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
public class SociosAll implements Serializable{
    
    private Integer IdSocio;
    private String NameSocio;
    private String LastNameSocio;
    private Integer Age;
    private String CI;
    private Integer IdSexo;
    private String Address;
    private String Phone;
    private String Movile;
    private String Type;
    private Integer IdPlan;
    private String Activity;

    public Integer getIdSocio() {
        return IdSocio;
    }

    public void setIdSocio(Integer IdSocio) {
        this.IdSocio = IdSocio;
    }

    public String getNameSocio() {
        return NameSocio;
    }

    public void setNameSocio(String NameSocio) {
        this.NameSocio = NameSocio;
    }

    public String getLastNameSocio() {
        return LastNameSocio;
    }

    public void setLastNameSocio(String LastNameSocio) {
        this.LastNameSocio = LastNameSocio;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }
   

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public Integer getIdSexo() {
        return IdSexo;
    }

    public void setIdSexo(Integer IdSexo) {
        this.IdSexo = IdSexo;
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

    public String getMovile() {
        return Movile;
    }

    public void setMovile(String Movile) {
        this.Movile = Movile;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Integer getIdPlan() {
        return IdPlan;
    }

    public void setIdPlan(Integer IdPlan) {
        this.IdPlan = IdPlan;
    }

    public String getActivity() {
        return Activity;
    }

    public void setActivity(String Activity) {
        this.Activity = Activity;
    }
    
    
    
}
