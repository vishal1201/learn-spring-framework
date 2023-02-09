package in.pelligent.learnjpaandhibernate.course;

import in.pelligent.learnjpaandhibernate.course.Course;
import in.pelligent.learnjpaandhibernate.course.jdbc.CourseJDBCRepository;
import in.pelligent.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJDBCRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "AWS", "in28minutes"));
        repository.save(new Course(2, "Learn Spring Boot", "in28minutes"));
        repository.save(new Course(3, "DevOps", "in28minutes"));
        repository.deleteById(3L);
        Optional<Course> course = repository.findById(2L);
        System.out.println("Retrieved Course by ID=2: " + course);

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("AWS"));
        System.out.println(repository.findByName("DevOps"));
    }
}
