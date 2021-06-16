/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.admis.service;

import co.admis.model.Logins;

/**
 *
 * @author AKASH
 */
public interface CommonMethodsService {
    public String getCurrentDate();
    
    public String getCurrentTime();
    
    public int add( int a, int b);
    
     public Logins user(Logins login);
    
    
}
