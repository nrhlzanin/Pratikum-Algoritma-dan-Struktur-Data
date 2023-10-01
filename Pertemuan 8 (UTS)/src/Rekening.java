package uts;

/**
 *
 * @author USER
 */
public class Rekening {
    String noRekening, nama, namaIbu, Phone, Email;
    
    public Rekening(String noRekening, String nama, String namaIbu, String Phone, String Email){
    this.noRekening = noRekening;
    this.nama = nama;
    this.namaIbu = namaIbu;
    this.Phone = Phone;
    this.Email = Email;
    }
    
    void tampilkanDataRekening(String noRekening, String nama, String namaIbu, String Phone, String Email){
        System.out.print("No Rekenign\t Nama\t Nama Ibu\t Phone\t Email");
        for (Rekening rekening : rekenings) {
            System.out.println(rekening.nonrekening + "");
        }
    }
}
