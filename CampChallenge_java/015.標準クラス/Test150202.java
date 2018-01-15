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
public class Test150202 {
    
    //現在の日時を「年-月-日 時:分:秒」で表示してください。
    public static void main(String[] arg){
        //Calendarクラスのオブジェクトを作成、初期処理で現在日付取得
        Calendar cal = Calendar.getInstance();
        
        //各フィールドの値を取得し、表示
        System.out.print("現在時刻：");
        System.out.print(cal.get(Calendar.YEAR) + "年");
        System.out.print((cal.get(Calendar.MONTH)+1) + "月");
        System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "日");
        System.out.print(cal.get(Calendar.HOUR_OF_DAY) + "時");
        System.out.print(cal.get(Calendar.MINUTE) + "分");
        System.out.println(cal.get(Calendar.SECOND) + "秒");
        
        return;
    }
}
