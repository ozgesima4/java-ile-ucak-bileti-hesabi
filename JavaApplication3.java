package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        double km,mesafe=0.10,tutar;
        int yas,yolculuk;
        System.out.println("gidilecek kmyi girin:");
        km=input.nextDouble();
        if(km<=0){
            System.out.println("HATALI DEGER GİRDİNİZ    !!");
        }
        tutar=km*mesafe;
        System.out.println("Yasınız:");
        yas=input.nextInt();
        if(yas<=0){
            System.out.println("HATALI DEGER GİRDİNİZ    !!");
        }
        else if(yas<12){
            tutar=tutar-(tutar*0.50);
        }
        else if(yas<24){
            tutar=tutar-(tutar*0.10);
        }
        else if(yas>65){
            tutar=tutar-(tutar*0.30);
        }
        System.out.println("yolculuk tipini secin 1->tek yon  2-> cift yon");
        yolculuk=input.nextInt();
        switch (yolculuk) {
            case 1:
                System.out.println("ödeyeceginiz tutar :"+tutar);
                break;
            case 2: 
                System.out.println("ödeyeceginiz tutar: "+(tutar=tutar-(tutar*0.20)));
                break;
            default:
                System.out.println("hatali deger giridniz!!");
        }
    }
    
}
