/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.*;

/**
 *
 * @author you
 */
public class Test150401 {
    
    //ファイルに自己紹介を書き出し、保存してください。
    public static void main(String[] args){
        try{
            //FIleクラスのインスタンスfpを作成・オープン
            File fp = new File("C:\\Users\\you\\Documents\\NetBeansProjects\\challenge15-4\\src\\java\\org\\camp\\servlet\\test150401.txt");
        
            //上書きモードのFileWriter作成
            FileWriter fw = new FileWriter(fp);

            fw.write("私の名前は、兼丸陽司といいます。");

            fw.close();
        } catch(IOException ie){
            System.out.println(ie);
        }
    }
}
