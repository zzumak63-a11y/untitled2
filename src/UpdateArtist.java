import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateArtist {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {

            String sql = "UPDATE artist SET country=? WHERE name=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, "Russia");
            ps.setString(2, "Bonapart");

            ps.executeUpdate();
            System.out.println("Artist updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
