package moonbox.jdbc;

import moonbox.jdbc.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Teest {
    public static void main(String[] args) {
         String jdbcName = "moonbox.jdbc.MbDriver";
         String url = "jdbc:moonbox://node2.develop:10010/test_tong";
            //使用反射加载数据库驱动
            try {
                Class.forName(jdbcName);
                System.out.println("加载驱动成功");
                String username = "sally";
                String password = "123456";
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
                statement.setQueryTimeout(60*10);
                statement.setFetchSize(200);
//                Statement rs = statement.executeQuery("1");
                System.out.println(1);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("加载驱动失败");
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
