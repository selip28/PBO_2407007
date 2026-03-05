package Latihan1;

public class Main {
    public static void main(String[] args) {
        SegiTiga S1 = new SegiTiga();
        S1.setAlas(10);
        S1.setTinggi(5);
        System.out.println("Luas Segitiganya adalah = " + S1.LuasSegitiga());

        Persegi P1 = new Persegi();
        P1.setSisi(10);
        System.out.println("Luas Perseginya adalah = " + P1.LuasPersegi());

        Trapesium T1 = new Trapesium();
        T1.setAlas(18);
        T1.setAlas(15);
        T1.setTinggi(5);
        System.out.println("Luas Trapesiumnya adalah = " + T1.LuasTrapesium());
    }
    
}
