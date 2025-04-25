import java.security.SecureRandom;
import java.util.Scanner;

class Coin{
    private int toss;
    private static int numberOfTosses = 0;
    Coin(){}
    Coin(int mainToss){
        toss = mainToss;
        numberOfTosses++;
    }
    public int getValue(){
        return toss;
    }
    public static int getNumberOfTosses(){
        return numberOfTosses;
    }
    public void displayToss(){
        System.out.println(this.toss == 0? "Tail": "Head");
    }
    public static void displayNumberOfTosses(){
        System.out.println("Number of Coin Tosses: "+numberOfTosses);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

// think of generator as like your Scanner variable sc
//Like sc you can reuse generator to generate more random data of different types

        Coin first = new Coin(generator.nextInt(2));
        Coin second = new Coin(generator.nextInt(2));

        first.displayToss();
        second.displayToss();
        Coin.displayNumberOfTosses();
        System.out.println("Random int 0-99: "+ generator.nextInt(100));
        System.out.println("Random double 0-99: "+ 100*generator.nextDouble());
    }
}