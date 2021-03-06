package Abstract;

public class Run {

    public static void main(String[] args) {

        Kid kid = new Kid();
        kid.prepocet();

        Mother mother = new Mother() {
            @Override
            void vypis() {

            }

            @Override
            void prepocet() {

            }
        };
    }
}
