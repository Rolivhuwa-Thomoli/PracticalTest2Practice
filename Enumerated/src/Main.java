import java.util.Scanner;
public class Main {
    public static enum Grade {A,B,C,D,E,F};
    public static Grade selector(int num){
        return switch (num/10){
            case 9 -> Grade.A;
            case 8 -> Grade.B;
            case 7 -> Grade.C;
            case 6 -> Grade.D;
            case 5 -> Grade.E;
            default -> Grade.F;
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark: ");
        int mark = sc.nextInt();
        System.out.println("Your grade is : "+ selector(mark));

    }
}