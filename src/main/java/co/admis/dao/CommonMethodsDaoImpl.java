/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.admis.dao;

import co.admis.database.HibernateUtil;
import co.admis.model.Logins;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author AKASH
 */
public class CommonMethodsDaoImpl implements CommonMethodsDao{

    @Override
    public String getCurrentDate() {
        ZonedDateTime d = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        String[] date = d.toString().split("T");
        return date[0];
    }

    @Override
    public String getCurrentTime() {
        ZonedDateTime d = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        String[] date = d.toString().split("T");
        String[] time = date[1].split(("\\."));
        System.out.println(time);
        return time[0];
    }

    @Override
   public int add(int a,int b){
       return a+b;
           
        
    }
   @Override 
    public Logins user(Logins login){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            Transaction transaction;
            transaction = session.beginTransaction();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Logins> criteria =  builder.createQuery(Logins.class);
            Root<Logins> root = criteria.from(Logins.class);
            criteria.where(builder.and(builder.equal(root.get("Uname"), login.getUname()) ,builder.equal(root.get("pass"), login.getPass())));
            TypedQuery<Logins> typed = session.createQuery(criteria);
            Logins result = typed.getSingleResult();
            Hibernate.initialize(result);
            transaction.commit();
            session.close();
            System.out.println("result: "+result);
            return result;
        }catch(Exception e){
            System.out.println(e);
            session.close();
            return null;
        
    }

    }
}
