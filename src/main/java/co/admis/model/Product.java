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
@Table(name = "\"product\"")
public class Product implements Serializable{
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
    
    @Column(name = "name", nullable = false, updatable = false)
    private String name;
    
    @Column(name = "price")
    private int price;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "image")
    private String image;
    
    @Column(name = "category")
    private String category;
    
    @Column(name = "create_date")
    private String create_date;

    @Column(name = "product_options_id")
    private int product_options_id;
   
    @Column(name = "order_details_id")
    private int order_details_id;
    
    @Column(name = "product_categories_id")
    private int product_categories_id;

    public Product(int id, String name, int price, String description, String thumbnail, String image, String category, String create_date, int product_options_id, int order_details_id, int product_categories_id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.thumbnail = thumbnail;
        this.image = image;
        this.category = category;
        this.create_date = create_date;
        this.product_options_id = product_options_id;
        this.order_details_id = order_details_id;
        this.product_categories_id = product_categories_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public int getProduct_options_id() {
        return product_options_id;
    }

    public void setProduct_options_id(int product_options_id) {
        this.product_options_id = product_options_id;
    }

    public int getOrder_details_id() {
        return order_details_id;
    }

    public void setOrder_details_id(int order_details_id) {
        this.order_details_id = order_details_id;
    }

    public int getProduct_categories_id() {
        return product_categories_id;
    }

    public void setProduct_categories_id(int product_categories_id) {
        this.product_categories_id = product_categories_id;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + ", thumbnail=" + thumbnail + ", image=" + image + ", category=" + category + ", create_date=" + create_date + ", product_options_id=" + product_options_id + ", order_details_id=" + order_details_id + ", product_categories_id=" + product_categories_id + '}';
    }
    
}