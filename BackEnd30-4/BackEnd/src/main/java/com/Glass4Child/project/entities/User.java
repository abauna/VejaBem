package com.Glass4Child.project.entities;



import org.springframework.web.bind.annotation.Mapping;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

//@Entity

@MappedSuperclass
public class User implements Serializable {
     private static final long serialVersionUID = 1L;
    @Id
    private String document;

    private String name;
    private String email;


    private Long telephone;
    private String password;


    public User(String name, String email, String document, Long telephone, String password) {
        this.name = name;
        this.email = email;
        this.document = document;
        this.telephone = telephone;
        this.password = password;
    }

    public User() {

    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((document == null) ? 0 : document.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (document == null) {
            if (other.document != null)
                return false;
        } else if (!document.equals(other.document))
            return false;
        return true;
    }
}