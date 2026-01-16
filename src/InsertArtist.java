import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertArtist {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {

            String sql = "INSERT INTO artist (name, country) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, "Bonapart");
            ps.setString(2, "Kazakhstan");
            ps.executeUpdate();

            ps.setString(1, "Coldplay");
            ps.setString(2, "USA");
            ps.executeUpdate();

            System.out.println("2 artists inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
