import java.util.Scanner;

public class Hinhtron {
    final float PI = 3.14f;
    float r;
    float chuvi;
    float dientich;
    void nhapbankinh(){
        Scanner.sc = new Scanner(System.in);

        System.out.print(s:"Nhap ban kinh r:");
        r=sc.nextFloat();
    }
    void tinhchuvi(){
        chuvi=2*r*PI;

    }
    void tinhdientich(){
        dientich=r*r*PI;

    }
    void inchuvi(){
        System.out.printf("Chu vi hinh tron ban kinh r la:");
        
    }
    void indientich(){
        System.out.printf("Dien tich hinh tron ban kinh r la:");
    }
  

}
