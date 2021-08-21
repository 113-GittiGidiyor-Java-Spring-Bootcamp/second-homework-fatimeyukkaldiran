package patika.dev.dataAccess.abstracts;

import org.springframework.stereotype.Repository;
import patika.dev.entities.concretes.Student;

import java.util.List;

@Repository
public interface StudentDao extends BaseDao<Student> {
    List<Student> getListByCourse(int courseId);

}
