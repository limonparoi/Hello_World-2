package Class4;

public class IfElseIFStatementTest {
    public static void main(String[] args) {
        int mark = 10;

        if (mark >=80 && mark<=100){
            System.out.println("A++");
        } else if (mark>=70 && mark<=79) {
            System.out.println("A");
        }
        else if (mark>=60 && mark<=69) {
            System.out.println("A-");
        }
        else if (mark>=50 && mark<=59) {
            System.out.println("B-");
        }
        else if (mark>=40 && mark<=49) {
            System.out.println("C-");
        }
        else if (mark>=0 && mark<=39) {
            System.out.println("Fail");
        }
    }
}
