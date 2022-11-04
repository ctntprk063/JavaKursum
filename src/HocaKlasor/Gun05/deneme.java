package HocaKlasor.Gun05;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        // Kullanıcıdan username(string), password(int) ve gizli soruyu(cümle) alıp ekrana yazdırınız.
        Scanner sc= new Scanner(System.in);
        System.out.print(" username = ");
        String  use= sc.nextLine();

        System.out.print(" password giriniz = " );
        int pass= sc.nextInt();

        System.out.print(" gizli sorunuz = ");
        String gizli=sc.next();
        
       String toplam=use+pass+gizli;

        System.out.println(use + "\n "+ pass+"\n " + gizli );

       



    }
}
