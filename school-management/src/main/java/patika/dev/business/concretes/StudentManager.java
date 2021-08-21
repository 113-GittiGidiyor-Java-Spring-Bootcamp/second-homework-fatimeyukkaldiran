package patika.dev.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import patika.dev.business.abstracts.StudentService;
import patika.dev.dataAccess.abstracts.StudentDao;
import patika.dev.entities.concretes.Student;

import java.util.List;

@Service
public class StudentManager implements StudentService {
    //just business code

    private StudentDao studentDao;

    @Autowired
    public StudentManager(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getAll(){
    return this.studentDao.getAll();
    }

    @Override
    public Student getById(int id) {

        return this.studentDao.getById(id);
    }

    @Override
    public Student add(Student student) {

        return this.studentDao.add(student);
    }

    @Override
    public void delete(int id) {

        this.studentDao.delete(id);
    }

    @Override
    public Student update(Student student) {

       return (Student) this.studentDao.update(student);
    }

    @Override
    public List<Student> getListByCourse(int courseId) {

        return this.studentDao.getListByCourse(courseId);
    }
}
