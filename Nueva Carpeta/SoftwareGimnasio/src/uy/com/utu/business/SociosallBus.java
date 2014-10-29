/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uy.com.utu.business;
import java.util.List;
import uy.com.utu.dto.SociosAll;
import uy.com.utu.model.dao.impl.SociosAllImpl;
import uy.com.utu.Model.dao.SociosAllDao;

/**
 *
 * @author jose
 */
public class SociosallBus {
    SociosAllDao sociosallDao;
    
    
    public SociosallBus(){
        sociosallDao= new SociosAllImpl();
    }
    
    public List<SociosAll>list(){
        return sociosallDao.list();
    }
    public String insertSociosall(SociosAll socioall){
        return  sociosallDao.insert(socioall);
    }
    public Integer idSociosall(){
        return sociosallDao.idSociosall();
    }
    public SociosAll get(Integer id){
        return sociosallDao.get(id);
    }
    public String delete(Integer id){
        return sociosallDao.delete(id);
    }
    public String update(SociosAll sociosall){
        return sociosallDao.update(sociosall);
    }
    
    
}
