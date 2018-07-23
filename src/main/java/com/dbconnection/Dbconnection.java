package com.dbconnection;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author msi_ge72
 */
public class Dbconnection {

    private static Dbconnection dbhelper;
    private static DataSource ds;

    public static Dbconnection getInstance() { 
        if (dbhelper == null) {

            dbhelper = new Dbconnection();
            MysqlConnectionPoolDataSource dsx = new MysqlConnectionPoolDataSource();
            dsx.setUser("root");
            dsx.setPassword("admin");// JavaMysql2017+
            dsx.setServerName("localhost");// 89.106.5.135 - erpmysql.java.com.tr
            dsx.setPort(3306);
            dsx.setDatabaseName("weboards");
            ds = dsx;
        }
        return dbhelper;

    }

    public static Dbconnection getInstance(DataSource dsx) {
        if (dbhelper == null) {

            dbhelper = new Dbconnection();
            ds = dsx;
        }
        return dbhelper;

    }

    public Connection getConnection() throws SQLException {
        return ds.getConnection();

    }

    public void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(Dbconnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}

