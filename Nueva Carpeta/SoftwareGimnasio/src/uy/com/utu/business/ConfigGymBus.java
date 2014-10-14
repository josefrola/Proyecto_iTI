/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uy.com.utu.business;

import java.util.List;
import uy.com.utu.dto.ConfigurationGim;
import uy.com.utu.model.dao.impl.ConfigurationGimImp;
import uy.com.utu.Model.dao.ConfigurationGimDao;



/**
 *
 * @author jose
 */
public class ConfigGymBus {
    
    ConfigurationGimDao configGymDao;
    
    public  ConfigGymBus (){
        configGymDao = new ConfigurationGimImp();
    }
    
    public List<ConfigurationGim> list(){
        return configGymDao.list();
    }
    
    public String insertConfigurationGym(ConfigurationGim gym){
        return configGymDao.insert(gym);
    }
    
    public Integer idConfigurationGym(){
        return configGymDao.idCongif();
    }
    
    public ConfigurationGim get (Integer id){
        return configGymDao.get(id);
    }
    
    public String delete(Integer id){
        return configGymDao.delete(id);
    }
    
    public String update(ConfigurationGim gym){
        return configGymDao.update(gym);
    }
    
    
}
