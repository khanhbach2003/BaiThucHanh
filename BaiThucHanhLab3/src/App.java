import java.util.Scanner;

public class App {
    public static void maining(String[] args) {
        Hinhtron ht = new Hinhtron();
        ht.setbankinh(5);
        float chuvi = Hinhtron.tinhchuvi();
        float dientich = Hinhtron.tinhdientich();
        System.out.println("Chu vi hinh tron: " + chuvi + "; va dien tich: + dientich")

    }