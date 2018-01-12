/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author you
 */
public class Test150201 {
    public static void main(String[] arg){
        Calendar cal = Calendar.getInstance();
        
        cal.set(2016,0,1,0,0,0);
        
        Date d = cal.getTime();
        
        System.out.println("2016/1/1 0:0:0　タイムスタンプ：" + d.getTime());
        
        return;
    }
}
