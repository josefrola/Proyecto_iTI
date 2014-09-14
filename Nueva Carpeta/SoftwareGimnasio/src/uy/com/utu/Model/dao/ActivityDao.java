/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uy.com.utu.Model.dao;
import uy.com.utu.dto.Activity;
import java.util.List;
       

/**
 *
 * @author jose
 */
public interface ActivityDao {
    
    public List<Activity> list();
    public String  insert(Activity activity);
    public Integer idActivity();
    public Activity get(Integer id);
    public String delete(Integer id);
    public String upadte (Activity activity);
    
}
