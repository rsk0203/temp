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
@Table(name = "\"categories\"")
public class Categories implements Serializable{
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
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "thumbnail")
    private String thumbnail;

    public Categories(int id, String name, String description, String thumbnail) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
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

    @Override
    public String toString() {
        return "Categories{" + "id=" + id + ", name=" + name + ", description=" + description + ", thumbnail=" + thumbnail + '}';
    }
    
}