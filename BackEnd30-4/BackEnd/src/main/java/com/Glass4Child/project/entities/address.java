package com.Glass4Child.project.entities;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class address implements  Serializable  {
	private static final long serialVersionUID = 1L;

//	@Id
	private String document;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;



	@OneToOne
	@JoinColumn(name = "id_Endereco",unique = true,nullable = true ,insertable = true,updatable = true)
	private Beneficent Beneficent;

	public com.Glass4Child.project.entities.Beneficent getBeneficent() {
		return Beneficent;
	}

	public void setBeneficent(com.Glass4Child.project.entities.Beneficent beneficent) {
		Beneficent = beneficent;
	}

	private String cep;

	 private String city;
	 private String neighborhood;
	 private String reference;

	public address() {

	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		address address = (address) o;
		return document.equals(address.document);
	}

	@Override
	public int hashCode() {
		return Objects.hash(document);
	}

	private int number;







	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}



	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


    public address(String document, String cep, String city, String neighborhood, String reference, int number) {
        this.document = document;
        this.cep = cep;
        this.city = city;
        this.neighborhood = neighborhood;
        this.reference = reference;
        this.number = number;
    }

}
