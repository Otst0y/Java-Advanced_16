package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements CRUD{

    List<Student> students = new ArrayList<>();

    @Override
    public Student create(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student read(int id) {
        return students.get(id);
    }

    @Override
    public Student update(Student student) {
        students.set(student.getId() - 1, student);
        return student;
    }

    @Override
    public void delete(int id) {
        students.remove(id);
    }

    @Override
    public List<Student> readAll() {
        return students;
    }
}
