import  java.util.Random;
public class SumOfTwoDice {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt(6) + rand.nextInt(6) + 2);
    }
}
