package latihan_pbo.latihan2;

public class Coba {
    protected double panjang;
    protected double lebar;
    protected double sisi;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getPanjang() {
        return panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double getLebar() {
        return lebar;
    }
    public void cetakLuas() {
        System.out.println("Luasny adalah= " + panjang * lebar);
    }
    
    public double hitungLuas() {
        return panjang * lebar;
    }
}
