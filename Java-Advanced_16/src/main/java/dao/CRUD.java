package dao;

import java.util.List;

public interface CRUD {
    Student create(Student student);
    Student read(int id);
    Student update(Student student);
    void delete(int id);
    List<Student> readAll();
}
