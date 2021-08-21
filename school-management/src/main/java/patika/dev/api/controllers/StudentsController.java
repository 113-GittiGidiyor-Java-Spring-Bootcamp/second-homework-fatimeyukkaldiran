package patika.dev.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import patika.dev.business.abstracts.StudentService;
import patika.dev.entities.concretes.Student;

import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentsController {
    //just manage http request here
    private StudentService studentService;

    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

@GetMapping("/getall")
public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(this.studentService.getAll(), HttpStatus.OK);
}
@PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
      return  studentService.add(student);
}
@GetMapping("/get/{id}")
public ResponseEntity<Student> getStudentById(@PathVariable int id){
        return new ResponseEntity<>(studentService.getById(id),HttpStatus.OK);
}
@PutMapping("/update")
public Student updateEmployee(@RequestBody Student student){
        return studentService.update(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable int id){
        studentService.delete(id);
        return "Deleted...";
    }
}
