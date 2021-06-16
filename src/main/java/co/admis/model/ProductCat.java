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
@Table(name = "\"product_categories\"")
public class ProductCat implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
   /*@JsonManagedReference
    @ManyToOne(mappedBy="orders", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private Customers customers;*/
    
     @ManyToOne
    @JoinColumn(name="customers_id", nullable=false, updatable = false)
    @JsonBackReference
    private Customers customers;
    
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    @Id
    private int id;
    
    @Column(name = "product_id", nullable = false, updatable = false)
    private String product_id;
    
    @Column(name = "category_id")
    private String category_id;
    
    @Column(name = "categories_id")
    private int categories_id;

    public ProductCat(int id, String product_id, String category_id, int categories_id) {
        this.id = id;
        this.product_id = product_id;
        this.category_id = category_id;
        this.categories_id = categories_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public int getCategories_id() {
        return categories_id;
    }

    public void setCategories_id(int categories_id) {
        this.categories_id = categories_id;
    }

    @Override
    public String toString() {
        return "ProductCat{" + "id=" + id + ", product_id=" + product_id + ", category_id=" + category_id + ", categories_id=" + categories_id + '}';
    }
    
}