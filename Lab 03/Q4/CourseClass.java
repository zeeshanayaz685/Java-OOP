package Q4k243023;

public class CourseClass {
    private String courseCode;
    private String name;
    private int creditHrs;

    // Setter for courseCode with validation
    public void setCourseCode(String courseCode) {
        if (courseCode.matches("[A-Za-z]{2}\\d{3}")) {
            this.courseCode = courseCode;
        } else {
            System.out.println("Invalid Course Code! Expected format: CS101");
        }
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for creditHrs with validation
    public void setCreditHrs(int creditHrs) {
        if (creditHrs >= 1 && creditHrs <= 4) {
            this.creditHrs = creditHrs;
        } else {
            System.out.println("Invalid Credit Hours! Must be between 1 and 4.");
        }
    }

    // Getter for courseCode
    public String getCourseCode() {
        return courseCode;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for creditHrs
    public int getCreditHrs() {
        return creditHrs;
    }
}
