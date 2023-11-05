package class2;

public class RelationlOperatorTest {
    public static void main(String[] args) {
        int number1=987, number2=321, number3;

        number3= number1-number2;//987-321=666
        System.out.println(number3>number1);//flase

        number1= number3-number1;//666-987=-321
        System.out.println(number3<number1);// flase

        number2= number1-number3;//-321-666=-987
        System.out.println(number2 >= number1);//true
        System.out.println(number2 <= number1);

        System.out.println(number3 == number1);
        System.out.println(number3 == number2);

        System.out.println(number2 != number3);

        System.out.println((number3 > number2) && (number2<number3));
        System.out.println((number3 > number2) || (number2<number3));



        int x = 5;
        System.out.println(x>2 && x<6);//	Returns true if both statements are true
        System.out.println(x>2 || x<6);	//Returns true if one of the statements is true
        System.out.println(!(x>6 && x<2));//Reverse the result, returns false if the result is true


    }
}
