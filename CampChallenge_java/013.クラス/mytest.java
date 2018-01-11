/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

class mytestclass{
    public int num1;
    public int num2;
    
    public void setmytestclass(int data1, int data2){
        this.num1 = data1;
        this.num2 = data2;
    }
    
    public void printmytestclass(){ 
        System.out.print("格納変数の値は" + this.num1 + "と" + this.num2 + "です。<br>");
    }
}
/**
 *
 * @author you
 */
public class mytest {
    public static void main(String[] arg){
        mytestclass mt = new mytestclass();
        
        mt.setmytestclass(10,20);
        mt.printmytestclass();
    }
}
