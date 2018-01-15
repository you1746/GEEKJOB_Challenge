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
public class Test150402 {
    
    //ファイルから自己紹介を読み出し、表示してください。
    public static void main(String[] args){
        try{
            //FIleクラスのインスタンスfpを作成・オープン
            File fp = new File("C:\\Users\\you\\Documents\\NetBeansProjects\\challenge15-4\\src\\java\\org\\camp\\servlet\\test150402.txt");
        
            //上書きモードのFileWriter作成
            FileWriter fw = new FileWriter(fp);

            fw.write("課題15-4-02です。。。。。。。。。。。。。。。。。。。。。。。。。。。。。333");

            fw.close();
        } catch(IOException ie){
            System.out.println(ie);
        }
        
        try{
            //FIleクラスのインスタンスfpを作成・オープン
            File fp = new File("C:\\Users\\you\\Documents\\NetBeansProjects\\challenge15-4\\src\\java\\org\\camp\\servlet\\test150402.txt");
        
            //読み出しモードのFileWriter作成
            FileReader fd = new FileReader(fp);
            BufferedReader bd = new BufferedReader(fd);

            System.out.println(bd.readLine());

            bd.close();
        } catch(IOException ie){
            System.out.println(ie);
        }
    }
}
