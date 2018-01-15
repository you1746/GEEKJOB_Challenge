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
public class Test150303 {
    
    //以下の文章の「I」⇒「い」に、「U」⇒「う」に入れ替える処理を作成し、結果を表示してください。
    //「きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます」
    public static void main(String[] arg){
        String text = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        String text2 = new String();
        String text3 = new String();
        
        //初期の文章を表示
        System.out.println("最初の文章は　　　 ：" + text);
        
        //「I」⇒「い」変換
        text2 = text.replace("I","い");
        System.out.println("「I」⇒「い」変換後：" + text2);
        
        //「U」⇒「う」変換
        text3 = text2.replace("U","う");
        System.out.println("「U」⇒「う」変換後：" + text3);
    }
}
