package assignment.exceptionhandling;

public class User {
    private String userFullName;
    private String userEmailId;
    private String userPassword;
    private int userAge;

    public User() {

    }

    public User(String userFullName, String userEmailId, String userPassword, int userAge) {
        this.userFullName = userFullName;
        this.userEmailId = userEmailId;
        this.userPassword = userPassword;
        this.userAge = userAge;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "userFullName='" + userFullName + '\'' +
                ", userEmailId='" + userEmailId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
