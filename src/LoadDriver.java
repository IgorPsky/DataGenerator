import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class LoadDriver {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println(Class.forName("com.mysql.jdbc.Driver").getName());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}