import java.sql.*;
public class Main {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "0000")) {

            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO artist (name, country) VALUES (?, ?)");
            ps.setString(1, "Bonapart");
            ps.setString(2, "Kazakhstan");
            ps.executeUpdate();

            ps.setString(1, "Coldplay");
            ps.setString(2, "USA");
            ps.executeUpdate();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM artist");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("country"));
            }

            ps = conn.prepareStatement("UPDATE artist SET country=? WHERE name=?");
            ps.setString(1, "Russia");
            ps.setString(2, "Bonapart");
            ps.executeUpdate();

            ps = conn.prepareStatement("DELETE FROM artist WHERE name=?");
            ps.setString(1, "Coldplay");
            ps.executeUpdate();

            System.out.println("CRUD operations done!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
