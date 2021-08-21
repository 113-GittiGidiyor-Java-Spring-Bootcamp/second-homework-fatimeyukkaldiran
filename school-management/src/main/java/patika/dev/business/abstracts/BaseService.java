package patika.dev.business.abstracts;

import java.util.List;

public interface BaseService<T> {
    List<T> getAll();
    T getById(int id);
    T add(T object);
    void delete(int id);
    T update(T object);

}
