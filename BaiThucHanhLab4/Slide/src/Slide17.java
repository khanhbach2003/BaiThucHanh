import java.util.ArrayList;

public class Slide17 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(7);
        list.add(1);
        list.add(9);

        System.out.println("Cac phan tu co trong list la: ");
        for (int number : list) {
            System.out.print(number + "\t");
        }
    }
}
