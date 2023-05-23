import java.util.ArrayList;
import java.util.Scanner;

public class Slide110 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu a [%d]: ", i);
            number = sc.nextInt();
            list.add(number);

        }

        System.out.print("Phan tu trong mang la: ");
        for (Integer integer : list) {
            System.out.print(integer + "\t");
        }

        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: " + max);

        System.out.println("");
        list.sort((o1, o2) -> 02 - 01);
        System.out.print("Sap xep giam dan: ");
        for (Integer integer : list) {
            System.out.print(integer + "\t");

        }
        System.out.println("Nhap gia tri phan tu can xoa: ");
        int tim = sc.nextInt();

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == tim) {
                list.remove(i);
            } else {
                System.out.println("Khong tim thay gia tri vua nhap");
            }
        }
    }
}
