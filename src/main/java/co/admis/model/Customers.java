/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.admis.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Adeep My IT Solution
 */
@Entity
@Table(name = "\"customers\"")
public class Customers implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
  
    @JsonManagedReference
    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private Orders orders;
     
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    @Id
    private int id;
    
    @Column(name = "email", nullable = false, updatable = false)
    private String email;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "full_name")
    private String full_name;
    
    @Column(name = "billing_address")
    private String billing_address;
    
    @Column(name = "default_shipping_address")
    private String default_shipping_address;

    @Column(name = "phone")
    private int phone;

    @Column(name = "country")
    private String country;

    public Customers(Orders orders, int id, String email, String password, String full_name, String billing_address, String default_shipping_address, int phone, String country) {
        this.orders = orders;
        this.id = id;
        this.email = email;
        this.password = password;
        this.full_name = full_name;
        this.billing_address = billing_address;
        this.default_shipping_address = default_shipping_address;
        this.phone = phone;
        this.country = country;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

    public String getDefault_shipping_address() {
        return default_shipping_address;
    }

    public void setDefault_shipping_address(String default_shipping_address) {
        this.default_shipping_address = default_shipping_address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Customers{" + "orders=" + orders + ", id=" + id + ", email=" + email + ", password=" + password + ", full_name=" + full_name + ", billing_address=" + billing_address + ", default_shipping_address=" + default_shipping_address + ", phone=" + phone + ", country=" + country + '}';
    }

}