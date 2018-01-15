/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.*;
import java.util.*;

/**
 *
 * @author you
 */
public class Test150403 {
    //紹介していないJAVAの標準クラスを利用して、処理を作成してください。

    //講義では紹介されていないJAVAの標準クラスはたくさん存在します。
    //１つJAVAの標準クラスを選び、実際にロジックを作成してみてください。
    //また、この処理を作成するに当たり、下記を必ず実装してください。
    //1. 処理の経過を書き込むログファイルを作成する。
    //2. 処理の開始、終了のタイミングで、ログファイルに開始・終了の書き込みを行う。
    //3. 書き込む内容は、「日時　状況（開始・終了）」の形式で書き込む。
    //4. 最後に、ログファイルを読み込み、その内容を表示してください。
    public static void main(String[] args){
        int x1 = 10;
        int x2 = 5;
        int y1 = 3;
        int y2 = 12;
        int z = -4;
        Math2 m2 = new Math2();

        System.out.println(m2.min2(x1,x2));
        System.out.println(m2.max2(y1,y2));
        System.out.println(m2.abs2(z));
        
        try{
            File fp = new File("C:\\Users\\you\\Documents\\NetBeansProjects\\challenge15-4\\src\\java\\org\\camp\\servlet\\test150403.txt");
            FileReader fr = new FileReader(fp);
            BufferedReader br = new BufferedReader(fr);
            
            System.out.println("◆◇◆ファイル読み出し◆◇◆");
            System.out.println(br.readLine());
        } catch(IOException ie){
            System.out.println(ie);
        }
    }
}

class Math2{
    //2つのint値のうち小さいほうを返します。
    static int min2(int a, int b){
        try{
            File fp = new File("C:\\Users\\you\\Documents\\NetBeansProjects\\challenge15-4\\src\\java\\org\\camp\\servlet\\test150403.txt");
            FileWriter fw = new FileWriter(fp,true);
            
            Date d = new Date();
            fw.write("min2開始：" + d.toString());

            if(a>b){
                fw.write("min2終了：" + d.toString());
                fw.close();
                return b;
            }
            else{
                fw.write("min2終了：" + d.toString());
                fw.close();
                return a;
            }
        } catch(IOException ie){
            System.out.print(ie);
        }
        return -1;
    }
    
    //2つのint値のうち大きいほうを返します。
    static int max2(int a, int b){

        try{
            File fp = new File("C:\\Users\\you\\Documents\\NetBeansProjects\\challenge15-4\\src\\java\\org\\camp\\servlet\\test150403.txt");
            FileWriter fw = new FileWriter(fp,true);
            
            Date d = new Date();
            fw.write("max2開始：" + d.toString());
            if(a<b){
                fw.write("max2終了：" + d.toString());
                fw.close();
                return b;
            }
            else{
                fw.write("max2終了：" + d.toString());
                fw.close();
                return a;
            }

        } catch(IOException ie){
            System.out.print(ie);
        }
        return -1;
    }
    
    //int値の絶対値を返します。
    static int abs2(int a){
        try{
            File fp = new File("C:\\Users\\you\\Documents\\NetBeansProjects\\challenge15-4\\src\\java\\org\\camp\\servlet\\test150403.txt");
            FileWriter fw = new FileWriter(fp,true);
            
            Date d = new Date();
            fw.write("abs2開始：" + d.toString());
            if(a>=0){
                fw.write("abs2終了：" + d.toString());
                fw.close();
                return a;
            }
            else{
                fw.write("abs2終了：" + d.toString());
                fw.close();
                return (a*(-1));
            }
        } catch(IOException ie){
            System.out.print(ie);
        }
        return -1;
    }
}
