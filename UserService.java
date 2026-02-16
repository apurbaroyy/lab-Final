public class Student {
    private int id;
    private String name;
    private double cgpa;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }
}
public boolean insertDB(int id, String name, double cgpa) {
    this.getConnection();
    String sql = "INSERT INTO STUDENTS(ID, NAME, CGPA) VALUES(?, ?, ?)";
    try {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, cgpa);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) { e.printStackTrace(); } 
    finally { closeAll(); }
    return false;
}

public List<String> viewDB() {
    List<String> result = new ArrayList<>();
    this.getConnection();
    String sql = "SELECT ID, NAME, CGPA FROM STUDENTS";
    try {
        ps = connection.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            result.add("ID: " + rs.getInt("ID") + ", Name: " + rs.getString("NAME") + ", CGPA: " + rs.getDouble("CGPA"));
        }
    } catch (SQLException e) { e.printStackTrace(); } 
    finally { closeAll(); }
    return result;
}
public boolean insertDB(int id, String name, double cgpa) {
    this.getConnection();
    String sql = "INSERT INTO STUDENTS(ID, NAME, CGPA) VALUES(?, ?, ?)";
    try {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, cgpa);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) { e.printStackTrace(); } 
    finally { closeAll(); }
    return false;
}

public List<String> viewDB() {
    List<String> result = new ArrayList<>();
    this.getConnection();
    String sql = "SELECT ID, NAME, CGPA FROM STUDENTS";
    try {
        ps = connection.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            result.add("ID: " + rs.getInt("ID") + ", Name: " + rs.getString("NAME") + ", CGPA: " + rs.getDouble("CGPA"));
        }
    } catch (SQLException e) { e.printStackTrace(); } 
    finally { closeAll(); }
    return result;
}
public boolean insertDB(int id, String name, double cgpa) {
    this.getConnection();
    String sql = "INSERT INTO STUDENTS(ID, NAME, CGPA) VALUES(?, ?, ?)";
    try {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, cgpa);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) { e.printStackTrace(); } 
    finally { closeAll(); }
    return false;
}

public List<String> viewDB() {
    List<String> result = new ArrayList<>();
    this.getConnection();
    String sql = "SELECT ID, NAME, CGPA FROM STUDENTS";
    try {
        ps = connection.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            result.add("ID: " + rs.getInt("ID") + ", Name: " + rs.getString("NAME") + ", CGPA: " + rs.getDouble("CGPA"));
        }
    } catch (SQLException e) { e.printStackTrace(); } 
    finally { closeAll(); }
    return result;
}
