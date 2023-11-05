package Class4;

public class BreakStatementTest {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            if(i>5) break;
            System.out.println("Break " + i);
        }
        System.out.println("=====================");
        for (int i = 0; i<100; i+=20){
            if(i<=25) break;
            System.out.println("Break " + i);
        }
    }
}
