package assignment.exceptionhandling;




public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUserAge(15);
        user.setUserEmailId("aditya@kalambe20@gmail.com");
        user.setUserPassword("Aditya@123");
        user.setUserFullName("Aditya Vasant Kalambe");

        School school = new School();
        try{
            school.login(user);
        }catch (RuntimeException e){
            System.out.println(e);
        }


    }
}
