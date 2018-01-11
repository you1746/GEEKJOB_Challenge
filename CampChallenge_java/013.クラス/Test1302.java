/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author you
 */
public class Test1302 {
    public static void main(String[] arg){
        Teacher soeda = new Teacher();
        
        soeda.setHuman("添田亮司", 34);
        
        soeda.age = 30;
        
        soeda.kougi();
        
        soeda.dataclear();
    }
}

class Human{
    protected String name;
    protected int age;
    
    void setHuman(String aaa, int bbb){
        this.name = aaa;
        this.age = bbb;
    }
}

class Teacher extends Human{
    void kougi(){
        System.out.print("名前は"+ this.name + "、年齢は、" + this.age + "才です。<br>");
    }
    
    void dataclear(){
        this.name = "";
        this.age = 0;
        System.out.print("データは抹消されました。<br>");        
        System.out.print("名前は"+ this.name + "、年齢は、" + this.age + "才です。<br>");

    }
}