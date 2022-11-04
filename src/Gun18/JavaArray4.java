package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray4 {
    public static void main(String[] args) {
        // kullanicidan alacagainz 7 sayiyi bir diziye atadiktan sonra ayri bir döngü ile kac tanesinin tek sayi oldugunu bulunuz.
        int[] dizi=new int[7];
        Scanner sc=new Scanner(System.in);
        int tekMiktari=0;

        for (int i=0; i<dizi.length; i++)
        {
            System.out.println("sayi giriniz");
            dizi[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(dizi));


        for(int i=0; i< dizi.length;i++)
        {
            if (dizi[i]%2==1) // tek ise
                tekMiktari++;
        }

        System.out.println("tekMiktari = " + tekMiktari);
    }





    }


