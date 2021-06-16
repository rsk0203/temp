  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.admis.controller;

import co.admis.database.HibernateUtil;
import co.admis.model.Log;
import co.admis.model.Logins;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
  *
  * @author workspace
 */

public class Hibertest {
    public static void main(String[] args){
        reads("admin");
       
        
        
          
       
        
                
    }
    private static Log read(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Log g = session.get(Log.class, id);
        Hibernate.initialize(g);
        session.close();
        System.out.println(g);
        return g;
    }
   private static Logins reads(String Uname){
       Logins g;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            g = session.get(Logins.class, Uname);
            Hibernate.initialize(g);
            session.close();
        }
        System.out.println(g);
        return g;
    }
    private static Log addLog(){
        Log log;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            log = new Log(0,"tau","act",3);
            session.beginTransaction();
            session.save(log);
            session.getTransaction().commit();
            session.close();
        }
        return log;
    }
        
         private static Logins addLogs(){
        Logins ol;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            ol = new Logins("admin","admin");
            session.beginTransaction();
            session.save(ol);
            session.getTransaction().commit();
            session.close();
        }
        return ol;
    }
        private static List<Log> list(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
           List<Log> list = session.createCriteria(Log.class).list();
        System.out.println(list);
        session.close();
           return list;
            }
         
           private static List<Log> adds(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
      Transaction transaction =  session.beginTransaction();
      CriteriaBuilder build = session.getCriteriaBuilder();
      CriteriaQuery<Log> criteria = build.createQuery(Log.class);
      Root<Log> root =criteria.from(Log.class);
      criteria.where(build.equal(root.get("status"),"kdj"));
      TypedQuery<Log> type= session.createQuery(criteria);
       List<Log> result=  type.getResultList();
       Hibernate.initialize(result);
        transaction.commit();
        session.close();
        System.out.println(result);
        return result;
      }
        catch(Exception e){
            System.out.println(e);
           session.close();
        return null;
        }
        
       }
}
