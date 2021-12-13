package dreamteamproject.model;

/**
 *
 * @author Murni
 */
public class BaseLeptop {
    private String nama;
    private Integer harga = 0;
    private Integer jumlah = 0;

//    public BaseLeptop(String nama, Integer harga) {
//        this.nama = nama;
//        this.harga = this.harga + harga;
//        this.jumlah++;
//    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }


}
