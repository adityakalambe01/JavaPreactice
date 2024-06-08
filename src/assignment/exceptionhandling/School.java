package assignment.exceptionhandling;

import assignment.exceptionhandling.customexception.InvalidAgeException;
import assignment.exceptionhandling.customexception.InvalidEmailException;
import assignment.exceptionhandling.customexception.InvalidPasswordException;

import java.util.ArrayList;


public class School {
    //home page
    private void homePage(User user){
        System.out.println("Hello "+user.getUserFullName());
        System.out.println("Your Data: ");
        System.out.println(user);
    }

    //verify user
    private RuntimeException verifyUser(User user){

        //age
        if (user.getUserAge()<6){
            throw new InvalidAgeException("age should be greater than oe equals 6");
        }

        //email
        if (!this.checkEmail(user.getUserEmailId())){
            if (user.getUserPassword().split("@").length!=2){
                throw new InvalidPasswordException("email should be valid");
            }
            throw new InvalidEmailException("Email should be valid and end with @gmail.com, @outlook.com, or @live.com.");
        }

        //password
        if (user.getUserPassword().contains(" ")) throw new InvalidPasswordException("password should not contain space");
        if(user.getUserPassword().length()>=8 && user.getUserPassword().length()<=15){

            StringBuilder message = new StringBuilder();

            boolean hasUppercase = user.getUserPassword().chars().anyMatch(Character::isUpperCase);
            boolean hasLowercase = user.getUserPassword().chars().anyMatch(Character::isLowerCase);
            boolean hasDigit = user.getUserPassword().chars().anyMatch(Character::isDigit);
            boolean hasSpecial = user.getUserPassword().chars().anyMatch(c -> !Character.isLetterOrDigit(c));

            if(!hasUppercase){
                message.append("uppercase");
            }
            if(!hasLowercase){
                message.append(!message.toString().isEmpty() ? ", lowercase":"lowercase");
            }
            if(!hasDigit){
                message.append(!message.toString().isEmpty() ? ", digit":"digit");
            }
            if(!hasSpecial){
                message.append(!message.toString().isEmpty() ? ", special":"special");
            }

            if (!hasUppercase || !hasLowercase || !hasDigit || !hasSpecial) {
                throw new InvalidPasswordException("password should be contains at least 1 "+message+" character.");
            }
        }else {
            throw new InvalidPasswordException("Password should be 8 to 15 character long");
        }
        return null;
    }

    //Email checking logic
    private boolean checkEmail(String email){
        return email.endsWith("@gmail.com") || email.endsWith("@live.com") || email.endsWith("@outlook.com");
    }

    public void login(User user){
        RuntimeException r = verifyUser(user);
        if(r == null){
            homePage(user);
        }else {
            throw r;
        }
    }
}