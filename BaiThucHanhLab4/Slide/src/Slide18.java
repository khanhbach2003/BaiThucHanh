import java.util.ArrayList;
import java.util.Iterator;

public class Slide18 {

    public static void main(String[] args) {

        ArrayList<Float> list = new ArrayList<>();

        list.add(0.7f);
        list.add(7.26f);
        list.add(1.02f);
        list.add(9.3f);

        Iterator<Float> iterator = list.iterator();

        System.out.println("Cac phan tu co trong list la: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }


    }
}
