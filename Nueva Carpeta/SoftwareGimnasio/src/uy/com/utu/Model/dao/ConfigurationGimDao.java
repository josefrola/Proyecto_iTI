/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uy.com.utu.Model.dao;
import uy.com.utu.dto.ConfigurationGim;
import java.util.List;

/**
 *
 * @author jose
 */
public interface ConfigurationGimDao {
    public List<ConfigurationGim> list();
    public String insert (ConfigurationGim configgim);
    public Integer idCongif();
    public ConfigurationGim get(Integer id);
    public String delete(Integer id);
    public String update(ConfigurationGim configgim);  
}



