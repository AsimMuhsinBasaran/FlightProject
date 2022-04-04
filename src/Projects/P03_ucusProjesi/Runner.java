package Projects.ucusProjesi;
public class Runner {
    public static void main(String[] args) {
        System.out.println("******** A Havalimanina Hosgeldiniz **********");
       Yolcu yolcu = new Yolcu("Asim","Basaran",10,"B","E",20);
       Yolcu yolcu1 = new Yolcu("Ali","Kesen",15,"D","E",25);
       Yolcu yolcu2 = new Yolcu("AHmet","Kaya",30,"D","H",100);
       yolcu.biletAl();
       yolcu1.biletAl();
       yolcu2.biletAl();
    }
}
