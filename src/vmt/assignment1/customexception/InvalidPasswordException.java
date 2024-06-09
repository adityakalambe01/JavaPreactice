package vmt.assignment1.customexception;

public class InvalidPasswordException extends RuntimeException{
    private String message = "password should contain 1 uppercase, 1 lowercase, 1 numeric, 1 special character.";

    public InvalidPasswordException() {}
    public InvalidPasswordException(String message) {
        this.message = message;
    }
    public String toString(){
        return "InvalidPasswordException: "+message;
    }
}
