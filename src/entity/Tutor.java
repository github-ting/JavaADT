package entity;

import java.lang.reflect.Field;
import java.util.Objects;

public class Tutor {

    private String tutorId;
    private String tutorName;
    private String tutorGender;
    private String tutorWork;
    private String tutorEmail;

    public Tutor() {
    }

    public Tutor(String tutorId, String tutorName, String tutorGender, String tutorWork, String tutorEmail) {
        this.tutorId = tutorId;
        this.tutorName = tutorName;
        this.tutorGender = tutorGender;
        this.tutorWork = tutorWork;
        this.tutorEmail = tutorEmail;
    }

    //Getter
    public String getTutorId() {
        return tutorId;
    }

    public String getTutorName() {
        return tutorName;
    }

    public String getTutorGender() {
        return tutorGender;
    }

    public String getTutorWork() {
        return tutorWork;
    }

    public String getTutorEmail() {
        return tutorEmail;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tutor other = (Tutor) obj;
        return Objects.equals(this.tutorId, other.tutorId);
    }

    //Setter
    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public void setTutorGender(String tutorGender) {
        this.tutorGender = tutorGender;
    }

    public void setTutorWork(String tutorWork) {
        this.tutorWork = tutorWork;
    }

    public void setTutorEmail(String tutorEmail) {
        this.tutorEmail = tutorEmail;
    }
    
        public int compareTo(Tutor anotherTutor, String... attributeNames) throws Exception {
        int result = 0;

        for (String attributeName : attributeNames) {
            try {
                Field field = getClass().getDeclaredField(attributeName);

                if (!Comparable.class.isAssignableFrom(field.getType())) {
                    throw new IllegalArgumentException("Attribute is not comparable!");
                }

                result = ((Comparable<Object>) field.get(this))
                    .compareTo((Comparable<Object>) field.get(anotherTutor));

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
