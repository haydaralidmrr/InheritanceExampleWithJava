public class InheritanceExample {
    public static void main(String[] args) {
        Kisi ali= new Kisi("ahmet",40134234,19);
        System.out.println(ali);
        Personel mus=new Personel("ali",453253,28,"Ogretmen");
        System.out.println(mus);
        Ogrenci demir = new Ogrenci("Demir",888234653,20,1555);
        System.out.println(demir);
        MezunOgrenci haydar = new MezunOgrenci("Haydar",444442111,26,14555,"NYC");
        System.out.println(haydar);
    }
}
class Kisi {
    private String isim;
    private long tcNo;
    private int yas;

    public Kisi() {
        isim = "henüz atanmadi";
        tcNo = 0;
        yas = 18;
        System.out.println("Kisi sinifi calisti");
    }

    public Kisi(String isim, long tcNo, int yas) {
        this.isim = isim;
        this.tcNo = tcNo;
        setYas(yas);
        System.out.println("Kisi sinifi calisti");
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 18) {
            this.yas = yas;
        }else yas=18;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                ", yas=" + yas +
                '}';
    }
}
class Personel extends Kisi{
    private String pozisyon;

    public Personel(String isim, long tcNo, int yas, String pozisyon) {
        super(isim, tcNo, yas);
        this.pozisyon = pozisyon;
        System.out.println("Personel sinifi calisti");
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "isim='" + getIsim() + '\'' +
                ", tcNo=" + getTcNo() +
                ", yas=" + getYas() +
                "pozisyon='" + pozisyon + '\'' +
                '}';
    }
}
class Ogrenci extends Kisi {
    private int ogrenciNo;

    public Ogrenci(String isim, long tcNo, int yas, int ogrenciNo) {
        super(isim, tcNo, yas);
        this.ogrenciNo = ogrenciNo;
        System.out.println("Ogrenci sinifi calisti");
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + getIsim() + '\'' +
                ", tcNo=" + getTcNo() +
                ", yas=" + getYas() +
                "ogrenciNo=" + ogrenciNo +
                '}';
    }
}
class MezunOgrenci extends Ogrenci {
    private String calistigiYer;

    public MezunOgrenci(String isim, long tcNo, int yas, int ogrenciNo, String calistigiYer) {
        super(isim, tcNo, yas, ogrenciNo);
        this.calistigiYer = calistigiYer;
        System.out.println("MezunOgrenci sinifi calisti");
    }

    public String getCalistigiYer() {
        return calistigiYer;
    }

    public void setCalistigiYer(String calistigiYer) {
        this.calistigiYer = calistigiYer;
    }

    @Override
    public String toString() {
        return "MezunOgrenci{" +
                "isim='" + getIsim() + '\'' +
                ", tcNo=" + getTcNo() +
                ", yas=" + getYas() +
                "calistigiYer='" + calistigiYer + '\'' +
                '}';
    }

}
