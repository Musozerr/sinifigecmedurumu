import java.util.Scanner;

public class sinifigecmedurumu {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        double ort,sifir;
        sifir = 5.0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat = sc.nextInt();
        if (mat < 0 || mat > 100) {
            mat = 0;
            sifir--;
        }
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = sc.nextInt();
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            sifir--;
        }
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = sc.nextInt();
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            sifir--;
        }
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = sc.nextInt();
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            sifir--;
        }
        System.out.print("Muzik notunuzu giriniz: ");
        muzik = sc.nextInt();
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            sifir--;
        }
        System.out.println("Gecerli Girilen Notlar : " + sifir);
        ort = (mat + fizik + kimya + turkce + muzik) / sifir;
        System.out.println("Not Ortalamaniz = " + ort);
        if (ort >= 55.0)
            System.out.println("Tebrikler Sinifi Gectiniz ... ");
        else
            System.out.println("Maalesef Sinifta Kaldiniz !!! ");
    }


}
