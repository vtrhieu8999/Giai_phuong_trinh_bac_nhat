import java.util.Scanner;

public class Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a= sc.nextDouble();
        System.out.println("Nhap b: ");
        double b= sc.nextDouble();
        System.out.println("Nhap c: ");
        b= b-sc.nextDouble();
        if(a==0){
            if(b==0) System.out.println("Phuong trinh co vo so nghiem");
            else System.out.println("Phuong trinh vo nghiem");
        } else System.out.println("Phuong trinh co nghiem: "+-b/a);
    }

}
