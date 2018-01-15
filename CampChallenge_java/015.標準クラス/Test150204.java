/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author you
 */
public class Test150204 {
    
    //2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。
    public static void main(String[] arg){
        //Calendarクラスのオブジェクトを作成、初期処理で現在日付取得
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        //オブジェクトcalのフィールドに日時を設定する
        cal1.set(2015, 0, 1, 0, 0, 0);
        cal2.set(2015, 11, 31, 23, 59, 59);
        
        //Dateクラスのオブジェクトdを作成し、calの日付情報で初期化する
        Date d1 = cal1.getTime();
        Date d2 = cal2.getTime();
        
        System.out.print("cal1_設定日時（チェック用）：");
        System.out.print(cal1.get(Calendar.YEAR) + "年");
        System.out.print((cal1.get(Calendar.MONTH)+1) + "月");
        System.out.print(cal1.get(Calendar.DAY_OF_MONTH) + "日");
        System.out.print(cal1.get(Calendar.HOUR_OF_DAY) + "時");
        System.out.print(cal1.get(Calendar.MINUTE) + "分");
        System.out.println(cal1.get(Calendar.SECOND) + "秒");
        
        System.out.print("cal2_設定日時（チェック用）：");
        System.out.print(cal2.get(Calendar.YEAR) + "年");
        System.out.print((cal2.get(Calendar.MONTH)+1) + "月");
        System.out.print(cal2.get(Calendar.DAY_OF_MONTH) + "日");
        System.out.print(cal2.get(Calendar.HOUR_OF_DAY) + "時");
        System.out.print(cal2.get(Calendar.MINUTE) + "分");
        System.out.println(cal2.get(Calendar.SECOND) + "秒");
        
        //差分
        System.out.println("d1   ：" + d1.getTime());
        System.out.println("d2   ：" + d2.getTime());
        System.out.println("d2-d1：  " + (d2.getTime() - d1.getTime()));
        
        return;
    }
}
