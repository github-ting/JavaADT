package entity;

import adt.ArrayList;
import java.io.Serializable;
import adt.ListInterface;

/**
 *
 * @author Acer
 */
public class Course implements Serializable {

    private String courseCode;
    private String courseName;
    private int creditHour;
    private String courseDesc;
    private ListInterface<Programme> programmeList = new ArrayList<>();

    public Course() {

    }

    public Course(String courseCode, String courseName, int creditHour, String courseDesc) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHour = creditHour;
        this.courseDesc = courseDesc;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public ListInterface<Programme> getProgrammeList() {
        return programmeList;
    }

    public void setProgrammeList(ListInterface<Programme> programmeList) {
        this.programmeList = programmeList;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Course)) {
            return false;
        }
        
        return ((Course)object).courseCode.equals(courseCode);
    }
}
