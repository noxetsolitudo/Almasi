public class Test03 {

    public int pole[] = {5, 10, 15, 20, 25};
    public int total;

    public void specialLoop() {

        for (int x : pole) {
            total += x;
        }
        System.out.println(total);
    }
}
