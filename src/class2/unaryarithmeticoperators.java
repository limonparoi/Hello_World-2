package class2;

public class unaryarithmeticoperators {
    public static void main(String[] args) {
        // ++exp, exp++, --exp, exp--

        int number = 70;
        System.out.println(number++);//70, 70+1=71
        System.out.println(++number);//71
        System.out.println(number);//1+71=72
        System.out.println(--number);//72-1=71
        System.out.println(number--);//71, 71-1
        System.out.println(number);//70

        number = 25+30;
        System.out.println(--number);//1-55=54
        System.out.println(number--);//54-1=53
        System.out.println(number++);//53+1
        System.out.println(++number);//54+1=55
    }
}
