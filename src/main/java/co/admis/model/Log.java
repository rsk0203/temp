/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.admis.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Adeep My IT Solution
 */
@Entity
@Table(name = "\"records\"")
public class Log implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
     @OneToOne
    @JoinColumn(name="uname_fk", nullable=false, updatable = false)
    @JsonBackReference
    private Logins logins;
    
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private int id;
    
    @Column(name = "log", nullable = false, updatable = false)
    private String log;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "user_id")
    private int userId;
    
    @Column(name = "timestamp")
    private String timestamp;

    public Log(Logins logins, int id, String log, String status, int userId, String timestamp) {
        this.logins = logins;
        this.id = id;
        this.log = log;
        this.status = status;
        this.userId = userId;
        this.timestamp = timestamp;
    }
    
    

    public Log() {
    }

    public Log(int id, String log, String status, int userId) {
        this.id = id;
        this.log = log;
        this.status = status;
        this.userId = userId;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Log{" + "logins=" + logins.getUname() + ", id=" + id + ", log=" + log + ", status=" + status + ", userId=" + userId + ", timestamp=" + timestamp + '}';
    }

   
}
