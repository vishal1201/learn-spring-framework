package in.pelligent.learnjpaandhibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Entity(name = "course_details")
public class Course {

    @Id
    private long ID;

    //    @Column(name = "name")
    private String name;

    //    @Column(name = "author")
    private String author;

    public Course() {
    }

    public Course(long ID, String name, String author) {
        this.ID = ID;
        this.name = name;
        this.author = author;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
