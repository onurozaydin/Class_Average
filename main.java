package java101;

import java.util.Scanner;
public class Class_Average {

	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,muzik;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz Matematik Notu. 0 ile 100 arasında olmalı.");
            return;
        }

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Geçersiz Fizik Notu. 0 ile 100 arasında olmalı.");
            return;
        }

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Geçersiz Kimya Notu. 0 ile 100 arasında olmalı.");
            return;
        }

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Geçersiz Türkçe Notu. 0 ile 100 arasında olmalı.");
            return;
        }

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz Müzik Notu. 0 ile 100 arasında olmalı.");
            return;
        }

        double average = (mat + fizik + kimya + turkce + muzik) / 5;

        if (average >= 55) {
            System.out.println("Ortalama: " + average + " Geçtiniz!");
        } else {
            System.out.println("Ortalama: " + average + " Kaldınız.");
        }
    }
}
