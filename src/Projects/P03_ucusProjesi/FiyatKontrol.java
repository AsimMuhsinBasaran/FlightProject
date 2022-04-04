package Projects.ucusProjesi;
import Projects.Projects_01.age;

public class FiyatKontrol {
    static double bPrice = 500*0.1;
    static double cPrice = 700*0.1;
    static double dPrice = 900*0.1;

    public static double priceB(int age){
        double finalPrice=0;
        if (age < 12 && age > 0){
            finalPrice = bPrice*0.5;
        }else if (age >= 12 && age < 24 ){
            finalPrice = bPrice*0.9;
        }else if (age >= 24 && age < 65){
            finalPrice = bPrice;
        }else if (age >= 65){
            finalPrice = bPrice*0.7;
        }
        return finalPrice;
    }
    public static double priceC(int age){
        double finalPrice=0;
        if (age < 12 && age > 0){
            finalPrice = cPrice*0.5;
        }else if (age >= 12 && age < 24 ){
            finalPrice = cPrice*0.9;
        }else if (age >= 24 && age < 65){
            finalPrice = cPrice;
        }else if (age >= 65){
            finalPrice = cPrice*0.7;
        }
        return finalPrice;
    }
    public static double priceD(int age){
        double finalPrice=0;
        if (age < 12 && age > 0){
            finalPrice = dPrice*0.5;
        }else if (age >= 12 && age < 24 ){
            finalPrice = dPrice*0.9;
        }else if (age >= 24 && age < 65){
            finalPrice = dPrice;
        }else if (age >= 65){
            finalPrice = dPrice*0.7;
        }
        return finalPrice;
    }

}
