package patika.dev.dataAccess.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import patika.dev.dataAccess.abstracts.StudentDao;
import patika.dev.entities.concretes.Student;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDaoJpaImpl implements StudentDao {
//just db code

private EntityManager entityManager;
    @Autowired
    public StudentDaoJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> getAll() {
        return this.entityManager.createQuery("from Student s",Student.class).getResultList();
    }

    @Override
    public Student getById(int id) {

        return entityManager.find(Student.class,id);
    }

    @Transactional
    @Override
    public Student add(Student student) {
       return this.entityManager.merge(student);
    }

    @Transactional
    @Override
    public void delete(int id) {
        Student student = this.getById(id);
        entityManager.remove(student);
    }
    @Transactional
    @Override
    public Student update(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public List<Student> getListByCourse(int courseId) {
        return null;
    }
}
