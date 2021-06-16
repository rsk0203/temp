    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.admis.controller;

import co.admis.database.HibernateUtil;
import co.admis.model.Logins;
import co.admis.service.CommonMethodsService;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Adeep My IT Solution Private Limited
 */
@Controller
public class Index {
    
   @Autowired
    CommonMethodsService commonMethodService;
   /*
    @RequestMapping(value = {"/cok"}, method = RequestMethod.GET)
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        Cookie ck[]= request.getCookies();
        for(Cookie c: ck)
        {
            if(c.getName().equalsIgnoreCase("Uname"))
                {
                if(c.getValue().equalsIgnoreCase("admin"))
                {
                    return new ModelAndView("success"); 
                }
            }
        }*/
   /*
         HttpSession session = request.getSession();
         if(session!=null && session.getAttribute("Uname")!=null){
              
                return new ModelAndView("success");
            
        }
        return new ModelAndView("login");
    }/*
       @RequestMapping(value = {"/success"}, method = RequestMethod.GET)
    public ModelAndView success(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie("Uname","admin");
                response.addCookie(cookie);
                 HttpSession session = request.getSession();
                 session.setAttribute("Uname", "admin");
                 
        return new ModelAndView("success");
    }
   */
   @RequestMapping(value = {"/Register"}, method = RequestMethod.GET)
   public ModelAndView logi(HttpServletRequest request, HttpServletResponse response) {
         return new ModelAndView("jsp");
    }
 @RequestMapping(value = {"/Dashboard"}, method = RequestMethod.GET)
   public ModelAndView log(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("indexs");
    }
     /*
@RequestMapping(value = {"/login"}, method = RequestMethod.POST 
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Logins logi) {
        
                Logins l = commonMethodService.user(logi);
        if(l==null){
            return new ModelAndView("failure");
        }else{
            return new ModelAndView("success");
        }
    }
}
 */
@RequestMapping(value = {"/ajaxSample"}, method = RequestMethod.POST)
    public @ResponseBody
         String ajax(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("login") Logins logi) {
      
        System.out.println(logi);
                Logins l = commonMethodService.user(logi);
        if(l==null){
            
            return "Invalid cerendials";
        }else{
            return "success";
        }
    }
}    
    

       
      
           /*  Logins log;
        Session session;
       session = HibernateUtil.getSessionFactory().openSession();
{
            log = new Logins(name,pas);
            session.beginTransaction();
            session.save(log);
            session.getTransaction().commit();
            session.close();
            System.out.println(log);
            int s = commonMethodService.add(25, 25);
            System.out.println(s);
            return new ModelAndView("log");
        }
       
        
      
    }
    
    }
     */
