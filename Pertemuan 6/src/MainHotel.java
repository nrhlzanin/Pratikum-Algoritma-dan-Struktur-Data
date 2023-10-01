package Tugas1;

public class MainHotel {
    public static void main(String[] args){
      HotelService list = new HotelService();
      Hotel h1 = new Hotel("The Haven Bali Seminyak", "Denpasar", 700000, (byte)3);
      Hotel h2 = new Hotel("The Phoenix Hotel Yogyakarta", "Yogyakarta", 850000, (byte)4);
      Hotel h3 = new Hotel("Zest Hotel Bandung", "Bandung", 400000, (byte)2);
      Hotel h4 = new Hotel("Shangri-La Hotel Jakarta", "Jakarta", 1000000, (byte)5);
      Hotel h5 = new Hotel("POP! Hotel Stasiun Kota Surabaya", "Surabaya", 200000, (byte)1);
      
      list.tambah(h1);
      list.tambah(h2);
      list.tambah(h3);
      list.tambah(h4);
      list.tambah(h5);
      
      System.out.println("Data sebelum diurutkan");
      list.tampil();
      System.out.println();
      
      System.out.println("==============================================================================");
      System.out.println("1. Harga dimulai dari harga termurah ke harga tertinggi. (asc)");
      list.selectionSort();
      list.tampil();  
      System.out.println();
      
      System.out.println("==============================================================================");
      System.out.println("2. Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1) (desc)");
      list.bubbleSort();
      list.tampil();
    }
}
