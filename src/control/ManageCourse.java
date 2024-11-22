/**
 * @author WONG QIAN YU
 */

package control;

import adt.ArrayList;
import adt.ListInterface;
import entity.Course;
import entity.Programme;

public class ManageCourse {

    private static ListInterface<Course> courseList = new ArrayList<>();
    
    public static ListInterface<Course> getCourseList() {
        return courseList;
    }

    public static boolean addCourse(String courseCode, String courseName, int creditHour, String courseDesc) {

        if (checkSimilar(courseCode)) {
            return false;
        }

        Course course = new Course(courseCode.toUpperCase(), courseName, creditHour, courseDesc);
        courseList.add(course);

        return true;
    }

    public static boolean checkSimilar(String courseCode) {
        courseCode = courseCode.toUpperCase();

        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseCode().equals(courseCode)) {
                return true;
            }
        }

        return false;
    }

    public static String listCourse() {
        String allCourse = "";
        Course course = null;

        for (int i = 0; i < courseList.size(); i++) {
            course = courseList.get(i);

            allCourse = allCourse + "Course name : " + course.getCourseName() + "\n"
                    + "Course Code : " + course.getCourseCode() + "\n"
                    + "Credit Hour : " + course.getCreditHour() + "\n"
                    + "Course Description : " + course.getCourseDesc() + "\n\n";
        }

        return allCourse;
    }

    public static boolean removeCourse(String code) {
        code = code.toUpperCase();
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseCode().equals(code)) {
                ListInterface<Programme> programmeList = courseList.get(i).getProgrammeList();
                Course course = courseList.get(i);
                
                for (int j = 0; j < programmeList.size(); j++) {
                    programmeList.get(j).removeCourse(course);
                }
                
                courseList.remove(course);
                return true;
            }
        }

        return false;
    }

    public static void amendCourse(String code, String name, String newCode, int creditHour, String desc) {
        code = code.toUpperCase();
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseCode().equals(code)) {
                courseList.get(i).setCourseCode(newCode.toUpperCase());
                courseList.get(i).setCourseName(name);
                courseList.get(i).setCreditHour(creditHour);
                courseList.get(i).setCourseDesc(desc);
                break;
            }
        }
    }

    public static boolean removeProgFromCourse(String courseCode, String progName) throws IllegalArgumentException {
        Course course = findCourse(courseCode);

        if (course == null) {
            throw new IllegalArgumentException("Course not found: " + courseCode);
        }

        Programme programme = ManageProgramme.findProgrammeByName(progName);

        if (programme == null) {
            throw new IllegalArgumentException("Programme not found: " + progName);
        }

        if (course.getProgrammeList().contains(programme)) {
            throw new IllegalArgumentException("Programme " + progName + " is already existed in course " + courseCode);
        }

        programme.removeCourse(course);

        return course.getProgrammeList().remove(programme);
    }

    public static boolean addProgToCourse(String courseCode, String progName) throws IllegalArgumentException {
        Course course = findCourse(courseCode);

        if (course == null) {
            throw new IllegalArgumentException("Course not found: " + courseCode);
        }

        Programme programme = ManageProgramme.findProgrammeByName(progName);

        if (programme == null) {
            throw new IllegalArgumentException("Programme not found: " + progName);
        }

        if (course.getProgrammeList().contains(programme)) {
            throw new IllegalArgumentException("Programme " + progName + " is already existed in course " + courseCode);
        }

        programme.addCourse(course);

        return course.getProgrammeList().add(programme);
    }

    public static Course findCourse(String courseCode) {
        courseCode = courseCode.toUpperCase();
        
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseCode().equals(courseCode)) {
                return courseList.get(i);
            }
        }

        return null;
    }

    public static String listProgInCourse() {
        String allCourse = "";
        Course course = null;
        for (int i = 0; i < courseList.size(); i++) {
            course = courseList.get(i);

            allCourse += "Course name : " + course.getCourseName() + "\n"
                    + "Course Code : " + course.getCourseCode() + "\n"
                    + "Programme that study this course : \n";

            if (course.getProgrammeList().isEmpty()) {
                allCourse += "  - none\n";
            } else {
                for (int j = 0; j < course.getProgrammeList().size(); j++) {
                    allCourse += "  " + (j + 1) + ". " + course.getProgrammeList().get(j).getProgrammeName() + "\n";
                }
            }

            allCourse += "\n";
        }

        return allCourse;
    }

    public static String report() {

        int number = courseList.size();
        String courseName = "";
        for (int i = 0; i < courseList.size(); i++) {
            courseName = courseName + courseList.get(i).getCourseName() + "\n";
        }

        return "There are " + number + " courses in this campus, which include : " + "\n" + courseName;
    }
}
