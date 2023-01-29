package Giris;
import java.util.List;
import java.util.Scanner;

public class NotOrtalamasi2 {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,ortalama=0,i=0;
        Scanner inp= new Scanner(System.in);
        System.out.print("Matematik Notu:");
        mat=inp.nextInt();
        System.out.print("Fizik Notu:");
        fizik =inp.nextInt();
        System.out.print("Türkçe Notu:");
        turkce =inp.nextInt();
        System.out.print("Kimya Notu:");
        kimya =inp.nextInt();
        System.out.print("Müzik Notu:");
        muzik =inp.nextInt();
        if (0<=mat && mat<=100) {
            ortalama += mat ;
            i++;
        }
        if (0<=turkce && turkce<=100) {
            ortalama += turkce ;
            i++;
        }
        if (0<=fizik && fizik<=100) {
            ortalama += fizik ;
            i++;
        }
        if (0<=kimya && kimya<=100) {
            ortalama += kimya ;
            i++;
        }
        if (0<=muzik && muzik<=100) {
            ortalama += muzik ;
            i++;
        }
        System.out.println("Ortalama:" + ortalama/i);
        if (ortalama>55){
            System.out.println("Geçtiniz");
        }else{
            System.out.println("Kaldınız");
        }
    }
}


