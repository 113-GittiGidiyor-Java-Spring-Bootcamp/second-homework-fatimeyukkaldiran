package patika.dev.dataAccess.abstracts;

import java.util.List;

public interface BaseDao<T> {
    List<T> getAll();
    T getById(int id);
    T add(T object);
    void delete(int id);
    T update(T object);
}
