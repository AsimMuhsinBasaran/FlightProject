package Projects.ucusProjesi;

import static Projects.ucusProjesi.FiyatKontrol.*;
import static Projects.ucusProjesi.FiyatKontrol.priceD;

public class Yolcu {
    static String rota;
    String donusBileti;
    int age;
    double bagaj;
    String isim;
    String soyisim;
    double netPrice;


    public Yolcu(String isim, String soyisim, int age,String rota, String donusBileti, double bagaj) {
        this.rota = rota;
        this.donusBileti = donusBileti;
        this.age = age;
        this.bagaj = bagaj;
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public void biletAl() {
        if (rota.equals("B") || rota.equals("C") || rota.equals("D")) {
            if (donusBileti.equals("H")) {
                if (rota.equals("B")) {
                    double netPrice = priceB(age);
                    biletYazdir(isim,soyisim,age,rota,donusBileti,bagaj,netPrice);
                } else if (rota.equals("C")) {
                    double netPrice = priceC(age);
                    biletYazdir(isim,soyisim,age,rota,donusBileti,bagaj,netPrice);
                } else if (rota.equals("D")) {
                    double netPrice = priceD(age);
                    biletYazdir(isim,soyisim,age,rota,donusBileti,bagaj,netPrice);
                }
            } else if (donusBileti.equals("E")) {
                if (rota.equals("B")) {
                    double netPrice = priceB(age) * 2 * 0.8;
                    biletYazdir(isim,soyisim,age,rota,donusBileti,bagaj,netPrice);
                } else if (rota.equals("C")) {
                    double netPrice = priceC(age) * 2 * 0.8;
                    biletYazdir(isim,soyisim,age,rota,donusBileti,bagaj,netPrice);
                } else if (rota.equals("D")) {
                    double netPrice = priceD(age) * 2 * 0.8;
                    biletYazdir(isim,soyisim,age,rota,donusBileti,bagaj,netPrice);
                }
            }
        } else {
            System.out.println("Lutfen gecerli bir sehir secin");
            biletAl();
        }
    }
    private void biletYazdir(String isim,String soyisim,int age,String rota,String donusBileti,double bagaj,double netPrice) {
        if (bagaj > 25) {
            System.out.println(isim+" "+soyisim);
            System.out.println("Yas : "+age);
                if (donusBileti.equals("H")) {
                    System.out.println("Seyahat : A sehrinden " + rota + " sehrine");
                }else if (donusBileti.equals("E")){
                    System.out.println("Seyahat : A sehrinden " + rota + " sehrine gidis ve donus");
                }
            System.out.println("Bagaj agirliginiz : "+bagaj+" kg");
            System.out.println("Bilet Fiyatiniz : " + (netPrice + ((bagaj - 25) * 2)) + "€");
            System.out.println("******** İyi Yolculular Dileriz **********");

        } else {
            System.out.println(isim + " " + soyisim);
            System.out.println("Yas : " + age);
            if (donusBileti.equals("H")) {
                System.out.println("Seyahat : A sehrinden " + rota + " sehrine");
            } else if (donusBileti.equals("E")) {
                System.out.println("Seyahat : A sehrinden " + rota + " sehrine gidis ve donus");
            }
            System.out.println("Bagaj agirliginiz : " + bagaj + " kg");
            System.out.println("Bilet Fiyatiniz : " + netPrice + "€");
            System.out.println("******** İyi Yolculular Dileriz **********");
        }
    }
}




