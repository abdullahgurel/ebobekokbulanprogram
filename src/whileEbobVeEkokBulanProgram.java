import java.util.Scanner;
public class whileEbobVeEkokBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.print("N1 Sayısını Giriniz: ");
        n1 = input.nextInt();
        System.out.print("N2 Sayısını Giriniz: ");
        n2 = input.nextInt();
        int i =n1;
        int ebob=1;
        int ekok=1;
            //ebob bulan program döngüsü
        while (i>=1) {
            i--;
            if (n1%i==0 && n2%i ==0) {
                ebob = i;
                System.out.println("Ebob Değeri : "+ebob);
                break;
            }

        }
        System.out.println("-----------------------------------------");
        //ekok bulan program döngüsü
        int k=n1;
        while (k>=1) {
            k--;
            if (n1%k==0 && n2%k ==0) {
                ekok = i;
                break;
            }
        }
        System.out.println("Ekok Değeri : "+ (n1*n2)/ekok);
    }
}
