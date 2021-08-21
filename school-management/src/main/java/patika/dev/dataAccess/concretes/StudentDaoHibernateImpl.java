package patika.dev.dataAccess.concretes;

import org.hibernate.Session;
import patika.dev.dataAccess.abstracts.StudentDao;
import patika.dev.entities.concretes.Student;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentDaoHibernateImpl implements StudentDao {
    private EntityManager entityManager;

    public StudentDaoHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Student", Student.class).getResultList();
    }

    @Override
    public Student getById(int id) {
        return null;
    }

    @Override
    public Student add(Student student) {
        Session session = entityManager.unwrap(Session.class);
        return (Student) session.merge(student);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public List<Student> getListByCourse(int courseId) {
        return null;
    }
}

