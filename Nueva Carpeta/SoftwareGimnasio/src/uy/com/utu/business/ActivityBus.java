/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uy.com.utu.business;
import java.util.List;
import uy.com.utu.dto.Activity;
import uy.com.utu.model.dao.impl.ActivityDaoImpl;
import uy.com.utu.Model.dao.ActivityDao;

/**
 *
 * @author jose
 */
public class ActivityBus {
    
    ActivityDao activityDao;
    
    public ActivityBus(){
        activityDao= new ActivityDaoImpl();
    }
    
    /*
    negio de la lista.
    */
    public List<Activity> list(){
        return activityDao.list();
    }
    
    public String InsertActivity(Activity activity){
        return activityDao.insert(activity);
    }
    
    public Integer idActivity(){
        return activityDao.idActivity();
    }
    
    public Activity get(Integer id){
        return  activityDao.get(id);
    }
    
    public String delete(Integer id){
        return activityDao.delete(id);
    }
    
    public String update(Activity activity){
        return activityDao.upadte(activity);
    }
    
    
    
    
}
