
package com.Glass4Child.project.entities;

import com.Glass4Child.project.repositories.addressRepository;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Glass4Child.project.entities.Beneficent;
import com.Glass4Child.project.entities.address;
import com.Glass4Child.project.repositories.addressRepository;
import com.Glass4Child.project.repositories.beneficentRepository;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;


//import org.springframework.data.annotation.Id;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Beneficent extends User implements Serializable {

    private static final long serialVersionUID = 1L;

    @OneToOne(cascade =CascadeType.ALL ,mappedBy ="Beneficent")
    public address address;


    private int donationLimit = 0;
    private int totalDonatedBeneficient = 0;
    private boolean everDonated = false;
    private String pseudonym;

    public com.Glass4Child.project.entities.address getAddress() {
        return address;
    }

    public void setAddress(com.Glass4Child.project.entities.address address) {
        this.address = address;
    }

    public Beneficent(){
        super();

    }

    public Beneficent(String name, String email, String document, Long telephone, String password, int donationLimit, int totalDonatedBeneficient, boolean everDonated, String pseudonym, com.Glass4Child.project.entities.address address) {
        super(name, email, document, telephone, password);
        this.address = address;
        this.donationLimit = donationLimit;
        this.totalDonatedBeneficient = totalDonatedBeneficient;
        this.everDonated = everDonated;
        this.pseudonym = pseudonym;
    }





   

   






	






	public int getDonationLimit() {
        return donationLimit;
    }

    public void setDonationLimit(int DonationLimit) {
        this.donationLimit = DonationLimit;
    }

    public int getTotalDonatedBeneficient() {
        return totalDonatedBeneficient;
    }

    public void setTotalDonatedBeneficient(int totalDonatedBeneficient) {
        this.totalDonatedBeneficient = totalDonatedBeneficient;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public boolean isEverDonated() {
        return everDonated;
    }

    public void setEverDonated(boolean EverDonated) {
        this.everDonated = EverDonated;
    }

    public void setNewDonationLimit(int value) {
        if (this.donationLimit > value) {
            this.donationLimit = value;
        }
        this.totalDonatedBeneficient = value + this.totalDonatedBeneficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Beneficent that = (Beneficent) o;
        return donationLimit == that.donationLimit &&
                totalDonatedBeneficient == that.totalDonatedBeneficient &&
                everDonated == that.everDonated;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), donationLimit, totalDonatedBeneficient, everDonated);
    }
}
