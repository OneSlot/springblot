package demodb.demo.controller;

import demodb.demo.model.Student;
import demodb.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentService studentService;


    @GetMapping("/creation")
    public ResponseEntity<String> create() {

        Arrays.asList(new Student("Thaw Thaw", 23, "Latha"),
                new Student("Max Max", 21, "Yangon"),
                new Student("Khaing", 23, "MDY")).stream().forEach(studentService::create);

        return new ResponseEntity<String>("successfully created", HttpStatus.OK);

    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> showAllStudent() {
        return studentService.findAllStudents();
    }


    @GetMapping(value = "/all/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student showStudentById(@PathVariable("id") int id) {
        return studentService.findById(id);

    }


}