/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uy.com.utu.Model.dao;
import uy.com.utu.dto.SociosAll;
import java.util.List;


/**
 *
 * @author jose
 */
public interface SociosAllDao {
    public List<SociosAll> list();
    public String insert(SociosAll sociosall);
    public Integer idSociosall();
    public SociosAll get(Integer id);
    public String delete(Integer id);
    public String update(SociosAll sociosall);
        
}
