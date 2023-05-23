import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        int number;
        System.out.println(" Nhap kich thuoc cua mang ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(" Nhap vao phan thu tu " + i + ":");
            number = sc.nextInt();
            list.add(number);
        }

        System.out.println(" Phan tu trong mang la ");
        for(Integer integer : list){
            System.out.println(integer + "\t");
        }
        try{
            do{
                
            }
        }
    }
}
