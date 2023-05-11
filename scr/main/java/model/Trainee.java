public class Trainee extends Person {
    String registrationID;
    String password;
    String[] enrolledCourses;

    public Trainee() {
    }

    // getters and setters
    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String[] enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

}
