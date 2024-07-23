package JavaBasic2;

public class Calculator {
    public static int TinhTongSoNguyen(int so1, int so2){
        return so1 + so2;
    }

    public static float TinhTongSoThuc(float so1, float so2){
        return so1 + so2;
    }

    public static void main(String[] args) {
        System.out.println("Tong la: "+TinhTongSoNguyen(2,4));
        System.out.println("Tong la: "+TinhTongSoThuc(2.5f,9.5f));
    }


}
