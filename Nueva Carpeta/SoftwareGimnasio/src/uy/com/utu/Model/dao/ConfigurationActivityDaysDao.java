/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uy.com.utu.Model.dao;
import uy.com.utu.dto.ConfigurationActivity;
import java.util.List;

/**
 *
 * @author jose
 */
public interface ConfigurationActivityDaysDao  {
    
    public List<ConfigurationActivity>list();
    public String insert(ConfigurationActivity actConf);
    public Integer idConAct();
    public ConfigurationActivity get(Integer id);    
    public String delete(Integer id);
    public String update (ConfigurationActivity config);
}
