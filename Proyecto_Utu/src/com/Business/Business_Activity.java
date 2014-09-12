/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Business;

import java.util.ArrayList;
import com.Data.DataConnexion;

/**
 *
 * @author jose
 */
public class Business_Activity {
    
    private int Id;
    private String Name;
    private String Details;
    
    
    public Business_Activity(int id, String name, String details){
        this.Id=id;
        this.Name=name;
        this.Details=details;               
        
    }
    
    public Business_Activity(){
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }
    
    public String toString(){
       
        return this.Id + "" + this.Name; 
    }
    
    
    
    
    
    
}
