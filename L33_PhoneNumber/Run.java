package L33_PhoneNumber;

import java.util.Random;

public class Run {

    public static void main(String[] args) {

        Random random = new Random();

        int firstFirst;
        int secondFirst;
        int thirdFirst;
        int middle;
        int last;
        String middleString;
        String lastString;

        firstFirst = random.nextInt((7 - 0) + 1) + 0;
        secondFirst = random.nextInt((7 - 0) + 1) + 0;
        thirdFirst = random.nextInt((7 - 0) + 1) + 0;
        middle = random.nextInt((742 - 0) + 1) + 0;
        last = random.nextInt((9999 - 0) + 1) + 0;

        middleString = Integer.toString(middle);
        lastString = Integer.toString(last);

        while (middleString.length() < 3) {
            middleString = "0" + middleString;
        }

        while (lastString.length() < 4) {
            lastString = "0" + lastString;
        }

        System.out.println(Integer.toString(firstFirst) + Integer.toString(secondFirst) + Integer.toString(thirdFirst) + "-" + middleString + "-" + lastString);
    }
}
