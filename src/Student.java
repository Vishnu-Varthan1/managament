public class Student {
    private int id;
    private String name;
    private String course;
    private int age;

    public Student() {}

    public Student(int id, String name, String course, int age) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public int getAge() { return age; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCourse(String course) { this.course = course; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + course + " | " + age;
    }
}
