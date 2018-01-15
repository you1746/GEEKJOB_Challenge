/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author you
 */
public class Test150302 {
    
    //自分のメールアドレスの「@」以降の文字を取得して、表示してください。
    public static void main(String[] arg){
        String mymail = "ei9gm3xuysg2yww0@yahoo.co.jp";
        
        //メールアドレス表示
        System.out.println("メアドは：　" + mymail);
        
        //「@」が何文字目かを調べる
        int num = mymail.indexOf("@");
        System.out.println("＠は　　：" + num + "文字目");
        
        //「@」以降の文字列を表示
        System.out.println("＠以降は：　" + mymail.substring(num));
    }
}
