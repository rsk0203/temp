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
@Table(name = "\"örders\"")
public class Orders implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @JsonManagedReference
    @OneToMany(mappedBy="order_details", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private Orders_Details order_details;
    
     @ManyToOne
    @JoinColumn(name="customers_id", nullable=false, updatable = false)
    @JsonBackReference
    private Customers customers;
    
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    @Id
    private int id;
    
    @Column(name = "custumer_id", nullable = false, updatable = false)
    private String custumer_id;
    
    @Column(name = "amount")
    private int amount;
    
    @Column(name = "shipping_address")
    private String shipping_address;
    
    @Column(name = "order_email")
    private String order_email;
    
    @Column(name = "order_date")
    private String order_date;

    @Column(name = "customers_id")
    private int customers_id;

    public Orders(Customers customers, int id, String custumer_id, int amount, String shipping_address, String order_email, String order_date, int customers_id) {
        this.customers = customers;
        this.id = id;
        this.custumer_id = custumer_id;
        this.amount = amount;
        this.shipping_address = shipping_address;
        this.order_email = order_email;
        this.order_date = order_date;
        this.customers_id = customers_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustumer_id() {
        return custumer_id;
    }

    public void setCustumer_id(String custumer_id) {
        this.custumer_id = custumer_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public String getOrder_email() {
        return order_email;
    }

    public void setOrder_email(String order_email) {
        this.order_email = order_email;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public int getCustomers_id() {
        return customers_id;
    }

    public void setCustomers_id(int customers_id) {
        this.customers_id = customers_id;
    }

    @Override
    public String toString() {
        return "Orders{" + "id=" + id + ", custumer_id=" + custumer_id + ", amount=" + amount + ", shipping_address=" + shipping_address + ", order_email=" + order_email + ", order_date=" + order_date + ", customers_id=" + customers_id + '}';
    }

}
