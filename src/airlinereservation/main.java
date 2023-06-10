package airlinereservation;

interface BakimTarihiModeli {
    void bakimTarihiniGoster();
}

interface SeriNoSu {
    void seriNoSuGoster();
}

class Ucak implements BakimTarihiModeli, SeriNoSu {
    private String model;
    private String seriNo;
    private String bakimTarihi;

    public Ucak(String model, String seriNo, String bakimTarihi) {
        this.model = model;
        this.seriNo = seriNo;
        this.bakimTarihi = bakimTarihi;
    }

    public void bilgileriGoster() {
        System.out.println("Model: " + model);
        System.out.println("Seri No: " + seriNo);
    }

    @Override
    public void bakimTarihiniGoster() {
        System.out.println("Bakim Tarihi: " + bakimTarihi);
    }

    @Override
    public void seriNoSuGoster() {
        System.out.println("Seri No Su: " + seriNo);
    }
}

public class main {
    public static void main(String[] args) {
        Ucak ucak = new Ucak("FRT 147", "123456789", "10.06.1999");

        ucak.bilgileriGoster();
        ucak.bakimTarihiniGoster();
        ucak.seriNoSuGoster();
    }
}

