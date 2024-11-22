package entity;

import entity.*;
import adt.*;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TutorialGroup implements Serializable {

    private int groupNo;
    private int year;
    private int semester;
    private ListInterface<Student> studentList;

    public TutorialGroup() {

    }

    public TutorialGroup(int groupNo) {
        this.groupNo = groupNo;
        studentList = new ArrayList<>();
    }

    public TutorialGroup(int groupNo, int year, int semester) {
        this.groupNo = groupNo;
        this.year = year;
        this.semester = semester;
        studentList = new ArrayList<>();
    }

    public int getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public ListInterface<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ListInterface<Student> studentList) {
        this.studentList = studentList;
    }

    public int getNoOfStudent() {
        return studentList.size();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    @Override
    public String toString() {
        return String.format("Group No      : %d\n"
                + "Year          : %d\n"
                + "Semester      : %d\n"
                + "No of Student : %d", groupNo, year, semester, studentList.size());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TutorialGroup)) {
            return false;
        }

        TutorialGroup anotherGroup = (TutorialGroup) o;

        return (groupNo == anotherGroup.groupNo)
                && (year == anotherGroup.year)
                && (semester == anotherGroup.semester);
    }

    public int compareTo(TutorialGroup anotherGroup, String... attributeNames) throws Exception {
        int result = 0;

        for (String attributeName : attributeNames) {
            try {
                Field field = getClass().getDeclaredField(attributeName);

//                if (!Comparable.class.isAssignableFrom(field.getType())) {
//                    throw new IllegalArgumentException("Attribute is not comparable!");
//                }
                result = ((Comparable<Object>) field.get(this))
                        .compareTo((Comparable<Object>) field.get(anotherGroup));

                if (result != 0) {
                    return result; // Attributes are not equal, return comparison result
                }
            } catch (NoSuchFieldException e) {
                try {
                    Method method = getClass().getMethod(attributeName);

                    result = ((Comparable<Object>) method.invoke(this))
                            .compareTo((Comparable<Object>) method.invoke(anotherGroup));

                    if (result != 0) {
                        return result; // Attributes are not equal, return comparison result
                    }
                } catch (Exception ex) {
                    throw new IllegalArgumentException("Invalid attribute name: " + attributeName, e);
                }
            }
        }

        return result; // All attributes are equal
    }
}
