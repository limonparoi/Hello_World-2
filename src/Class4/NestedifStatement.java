package Class4;

public class NestedifStatement {
    public static void main(String[] args) {
        int  age = 507;
        if(age >= 18){
            if(age >23){
                System.out.println("You might got married");
            }
            System.out.println("Adult");
        }else {
            System.out.println("Child");
        }
    }
}
