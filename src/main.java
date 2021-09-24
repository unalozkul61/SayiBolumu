import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int k , toplam=0 , bolen=0 ;
        System.out.print("Bir Sayi Giriniz : ");
        k = input.nextInt();

        for (int i=1;i<=k;i++) {
            if ((i %3 ==0)&(i % 4 == 0 )) {
                System.out.println(i);
                bolen++;
                toplam +=i;


            }
        }
        double ortalama = toplam / bolen;
        System.out.println("ortalama : " + ortalama);


        }


    }


