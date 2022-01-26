package sql;

import java.sql.*;

public class ExchangeRateDB {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jbdc:h2:/ValeyTransleitor/TestTask/db/exchangerate");
        // add application code here
        conn.close();
    }
}