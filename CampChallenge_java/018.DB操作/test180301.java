/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.*;

/**
 *
 * @author you
 */
public class test180301 {
    public static void main(String[] args){
        
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;

        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","root","");
            
            //Challenge_dbデータベースでuserテーブルにおいて、年齢が25より上の人を抽出
            db_st = db_con.prepareStatement("select * from user where age > ?");
            db_st.setInt(1,25);
            
            db_data = db_st.executeQuery();
            while(db_data.next()){
                System.out.println("名前：" + db_data.getString("name"));
            }
            
            db_data.close();
            db_st.close();
            db_con.close();
        }catch(Exception e){
            System.out.print(e);
        };
    }
}
