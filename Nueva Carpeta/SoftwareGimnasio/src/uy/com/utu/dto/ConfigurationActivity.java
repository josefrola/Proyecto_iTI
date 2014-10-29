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
public class ConfigurationActivity  implements Serializable {
    private Integer id;
    private String Nameconf;
    private Integer Id_activity;
    private Integer Id_Gym ;
    private Integer Id_sexo;
    private String From_time;
    private String Time_to;    
    private String Monday;
    private String Tuesday;
    private String Wednsesday;
    private String Thursday;
    private String Friday;
    private String Saterday;
    private Float Price;
    private Integer EdadDesde;
    private Integer EddadHasta;
    
    
    public ConfigurationActivity(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameconf() {
        return Nameconf;
    }

    public void setNameconf(String Nameconf) {
        this.Nameconf = Nameconf;
    }

    public Integer getId_activity() {
        return Id_activity;
    }

    public void setId_activity(Integer Id_activity) {
        this.Id_activity = Id_activity;
    }

    public Integer getId_Gym() {
        return Id_Gym;
    }

    public void setId_Gym(Integer Id_Gym) {
        this.Id_Gym = Id_Gym;
    }

    public Integer getId_sexo() {
        return Id_sexo;
    }

    public void setId_sexo(Integer Id_sexo) {
        this.Id_sexo = Id_sexo;
    }

    public String getFrom_time() {
        return From_time;
    }

    public void setFrom_time(String From_time) {
        this.From_time = From_time;
    }

    public String getTime_to() {
        return Time_to;
    }

    public void setTime_to(String Time_to) {
        this.Time_to = Time_to;
    }
    public String getMonday() {
        return Monday;
    }

    public void setMonday(String Monday) {
        this.Monday = Monday;
    }

    public String getTuesday() {
        return Tuesday;
    }

    public void setTuesday(String Tuesday) {
        this.Tuesday = Tuesday;
    }

    public String getWednsesday() {
        return Wednsesday;
    }

    public void setWednsesday(String Wednsesday) {
        this.Wednsesday = Wednsesday;
    }

    public String getThursday() {
        return Thursday;
    }

    public void setThursday(String Thursday) {
        this.Thursday = Thursday;
    }

    public String getFriday() {
        return Friday;
    }

    public void setFriday(String Friday) {
        this.Friday = Friday;
    }

    public String getSaterday() {
        return Saterday;
    }

    public void setSaterday(String Saterday) {
        this.Saterday = Saterday;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float Price) {
        this.Price = Price;
    }

    public Integer getEdadDesde() {
        return EdadDesde;
    }

    public void setEdadDesde(Integer EdadDesde) {
        this.EdadDesde = EdadDesde;
    }

    public Integer getEddadHasta() {
        return EddadHasta;
    }

    public void setEddadHasta(Integer EddadHasta) {
        this.EddadHasta = EddadHasta;
    }
    
    
    
    
   
    
    
    
}
