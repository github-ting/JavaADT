package control;

import entity.Student;
import adt.*;

public class ManageStudent {
    private static ListInterface<Student> studentList = new ArrayList<>();
    
    public static void addStudent() {
        studentList.add(new Student());
    }
}
