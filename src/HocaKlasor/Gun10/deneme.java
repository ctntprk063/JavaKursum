package HocaKlasor.Gun10;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("bir sayi giriniz :");

       int  sayi=sc.nextInt();
//
//       if (sayi<8)
//           System.out.println("sayi  8 den kucuk dir...");
//
//        System.out.println("*********************************");
//        // sayi negatifmi yoksa pozitif mi?
//
//        if (sayi<0){
//            System.out.println("sayi negatiftir");
//
//
//        }
//
//
//        if (sayi>0) {
//            System.out.println("sayi pozitiftir");
//
//
//        }
//        System.out.println("**********************");
//
//        S
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        //tek mi cift mi

//        if (sayi %2 == 0){
//
//            System.out.println("sayi cifttir = " + sayi);
//
//        }
//        if (sayi % 2==1){
//            System.out.println("sayi tektir : " + sayi);
//        }

//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        //birler basamagini yazi ile yazdirma
//
//       int birler= sayi%10;
//
//       if (birler==0) { System.out.println("sifir"); }
//       if (birler==1) { System.out.println("bir"); }
//       if (birler==2) { System.out.println("iki"); }
//       if (birler==3) { System.out.println("üc"); }
//       if (birler==4) { System.out.println("dört"); }
//       if (birler==5) { System.out.println("bes"); }
//       if (birler==6) { System.out.println("alti"); }
//       if (birler==7) { System.out.println("yedi"); }
//       if (birler==8) { System.out.println("sekiz"); }
//        if (birler==9) { System.out.println("dokuz"); }
//

//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
//        // üc sayidan en buyugunu bulunuz
//        System.out.print("ikinci sayiyi giriniz = ");
//        int sayi2=sc.nextInt();
//
//        System.out.print("ücüncu sayiyi girin = ");
//        int sayi3=sc.nextInt();
//
//        int enbuyuk = sayi;
//
//        if(sayi2>sayi){
//            enbuyuk=sayi2;
//
//        }
//        if (sayi3>sayi2){
//            enbuyuk= sayi3;
//
//        }
//        System.out.println(" en buyuk sayim :" +enbuyuk);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
        // onlar basamagi tek mi ciftmi?

//        int onlar=(sayi/10)%10;
//
//
//        if (onlar%2==0){
//            System.out.println("onlar basamagi cifttir ");
//        }
//        if (onlar%2==1){
//            System.out.println("onlar basamagi tektir ");
//        }


        System.out.println("xxxxxxxxxxxxxxxx");
        // yuzler basamagi tek mi cift mi?

        int yuzler=(sayi/100)%10;

        if (yuzler %2==0){
            System.out.println(" yuzler basamagi cifttir");


        }
        if (yuzler %2==1)
            System.out.println("yuzler basamagi tektir");











    }
}
