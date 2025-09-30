import java.util.Random;
public class RollDie {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt(6) + 1);
    }
}
