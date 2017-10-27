package cn.com.up.data.gen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class DataGen {

	
	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("D:\\app_install\\傲飞数据整合平台_V3.3.0\\platform\\webapps\\etl_platform\\WEB-INF\\jdbc.properties"));
		System.out.println(prop.get("jdbc.password"));
//		Connection con;
//		String driver = "com.mysql.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/etltest?useUnicode=true&characterEncoding=utf-8&useSSL=false";
//		String user="root";
//		String password="123456";
//		try {
//			Class.forName(driver);
//			con = DriverManager.getConnection(url,user,password);
//			Statement statement = con.createStatement();
//			String createTableSql="create table if not exists bigTable(id int primary key AUTO_INCREMENT";
//			for (int i=1;i<=50 ;i++) {
//				createTableSql+=",c" + i + "  varchar(255)";
//			}
//			createTableSql+=")";
//			statement.execute(createTableSql);
//			//插入数据
//			for (int i=0;i<100000;i++) {
//				String insertSql="insert into bigTable ( c1";
//				for(int k =2;k<=50;k++) {
//					insertSql+=",c"+k;
//				}
//				insertSql+=" ) values ('abcdefghijklmnopqrstuvwxyz1234567890'";
//				for(int j =2;j<=50;j++) {
//					insertSql+=",'abcdefghijklmnopqrstuvwxyz1234567890'";
//				}
//				insertSql+=");";
//				statement.addBatch(insertSql);				
//			}
//			
//			statement.executeBatch();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
