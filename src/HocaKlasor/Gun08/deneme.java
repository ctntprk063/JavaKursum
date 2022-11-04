package HocaKlasor.Gun08;

public class deneme {
    public static void main(String[] args) {

        String str="Guten Morgen";
        String wie="   Wie geht es Ihnen    ";

        // startsWith

        System.out.println( "ilk stringim  Gu ile basliyor mu = " +str.startsWith("Gu"));//true
        System.out.println( "ilk stringim  gu ile basliyor mu = " +str.startsWith("gu"));//false

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<");

        //endsWith

        System.out.println(" ikinci stringim nen ile bitiyor mu = "+wie.endsWith("nen")); // true


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<");
        //toLowerCase
        System.out.println(" ilk stringimi hepsini kücük yaz = "+str.toLowerCase());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<");
        // toUpperCase
        System.out.println(" ikinci stringi buyuk yazdir = " + wie.toUpperCase());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<");

        // trim  : bosluklari temizler
        System.out.println(" ikinci stringin bosluklarini temizle = " + wie.trim());
        System.out.println(" ikinci stringin büyük  ve bosluksuz hali = " + wie.toUpperCase());


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<");

        // replace : istenen karakterleri yeni karekterlerle degistirir

        System.out.println(" Ihnen i -du- ile degistir = "+ wie.replace("Ihnen", " du"));
        System.out.println(" ikinci stringdeki e leri a ile ddegistir = " +wie.replace("e","a"));


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<");
        // replacefirst  istenen karakterleri sadece ilkini yeni karekterle degistirir

        System.out.println(" ikinci stringdeki e leri a ile ddegistir = " +wie.replaceFirst("e","a"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<");
        // replaceAll  istenen karakterleri kriterlere gore yeni karekterle degistirir.  []--> karekterler icinde yazilir

        System.out.println("ilk stringdeki [ten]  [zel] ile degisimi= "+ str.replaceAll("ten","zel") );
        System.out.println("kucuk harfleri * yaoilmis hali 0 " +str.replaceAll("[a-z]", "*"));

        System.out.println("buyuk harflerin _ hali = " + wie.replaceAll("[A-Z]","_"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<");










    }
}
