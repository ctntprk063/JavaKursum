package HocaKlasor.Gun11;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        // ögrencinin notu 50 den buyukse gecti
        Scanner sc=new Scanner(System.in);
//        System.out.print("ogrencinin notunu giriniz : " );
//        int not=sc.nextInt();
//
//        if (not>=50){
//            System.out.println(" tebrilker gectiniz.");
//
//        }else
//            System.out.println(" butunlemeye kaldiniz..");

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
//
//        System.out.println("vize notunu girin");
//        int vize=sc.nextInt();
//
//        System.out.println("final notunu girin");
//        int fin=sc.nextInt();
//
//        double ort=(vize*0.4)+(fin*0.6);
//
//        if (ort>=60){
//            System.out.println("tebrikler gectiniz");
//        }
//            else
//            System.out.println(" kaldiniz");


        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");

//        // sayi pozitif mi negatif mi?
//
//
//        System.out.print(" bir sayi giriniz");
//
//        int sayi=sc.nextInt();
//
//        if (sayi>0){
//            System.out.println("sayi pozitif");
//        }
//        else
//            if (sayi<0)
//                System.out.println("sayi negatif");
//            else
//                System.out.println("sayi sifir");

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
        // stringde cetin geciyorsa evet yazdir

//        System.out.print(" kelime giriniz");
//        String kelime=sc.nextLine();
//
//        if (kelime.length()>6 && kelime.contains("cetin")){
//            System.out.println("evet");
//        }else
//            System.out.println("hayir");

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");

        // pass
//        System.out.print(" yeni sifrenizi girin =  ");
//        String sifre=sc.nextLine();
//
//        if (sifre.length()>7 && !sifre.contains("pass") && sifre.length()<15 ){
//            System.out.println("tamam sifreniz kabul edildi");
//        }
//        else
//            System.out.println("sifreniz kabul edilmedi" );


        System.out.println("/////////////////////////////////////");
        // otopark ucreti

//        System.out.print(" kac saat kalacaksaniz : ");
//        int park=sc.nextInt();
//        if (park<=2){
//            System.out.println("otopark ucretiniz 2 €  ");
//        }
//        if (park>2 && park<=5){
//            System.out.println("park ucretiniz 5€ .");
//        }
//        if (park>5 && park<10){
//            System.out.println("park ucretiniz 7 €  ");
//
//        }
//        if (park>10){
//            System.out.println("park ucretiniz 10 €");
//        }

        System.out.println("/////////////////////////////////////");

        // t basinca toplam:
        System.out.print("birinci sayiyi giriniz : ");
        int sayi1=sc.nextInt();

        System.out.println("ikinci sayiyi giriniz : ");
        int sayi2 =sc.nextInt();


        System.out.println("Toplam için T\nÇıkrma için Ç\nÇarpma için P\nBölme için B ye\n basınız.");
        Scanner sc2=new Scanner(System.in);
        String islem= sc2.nextLine();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam = " + (sayi1+sayi2 ));

        else
            if (islem.equalsIgnoreCase("C"))
                System.out.println("cikarma : "+ (sayi1-sayi2));
            else
                if (islem.equalsIgnoreCase("P"))
                    System.out.println("carpma : " + (sayi1*sayi2));
                else
                    if (islem.equalsIgnoreCase("B"))
        System.out.println("bolme : "+ (sayi1/sayi2));



    }
}
