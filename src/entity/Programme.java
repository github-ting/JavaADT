package entity;

import adt.*;
import java.lang.reflect.Field;

public class Programme {

    private String programmeCode;
    private String programmeName;
    private String programmeDesc;
    private String faculty;
    private Integer programmeDurationInMonths;
    private Integer creditHour = 0;
    private ListInterface<TutorialGroup> tutorialGroup = new ArrayList<>();
    private ListInterface<Course> courseList = new ArrayList<>();

    public Programme() {

    }

    public Programme(String programmeCode, String programmeName, String programmeDesc, String faculty, int programmeDurationInMonths) {
        this.programmeCode = programmeCode;
        this.programmeName = programmeName;
        this.programmeDesc = programmeDesc;
        this.faculty = faculty;
        this.programmeDurationInMonths = programmeDurationInMonths;
    }

    public String getProgrammeCode() {
        return programmeCode;
    }

    public void setProgrammeCode(String programmeCode) {
        this.programmeCode = programmeCode;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public String getProgrammeDesc() {
        return programmeDesc;
    }

    public void setProgrammeDesc(String programmeDesc) {
        this.programmeDesc = programmeDesc;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getProgrammeDurationInMonths() {
        return programmeDurationInMonths;
    }

    public void setProgrammeDurationInMonths(int programmeDurationInMonths) {
        this.programmeDurationInMonths = programmeDurationInMonths;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    public ListInterface<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ListInterface<Course> courseList) {
        this.courseList = courseList;
    } 

    public boolean addCourse(Course course) {
        if (courseList.add(course)) {
            creditHour += course.getCreditHour();
            return true;
        }
        
        return false;
    }
    
    public boolean removeCourse(Course course) {
        if (courseList.remove(course)) {
            creditHour -= course.getCreditHour();
            return true;
        }
        
        return false;
    }
    
    public ListInterface<TutorialGroup> getTutorialGroup() {
        return tutorialGroup;
    }

    public void setTutorialGroup(ListInterface<TutorialGroup> tutorialGroup) {
        this.tutorialGroup = tutorialGroup;
    }

    @Override
    public String toString() {
        return String.format("Code        : %s\n"
                + "Name        : %s\n"
                + "Description : %s\n"
                + "Faculty     : %s\n"
                + "Duration    : %d months\n"
                + "Credit hour : %d", programmeCode, programmeName, programmeDesc, faculty, programmeDurationInMonths, creditHour);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Programme)) {
            return false;
        }

        return ((Programme) o).getProgrammeCode().equals(programmeCode);
    }

    public int compareTo(Programme anotherProgramme, String... attributeNames) throws Exception {
        int result = 0;

        for (String attributeName : attributeNames) {
            try {
                Field field = getClass().getDeclaredField(attributeName);

                if (!Comparable.class.isAssignableFrom(field.getType())) {
                    throw new IllegalArgumentException("Attribute is not comparable!");
                }

                result = ((Comparable<Object>) field.get(this))
                    .compareTo((Comparable<Object>) field.get(anotherProgramme));

                if (result != 0) {
                    return result; // Attributes are not equal, return comparison result
                }
            } catch (NoSuchFieldException e) {
                throw new IllegalArgumentException("Invalid attribute name: " + attributeName, e);
            }
        }

        return result; // All attributes are equal
    }
}
