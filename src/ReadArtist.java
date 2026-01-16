import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadArtist {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM artist");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("country")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
