import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi;
        boolean asal;
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        sayi = giris.nextInt();

        for(int i = 2; i<=sayi; i++){
            asal = true;
            for(int j = 2; j<i ;j++){
                if (i % j == 0){
                    asal = false;
                }

                }
            if (asal){
                System.out.print("  "+i);
            }
        }


    }
}
