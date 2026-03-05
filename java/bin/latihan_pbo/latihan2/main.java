package latihan_pbo.latihan2;

public class main {    
  public static void main(String[] args) {
      Coba pp1 = new Coba();
      pp1.setPanjang(10);
      System.out.print("panjangnya adalah: " + pp1.getPanjang());
      pp1.setLebar(5);
      System.out.println("Lebarnya adalah: " + pp1.getLebar());
      pp1.cetakLuas();
      System.out.println("Luasnya adalah: " + pp1.hitungLuas());
  }
}
