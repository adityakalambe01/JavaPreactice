package exceptionhandling.throwthrows;


class Program1{
    void login(int age){
        System.out.println("Welcome to the site");
        if (age>=70){
            this.home();
        }else{
            throw new ArithmeticException("age is less than 70");
        }
        System.out.println("Visit Again");

    }

    private void home(){
        System.out.println("Welcome to the home");
    }
}

public class ThrowExampleMain {
    public static void main(String[] args) {
        Program1 program1 = new Program1();
        System.out.println("Program Started");

        try{
            program1.login(18);
        }catch (ArithmeticException e){
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("Program Ended");
    }
}
