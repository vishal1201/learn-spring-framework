package in.pelligent.learnjpaandhibernate.course.jpa;

import in.pelligent.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext // Use this over @Autowired.
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long ID) {
        return entityManager.find(Course.class, ID);
    }

    public void deleteById(long ID) {
        Course course = entityManager.find(Course.class, ID);
        entityManager.remove(course);
    }
}
