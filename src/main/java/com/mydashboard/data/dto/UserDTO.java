package com.mydashboard.data.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserDTO {

    @XmlElement(required = false)
    protected Long id;
    protected String username;
    protected String email;
    protected java.util.Date dob;
    protected String nationality;

    public UserDTO() {
    }

    public UserDTO(Long id, String username, String email, Date dob, String nationality) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.dob = dob;
        this.nationality = nationality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
