package TOKOKU;

// inheritance
public class ProductDetail extends Product {
    public ProductDetail(String kodeProduk, String namaProduk) {
        super(kodeProduk, namaProduk);
    }

    //seleksi
    // polymorphism (overriding)
    public String displayInfo() {
        return super.displayInfo() +
               "\nKategori: " + getKategori() +
               "\nJenis Produk: " + getJenisProduk() +
               "\nNomor Stok: " + getNomorStok();
    }

    //seleksi if-else
    public String getKategori() {
        String kode = getKodeProduk().substring(0, 2);
        if (kode.equals("01")) {
            return "Elektronik";
        } else if (kode.equals("02")) {
            return "Makanan";
        } else {
            return "Lainnya";
        }
    }

    //seleksi switch-case
    public String getJenisProduk() {
        String kode = getKodeProduk().substring(2, 4);
        switch (kode) {
            case "TV":
                return "Televisi";
            case "HP":
                return "Handphone";
            case "MT":
                return "Mie Instan";
            default:
                return "Jenis Lain";
        }
    }

    public int getNomorStok() {
        return Integer.parseInt(getKodeProduk().substring(4));
    }
}
