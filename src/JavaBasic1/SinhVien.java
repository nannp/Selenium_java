package JavaBasic1;

public class SinhVien {
    public static String name = "Nguyen Phuong Lan";
    int age = 24;
    public void Info(){
        String phoneNumber = "0357578900";
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        System.out.println("Name: "+ name);
        SinhVien sinhVien = new SinhVien();
        System.out.println("Age: "+ sinhVien.age);
        sinhVien.Info();
        System.out.println("Code: " + ThongTin.code);
        System.out.println("Class code: "+ ThongTin.classCode);
    }
}
