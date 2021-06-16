package co.admis.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author workspace
 */
@Entity
@Table(name = "\"logins\"")
public class Logins implements Serializable{
    @Id
    @Column(name = "Uname",nullable = false, unique = true)
    private String Uname;
    
    @Column(name = "pass", nullable = false, updatable = false)
    private String pass;
    
     @JsonManagedReference
    @OneToOne(mappedBy="logins", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private Log log;

    public String getUname() {
        return Uname;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
        
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public Logins(String Uname, String pass) {
        this.Uname = Uname;
        this.pass = pass;
    }
    

    public Logins(String Uname, String pass, Log log) {
        this.Uname = Uname;
        this.pass = pass;
        this.log = log;
    }
    
    public Logins(){
        
    }


    @Override
    public String toString() {
        return "Login{" + "Uname=" + Uname + ", pass=" + pass + '}';
    }
    
    
}
