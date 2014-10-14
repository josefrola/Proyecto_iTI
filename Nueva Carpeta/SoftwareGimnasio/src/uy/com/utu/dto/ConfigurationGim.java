/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uy.com.utu.dto;
import java.io.Serializable;
/**
 *
 * @author jose
 */
public class ConfigurationGim  implements Serializable{
    
    private Integer Idconfiguration;
    private String  NameGim;
    private String  Address;
    private String  Phone;
  

    public Integer getIdconfiguration() {
        return Idconfiguration;
    }

    public void setIdconfiguration(Integer Idconfiguration) {
        this.Idconfiguration = Idconfiguration;
    }

    public String getNameGim() {
        return NameGim;
    }

    public void setNameGim(String NameGim) {
        this.NameGim = NameGim;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    
    
    
}
