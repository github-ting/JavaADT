/**
 * 
 * @author Ting Jian Hao
 */
package control;

import adt.ArraySet;
import adt.SetInterface;
import entity.Tutor;

public class TutorManager {
    
    private static SetInterface<Tutor> tutorList = new ArraySet<>();
    
    public boolean addTutor(Tutor tutor) {
        return tutorList.add(tutor);
    }
    
    public static SetInterface<Tutor> getTutorList() {
        return tutorList;
    }
    
    public static Tutor findTutor(String search) {
        search = search.toUpperCase();
        
        for (Tutor tutor : tutorList) {
            String tutorIdUpper = tutor.getTutorId().toUpperCase();
            String tutorNameUpper = tutor.getTutorName().toUpperCase();
            
            if (search.equalsIgnoreCase(tutorIdUpper) || search.equalsIgnoreCase(tutorNameUpper)) {
                return tutor;
            }
        }
        return null;
    }
    
    public static void removeTutor(Tutor tutor) {
        tutorList.remove(tutor);
    }
    
    public static boolean editTutor(Tutor tutor, String id, String name, String gender, String work, String email) {
        
        for (Tutor tutors : tutorList) {
            String tutorId = tutors.getTutorId();
            String tutorName = tutors.getTutorName();
            
            if (tutorId.equalsIgnoreCase(tutor.getTutorId()) || tutorName.equalsIgnoreCase(tutor.getTutorName())) {
                Tutor newTutor = new Tutor(id, name, gender, work, email);
                if (!tutorList.contains(newTutor)) {
                    tutorList.set(tutors, newTutor);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static String reportTutor() {
        return tutorList.toString();
    }
    
    public SetInterface<Tutor> filterTutor(String gender, String work) {
        SetInterface<Tutor> filteredTutor = new ArraySet<>();
        
        for (Tutor tutor : tutorList) {
            if ((gender.equalsIgnoreCase(tutor.getTutorGender()) || gender.equals("")) && (work.equalsIgnoreCase(tutor.getTutorWork())
                    || work.equals(""))) {
                filteredTutor.add(tutor);
            }
        }
        
        return filteredTutor;
    }
    
    public static SetInterface<Tutor> filterTutor(String work) {
        SetInterface<Tutor> filteredTutor = new ArraySet<>();
        
        for (Tutor tutor : tutorList) {
            if (tutor.getTutorWork().equalsIgnoreCase(work)) {
                filteredTutor.add(tutor);
            }
        }
        
        return filteredTutor;
    }
    
    public static SetInterface<Tutor> sortTutor(SetInterface<Tutor> tutors) {
        tutors.sort("tutorName");
        return tutors;
    }
}
