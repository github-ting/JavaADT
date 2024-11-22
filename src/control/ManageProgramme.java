/**
 * @author CHUA CHUN YAN
 */
package control;

import adt.ArrayList;
import adt.ListInterface;
import entity.Programme;
import entity.TutorialGroup;
import entity.Course;

public class ManageProgramme {

    //A list that contains all programmes
    private static ListInterface<Programme> programmeList = new ArrayList<>();

    /**
     * Getter for a list that contains all programme
     *
     * @return A list that contains all programme
     */
    public static ListInterface<Programme> getProgrammeList() {
        return programmeList;
    }

    /**
     * Add a new programme into a programme list
     *
     * @param programmeCode Programme code of the new programme
     * @param programmeName Programme name of the new programme
     * @param programmeDesc Programme description of the new programme
     * @param faculty Faculty of the new programme
     * @param programmeDurationInMonths Programme duration of the new programme
     * @return Boolean indicating whether the operation is successful : -
     * {@code false} if the new programme to be added is existed in the
     * programme list, - {@code true} if the new programme is added successfully
     *
     * @throws Exception if the size of programme list reached its upper limit
     */
    public static boolean addProgramme(String programmeCode, String programmeName, String programmeDesc, String faculty, int programmeDurationInMonths) throws Exception {
        // Check if a programme with the given programme code already exists in the programme list.
        if (contains(programmeCode)) {
            // A programme with the same programme code exists, so return false (programme not added).
            throw new Exception("Programme with the same code existed!");
        }

        // Create a new Programme object using the provided information.
        Programme programme = new Programme(programmeCode.toUpperCase(), programmeName, programmeDesc,
                faculty.substring(0, 4), programmeDurationInMonths);

        // Attempt to add the new programme to the programme list.
        if (!programmeList.add(programme)) {
            // If the programme list is full and cannot accommodate more programmes, throw an exception.
            throw new Exception("Number of programme exceed the limit!");
        }

        // The new programme is successfully added to the programme list, so return true (programme added successfully).
        return true;
    }

    /**
     * Remove a programme from programme list based on its programme code
     *
     * @param programmeCode The programmeCode of the programme that's going to
     * be removed
     * @return Boolean indicating whether the operation is successful :
     * {@code false} if the programme with the programme code does not exist in
     * the programme list, {@code true} if the programme removed successfully
     */
    public static boolean removeProgramme(String programmeCode) {
        // Find the index of the programme with the given programme code in the programme list.
        int index = indexOf(programmeCode);

        if (index == -1) {
            // Programme with the given code not found, so return false (programme not removed).
            return false;
        } else {
            // Remove the programme from the programme list and return true (programme removed successfully).
            programmeList.remove(index);
            return true;
        }
    }

    /**
     * Remove the selected programme from programme list
     *
     * @param programme The programme object that's going to be removed
     * @return Boolean indicating whether the operation is successful : -
     * {@code false} if the programme does not exist in the programme list, -
     * {@code true} if the programme removed successfully
     */
    public static boolean removeProgramme(Programme programme) {
        if (!programmeList.contains(programme)) {
            // Programme not found, so return false (programme not removed).
            return false;
        } else {
            // Remove the programme from all the course taken by it
            ListInterface<Course> courseList = programme.getCourseList();

            for (int i = 0; i < courseList.size(); i++) {
                courseList.get(i).getProgrammeList().remove(programme);
            }

            // Remove the programme from the programme list and return true (programme removed successfully).
            programmeList.remove(programme);
            return true;
        }
    }

    /**
     * Remove all programme in the programme list
     */
    public static void removeAllProgramme() {
        // Remove all programme from programmeList
        programmeList.clear();

        // Remove all programme from all course
        ListInterface<Course> courseList = ManageCourse.getCourseList();

        for (int i = 0; i < courseList.size(); i++) {
            courseList.get(i).getProgrammeList().clear();
        }
    }

    /**
     * Find a specific programme from programme list based on its programme code
     *
     * @param programmeCode The programme code of the programme that's required
     * to be retrieve
     * @return The programme with the programme code, {@code null} if the
     * programme with the programme code does not exist in the programme list
     */
    public static Programme findProgrammeByCode(String programmeCode) {
        // Find the index of the programme with the given programme code in the programme list.
        int index = indexOf(programmeCode);

        if (index == -1) {
            // Programme with the given code not found, so return null.
            return null;
        } else {
            // Return the Programme object at the found index.
            return programmeList.get(index);
        }
    }

    /**
     * Find a specific programme from programme list based on its programme name
     *
     * @param programmeName The programme name of the programme that's required
     * to be retrieve
     * @return The programme with the programme name, {@code null} if the
     * programme with the programme name does not exist in the programme list
     */
    public static Programme findProgrammeByName(String programmeName) {
        for (int i = 0; i < programmeList.size(); i++) {
            if (programmeList.get(i).getProgrammeName().equalsIgnoreCase(programmeName)) {
                return programmeList.get(i);
            }
        }

        return null;
    }

    /**
     * Find a list of programmes from programme list based on all their
     * attribute's values, the parameters' value can be partially matched with
     * the programmes' values, and empty or null values are ignored for matching
     *
     * @return A list of programme that fulfill the searching keyword
     */
    public static ListInterface<Programme> findProgramme(String programmeCode, String programmeName, String programmeDesc, String faculty, int programmeDuration, int creditHour) {
        ListInterface<Programme> filteredProgramme = new ArrayList<>();
        programmeCode = programmeCode.toUpperCase();
        programmeName = programmeName.toUpperCase();
        programmeDesc = programmeDesc.toUpperCase();

        Programme programme = null;

        for (int i = 0; i < programmeList.size(); i++) {
            programme = programmeList.get(i);

            // Check if the programme matches the specified search criteria.
            if ((programmeCode.equals("") || programme.getProgrammeCode().contains(programmeCode))
                    && (programmeName.equals("") || programme.getProgrammeName().toUpperCase().contains(programmeName))
                    && (programmeDesc.equals("") || programme.getProgrammeDesc().toUpperCase().contains(programmeDesc))
                    && (faculty.equals("Select Faculty") || programme.getFaculty().toUpperCase().equals(faculty))
                    && (programmeDuration == -1 || programme.getProgrammeDurationInMonths() == programmeDuration)
                    && (creditHour == -1 || programme.getCreditHour() == creditHour)) {
                // Add the matched programme to the filtered list.
                filteredProgramme.add(programme);
            }
        }

        // Return the list of programmes that fulfill the search criteria.
        return filteredProgramme;
    }

    /**
     * Amend/edit details of a programme in the programme list
     *
     * @param programme The programme that's going to be edited
     * @param programmeCode The new programme code to be changed
     * @param programmeName The new programme name to be changed
     * @param programmeDesc The new programme description to be changed
     * @param programmeDuration The new programme duration to be changed
     * @return Boolean indicating whether the operation is successful : -
     * {@code false} if the programme does not exist in the programme list, -
     * {@code true} if the programme edited successfully
     */
    public static boolean amendProgrammeDetails(Programme programmeToEdit, String programmeCode, String programmeName, String programmeDesc, String faculty, int programmeDuration) throws Exception {
        if (!programmeList.contains(programmeToEdit)) {
            // Programme not found, so throw exception (programme not edited).
            throw new Exception("Programme not found!");
        }

        if (!programmeToEdit.getProgrammeCode().equals(programmeCode) && contains(programmeCode)) {
            throw new Exception("Programme with same programme code existed!");
        }

        //Edit programme details with given parameter, through setters.
        programmeToEdit.setProgrammeCode(programmeCode);
        programmeToEdit.setProgrammeName(programmeName);
        programmeToEdit.setProgrammeDesc(programmeDesc);
        programmeToEdit.setFaculty(faculty.substring(0, 4));
        programmeToEdit.setProgrammeDurationInMonths(programmeDuration);

        //Programme details amended, so return true
        return true;
    }

    /**
     * Add a tutorial group into a programme
     *
     * @param tutorialGroup The tutorial group that's going to be added
     * @param programme The programme that the tutorial group will be added to
     * @return Boolean indicating whether the operation is successful : -
     * {@code false} if the tutorial group existed in the programme, -
     * {@code true} if the tutorial group added successfully
     */
    public static boolean addTutorialGroupToProgramme(int groupNo, int year, int semester, Programme programme) {

        TutorialGroup tutorialGroup = new TutorialGroup(groupNo, year, semester);
        if (programme.getTutorialGroup().contains(tutorialGroup)) {
            // The tutorial group found in the programme, so return false (tutorial group not added).
            return false;
        }

        // Add the new tutorial group to the programme.
        programme.getTutorialGroup().add(tutorialGroup);

        // Tutorial group successfully added, return true.
        return true;
    }

    /**
     * Remove an existing tutorial group from a programme
     *
     * @param tutorialGroup The tutorial group that's going to be removed
     * @param programme The programme that the tutorial group will be removed
     * from
     * @return Boolean indicating whether the operation is successful : -
     * {@code false} if the tutorial group does not exist in the programme, -
     * {@code true} if the tutorial group removed successfully
     */
    public static boolean removeTutorialGroupFromProgramme(TutorialGroup tutorialGroup, Programme programme) {
        if (!programme.getTutorialGroup().contains(tutorialGroup)) {
            // The tutorial group is not found in the programme, so return false (tutorial group not removed).
            return false;
        }

        // Remove the specified tutorial group from the programme's list of tutorial groups.
        programme.getTutorialGroup().remove(tutorialGroup);

        // Tutorial group successfully removed, return true.
        return true;
    }

    /**
     * Remove all tutorial group from a programme
     *
     * @param programme The programme that the tutorial group will be removed
     * from
     */
    public static void removeAllTutorialGroupFromProgramme(Programme programme) {
        programme.getTutorialGroup().clear();
    }

    /**
     * List out all existing tutorial group in a programme
     *
     * @param programmeCode The programme code of the programme that contains
     * the tutorial group
     * @return A string that contains the formatted list of tutorial group in
     * the programme
     */
    public static String listTutorialGroupInProgramme(String programmeCode) {
        // Find the programme based on the given programme code.
        Programme programme = findProgrammeByCode(programmeCode);

        // If the programme is not found, return null.
        if (programme == null) {
            return null;
        }

        // Create a formatted string containing programme code, programme name, and tutorial group list.
        String str = programme.getProgrammeCode() + " " + programme.getProgrammeName() + "\n"
                + "===========================\n";

        ListInterface<TutorialGroup> tutorialGroup = programme.getTutorialGroup();
        tutorialGroup.sort();

        // Check if there are tutorial groups in the programme.
        if (tutorialGroup.isEmpty()) {
            str += "NONE"; // No tutorial groups found in the programme.
        } else {
            // Append the list of tutorial groups to the string.
            for (int i = 0; i < tutorialGroup.size(); i++) {
                str += (i + 1) + ". G" + tutorialGroup.get(i).toString() + "\n";
            }
        }

        // Return the formatted string containing programme details and tutorial group list.
        return str;
    }

    /**
     * Find a list of tutorial group from a specific programme attribute's values, 
     * , -1 are ignored for matching
     *
     * @param chosenProgramme Programme that contains the tutorial group
     * @return A list of tutorial group that fulfill the searching keyword
     */
    public static ListInterface<TutorialGroup> filterGroup(int groupNo, int year, int semester, int noOfStudent, Programme chosenProgramme) {
        ListInterface<TutorialGroup> filteredTutorialGroup = new ArrayList<>();

        TutorialGroup tutorialGroup = null;
        ListInterface<TutorialGroup> tutorialGroupList = chosenProgramme.getTutorialGroup();
        
        for (int i = 0; i < tutorialGroupList.size(); i++) {
            tutorialGroup = tutorialGroupList.get(i);

            // Check if the tutorial group matches the specified search criteria.
            if ((groupNo == -1 || tutorialGroup.getGroupNo() == groupNo)
                    && (year == -1 || tutorialGroup.getYear() == year)
                    && (semester == -1 || tutorialGroup.getSemester() == semester)
                    && (noOfStudent == -1 || tutorialGroup.getNoOfStudent() == noOfStudent)) {
                // Add the matched tutorial group to the filtered list.
                filteredTutorialGroup.add(tutorialGroup);
            }
        }

        // Return the list of tutorial group that fulfill the search criteria.
        return filteredTutorialGroup;
    }

    /**
     * Generate report for a specific programme in String format
     *
     * @param programme Programme that will be used to generate report
     * @return String which contains the report content of the programme
     */
    public static String generateReport(Programme programme) {
        StringBuilder reportContent = new StringBuilder();

        if (!programmeList.contains(programme)) {
            return "Programme not found!";
        }

        // Include programme basic info
        reportContent.append(programme.toString() + "\n\n");

        // Include courses in the programme
        reportContent.append("List of Course\n");

        Course course = null;

        if (programme.getCourseList().isEmpty()) {
            reportContent.append("  - none\n");
        } else {
            for (int i = 0; i < programme.getCourseList().size(); i++) {
                course = programme.getCourseList().get(i);
                reportContent.append(String.format("  %2d. %-5s %-30s %d\n",
                        (i + 1), course.getCourseCode(), course.getCourseName(), course.getCreditHour()));
            }
        }

        // Include tutorial group in the programme
        reportContent.append("\nList of Tutorial Group\n");

        TutorialGroup tutorialGroup = null;

        if (programme.getTutorialGroup().isEmpty()) {
            reportContent.append("  - none\n");
        } else {
            programme.getTutorialGroup().sort("groupNo", "year", "semester");
            for (int j = 0; j < programme.getTutorialGroup().size(); j++) {
                tutorialGroup = programme.getTutorialGroup().get(j);
                reportContent.append(String.format("  %2d. G%d Y%d S%d\n",
                        (j + 1), tutorialGroup.getGroupNo(), tutorialGroup.getYear(), tutorialGroup.getSemester()));
            }
        }

        return reportContent.toString();
    }

    /**
     * Get the index of the programme in programme list based on its programme
     * code
     *
     * @param programmeCode The programme code of the programme that's going to
     * be retrieved
     * @return The index of the programme with the given programme code in
     * programme list, {@code -1} if the programme with given programme code
     * does not exist in the programme list
     */
    public static int indexOf(String programmeCode) {
        programmeCode = programmeCode.toUpperCase();
        for (int i = 0; i < programmeList.size(); i++) {
            if (programmeList.get(i).getProgrammeCode().equals(programmeCode)) {
                // The programme with the given programme code is found, so return its index.
                return i;
            }
        }

        // The programme with the given programme code is not found in the programme list, so return -1.
        return -1;
    }

    /**
     * Check whether a programme with given programme code exist in programme
     * list
     *
     * @param programmeCode The programme code of the programme that's going to
     * be checked
     * @return Boolean indicating whether the programme exist in the programme
     * list : - {@code false} programme with given programme code does not exist
     * programme list, - {@code true} programme with given programme code exist
     * programme list
     */
    public static boolean contains(String programmeCode) {
        programmeCode = programmeCode.toUpperCase();

        for (int i = 0; i < programmeList.size(); i++) {
            if (programmeList.get(i).getProgrammeCode().equals(programmeCode)) {
                // The programme with the given programme code is found, so return true.
                return true;
            }
        }

        // The programme with the given programme code is not found in the programme list, so return false.
        return false;
    }
}
