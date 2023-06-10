package airlinereservation;

public class detaybilgi {
    private String kullaniciAdi;
    private String telefonNumarasi;
    private String havalimaniKodu;
    private String sehir;
    private String ulke;
    private String koltuk;
    private int yas;
    private String cinsiyet;
    private String selectedTime; 

    public detaybilgi(String kullaniciAdi, String telefonNumarasi, String havalimaniKodu, String sehir, String ulke, String koltuk, int yas, String cinsiyet, String selectedTime) {
        this.kullaniciAdi = kullaniciAdi;
        this.telefonNumarasi = telefonNumarasi;
        this.havalimaniKodu = havalimaniKodu;
        this.sehir = sehir;
        this.ulke = ulke;
        this.koltuk = koltuk;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.selectedTime = selectedTime;
    }

    public void rezervasyonuYazdir() {
        System.out.println("Rezervasyonunuz basariyla olusturulmustur. Bilgiler asagidaki gibidir:");
        System.out.println("Kullanici Adi: " + kullaniciAdi);
        System.out.println("Telefon Numarasi: " + telefonNumarasi);
        System.out.println("Havalimani Kodu: " + havalimaniKodu);
        System.out.println("Sehir: " + sehir);
        System.out.println("Ulke: " + ulke);
        System.out.println("Koltuk: " + koltuk);
        System.out.println("Yas: " + yas);
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("Secilen Saat: " + selectedTime);
    }

    public static void main(String[] args) {
        detaybilgi detay = new detaybilgi("Ceren Ergelen", "5443333434", "ABC", "istanbul", "Turkey", "2A", 22, "Kadin", "12:00");
        detay.rezervasyonuYazdir();
    }
}
