/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netbeans.config;
import java.util.Set;
import javax.ws.rs.core.Application;



@javax.ws.rs.ApplicationPath("ws")
public class Applicationconfig extends Application{
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources= new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    
private void addRestResourceClasses(Set<Class<?>> resources){

    
        resources.add(com.api.Userapi.class);
        
     
       
         
}
}