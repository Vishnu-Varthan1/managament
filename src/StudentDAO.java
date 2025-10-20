import java.sql.*;
import java.util.*;

public class StudentDAO {

    // Add a new student record
    public void addStudent(Student s) {
        String sql = "INSERT INTO students (id, name, course, age) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, s.getId());
            stmt.setString(2, s.getName());
            stmt.setString(3, s.getCourse());
            stmt.setInt(4, s.getAge());
            stmt.executeUpdate();

            System.out.println("✅ Student added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Fetch all student records
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setCourse(rs.getString("course"));
                s.setAge(rs.getInt("age"));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
