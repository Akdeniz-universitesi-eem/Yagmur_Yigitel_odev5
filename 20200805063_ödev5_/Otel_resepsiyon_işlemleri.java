
package otel_resepsiyon_işlemleri;

public class Otel_resepsiyon_işlemleri {

   
   import java.util.ArrayList;
import java.util.Scanner;

class Musteri {
    private String ad;
    private String soyad;
    private String telefon;


    public Musteri(String ad, String soyad, String telefon,) {
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
      
    }

    // Getter ve Setter yöntemleri
    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTelefon() {
        return telefon;
    }

   


       class Rezervasyon {
    private Musteri musteri;
    private String odaNo;
    private String girisTarihi;
    private String cikisTarihi;

    public Rezervasyon(Musteri musteri, String odaNo, String girisTarihi, String cikisTarihi) {
        this.musteri = musteri;
        this.odaNo = odaNo;
        this.girisTarihi = girisTarihi;
        this.cikisTarihi = cikisTarihi;
    }
    public Musteri getMusteri() {
        return musteri;
    }

    public String getOdaNo() {
        return odaNo;
    }

    public String getGirisTarihi() {
        return girisTarihi;
    }

    public String getCikisTarihi() {
        return cikisTarihi;
    }
}

class Otel {
    private ArrayList<Rezervasyon> rezervasyonlar = new ArrayList<>();

    public void rezervasyonEkle(Rezervasyon rezervasyon) {
        rezervasyonlar.add(rezervasyon);
    }

    public void guncelRezervasyonlariGoster() {
        for (Rezervasyon rezervasyon :) {
           System.out.println("Müşteri: " + rezervasyon.getMusteri().getAd() + " " + rezervasyon.getMusteri().getSoyad());
           System.out.println("Oda No: " + rezervasyon.getOdaNo());
              System.out.println("Giriş Tarihi: " + rezervasyon.getGirisTarihi());
            System.out.println("Çıkış Tarihi: " + rezervasyon.getCikisTarihi());
          System.out.println();
        }
    }

    public void muhasebeyeBilgiAktar() {
        // Muhasebe işlemleri burada yapılır.
        System.out.println("Muhasebeye bilgi aktarıldı.");
    }
}

class OnlineRezervasyon extends Rezervasyon {
    private String online;

    public OnlineRezervasyon(Musteri musteri, String odaNo, String girisTarihi, String cikisTarihi, String onlineReferans) {
        super(musteri, odaNo, girisTarihi, cikisTarihi);
        this.online = onlineReferans;
    }

    public String getonline() {
        return online;
    }
   }

public class OtelRezervasyonUygulamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Müşteri bilgilerini al
        System.out.print("Adınız: ");
        String ad = scanner.nextLine();
        System.out.print("Soyadınız: ");
        String soyad = scanner.nextLine();
        System.out.print("Telefon: ");
        String telefon = scanner.nextLine();
        
       
        Musteri musteri = new Musteri(ad, soyad, telefon);

        // Rezervasyon bilgilerini al
        System.out.print("Oda Numarası: ");
        String odaNo = scanner.nextLine();
        System.out.print("Giriş Tarihi: ");
        String girisTarihi = scanner.nextLine();
        System.out.print("Çıkış Tarihi: ");
        String cikisTarihi = scanner.nextLine();
        Rezervasyon rezervasyon = new Rezervasyon(musteri, odaNo, girisTarihi, cikisTarihi);

        // Online rezervasyon bilgilerini al
        System.out.print("Online Referans: ");
        String onlineReferans = scanner.nextLine();
        OnlineRezervasyon onlineRezervasyon = new OnlineRezervasyon(musteri, odaNo, girisTarihi, cikisTarihi, onlineReferans);

        // Otel işlemlerini yönet
        Otel otel = new Otel();
        otel.rezervasyonEkle(rezervasyon);
        
    
}
    
