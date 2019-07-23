package demodb.demo.repository;

import demodb.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Studentrepository extends JpaRepository<Student, Integer> {


}
