package demodb.demo.service;

import demodb.demo.model.Student;

import java.util.List;

public interface StudentService {

    Student create(Student s);

    List<Student> findAllStudents();

    Student findById(int id);

}
