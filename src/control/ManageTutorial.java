/**
 *
 * @author NG YOO SIN
 */
package control;

import entity.TutorialGroup;
import entity.Student;
import adt.ArrayList;
import adt.ListInterface;

public class ManageTutorial {

    private static ListInterface<TutorialGroup> tutorialGroups = new ArrayList<>();

    public static ListInterface<TutorialGroup> getTutorialGroup() {
        return tutorialGroups;
    }

    public static void addStudentToTutorialGroup(Student std, int grpNo) {
        for (int i = 0; i < tutorialGroups.size(); i++) {
            if (tutorialGroups.get(i).getGroupNo() == grpNo) {
                TutorialGroup tg = tutorialGroups.get(i);
                tg.addStudent(std);
            }
        }
    }

    public static void removeStudentFromTutorialGroup(Student std, int grpNo) {
        for (int i = 0; i < tutorialGroups.size(); i++) {
            if (tutorialGroups.get(i).getGroupNo() == grpNo) {
                ListInterface<Student> tg = tutorialGroups.get(i).getStudentList();
                for (int j = 0; j < tg.size(); j++) {
                    if (std.getStdID() == tg.get(j).getStdID()) {
                        tg.remove(j);
                    }
                }
            }
        }
    }
    
      public ListInterface<Student> searchContains(int id) {
        ListInterface<Student> stud = new ArrayList<>();

        if (id == -1) {
            return stud;
        }

        String search = String.valueOf(id);
        for (int i = 0; i < tutorialGroups.size(); i++) {
            ListInterface<Student> st = tutorialGroups.get(i).getStudentList();
            for (int j = 0; j < st.size(); j++) {
                String studentId = String.valueOf(st.get(j).getStdID());

                if (studentId.contains(search)) {
                    stud.add(st.get(j));
                }
            }
        }
        return stud;
    }

    // to search the specific student
    public ListInterface<Student> search(int id) {
        ListInterface<Student> stud = new ArrayList<>();
        if (id == -1) {   // return if id = -1
            return stud;
        }

        for (int i = 0; i < tutorialGroups.size(); i++) {   
            ListInterface<Student> st = tutorialGroups.get(i).getStudentList();  
            for (int j = 0; j < st.size(); j++) {  
                Student std = st.get(j);

                if (std.getStdID() == id) {
                    stud.add(std);  
                }
            }
        }
        return stud;
    }

    //search where the group the student inside
    public ListInterface<Integer> grpSearch(int id) {
        ListInterface<Integer> grp = new ArrayList<>(); 
        for (int i = 0; i < tutorialGroups.size(); i++) { 
            ListInterface<Student> st = tutorialGroups.get(i).getStudentList(); 
            for (int j = 0; j < st.size(); j++) {
                Student std = st.get(j);
                if (std.getStdID() == id) {
                    int g = tutorialGroups.get(i).getGroupNo();
                    grp.add(g);
                }
            }
        }
        return grp;
    }

    public int getAllGrp() {
        return tutorialGroups.size();
    }

}
