import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.Image;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

// class starts here
public class INGCollege {
    // declaring class level variables
    private ArrayList<Course> courseList = new ArrayList<>(); // An ArrayList to store object of Course type
    // variables for creating the frames and their components
    private JFrame frame; // variable to create main frame
    // lebel creating variables
    private JLabel titleLabel, courseIDLabel, courseNameLabel, durationLabel, courseLeaderLabel, lecturerNameLabel,
            levelLabel, creditLabel, startDateLabel, completionDateLabel, noOfAssessmentLabel, instructorNameLabel,
            examDateLabel, prerequisiteLabel, yesLabel;
    // variables to create text fields
    private JTextField courseIDTextField, courseNameTextField, durationTextField, courseLeaderTextField,
            lecturerNameTextField, levelTextField, creditTextField, startDateTextField, completionDateTextField,
            noOfAssessmentTextField, instructorNameTextField, examDateTextField, prerequisiteTextField;
    // variables for buttons
    private JButton addButton, registerButton, displayButton, removeButton, clearButton, cancelButton, yesButton,
            noButton, backButton;
    // variable for text area
    private JTextArea displayTextArea;

    // getters for accessing the values entered in the text fields
    public String getCourseID() {
        return courseIDTextField.getText(); // returns course ID
    }

    public String getCourseName() {
        return courseNameTextField.getText(); // returns course name
    }

    public String getDuration() {
        return durationTextField.getText(); // returns course duration
    }

    public String getCourseLeader() {
        return courseLeaderTextField.getText(); // returns course leader's name
    }

    public String getLectureName() {
        return lecturerNameTextField.getText(); // returns lecturer's name
    }

    public String getLevel() {
        return levelTextField.getText(); // returns the level of course
    }

    public String getCredit() {
        return creditTextField.getText(); // returns credit required for the course
    }

    public String getStartDate() {
        return startDateTextField.getText(); // returns the exam date of the course
    }

    public String getCompletionDate() {
        return completionDateTextField.getText(); // returns the completion date of the course
    }

    public String getNoOfAssessment() {
        return noOfAssessmentTextField.getText(); // returns the number of assessments of a course
    }

    public String getInstructorName() {
        return instructorNameTextField.getText(); // returns instructor's name pf a course
    }

    public String getExamDate() {
        return examDateTextField.getText(); // returns exam date of a curse
    }

    public String getPrerequisite() {
        return prerequisiteTextField.getText(); // returns prerequisite of a course
    }

    // creates the frame
    public void createFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates the frame on close
        frame.setSize(new Dimension(730, 380));// dimension of the frame
        frame.setLayout(null);// allow user to place comonents wherever he wants
        frame.setLocationRelativeTo(null); // location of the frame to be poped
        frame.getContentPane().setBackground(Color.lightGray); // background color of the frame
        frame.setVisible(true); // frame is made visible
    }

    // creates the labels
    public void createLabel() {
        titleLabel = new JLabel();
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        courseIDLabel = new JLabel("Course ID");
        courseNameLabel = new JLabel("Course Name");
        durationLabel = new JLabel("Duration");
        courseLeaderLabel = new JLabel("Course Leader");
        lecturerNameLabel = new JLabel("Lecturer name");
        levelLabel = new JLabel("Level");
        creditLabel = new JLabel("Credit");
        startDateLabel = new JLabel("Start Date");
        completionDateLabel = new JLabel("Completion Date");
        noOfAssessmentLabel = new JLabel("No. Of Assignment");
        instructorNameLabel = new JLabel("Instructor Name");
        examDateLabel = new JLabel("Exam Date");
        prerequisiteLabel = new JLabel("Prerequisite");
        yesLabel = new JLabel("Do you want to register a course?");

    }

    // creates the text fields
    public void createTextFields() {
        courseIDTextField = new JTextField("Enter your Course ID");
        courseIDTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        courseIDTextField.addFocusListener(new FocusListener() { // adding focus listener for place holders
            public void focusGained(FocusEvent e) {
                if (courseIDTextField.getText().equals("Enter your Course ID")) {
                    courseIDTextField.setText(""); // sets the text field to empty string when clicked
                }
            }

            public void focusLost(FocusEvent e) {
                if (courseIDTextField.getText().equals("")) {
                    courseIDTextField.setText("Enter your Course ID"); // sets the place holder if the user donot enter
                                                                       // any value
                }
            }
        });
        courseNameTextField = new JTextField("Enter your Course Name");
        courseNameTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        courseNameTextField.addFocusListener(new FocusListener() { // setting place holder
            public void focusGained(FocusEvent e) {
                if (courseNameTextField.getText().equals("Enter your Course Name")) {
                    courseNameTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (courseNameTextField.getText().equals("")) {
                    courseNameTextField.setText("Enter your Course Name");
                }
            }
        });
        durationTextField = new JTextField("Enter Duration");
        durationTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        durationTextField.addFocusListener(new FocusListener() { // setting place holder
            public void focusGained(FocusEvent e) {
                if (durationTextField.getText().equals("Enter Duration")) {
                    durationTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (durationTextField.getText().equals("")) {
                    durationTextField.setText("Enter Duration");
                }
            }
        });
        courseLeaderTextField = new JTextField("Enter your course leader's name");
        courseLeaderTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        courseLeaderTextField.addFocusListener(new FocusListener() { // setting place holder
            public void focusGained(FocusEvent e) {
                if (courseLeaderTextField.getText().equals("Enter your course leader's name")) {
                    courseLeaderTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (courseLeaderTextField.getText().equals("")) {
                    courseLeaderTextField.setText("Enter your course leader's name");
                }
            }
        });
        lecturerNameTextField = new JTextField("Enter your course lecturer's name");
        lecturerNameTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        lecturerNameTextField.addFocusListener(new FocusListener() { // focus listener for placeholder
            public void focusGained(FocusEvent e) {
                if (lecturerNameTextField.getText().equals("Enter your course lecturer's name")) {
                    lecturerNameTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (lecturerNameTextField.getText().equals("")) {
                    lecturerNameTextField.setText("Enter your course lecturer's name");
                }
            }
        });
        levelTextField = new JTextField("Enter Level");
        levelTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        levelTextField.addFocusListener(new FocusListener() { // focus listener for placeholder
            public void focusGained(FocusEvent e) {
                if (levelTextField.getText().equals("Enter Level")) {
                    levelTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (levelTextField.getText().equals("")) {
                    levelTextField.setText("Enter Level");
                }
            }
        });
        creditTextField = new JTextField("Enter Credit");
        creditTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        creditTextField.addFocusListener(new FocusListener() { // focus listener for placeholder
            public void focusGained(FocusEvent e) {
                if (creditTextField.getText().equals("Enter Credit")) {
                    creditTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (creditTextField.getText().equals("")) {
                    creditTextField.setText("Enter Credit");
                }
            }
        });
        startDateTextField = new JTextField("Enter start date");
        startDateTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        startDateTextField.addFocusListener(new FocusListener() { // focus listener for placeholder
            public void focusGained(FocusEvent e) {
                if (startDateTextField.getText().equals("Enter start date")) {
                    startDateTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (startDateTextField.getText().equals("")) {
                    startDateTextField.setText("Enter start date");
                }
            }
        });
        completionDateTextField = new JTextField("Enter completion date");
        completionDateTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        completionDateTextField.addFocusListener(new FocusListener() { // focus listener for placeholder
            public void focusGained(FocusEvent e) {
                if (completionDateTextField.getText().equals("Enter completion date")) {
                    completionDateTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (completionDateTextField.getText().equals("")) {
                    completionDateTextField.setText("Enter completion date");
                }
            }
        });
        noOfAssessmentTextField = new JTextField("Enter no. Of Assignment");
        noOfAssessmentTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        noOfAssessmentTextField.addFocusListener(new FocusListener() { // focus listener for placeholder
            public void focusGained(FocusEvent e) {
                if (noOfAssessmentTextField.getText().equals("Enter no. Of Assignment")) {
                    noOfAssessmentTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (noOfAssessmentTextField.getText().equals("")) {
                    noOfAssessmentTextField.setText("Enter no. Of Assignment");
                }
            }
        });
        examDateTextField = new JTextField("Enter exam date");
        examDateTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        examDateTextField.addFocusListener(new FocusListener() { // focus listener for placeholder
            public void focusGained(FocusEvent e) {
                if (examDateTextField.getText().equals("Enter exam date")) {
                    examDateTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (examDateTextField.getText().equals("")) {
                    examDateTextField.setText("Enter exam date");
                }
            }
        });
        instructorNameTextField = new JTextField("Enter instructor name");
        instructorNameTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        instructorNameTextField.addFocusListener(new FocusListener() { // focus listener for placeholder
            public void focusGained(FocusEvent e) {
                if (instructorNameTextField.getText().equals("Enter instructor name")) {
                    instructorNameTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (instructorNameTextField.getText().equals("")) {
                    instructorNameTextField.setText("Enter instructor name");
                }
            }
        });
        prerequisiteTextField = new JTextField("Prerequisite");
        prerequisiteTextField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        prerequisiteTextField.addFocusListener(new FocusListener() { // adding focus listener for place holder
            public void focusGained(FocusEvent e) {
                if (prerequisiteTextField.getText().equals("Prerequisite")) {
                    prerequisiteTextField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (prerequisiteTextField.getText().equals("")) {
                    prerequisiteTextField.setText("Prerequisite");
                }
            }
        });
    }

    // clears the values from text fields and restores the place holders
    public void clearTextField() {
        courseIDTextField.setText("Enter your Course ID");
        courseNameTextField.setText("Enter your Course Name");
        durationTextField.setText("Enter Duration");
        courseLeaderTextField.setText("Enter your course leader's name");
        lecturerNameTextField.setText("Enter your course lecturer's name");
        levelTextField.setText("Enter Level");
        creditTextField.setText("Enter Credit");
        startDateTextField.setText("Enter start date");
        completionDateTextField.setText("Enter completion date");
        noOfAssessmentTextField.setText("Enter no. Of Assignment");
        examDateTextField.setText("Enter exam date");
        instructorNameTextField.setText("Enter instructor name");
        prerequisiteTextField.setText("Prerequisite");
    }

    public void customizeButton(JButton button) {
        // button = new JButton(text);
        button.setBorder(BorderFactory.createLineBorder(Color.white, 1, true));
        button.setBackground(Color.gray);
        button.setFocusable(false);
    }

    // creates the buttons and sets fucusable to false
    public void createButton() {
        addButton = new JButton("Add");
        customizeButton(addButton);
        registerButton = new JButton("Register");
        customizeButton(registerButton);
        displayButton = new JButton("Display");
        customizeButton(displayButton);
        removeButton = new JButton("Remove");
        customizeButton(removeButton);
        clearButton = new JButton("Clear");
        customizeButton(clearButton);
        cancelButton = new JButton("Cancel");
        customizeButton(cancelButton);
        yesButton = new JButton("Yes");
        customizeButton(yesButton);
        noButton = new JButton("No");
        customizeButton(noButton);
        backButton = new JButton("Back");
        customizeButton(backButton);
        backButton.setBounds(1, 5, 70, 25);
    }

    // creates a text ares with a magets border, the editablity of the area is set
    // to false
    public void createTextArea() {
        displayTextArea = new JTextArea();
        displayTextArea.setBackground(Color.lightGray); // light gray background
        displayTextArea.setFont(new Font("Arial", 0, 15));
        displayTextArea.setBorder(BorderFactory.createLineBorder(Color.gray, 1, true)); // border
        displayTextArea.setEditable(false);
    }

    /*
     * creates the main frame of the course work. we can choose an academic or
     * non-academic course to add
     */
    public void homeFrame() {
        createFrame(); // calls a method which creates the frame
        frame.setTitle("Welcome Home"); // sets the title of frame
        frame.setSize(new Dimension(730, 310)); // dimension for new frame

        // inserting an image to set logo
        ImageIcon imageIcon = new ImageIcon("iiclogo.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it to scale the image we need object of Image not ImageIcon
        Image newImage = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);// resizing the image
        ImageIcon icon = new ImageIcon(newImage);// New resized image

        createLabel(); // calls a method which creates the labels
        titleLabel.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.black));
        titleLabel.setIcon(icon); // setting the logo
        titleLabel.setBounds(200, 50, 100, 100);
        frame.add(titleLabel);
        courseIDLabel.setText("We Welcome You!");
        courseIDLabel.setFont(new Font("MV Boli", 1, 25)); // setting font of the label
        courseIDLabel.setBounds(320, 60, 250, 50);
        frame.add(courseIDLabel);
        courseNameLabel.setText("-IIC COLLEGE");
        courseNameLabel.setFont(new Font("MV Boli", 1, 25)); // setting the font of the label
        courseNameLabel.setBounds(350, 90, 200, 50);
        frame.add(courseNameLabel);

        createButton(); // calls a method which creates buttons
        addButton.setText("Academic Course");
        addButton.setBackground(new Color(0xabaeb0)); // backgrund color of button
        addButton.setBorder(BorderFactory.createRaisedBevelBorder());
        addButton.setBounds(180, 180, 175, 35);
        addButton.addActionListener(e -> { // adding action listener
            // lambda experssion is used
            frame.dispose(); // closes the current frame
            addAcademicCourseFrame(); // opens a frame that adds an academic course
        });
        frame.add(addButton);
        registerButton.setText("Non-Academic Course");
        registerButton.setBackground(new Color(0xabaeb0)); // background color of thr button
        registerButton.setBorder(BorderFactory.createRaisedBevelBorder());
        registerButton.setBounds(370, 180, 175, 35);
        registerButton.addActionListener(e -> { // action listener
            frame.dispose(); // closes the current frame
            addNonAcademicCourseFrame(); // opens a new frame that addsa a non-academic course
        });
        frame.add(registerButton);

        frame.setResizable(false); // disabling the resize abiliyi of the frame
        /*
         * this statement must be used at last or some coponennts donot render in the
         * frame
         */
    }

    // initializes a frame that helps to add an academic course to the ArrayList
    public void addAcademicCourseFrame() {
        createFrame(); // calls a method which creates the frame
        frame.setTitle("Add Academic Course"); // new titile for the frame
        // calling the method that creates label and settinf the positions of the all
        // components
        createLabel();
        titleLabel.setText("Add a Academic course");
        titleLabel.setBounds(255, 10, 250, 30);
        frame.add(titleLabel);
        courseIDLabel.setBounds(60, 70, 100, 25);
        frame.add(courseIDLabel);
        courseNameLabel.setBounds(365, 70, 100, 25);
        frame.add(courseNameLabel);
        durationLabel.setBounds(85, 120, 80, 25);
        frame.add(durationLabel);
        levelLabel.setBounds(280, 120, 50, 25);
        frame.add(levelLabel);
        creditLabel.setBounds(460, 120, 50, 25);
        frame.add(creditLabel);
        noOfAssessmentLabel.setBounds(225, 170, 110, 25);
        frame.add(noOfAssessmentLabel);
        yesLabel.setBounds(200, 285, 300, 25);
        frame.add(yesLabel);

        createTextFields(); // calls a method that creates text fields
        courseIDTextField.setBounds(135, 70, 200, 25);
        frame.add(courseIDTextField);
        courseNameTextField.setBounds(460, 70, 200, 25);
        frame.add(courseNameTextField);
        durationTextField.setBounds(145, 120, 120, 25);
        frame.add(durationTextField);
        levelTextField.setBounds(325, 120, 120, 25);
        frame.add(levelTextField);
        creditTextField.setBounds(510, 120, 120, 25);
        frame.add(creditTextField);
        noOfAssessmentTextField.setBounds(343, 170, 160, 25);
        frame.add(noOfAssessmentTextField);

        createButton(); // calls a method which creates buttons
        addButton.setBounds(205, 220, 100, 25); // button which adds the course
        addButton.addActionListener((e) -> { // lambda for action listener
            addAcademicCourse(); // method which actually adds a course
        });
        frame.add(addButton);
        clearButton.setBounds(310, 220, 100, 25);
        clearButton.addActionListener((e) -> { // lamba for action listener
            clearTextField(); // clears the text ares and restores the place holders
        });
        frame.add(clearButton);
        cancelButton.setBounds(415, 220, 100, 25);
        cancelButton.addActionListener((e) -> { // lambda for action listener
            System.exit(0); // closes the program
        });
        frame.add(cancelButton);
        displayButton.setBounds(310, 255, 100, 25);
        displayButton.addActionListener((e) -> { // lambda for action listener
            frame.dispose(); // closes the current frame
            // displayCourseFrame();
            displayAcademicCourseFrame(); // displays details of courses in the terminal
        });
        frame.add(displayButton);
        yesButton.setBounds(400, 285, 60, 25);
        yesButton.addActionListener((e) -> { // lambda for action listener
            frame.dispose(); // closes the curret frame
            registerAcademicCourseFrame(); // creates a new frame which registers a course
        });
        frame.add(yesButton);
        noButton.setBounds(465, 285, 60, 25); // this button does nothing
        frame.add(noButton);
        backButton.addActionListener(e -> {
            frame.dispose(); // closes the current frame
            homeFrame();
        });
        frame.add(backButton);

        frame.setResizable(false); // disabling the resize ability of the frame
                                   // must be at the end
    }

    // adds an academic course to the ArrayList
    public void addAcademicCourse() {
        // declaring local variable to store the values entered in the text fields
        String courseID = this.getCourseID();
        String courseName = this.getCourseName();
        String durationString = this.getDuration();
        String level = this.getLevel();
        String credit = this.getCredit();
        String noOfAssessmentString = this.getNoOfAssessment();
        int duration, noOfAssessment; // declaring integer variable for exception handling
        boolean flag = false; // a boolean variable for avoding ConcurrentModificationException
        // checks if the user fills all the text fields
        if (courseID.equals("Enter your Course ID") || courseName.equals("Enter your Course Name")
                || durationString.equals("Enter Duration") || level.equals("Enter Level")
                || credit.equals("Enter Credit") || noOfAssessmentString.equals("Enter no. Of Assignment")) {
            // dsiplays a message if any of the text fields are empty
            JOptionPane.showMessageDialog(null, "Please, Fill all the fields", "Empty Field", 2);
            return;
        } else {
            if (courseList.isEmpty()) { // cleckes if the array list is ampty
                flag = true;
            } else {
                for (Course course : courseList) { // iterates through the array list
                    if (course.getCourseID().equalsIgnoreCase(courseID)) { // checks if the user wants to adda duplicate
                                                                           // course
                        // message for duplicate course
                        JOptionPane.showMessageDialog(null, "The " + courseID + " is already added.", "Empty Field", 1);
                        return;
                    } else {
                        flag = true;
                    }
                }
            }
            /*
             * conveting duration and number of assessments to numeric values because we get
             * a string value from a text field and handling NumberFormateException
             */
            try {
                duration = Integer.parseInt(durationString); // conveting duraion to numeric vaue
            } catch (NumberFormatException e) {
                // message for incompatible date type in duration text field
                JOptionPane.showMessageDialog(null, "Please enter a whole number in the duration field",
                        "Invalid duration", 2);
                return;
            }
            try {
                noOfAssessment = Integer.parseInt(noOfAssessmentString); // converting no of assessment to numeric value
            } catch (NumberFormatException e) {
                // message for incompatible data type in the text field
                JOptionPane.showMessageDialog(null, "Please enter a whole number in the No.of Assessment field",
                        "Invalid No. of Assessment", 2);
                return;
            }
            if (flag) {
                // adding an academic course to the ArrayList by calling the constructor of
                // AcademmicCourse class
                courseList.add(new AcademicCourse(courseID, courseName, duration, level, credit, noOfAssessment));
                clearTextField(); // removing values from text fields
                JOptionPane.showMessageDialog(null, "The " + courseID + " has successfully been added.", "Course Added",
                        1); // message for successfull addition of course
                return;
            }
        }
    }

    // frame for registering an academic course
    public void registerAcademicCourseFrame() {
        createFrame(); // calls the method that creates the frame
        frame.setTitle("Register an Academic Course"); // title of frame
        frame.setSize(735, 350); // dimenssion of frame

        createLabel(); // calls a method whiich creates labels
        titleLabel.setText("Register an Academic Course");
        titleLabel.setBounds(230, 10, 270, 30);
        frame.add(titleLabel);
        courseIDLabel.setBounds(60, 70, 100, 25);
        frame.add(courseIDLabel);
        courseLeaderLabel.setBounds(365, 70, 100, 25);
        frame.add(courseLeaderLabel);
        lecturerNameLabel.setBounds(205, 120, 100, 25);
        frame.add(lecturerNameLabel);
        startDateLabel.setBounds(65, 170, 100, 25);
        frame.add(startDateLabel);
        completionDateLabel.setBounds(355, 170, 100, 25);
        frame.add(completionDateLabel);

        createTextFields(); // calls a method that creates text fields
        courseIDTextField.setBounds(135, 70, 200, 25);
        frame.add(courseIDTextField);
        courseLeaderTextField.setBounds(460, 70, 200, 25);
        frame.add(courseLeaderTextField);
        lecturerNameTextField.setBounds(300, 120, 200, 25);
        frame.add(lecturerNameTextField);
        startDateTextField.setBounds(135, 170, 200, 25);
        frame.add(startDateTextField);
        completionDateTextField.setBounds(460, 170, 200, 25);
        frame.add(completionDateTextField);

        createButton(); // calls a method which creates buttons
        registerButton.setBounds(205, 220, 100, 25);
        registerButton.addActionListener((e) -> { // lambda for action listener
            registerAcademicCourse(); // calls the method that registers a course
        });
        frame.add(registerButton);
        clearButton.setBounds(310, 220, 100, 25);
        clearButton.addActionListener((e) -> { // lambda fro action listener
            clearTextField(); // removes the values from the text fields and restores the place holders
        });
        frame.add(clearButton);
        displayButton.setBounds(415, 220, 100, 25);
        displayButton.addActionListener((e) -> { // lambda for action listener
            frame.dispose(); // closes the current frame
            displayAcademicCourseFrame(); // calls another frame which display the details about a course searched
        });
        frame.add(displayButton);
        cancelButton.setBounds(310, 260, 100, 25);
        cancelButton.addActionListener((e) -> { // lambda for action listener
            System.exit(0); // terminates the program
        });
        frame.add(cancelButton);
        backButton.addActionListener(e -> {
            frame.dispose(); // closes the current frame
            addAcademicCourseFrame();
        });
        frame.add(backButton);

        frame.setResizable(false); // disabling the resize ability of the frame
        // must be at the end
    }

    // registers an academic course
    public void registerAcademicCourse() {
        // grabs the values entered in the text fields and stores them in local
        // variables
        String courseID = this.getCourseID();
        String courseLeaderName = this.getCourseLeader();
        String lecturerName = this.getLectureName();
        String startDate = this.getStartDate();
        String completionDate = this.getCompletionDate();
        boolean flag = false; // declaring and initializing a boolean variable to overcome
                              // ConcurretModificationException
        // checcks if the user enters values in every text fields
        if (courseID.equals("Enter your course ID") || courseLeaderName.equals("Enter your course leader's name")
                || lecturerName.equals("Enter your course lecturer's name") || startDate.equals("Enter start date")
                || completionDate.equals("Enter completion date")) {
            // displays dialog box if the user misses any of the text fields
            JOptionPane.showMessageDialog(null, "Please, Fill all the fields", "Warning", 2);
            return;
        } else {
            if (courseList.isEmpty()) { // checks if the ArrayList is empty
                // dialog box for if the Araylist is empty
                JOptionPane.showMessageDialog(null, "First add a course to the list to register.", "Empty Course List",
                        2);
                return;
            } else {
                for (Course course : courseList) { // iterating through ArrayList
                    if (course.getCourseID().equalsIgnoreCase(courseID)) { // checks if the user entered course list
                                                                           // available or not
                        if (course instanceof AcademicCourse) { // ckecks if the course is an instance of AcademicCourse
                                                                // class
                            AcademicCourse academicCourse = (AcademicCourse) course; // down casting
                            if (academicCourse.getIsRegistered()) { // checks if the status of isRegistered variable is
                                                                    // true
                                JOptionPane.showMessageDialog(null, "The " + courseID + " is already registered",
                                        "Registered Course", 2); // dialog box if the course is alrerady registered
                                return;
                            } else {
                                // registers an academic course by calling the register method of AcademicCourse
                                // class
                                academicCourse.register(courseLeaderName, lecturerName, startDate, completionDate);
                                clearTextField(); // clears theb values from text fields and restores the parameters
                                JOptionPane.showMessageDialog(null, "The " + courseID + " is restered successfully",
                                        "Course Registered", 1); // dialog box for successfull registration of a course
                                return;
                            }
                        }
                    } else {
                        flag = true;
                    }
                }
                if (flag) { // checks if the status of flag is true
                    // dislog box informing the user that the course he entered does not exist
                    JOptionPane.showMessageDialog(null, "The " + courseID + " is not found.", "Invalid Course", 2);
                    return;
                }
            }
        }
    }

    /*
     * creates a frame to display details of acdemic course we can search for course
     * on t the basis of course Id and display its details in a text area
     */
    public void displayAcademicCourseFrame() {
        createFrame();
        frame.setTitle("Display Course's details"); // new title for the frame
        frame.setSize(new Dimension(730, 400)); // dimenssion of the new frame

        createLabel(); // calls a method to create labels
        titleLabel.setText("Display Details");
        titleLabel.setBounds(275, 15, 310, 30);
        frame.add(titleLabel);

        createTextFields(); // calls a method to create text fields
        courseIDTextField.setBounds(190, 60, 250, 25);
        frame.add(courseIDTextField);

        createTextArea(); // calls a method to create text area
        displayTextArea.setBounds(70, 100, 580, 230);
        frame.add(displayTextArea);

        createButton(); // calls a method to create button
        displayButton.setBounds(445, 60, 90, 25);
        displayButton.addActionListener((e) -> { // lambda for action listener
            displayAcademicCourse(); // calls a method which displays the details of a course
        });
        frame.add(displayButton);
        backButton.addActionListener((e) -> { // lambda for action listener
            frame.dispose();
            registerAcademicCourseFrame();
        });
        frame.add(backButton);

        frame.setResizable(false); // disabling the resize ablity of the frame
                                   // tis statement must be at the end
    }

    // displays the details of an academic course
    public void displayAcademicCourse() {
        // gets the course ID from the text field and stores in a local variable
        String courseID = this.getCourseID();
        boolean flag = false; // a boolean variable to overcome ConcurrentModificationException
        if (courseList.isEmpty()) { // checks if the ArrayList is empty
            // dialog box if the course list is empty
            JOptionPane.showMessageDialog(null, "First add and register a course to the list to diplay details.",
                    "Empty Course List", 2);
            return;
        } else {
            for (Course course : courseList) { // iterates through the ArrayList
                if (course.getCourseID().equalsIgnoreCase(courseID)) { // compares if the user enters a valid course ID
                    if (course instanceof AcademicCourse) { // checks if the course is an instance of AcademicCourse
                                                            // class
                        AcademicCourse academicCourse = (AcademicCourse) course; // down casting
                        if (academicCourse.getIsRegistered()) { // checks if the ststus of isRegistered variable is true
                            academicCourse.display(); // display method of AcademicCourse class
                            // settig the details of the course as text in a text area
                            displayTextArea.setText("The name of the course is " + academicCourse.getCourseName()
                                    + ".\nThe lecture is " + academicCourse.getLectureName()
                                    + ".\nThe start and completion dates of course are " + academicCourse.getStartDate()
                                    + " and " + academicCourse.getCompletionDate() + ".\nThe level of the course is "
                                    + academicCourse.getLevel() + " and credit is " + academicCourse.getCredit() + ".\n"
                                    + academicCourse.getNoOfAssessment() + " assessments are assigned in total.");
                            return;
                        } else {
                            academicCourse.display(); // calling display method of AcademicCourse class will
                            // setting course ID, course name and duration to the text field of
                            displayTextArea.setText("The course ID is " + course.getCourseID() + "\nThe Course Name is "
                                    + course.getCourseName() + "\nThe duration of the courseis " + course.getDuration()
                                    + "\nThe " + courseID + " is not registered so other details are not available.");
                            return;
                        }
                    }
                } else {
                    flag = true;
                }
            }
            if (flag) { // checks if the ststus of flag is true
                // dislog box if the course ID doesnot match with any of the courses of the
                // ArrayList
                JOptionPane.showMessageDialog(null, "The " + courseID + " is not found.", "Invalid Course", 2);
                return;
            }
        }
    }

    // add a non-academic course
    public void addNonAcademicCourseFrame() {
        createFrame(); // calls a method that creates a frame
        frame.setTitle("Add a non-academic course"); // new title for the frame
        frame.setSize(new Dimension(735, 350)); // dimenssion for the frame

        createLabel(); // calls a method to create label
        titleLabel.setText("Add a Non-Academic Course");
        titleLabel.setBounds(230, 10, 270, 25);
        frame.add(titleLabel);
        courseIDLabel.setBounds(60, 70, 100, 25);
        frame.add(courseIDLabel);
        courseNameLabel.setBounds(365, 70, 100, 25);
        frame.add(courseNameLabel);
        durationLabel.setBounds(125, 120, 80, 25);
        frame.add(durationLabel);
        prerequisiteLabel.setBounds(360, 120, 80, 25);
        frame.add(prerequisiteLabel);
        yesLabel.setBounds(210, 250, 300, 25);
        frame.add(yesLabel);

        createTextFields(); // calls a method that creates text fields
        courseIDTextField.setBounds(135, 70, 200, 25);
        frame.add(courseIDTextField);
        courseNameTextField.setBounds(460, 70, 200, 25);
        frame.add(courseNameTextField);
        durationTextField.setBounds(190, 120, 150, 25);
        frame.add(durationTextField);
        prerequisiteTextField.setBounds(440, 120, 150, 25);
        frame.add(prerequisiteTextField);

        createButton(); // calls a method that creates buttons
        addButton.setBounds(220, 170, 100, 25);
        addButton.addActionListener(e -> { // lambda for action listener
            addNonAcademicCourse(); // calls the method that adds a non-academic course to the ArrayList
        });
        frame.add(addButton);
        clearButton.setBounds(325, 170, 100, 25);
        clearButton.addActionListener(e -> { // lambda for action listener
            clearTextField(); // clears the text fields' values and restores the place holders
        });
        frame.add(clearButton);
        displayButton.setBounds(430, 170, 100, 25);
        displayButton.addActionListener((e) -> { // lambda for action listener
            frame.dispose();
            removeDisplayNonAcademicCourseFrame();
        });
        cancelButton.setBounds(300, 210, 150, 25);
        cancelButton.addActionListener(e -> { // lambda for action listener
            System.exit(0); // terminates the program
        });
        frame.add(displayButton);
        frame.add(cancelButton);
        yesButton.setBounds(410, 250, 60, 25);
        yesButton.addActionListener(e -> { // lambda for action listener
            frame.dispose(); // closes the current frame
            registerNonAcademicCourseFrame(); // opens a new frame that registers the non-academic course
        });
        frame.add(yesButton);
        noButton.setBounds(475, 250, 60, 25);
        frame.add(noButton);
        backButton.addActionListener(e -> { // lambda for action listener
            frame.dispose(); // closes the current frame
            homeFrame(); // calls Home frame
        });
        frame.add(backButton);

        frame.setResizable(false); // disabling the resize ability of the frame
                                   // must be at the end
    }

    // adds a non-academic course to the ArrayList
    public void addNonAcademicCourse() {
        // gets get values entered in the text fields and stores them in local variables
        String courseID = this.getCourseID();
        String courseName = this.getCourseName();
        String durationString = this.getDuration();
        String prerequisite = this.getPrerequisite();
        int duration; // declaring an integer local variable for NumberFormatException
        boolean flag = false; // boolean variable for ovarcoming CncurrentModiFicationException
        // chcecks if the user enetrs values in every fields
        if (courseID.equals("Enter your course ID") || courseName.equals("Enter your Course Name")
                || durationString.equals("Enter Duration") || prerequisite.equals("Prerequisite")) {
            // message for any empty text fields
            JOptionPane.showMessageDialog(null, "Please, Fill all the fields", "Empty field",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            if (courseList.isEmpty()) { // checks if the ArrayList is empty
                flag = true;
            } else {
                for (Course course : courseList) { // iterates through the ArrayList
                    if (course.getCourseID().equalsIgnoreCase(courseID)) { // checks if the course is already added in
                                                                           // the ArrayList
                        // displays message is the course is already present in the ArrayList
                        JOptionPane.showMessageDialog(null, "The " + courseID + " is already added.", "Empty Field", 2);
                        return;
                    } else {
                        flag = true;
                    }
                }
            }
            /* hanlding NumbeFormatException for duration */
            try {
                duration = Integer.parseInt(durationString); // converting the duration to numeric value
            } catch (NumberFormatException e) {
                // message if the duration is not compatible
                JOptionPane.showMessageDialog(null, "Please enter a whole number in the duration field",
                        "Invalid duration", 2);
                return;
            }
            if (flag) { // checks if the status of flag is true
                // calls the constructor of NonAcademicCourse to add the course to the ArrayList
                courseList.add(new NonAcademicCourse(courseID, courseName, duration, prerequisite));
                clearTextField(); // removing data from text fields
                // messsage for successfull addition of the course
                JOptionPane.showMessageDialog(null, "The " + courseID + " has successfully been added.", "Course Added",
                        1);
                return;
            }
        }
    }

    // creates a frame to register a non-academic course
    public void registerNonAcademicCourseFrame() {
        createFrame(); // creates a new frame to register a non-academic course
        frame.setTitle("Register a non-academic course"); // new title for the frame
        frame.setSize(730, 340); // dimenssions for the new frame

        createLabel(); // calls a method that creates labels
        titleLabel.setText("Register a Non-Academic Course");
        titleLabel.setBounds(200, 10, 310, 30);
        frame.add(titleLabel);
        courseIDLabel.setBounds(60, 70, 100, 25);
        frame.add(courseIDLabel);
        courseLeaderLabel.setBounds(365, 70, 100, 25);
        frame.add(courseLeaderLabel);
        instructorNameLabel.setBounds(40, 120, 100, 25);
        frame.add(instructorNameLabel);
        startDateLabel.setBounds(385, 120, 100, 25);
        frame.add(startDateLabel);
        completionDateLabel.setBounds(40, 170, 100, 25);
        frame.add(completionDateLabel);
        examDateLabel.setBounds(383, 170, 100, 25);
        frame.add(examDateLabel);

        createTextFields(); // calls a method that creates the text fields
        courseIDTextField.setBounds(135, 70, 200, 25);
        frame.add(courseIDTextField);
        courseLeaderTextField.setBounds(460, 70, 200, 25);
        frame.add(courseLeaderTextField);
        instructorNameTextField.setBounds(145, 120, 200, 25);
        frame.add(instructorNameTextField);
        startDateTextField.setBounds(460, 120, 200, 25);
        frame.add(startDateTextField);
        completionDateTextField.setBounds(145, 170, 200, 25);
        frame.add(completionDateTextField);
        examDateTextField.setBounds(460, 170, 200, 25);
        frame.add(examDateTextField);

        createButton(); // calls a method that creates buttons
        registerButton.setBounds(205, 220, 100, 25);
        registerButton.addActionListener((e) -> { // lambda for action listener
            registerNonAcademicCourse(); // calls a meods which registers a course
        });
        frame.add(registerButton);
        clearButton.setBounds(310, 220, 100, 25);
        clearButton.addActionListener((e) -> { // lambda for action listener
            clearTextField(); // calls a method which clears the values os text fields and restores the place
                              // holders
        });
        frame.add(clearButton);
        displayButton.setText("Disply/Remove");
        displayButton.setBounds(285, 255, 150, 25);
        displayButton.addActionListener((e) -> { // lambda for action listener
            frame.dispose(); // closes the current frame
            removeDisplayNonAcademicCourseFrame(); // calls a methods which creates a new frame to display
                                                   // or remove a non-academic course
        });
        frame.add(displayButton);
        cancelButton.setBounds(415, 220, 100, 25);
        cancelButton.addActionListener((e) -> { // lambda for acton listener
            System.exit(0); // terminats the program
        });
        frame.add(cancelButton);
        backButton.addActionListener((e) -> { // lambda for action listener
            frame.dispose(); // closes the current frame
            addNonAcademicCourseFrame(); // calls a methods which creates a new frame to add a non-academic course
        });
        frame.add(backButton);

        frame.setResizable(false); // disables the resize ability of the frame
                                   // must be at the end
    }

    // registers non-academic course from the ArrayList
    public void registerNonAcademicCourse() {
        // gets the values entered in the text fields and stores them to local variables
        String courseID = this.getCourseID();
        String courseLeaderName = this.getCourseLeader();
        String instructorName = this.getInstructorName();
        String examDate = this.getExamDate();
        String completionDate = this.getCompletionDate();
        String startDate = this.getStartDate();
        boolean flag = false; // boolean variable to overcome ConcurrentMdificationException
        // chceks if the user fills all the text fields
        if (courseID.equals("Enter your Course ID") || courseLeaderName.equals("Enter your course leader")
                || instructorName.equals("Enter instructor name") || startDate.equals("Enter Start Date")
                || completionDate.equals("Enter completion date") || examDate.equals("Enter exam date")) {
            // dialog box for any empty text fields
            JOptionPane.showMessageDialog(null, "Please fill all fields", "Empty Field", 2);
            return;
        } else {
            if (courseList.isEmpty()) { // checks if the ArrayList is empty
                // dialog box if the ArrayList is empty
                JOptionPane.showMessageDialog(null, "First add a course to the list to register.", "Empty Course List",
                        2);
                return;
            } else {
                for (Course course : courseList) { // iterates through the ArrayList
                    if (course.getCourseID().equalsIgnoreCase(courseID)) { // checks if the user enters a valid course
                                                                           // ID
                        if (course instanceof NonAcademicCourse) { // checks if the course is an instance of the
                                                                   // NonAcademicCourse class
                            NonAcademicCourse nonAcademicCourse = (NonAcademicCourse) course; // down casting
                            if (nonAcademicCourse.getIsRegistered()) { // checks if the status of isRegistered is true
                                // dislay a dialog box is the course is already registered
                                JOptionPane.showMessageDialog(null, "The " + courseID + " is already registered",
                                        "Registered Course", 2);
                                return;
                            } else {
                                // calls a method from NonAcademicCourse class which registes the course
                                nonAcademicCourse.register(courseLeaderName, instructorName, startDate, completionDate,
                                        examDate);
                                clearTextField(); // calls a method which clears all the text fields and restores the
                                                  // place holders
                                // dialog box for successfull registration of the course
                                JOptionPane.showMessageDialog(null, "The " + courseID + " is restered successfully",
                                        "Course Registered", 1);
                                return;
                            }
                        }
                    } else {
                        flag = true;
                    }
                }
                if (flag) { // checks if the valus of fralg is true
                    // message if the user enters a invalid course ID
                    JOptionPane.showMessageDialog(null, "The " + courseID + " is not found.", "Invalid Course", 2);
                    return;
                }
            }
        }
    }

    // creates a frame which displays or remove course details
    public void removeDisplayNonAcademicCourseFrame() {
        createFrame();
        frame.setTitle("Remove/Display course"); // new title for the frame
        frame.setSize(new Dimension(730, 400)); // dimenssion for the new frame

        createLabel(); // calls a method which creates label
        titleLabel.setText("Remove/Display a course");
        titleLabel.setBounds(275, 15, 310, 30);
        frame.add(titleLabel);

        createTextFields(); // calls a method which creates text field
        courseIDTextField.setBounds(190, 60, 250, 25);
        frame.add(courseIDTextField);

        createTextArea(); // calls a method which creates text area
        displayTextArea.setBounds(70, 130, 580, 200);
        frame.add(displayTextArea);

        createButton(); // calls a method which creates button
        displayButton.setBounds(445, 60, 90, 25);
        displayButton.addActionListener((e) -> { // lambda for action listener
            displayNonAcademicCourse(); // calls a method which displays details of a course
        });
        frame.add(displayButton);
        removeButton.setBounds(295, 95, 120, 25);
        removeButton.addActionListener((e) -> { // lambda for action listener
            removeNonAcademicCourse(); // calls a method which removes the details of a course
        });
        frame.add(removeButton);
        backButton.addActionListener((e) -> { // lambda for action listener
            frame.dispose(); // closes the current frame
            registerNonAcademicCourseFrame(); // calls a method which creates a frame to register non-academic course
        });
        frame.add(backButton);
        frame.setResizable(false); // disables the resize ability of the frame
                                   // must be at the end or some components do not render
    }

    // displays the details of a non-academic course
    public void displayNonAcademicCourse() {
        // gets the course ID from the text field and stores it in a local variable
        String courseID = this.getCourseID();
        boolean flag = false; // boolean variable for avoiding ConcurrentModificationExceptio
        if (courseList.isEmpty()) { // checks if the ArrayList is empty
            // dispalys a diaLog box if the ArayList is empty
            JOptionPane.showMessageDialog(null, "First add and register a course to the list to diplay details.",
                    "Empty Course List", 2);
            return;
        } else {
            for (Course course : courseList) { // iterates trough the ArrayList
                if (course.getCourseID().equalsIgnoreCase(courseID)) { // checks if the user enters a valid course ID
                    if (course instanceof NonAcademicCourse) { // checks if the course is an instance of
                                                               // NonAcademicCourse class
                        NonAcademicCourse nonAcademicCourse = (NonAcademicCourse) course; // down casting
                        if (nonAcademicCourse.getIsRegistered()) { // checks if the ststus of is regitered is true
                            nonAcademicCourse.display(); // calls a dispay method of NonAcademicCourse class
                            // sets the details of the course to a text area
                            displayTextArea.setText("The course name is " + nonAcademicCourse.getCourseName()
                                    + ".\nThe instructor is " + nonAcademicCourse.getInstructorName()
                                    + ".\nThe start date of the course is " + nonAcademicCourse.getStartDate()
                                    + " and the completion date is " + nonAcademicCourse.getCompletionDate()
                                    + ".\nThe exam date is " + nonAcademicCourse.getExamDate()
                                    + ".\nThe prerequisite of the course is " + nonAcademicCourse.getPrerequisite());
                            return;
                        } else {
                            nonAcademicCourse.display(); // calls a dispay method of NonAcademicCourse class
                            // sets the details of the course to a text area
                            displayTextArea.setText("The course ID is " + course.getCourseID()
                                    + ".\nThe Course Name is " + course.getCourseName()
                                    + ".\nThe duration of the course is " + course.getDuration() + ".\nThe " + courseID
                                    + " is not registered so other details are not available.");
                            return;
                        }
                    }
                } else {
                    flag = true;
                }
            }
            if (flag) { // checks if the status of flag is true
                // display a dialog box if the user enters an invalid couse ID
                JOptionPane.showMessageDialog(null, "The " + courseID + " is not found.", "Invalid Course", 2);
                return;
            }
        }
    }

    // removes a non-academic course details
    public void removeNonAcademicCourse() {
        // gets the value entered in the text field and stores it in a local variable
        String courseID = this.getCourseID();
        boolean flag = false; // boolean variable to overcome ConcurrentModificationEception
        if (courseList.isEmpty()) { // checks if the ArrayList is empty
            // dislog box if the ArrayList is empty
            JOptionPane.showMessageDialog(null, "First add and register a course to the list to diplay details.",
                    "Empty Course List", 2);
            return;
        } else {
            for (Course course : courseList) { // iterates through ArrayList
                if (course.getCourseID().equalsIgnoreCase(courseID)) { // checks if the user enters a valid course ID
                    if (course instanceof NonAcademicCourse) { // checks if the course is instance of NonAcademicCourse
                                                               // class
                        NonAcademicCourse nonAcademicCourse = (NonAcademicCourse) course; // down casting
                        // conforming if te user really want ot remove the course
                        int conform = (int) JOptionPane.showConfirmDialog(null,
                                "Are you sure, you want to remove " + courseID + "?", "Remove course", 0);
                        if (nonAcademicCourse.getIsRemoved() == false && conform == 0) {
                            nonAcademicCourse.remove(); // remove method of NonAcademicCourse class
                            // courseList.remove(course); // rmoves the object form the ArrayList
                            // message informing the the course is remived successfully
                            JOptionPane.showMessageDialog(null, "The " + courseID + " is removed successfully.",
                                    "Course removed", 1);
                            return;
                        } else {
                            // dialog box if the course is already removed
                            JOptionPane.showMessageDialog(null, "The " + courseID + " is already removed.",
                                    "Invalid Course", 2);
                            return;
                        }
                    }
                } else {
                    flag = true;
                }
            }
            if (flag) { // chcecks if the ststus of flag is true
                // dialog box if the course ID enetered by the user is not found
                JOptionPane.showMessageDialog(null, "The " + courseID + " is not found.", "Invalid Course", 2);
                return;
            }
        }
    }

    // main method starts here
    public static void main(String[] args) {
        new INGCollege().homeFrame(); // running the main frame
    }
}
