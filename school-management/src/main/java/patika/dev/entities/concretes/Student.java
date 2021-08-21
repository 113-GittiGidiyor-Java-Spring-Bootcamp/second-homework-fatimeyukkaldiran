package patika.dev.entities.concretes;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // it controls id that is unique on db
    private int id;
    private String name;
    private String address;
    private LocalDate birthDate;
    private String gender;

   @ManyToMany
   private List<Course> courseList = new ArrayList<Course>();

    public Student() {}

    public Student(String name, String address, LocalDate birthdate, String gender) {
        this.name = name;
        this.address = address;
        this.birthDate = birthdate;
        this.gender = gender;
    }

    public LocalDate getBirthDate() {

        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {

        this.birthDate = birthDate;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Course> getCourseList() {

        return courseList;
    }

    public void setCourseList(List<Course> courseList) {

        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}

