
public class Course {

    private String courseID, courseName, courseLeaderName;
    private int duration;

    Course(String courseID, String courseName, int duration) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        courseLeaderName = "";
    }

    public String getCourseID() {
        return this.courseID;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseLeaderName(String courseLeaderName) {
        this.courseLeaderName = courseLeaderName;
    }

    public String getCourseLeaderName() {
        return this.courseLeaderName;
    }

    public int getDuration() {
        return this.duration;
    }

    public void display() {
        if (!getCourseLeaderName().equals("")) {
            System.out.println("Your courseID is " + courseID);
            System.out.println("Your course Name is " + courseName);
            System.out.println("The course duration is " + duration);
            System.out.println("And the course leader is " + getCourseLeaderName());
        } else {
            System.out.println("Your courseID is " + courseID);
            System.out.println("Your course Name is " + courseName);
            System.out.println("The course duration is " + duration);
            System.out.println("No inforation of the coourse leader is provided.");
        }
    }
    public static void main(String[] args) {
        
    }
}
