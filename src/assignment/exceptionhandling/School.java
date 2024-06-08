package assignment.exceptionhandling;

import assignment.exceptionhandling.customexception.InvalidAgeException;
import assignment.exceptionhandling.customexception.InvalidEmailException;
import assignment.exceptionhandling.customexception.InvalidPasswordException;


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
        if(!this.checkPassword(user.getUserPassword())){
            throw new InvalidPasswordException();
        }
        if (!this.checkEmail(user.getUserEmailId())){
            throw new InvalidEmailException();
        }
        return null;
    }

    //Password checking logic
    private boolean checkPassword(String password){
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        for (char character : password.toCharArray()) {
            if(Character.isUpperCase(character)){
                uppercaseCount++;
            }else if(Character.isLowerCase(character)){
                lowercaseCount++;
            }else if(Character.isDigit(character)){
                digitCount++;
            } else if (!Character.isWhitespace(character)) {
                specialCount++;
            }
        }
        return (uppercaseCount>=1 && lowercaseCount>=1 && digitCount>=1 && specialCount>=1) && (password.length()>=8 && password.length()<=15);
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
