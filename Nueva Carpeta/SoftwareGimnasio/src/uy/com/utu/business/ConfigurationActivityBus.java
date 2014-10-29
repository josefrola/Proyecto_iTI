/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.com.utu.business;

import java.util.List;
import uy.com.utu.dto.ConfigurationActivity;
import uy.com.utu.model.dao.impl.ConfigurationActivityDaoImpl;
import uy.com.utu.Model.dao.ConfigurationActivityDaysDao;

/**
 *
 * @author jose
 */
public class ConfigurationActivityBus {

    ConfigurationActivityDaysDao configact;

    public ConfigurationActivityBus() {
        configact = new ConfigurationActivityDaoImpl();
    }

    public List<ConfigurationActivity> list() {
        return configact.list();
    }

    public String insertConfigurationactivity(ConfigurationActivity confa) {
        return configact.insert(confa);
    }

    public Integer idConfigurationactivity() {
        return configact.idConAct();
    }

    public ConfigurationActivity get(Integer id) {
        return configact.get(id);
    }

    public String delete(Integer id) {
        return configact.delete(id);
    }

    public String Update(ConfigurationActivity act) {
        return configact.update(act);
    }

}
