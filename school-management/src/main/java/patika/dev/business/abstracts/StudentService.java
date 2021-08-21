package patika.dev.business.abstracts;

import patika.dev.entities.concretes.Student;

import java.util.List;

public interface StudentService extends BaseService<Student>{
    List<Student> getListByCourse(int courseId);


}
