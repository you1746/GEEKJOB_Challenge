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
public class Test150203 {
    
    //2016年11月4日 10時0分0秒のタイムスタンプを作成し、「年-月-日 時:分:秒」で表示してください。
    public static void main(String[] arg){
        //Calendarクラスのオブジェクトを作成、初期処理で現在日付取得
        Calendar cal = Calendar.getInstance();
        
        //オブジェクトcalのフィールドに日時を設定する
        cal.set(2016, 10, 4, 10, 0, 0);
        
        //Dateクラスのオブジェクトdを作成し、calの日付情報で初期化する
        Date d = cal.getTime();
        
        System.out.print("設定日時（チェック用）：");
        System.out.print(cal.get(Calendar.YEAR) + "年");
        System.out.print((cal.get(Calendar.MONTH)+1) + "月");
        System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "日");
        System.out.print(cal.get(Calendar.HOUR_OF_DAY) + "時");
        System.out.print(cal.get(Calendar.MINUTE) + "分");
        System.out.println(cal.get(Calendar.SECOND) + "秒");
        
        //フォーマットを指定
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(d));
        
        return;
    }
}
