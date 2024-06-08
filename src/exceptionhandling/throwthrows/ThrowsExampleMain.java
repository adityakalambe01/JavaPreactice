package exceptionhandling.throwthrows;

class Program2{
    void login(int age) throws ClassNotFoundException, InstantiationException{
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

public class ThrowsExampleMain {
    public static void main(String[] args) {
        Program2 program2 = new Program2();

        System.out.println("Program Started");

        try{
            program2.login(18);
        }catch (ArithmeticException | ClassNotFoundException | InstantiationException e){
            System.out.println(e);
        }

        System.out.println("Program Ended");

    }
}
