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
@Table(name = "\"product_options\"")
public class ProductOptions implements Serializable{
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
    
    @Column(name = "option_id", nullable = false, updatable = false)
    private String option_id;
    
    @Column(name = "product_id")
    private String product_id;
    
    @Column(name = "options_id")
    private int options_id;

    public ProductOptions(int id, String option_id, String product_id, int options_id) {
        this.id = id;
        this.option_id = option_id;
        this.product_id = product_id;
        this.options_id = options_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOption_id() {
        return option_id;
    }

    public void setOption_id(String option_id) {
        this.option_id = option_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public int getOptions_id() {
        return options_id;
    }

    public void setOptions_id(int options_id) {
        this.options_id = options_id;
    }

    @Override
    public String toString() {
        return "ProductOptions{" + "id=" + id + ", option_id=" + option_id + ", product_id=" + product_id + ", options_id=" + options_id + '}';
    }
    
}