package init;

import entity.*;
import control.*;
import static control.ManageTutorial.addStudentToTutorialGroup;

/**
 *
 * @author chuac
 */
public class DataInitializer {

    public static void initializeAllData() {
        initializeProgramme();
        initializeCourse();
        initializeTutor();
        initializeTutorialGroup();
    }

    public static void initializeProgramme() {
        // declaration of test data
        String[] programmeCode = {
            "DAC", "DAD", "DAQ", "DBF", "DBU", "DBI", "DBA", "DBE", "DCM", "DCS",
            "DCO", "DCA", "DEM", "DEC", "DEE", "DEN", "DEV", "DFD", "DFI", "DFS",
            "DGD", "DHT", "DHR", "DIB", "DIS", "DIT", "DJR", "DLS", "DMT", "DMA",
            "DME", "DMC", "DMS", "DMD", "DPR", "DPT", "DQS"
        };
        String[] programmeName = {
            "Diploma in Accounting", "Diploma in Advertising", "Diploma in Aquaculture",
            "Diploma in Banking & Finance", "Diploma in Broadcast Communication",
            "Diploma in Building", "Diploma in Business Administration",
            "Diploma in Business Economics", "Diploma in Communication & Media Studies",
            "Diploma in Computer Science", "Diploma in Counselling", "Diploma in Culinary Arts",
            "Diploma in E-Marketing", "Diploma in Early Childhood Education",
            "Diploma in Electronic Engineering", "Diploma in Entrepreneurship",
            "Diploma in Event Management", "Diploma in Fashion Design",
            "Diploma in Finance & Investment", "Diploma in Food Science",
            "Diploma in Graphic Design", "Diploma in Hotel Management",
            "Diploma in Human Resource Management", "Diploma in International Business",
            "Diploma in Information Systems", "Diploma in Information Technology",
            "Diploma in Journalism", "Diploma in Logistics & Supply Chain Management",
            "Diploma in Manufacturing Technology", "Diploma in Marketing",
            "Diploma in Mechanical Engineering", "Diploma in Mechatronic Engineering",
            "Diploma in Media Studies", "Diploma in Multimedia Design",
            "Diploma in Public Relations", "Diploma in Product Development Technology",
            "Diploma in Quantity Surveying"
        };
        String[] programmeDesc = {
            "Learn accounting principles and practices.",
            "Explore the world of advertising and marketing.",
            "Study aquaculture and fisheries.",
            "Understand the world of finance and banking.",
            "Learn about broadcasting and communication.",
            "Study building and construction.",
            "Explore the basics of business administration.",
            "Understand economics in business contexts.",
            "Study communication and media.",
            "Explore the world of computer science.",
            "Learn about counselling.",
            "Study culinary arts.",
            "Study e-marketing strategies.",
            "Learn about early childhood education.",
            "Study electronic engineering.",
            "Explore entrepreneurship.",
            "Learn event management principles.",
            "Study fashion design.",
            "Study finance and investment.",
            "Learn about food science.",
            "Explore graphic design principles.",
            "Study hotel management.",
            "Learn about human resource management.",
            "Study international business.",
            "Learn about information systems.",
            "Explore the world of information technology.",
            "Study journalism principles.",
            "Learn about logistics and supply chain management.",
            "Study manufacturing technology.",
            "Learn about marketing principles.",
            "Study mechanical engineering.",
            "Explore mechatronic engineering.",
            "Study media and communication.",
            "Explore multimedia design.",
            "Learn about public relations.",
            "Study product development technology.",
            "Explore quantity surveying principles."
        };

        String[] faculty = {
            "FAFB", "FCCI", "FOAS", "FAFB", "FCCI", "FOBE", "FAFB", "FAFB", "FCCI", "FOCS",
            "FSSH", "FAFB", "FAFB", "FSSH", "FOET", "FAFB", "FAFB", "FCCI", "FAFB", "FOAS",
            "FCCI", "FAFB", "FAFB", "FAFB", "FAFB", "FAFB", "FCCI", "FAFB", "FOET", "FAFB",
            "FOET", "FOET", "FCCI", "FCCI", "FCCI", "FOET", "FOBE"
        };

        int[] programmeDuration = new int[]{
            24, 24, 24, 24, 24, 24, 24, 24, 24, 24,
            24, 24, 24, 24, 24, 24, 24, 24, 24, 24,
            24, 24, 24, 24, 24, 24, 24, 24, 24, 24,
            24, 24, 24, 24, 24, 24, 24
        };

        // end of test data

        Programme programme = null;

        // add test data into programme list
        for (int i = 0; i < programmeCode.length; i++) {
            try {
                ManageProgramme.addProgramme(programmeCode[i], programmeName[i], programmeDesc[i], faculty[i], programmeDuration[i]);
                programme = ManageProgramme.findProgrammeByCode(programmeCode[i]);

                int ran = (int) ((Math.random() * 10) + 1);
                for (int j = 1; j <= ran; j++) {
                    ManageProgramme.addTutorialGroupToProgramme(j, 1, 1, programme);
                    ManageProgramme.addTutorialGroupToProgramme(j, 1, 2, programme);
                    ManageProgramme.addTutorialGroupToProgramme(j, 1, 3, programme);
                    ManageProgramme.addTutorialGroupToProgramme(j, 2, 1, programme);
                    ManageProgramme.addTutorialGroupToProgramme(j, 2, 2, programme);
                    ManageProgramme.addTutorialGroupToProgramme(j, 2, 3, programme);
                }
                
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static void initializeCourse() {
        String[] courseName = {
            "Science", "Discrete Math", "Information Technologies", "Computer System Architecture", "English",
            "Sejarah", "Artificial Intelligence", "Geografi", "Operating System", "Statistic"
        };
        String[] courseCode = {
            "SC1", "DM1", "IT12", "CSA32", "ENG1", "SJ2", "AI3", "GEO1", "OS42", "STAT2"
        };
        int[] creditHour = new int[]{
            2, 2, 3, 3, 3, 2, 2, 2, 3, 4, 3
        };
        String[] courseDesc = {
            "Learn about everything happen around us.",
            "Learn about how to dram diagram.",
            "All the hardware and software in IT field.",
            "Machine language.",
            "Learn how to use grammar in a corect way.",
            "Look bak to our  history.",
            "See how AI change the wolrd.",
            "Take a look at the places around the world.",
            "Learn to use Ubuntu.",
            "Learn to calculate the mean, mod, median for a collection of data."
        };

        for (int i = 0; i < courseName.length; i++) {
            ManageCourse.addCourse(courseCode[i], courseName[i], creditHour[i], courseDesc[i]);
        }

//        String[] cc = {
//            "SC1", "DM1", "IT12", "CSA32", "SC1", "SJ2", "AI3", "GEO1", "OS42", "STAT2"
//        };
//
//        String[] cn = {
//            "Science", "Discrete Math", "Information Technologies", "Computer System Architecture", "English",
//            "Sejarah", "Artificial Intelligence", "Geografi", "Operating System", "Statistic"
//        };
//
//        String[] pn = {
//            "FOUNDATION IN SCIENCE",
//            "DIPLOMA IN MATHEMATIC THEORY",
//            "DIPLOMA IN IT",
//            "DIPLOMA IN COMPUTER SCIENCE",
//            "FOUNDATION IN LANGUAGE",
//            "DEGREE IN CULTURE",
//            "DEGREE IN AI",
//            "DEGREE IN WORLD EXPLORATION",
//            "DIPLOMA IN CYBER SECURITY",
//            "FOUNDATION IN CALCULATION"
//        };
        String[] programmeName = {
            "Diploma in Accounting", "Diploma in Advertising", "Diploma in Aquaculture",
            "Diploma in Banking & Finance", "Diploma in Broadcast Communication",
            "Diploma in Building", "Diploma in Business Administration",
            "Diploma in Business Economics", "Diploma in Communication & Media Studies",
            "Diploma in Computer Science", "Diploma in Counselling", "Diploma in Culinary Arts",
            "Diploma in E-Marketing", "Diploma in Early Childhood Education",
            "Diploma in Electronic Engineering", "Diploma in Entrepreneurship",
            "Diploma in Event Management", "Diploma in Fashion Design",
            "Diploma in Finance & Investment", "Diploma in Food Science",
            "Diploma in Graphic Design", "Diploma in Hotel Management",
            "Diploma in Human Resource Management", "Diploma in International Business",
            "Diploma in Information Systems", "Diploma in Information Technology",
            "Diploma in Journalism", "Diploma in Logistics & Supply Chain Management",
            "Diploma in Manufacturing Technology", "Diploma in Marketing",
            "Diploma in Mechanical Engineering", "Diploma in Mechatronic Engineering",
            "Diploma in Media Studies", "Diploma in Multimedia Design",
            "Diploma in Public Relations", "Diploma in Product Development Technology",
            "Diploma in Quantity Surveying"
        };

        int ran = 0, n = programmeName.length - 1;

        for (int i = 0; i < courseCode.length; i++) {
            for (int j = 0; j < 5; j++) {
                ran = (int) (Math.random() * n);
                try {
                    ManageCourse.addProgToCourse(courseCode[i], programmeName[ran]);
                } catch (IllegalArgumentException ex) {
//                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public static void initializeTutor() {
        TutorManager tm = new TutorManager();
        String[] tutorIds = {
            "A0001", "A0002", "A0003", "A0004", "A0005", "A0006", "A0007", "A0008", "A0009", "A0010", "A0011", "A0012", "A0013", "A0014", "A0015",
            "A0016", "A0017", "A0018", "A0019", "A0020", "A0021", "A0022", "A0023", "A0024", "A0025"};

        String[] tutorNames = {
            "Ariana Swift", "Sandra Wong", "Chris Lee", "Sarah Illiyin", "Yuan Le", "Albert Yap", "Ah Mei", "Jane Zamhari", "Zhu Looi Fei", "Hang Leang Goo",
            "Jane Jayaseelan", "Phuah Hoo Shar", "Toh Yik Siew", "John Sathianathan", "Maha a/l Chanturu", "Thang Mat Jiong", "Wong Shun Goon", "Kwong Pin Ho",
            "Stephen Siao Zit Mo", "Fam Leow Huan", "Liao Cek Woo", "Leow Ron Deng", "Qurratul Nazeri", "Alina Mu binti Yushafiq", "Gheetha a/l Nandakumar"};

        String[] tutorGenders = {
            "Female", "Female", "Male", "Female", "Male", "Male", "Female", "Male", "Female", "Male", "Female", "Male", "Female", "Male", "Male", "Male",
            "Female", "Male", "Male", "Female", "Male", "Male", "Female", "Female", "Female"};

        String[] tutorWorks = {
            "Full Time", "Full Time", "Part Time", "Full Time", "Part Time", "Part Time", "Full Time", "Part Time", "Part Time", "Full Time", "Full Time",
            "Full Time", "Part Time", "Part Time", "Full Time", "Part Time", "Part Time", "Full Time", "Part Time", "Full Time", "Part Time", "Part Time",
            "Full Time", "Full Time", "Full Time"};

        String[] tutorEmails = {
            "bong321@gmail.com", "abc123@gmail.com", "tong@gmail.com", "sagege@gmail.com", "yys@gmail.com", "def932@gmail.com", "kokcl@gmail.com", "kewlol@gmail.com",
            "tryabc@gmail.com", "ogkk@gmail.com", "eqwjfk@gmail.com", "jinting@gmail.com", "qwondk@gmail.com", "opewiq@gmail.com", "trylokde@gmail.com", "okok123@gmail.com",
            "pogglol@gmail.com", "well321@gmail.com", "junhi1lol@gmail.com", "gnffkek@gmail.com", "osomen123@gmail.com", "plolqwe1232@gmail.com", "pop321@gmail.com",
            "dengwer@gmail.com", "tinsad@gmail.com"};

        for (int i = 0; i < 25; i++) {
            Tutor tutor = new Tutor(tutorIds[i], tutorNames[i], tutorGenders[i], tutorWorks[i], tutorEmails[i]);
            tm.addTutor(tutor);
        }
    }
    
    public static void initializeTutorialGroup() {
        for (int i = 1; i < 6; i++) {
            ManageTutorial.getTutorialGroup().add(new TutorialGroup(i));
        }
        Student std = new Student(1000, "Mary");
        addStudentToTutorialGroup(std, 1);
        Student std1 = new Student(1001, "Alan");
        addStudentToTutorialGroup(std1, 2);
        Student std2 = new Student(1002, "John");
        addStudentToTutorialGroup(std2, 3);
        Student std3 = new Student(1003, "Ali");
        addStudentToTutorialGroup(std3, 4);
        Student std4 = new Student(1004, "Bob");
        addStudentToTutorialGroup(std4, 5);
        Student std5 = new Student(1005, "Alex");
        addStudentToTutorialGroup(std5, 1);
        Student std6 = new Student(1006, "Lesley");
        addStudentToTutorialGroup(std6, 2);
        Student std7 = new Student(1007, "Christine");
        addStudentToTutorialGroup(std7, 3);
        Student std8 = new Student(1008, "Unicorn");
        addStudentToTutorialGroup(std8, 4);
        Student std9 = new Student(1009, "Casandra");
        addStudentToTutorialGroup(std9, 5);
        Student std10 = new Student(1010, "Queena");
        addStudentToTutorialGroup(std10, 1);
        Student std11 = new Student(1011, "Jerry");
        addStudentToTutorialGroup(std11, 2);
        Student std12 = new Student(1012, "Thomas");
        addStudentToTutorialGroup(std12, 3);
        Student std13 = new Student(1013, "Gru");
        addStudentToTutorialGroup(std13, 4);
        Student std14 = new Student(1014, "Fiona");
        addStudentToTutorialGroup(std14, 5);
    }
}
