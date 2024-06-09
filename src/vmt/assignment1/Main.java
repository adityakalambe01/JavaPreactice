package vmt.assignment1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        User user = new User();
        user.setUserAge(15);
        user.setUserEmailId("adityakalambe20@gmail.com");
        user.setUserPassword("Aditya@123");
        user.setUserFullName("Aditya Vasant Kalambe");


        School school = new School();
        try{
            school.login(user);
        }catch (RuntimeException e){
            System.out.println(e);
        }
        */

        List<User> users = new ArrayList<User>();
        users.add(new User("Aditya Vasant Kalambe","adityakalambe20@gmail.com","Aditya@123",15));
        users.add(new User("Sanket Parsewar","sanketparsewar@gmail.com","Sanket@123",14));
        users.add(new User("Hitesh Dhawale","hiteshdhawale@gmail.com","hitesH@123",14));
        users.add(new User("Akshay Sanap","akshaysanap@gmail.com","akshAy@123",18));
        users.add(new User("Abhayraaj Sapkal","abhayraaj@gmail.com","abHay@123",14));

        for (User user : users) {
            School school = new School();
            try{
                school.login(user);
            }catch (RuntimeException e){
                System.out.println(e);
            }
        }


    }
}
