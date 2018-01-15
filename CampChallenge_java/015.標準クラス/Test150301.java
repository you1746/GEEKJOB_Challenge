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
public class Test150301 {
    
    //自分の氏名について、バイト数と文字数を取得して、表示してください。
    public static void main(String[] arg){
        String name = "兼丸 陽司";
        
        System.out.println("名前は：　　" + name);
        System.out.println("文字数は：　" + name.length());
        System.out.println("バイト数は：" + name.getBytes().length);
    }
}
