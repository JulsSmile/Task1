package task2;

public class Student extends Person{
    private Integer id;
    private String faculty;
    private Integer course;
    private Integer group;

    public Student(String firstName, String lastName, String middleName, Integer birsday, String address, Integer phoneNumber, Integer id, String faculty, Integer course, Integer group) {
        super(firstName, lastName, middleName, birsday, address, phoneNumber);
        this.id = id;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + lastName + id + faculty + course + group + address;
    }

    public String getFaculty() {
        return faculty;
    }

    public Integer getGroup() {
        return group;
    }
}