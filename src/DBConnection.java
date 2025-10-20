import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";  // your MySQL username
    private static final String PASSWORD = "root"; // replace with your MySQL password

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load MySQL driver (important for older JDKs and some configurations)
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e);
        }
        return conn;
    }
}
