import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteArtist {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {

            String sql = "DELETE FROM artist WHERE name=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, "Coldplay");
            ps.executeUpdate();

            System.out.println("Artist deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
