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

        if (user.getUserAge()<6){
            throw new InvalidAgeException("age should be greater than oe equals 6");
        }


        if (!this.checkEmail(user.getUserEmailId())){
            throw new InvalidEmailException();
        }

        if(user.getUserPassword().length()>=8 && user.getUserPassword().length()<=15){
            if (user.getUserPassword().contains(" ")) throw new InvalidPasswordException("password should not contain space");

            boolean isUppercase = false, isLowercase = false, isDigit = false, isSpecial = false;
            String message = "";

            for (char character : user.getUserPassword().toCharArray()) {
                if (isLowercase && isUppercase && isDigit && isSpecial) {
                    break;
                }else if(Character.isUpperCase(character)){
                    isUppercase = true;
                }else if(Character.isLowerCase(character)){
                    isLowercase = true;
                }else if(Character.isDigit(character)){
                    isDigit = true;
                } else if (!Character.isWhitespace(character)) {
                    isSpecial = true;
                }
            }



            if(!isUppercase){
                message = "uppercase";
            }
            if(!isLowercase){
                message += !message.isEmpty() ? ", lowercase":"lowercase";
            }
            if(!isDigit){
                message += !message.isEmpty() ? ", digit":"digit";
            }
            if(!isSpecial){
                message += !message.isEmpty() ? ", special":"special";
            }

            if (!isUppercase || !isLowercase || !isDigit || !isSpecial) {
                throw new InvalidPasswordException("password should be contains at least 1 "+message+" letters");

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
