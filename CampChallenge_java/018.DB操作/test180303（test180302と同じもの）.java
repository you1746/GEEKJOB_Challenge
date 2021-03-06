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
public class test180302 {
    public static void main(String[] args){
        
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        int db_up;

        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","root","");
            
            //Challenge_dbデータベースでprofilesテーブルにおいて、レコードを追加
            db_st = db_con.prepareStatement("insert into profiles (profilesID,name,tel,age,birthday) values (?,?,?,?,?)");
            db_st.setInt(1,6);
            db_st.setString(2,"渡辺 一二三");
            db_st.setString(3,"999-999-9999");
            db_st.setInt(4,28);
            db_st.setString(5,"2001-01-01");
            
            db_up = db_st.executeUpdate();
            
            db_st = db_con.prepareStatement("select * from profiles");
            
            db_data = db_st.executeQuery();
            while(db_data.next()){
                System.out.print(" / " + db_data.getInt("profilesID"));
                System.out.print(" / " + db_data.getString("name"));
                System.out.print(" / " + db_data.getString("tel"));
                System.out.print(" / " + db_data.getInt("age"));
                System.out.println(" / " + db_data.getString("birthday"));
            }
            
            db_data.close();
            db_st.close();
            db_con.close();
        }catch(Exception e){
            System.out.print(e);
        };
    }
}
