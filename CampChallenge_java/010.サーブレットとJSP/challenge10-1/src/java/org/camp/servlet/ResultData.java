/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author you
 */
public class ResultData implements Serializable{
    private Date d;
    private String luck;
    
    //初期化
    public ResultData(){}
    
    //getter：d
    public Date getD(){
        return d;
    }
    
    //setter：d
    public void setD(Date d){
        this.d = d;
    }
    
    //getter luck
    public String getLuck(){
        return luck;
    }
    
    //setter luck
    public void setLuck(String luck){
        this.luck = luck;
    }
}
