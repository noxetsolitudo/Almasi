package L37_RandomNumber;

import java.text.DecimalFormat;
import java.util.Random;

public class Run {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        Random random = new Random();

        int rnd;
        double sin;
        double cos;

        rnd = random.nextInt(((40-20)+1)+20);

        sin = Math.sin(rnd);
        cos = Math.cos(rnd);

        System.out.println("Sine of " + "number " + rnd + " is: " + decimalFormat.format(sin) +
                "\n" + "Cosine of " + "number " + rnd + " is: " + decimalFormat.format(cos));

    }
}
