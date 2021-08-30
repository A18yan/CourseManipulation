
public class NonAcademicCourse extends Course {

    // static variables
    private String prerequisite, instructorName, startDate, completionDate, examDate;
    private boolean isRegistered, isRemoved;

    // constructor of the class
    NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite) {
        super(courseID, courseName, duration);
        instructorName = "";
        this.prerequisite = prerequisite;
        startDate = "";
        completionDate = "";
        examDate = "";
        isRegistered = false;
        isRemoved = false;
    }

    // getters and setters
    public String getStartDate() {
        return this.startDate;
    }

    public String getCompletionDate() {
        return this.completionDate;
    }

    public String getPrerequisite() {
        return this.prerequisite;
    }

    public void setInstructorName(String instructorName) {
        if (isRegistered == false) {
            this.instructorName = instructorName;
        } else {
            System.out.println("The nonacademic course is already registered so you can't set instructor's name");
        }
    }

    public String getInstructorName() {
        return this.instructorName;
    }

    public String getExamDate() {
        return this.examDate;
    }

    public boolean getIsRegistered() {
        return this.isRegistered;
    }

    public boolean getIsRemoved() {
        return this.isRemoved;
    }

    // creating register() method which has five parameters
    public void register(String courseLeaderName, String instructorName, String startDate, String completionDate,
            String examDate) {
        if (isRegistered == true) {
            System.out.println("The course is already registered.");
        } else {
            setInstructorName(instructorName);
            super.setCourseLeaderName(courseLeaderName);
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            isRegistered = true;
        }
    }

    // creating remove() method
    public void remove() {
        if (isRemoved == true) {
            System.out.println("The course has already been removed.");
        } else {
            super.setCourseLeaderName("");
            this.instructorName = "";
            this.startDate = "";
            this.completionDate = "";
            this.examDate = "";
            this.isRegistered = false;
            this.isRemoved = true;
        }
    }

    // creating dsplay() method
    public void display() {
        // calling parent class display() method
        super.display();
        if (isRegistered == true) {
            System.out.println("Your instructor is " + this.instructorName);
            System.out.println("Your starting date is " + this.startDate);
            System.out.println("Your completion date is " + this.completionDate);
            System.out.println("Your exam date is " + this.examDate);
        }
    }
    public static void main(String[] args) {
        
    }

}
