//package moonbox.jdbc;
//
//import java.sql.Connection;
//import java.sql.Driver;
//import java.sql.DriverManager;
//import java.sql.DriverPropertyInfo;
//import java.sql.SQLException;
//import java.sql.SQLFeatureNotSupportedException;
//import java.util.Properties;
//import java.util.logging.Logger;
//
//public class MbDriver implements Driver {
//    static {
//        try {
//            DriverManager.registerDriver(new MbDriver());
//        } catch (SQLException e) {
//            throw new RuntimeException("Can't register MbDriver!");
//        }
//    }
//
//    public int getMajorVersion() {
//        return 0;
//    }
//
//    public int getMinorVersion() {
//        return 0;
//    }
//
//    public boolean jdbcCompliant() {
//        return false;
//    }
//
//    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
//        return null;
//    }
//
//    public Connection connect(String url, Properties info) throws SQLException {
//        System.out.println("url"+url);
//        System.out.println("info"+info.toString());
//        if (!acceptsURL(url))
//            return null;
//        MoonboxConnection conn = new MoonboxConnection(url, info);
//        System.out.println("okconn");
//        System.out.println(conn.toString());
//        if (conn.init())
//            return conn;
//        throw new SQLException("User check error");
//    }
//
//    public boolean acceptsURL(String url) throws SQLException {
//        String urlPrefix = "jdbc:moonbox:";
//        return (url != null && url.toLowerCase().startsWith(urlPrefix));
//    }
//
//    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) {
//        return null;
//    }
//}
