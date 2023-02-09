package in.pelligent.learnjpaandhibernate.course.jdbc;

import in.pelligent.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

    private static final String DELETE_QUERY = "DELETE FROM Course where id=?";
    private static final String INSERT_QUERY =
            """
                        insert into course(id, name, author)
                        values (?, ?, ?);
                    """;
    private static final String SELECT_QUERY = "SELECT * FROM Course WHERE id=?";
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY, course.getID(), course.getName(), course.getAuthor());
    }

    public void deleteById(Long ID) {
        jdbcTemplate.update(DELETE_QUERY, ID);
    }

    public Course findById(Long ID) {
        return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), ID);
        // ResultSet -> Bean
    }
}
