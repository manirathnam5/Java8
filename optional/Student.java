package optional;

public class Student {

    private String name ;

    private Integer id ;

    private String college;

    private String location ;

    private String department;

    public Student(String name, Integer id, String college, String location, String department) {
        this.name = name;
        this.id = id;
        this.college = college;
        this.location = location;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", college='" + college + '\'' +
                ", location='" + location + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
