
public class AcademicCourse extends Course {

    // the static variables
    private String level, credit, lecturerName, startDate, completionDate;
    private int noOfAssessment;
    private boolean isRegistered;

    // constructor of the class
    AcademicCourse(String courseID, String courseName, int duration, String level, String credit, int noOfAssessment) {
        super(courseID, courseName, duration);
        this.level = level;
        this.credit = credit;
        this.noOfAssessment = noOfAssessment;
        lecturerName = "";
        startDate = "";
        completionDate = "";
        isRegistered = false;
    }

    // getters and setter
    public String getStartDate() {
        return this.startDate;
    }

    public String getCompletionDate() {
        return this.completionDate;
    }

    public String getLevel() {
        return this.level;
    }

    public String getCredit() {
        return this.credit;
    }

    public void setNoOfAssignment(int noOfAssessment) {
        this.noOfAssessment = noOfAssessment;
    }

    public int getNoOfAssessment() {
        return this.noOfAssessment;
    }

    public void setLectureName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getLectureName() {
        return this.lecturerName;
    }

    public boolean getIsRegistered() {
        return this.isRegistered;
    }

    public void register(String courseLeaderName, String lecturerName, String startDate, String completionDate) {
        // showing instructor's name, start date and completion date is the course is
        // already registered
        if (isRegistered == true) {
            System.out.println("Your lecturer is " + this.lecturerName);
            System.out.println("You started on " + this.startDate);
            System.out.println("You will complete on " + this.completionDate);
        } else {
            /**
             * calling courseLeader from Course class and updating lecturerName,
             * startingDate and completionDate with the parameters of register() method
             */
            super.setCourseLeaderName(courseLeaderName);
            this.lecturerName = lecturerName;
            this.completionDate = completionDate;
            this.startDate = startDate;
            isRegistered = true;
        }
    }

    public void display() {
        // overriding display method
        super.display();
        if (isRegistered == true) {
            System.out.println("Your lecturer is " + this.lecturerName);
            System.out.println("Your class is in level " + this.level);
            System.out.println("Your credit is " + this.credit);
            System.out.println("You started on " + this.startDate);
            System.out.println("You will complete on " + this.completionDate);
            System.out.println("You have done " + this.noOfAssessment + " assessments");

        }
    }
    public static void main(String[] args) {
        
    }

}
