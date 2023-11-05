package Class5;

public class VariablesTest {
    String name = "Leemon";
// the variable inside the class and outside the method and without static Keyword it's called instanced variable.
    public static int salary = 58000;


    public void printNumber(){

        //this variable only work inside this method. this call local variable.
        int number = 50;
        System.out.println("Number " + number);
    }

    public void printSomething(){
        System.out.println("Number ");
    }

}
