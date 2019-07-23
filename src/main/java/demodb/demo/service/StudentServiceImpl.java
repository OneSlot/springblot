package demodb.demo.service;

import demodb.demo.model.Student;
import demodb.demo.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private Studentrepository studentrepository;

    @Override
    public Student create(Student s) {
        return studentrepository.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentrepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentrepository.getOne(id);
    }
}
