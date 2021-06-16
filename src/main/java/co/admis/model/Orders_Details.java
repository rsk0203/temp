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
@Table(name = "\"örder_details\"")
public class Orders_Details implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
  
    @ManyToOne
    @JoinColumn(name="orders_id", nullable=false, updatable = false)
    @JsonBackReference
    private Orders orders;
    
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    @Id
    private int id;
    
    @Column(name = "order_id", nullable = false, updatable = false)
    private String order_id;
    
    @Column(name = "product_id")
    private String product_id;
    
    @Column(name = "price")
    private int price;
    
    @Column(name = "quantity")
    private int quantity;

    @Column(name = "orders_id")
    private int orders_id;

    public Orders_Details(int id, String order_id, String product_id, int price, int quantity, int orders_id) {
        this.id = id;
        this.order_id = order_id;
        this.product_id = product_id;
        this.price = price;
        this.quantity = quantity;
        this.orders_id = orders_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }

    @Override
    public String toString() {
        return "Orders_Details{" + "id=" + id + ", order_id=" + order_id + ", product_id=" + product_id + ", price=" + price + ", quantity=" + quantity + ", orders_id=" + orders_id + '}';
    }
}  