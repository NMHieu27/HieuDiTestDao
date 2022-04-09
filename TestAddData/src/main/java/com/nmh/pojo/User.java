/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmh.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id"),
    @NamedQuery(name = "User.findByFullname", query = "SELECT u FROM User u WHERE u.fullname = :fullname"),
    @NamedQuery(name = "User.findByPhone", query = "SELECT u FROM User u WHERE u.phone = :phone"),
    @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username"),
    @NamedQuery(name = "User.findByPass", query = "SELECT u FROM User u WHERE u.pass = :pass"),
    @NamedQuery(name = "User.findByAvatar", query = "SELECT u FROM User u WHERE u.avatar = :avatar")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "phone")
    private String phone;
    @Column(name = "username")
    private String username;
    @Column(name = "pass")
    private String pass;
    @Column(name = "avatar")
    private String avatar;
    @Transient
    private MultipartFile file;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String fullname, String phone, String username, String pass) {
        this.id = id;
        this.fullname = fullname;
        this.phone = phone;
        this.username = username;
        this.pass = pass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dht.pojo.User[ id=" + id + " ]";
    }

    /**
     * @return the file
     */
    public MultipartFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(MultipartFile file) {
        this.file = file;
    }

}
