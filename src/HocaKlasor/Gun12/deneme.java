package HocaKlasor.Gun12;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        // ternary
        Scanner sc=new Scanner(System.in);
//        System.out.println("bir sayi giriniz");
//        int sayi=sc.nextInt();
//
//        String sonuc =sayi>0?"pozotof":"negatif";
//        System.out.println("sonuc = " + sonuc);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        // Math Max

//        System.out.println("birinci sayiyi giriniz");
//        int say1=sc.nextInt();
//
//        System.out.println("ikinci sayiyi giriniz");
//        int sayi2 =sc.nextInt();
//
//        System.out.println("ucuncu sayiyi giriniz");
//        int sayi3=sc.nextInt();
//
//        System.out.println("en buyuk sayi  = " + Math.max(Math.max(say1,sayi2) ,sayi3 ) );
//
//        System.out.println(" en kucuk sayi = "+ Math.min(Math.min(say1,sayi2),sayi3));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        //Random
//        int sayi= (int) (Math.random()*8+1);
//        System.out.println("sayi = " + sayi);
//
//        //double denemek istedim
//        double sayi2=(double)(Math.random()*4+1);
//        System.out.println("sayi2 = " + sayi2);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        // TODO Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.


        System.out.println(" birinci sayiyi giriniz");
        int sayi1=sc.nextInt();
        int uretilen=(int)(Math.random()*sayi1+1);

        System.out.println("sayi tahmini = ");
        int tahmin=sc.nextInt();

        if (uretilen==tahmin){
            System.out.println("tebrikler bildiniz.");
        }else
            System.out.println("tekrar deneyiniz");

        System.out.println("uretilen sayi  = " + uretilen);




    }
}
