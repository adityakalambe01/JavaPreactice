package vmt.assignment1.customexception;

public class InvalidEmailException extends RuntimeException{
    private String message = "Invalid email";
    public InvalidEmailException() {}
    public InvalidEmailException(String message) {
        this.message = message;
    }

    public String toString(){
        return "InvalidEmailException: " + message;
    }
}
