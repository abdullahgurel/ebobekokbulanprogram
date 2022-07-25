import java.util.Scanner;

public class ekokBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.print("N1 Sayısını Giriniz: ");
        n1 = input.nextInt();
        System.out.print("N2 Sayısını Giriniz: ");
        n2 = input.nextInt();

        int ebob=1;

        for (int i =1;i<=(n1*n2);i++) {
            if (i%n1 == 0 && i%n2 ==0) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("--------------------------------------------------");
        for (int k = n1;k>=1;k--) {
            if (n1%k==0 && n2%k ==0) {
                ebob = k;
                break;
            }
        }
        System.out.println((n1*n2)/ebob);
    }

}
