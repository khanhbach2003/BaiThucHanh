import java.util.Scanner;

public class Hinhtron {
    private final float Pi = 3.14f;
    private float bankinh;

    public float getbankinh() {

    }

    public void setbankinh(float bankinh) {
        this.bankinh = bankinh;

    }

    public float tinhchuvi(){
        return 2 * Pi * bankinh;

    }

    public float tinhdientich() {
        return Pi * bankinh * bankinh;
    }
    
    }