
package TOKOKU;

//class 
public class Product {
    // atribut dan encapsulation
    private String kodeProduk;
    private String namaProduk;

    // constructor
    public Product(String kodeProduk, String namaProduk) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
    }

    // mutator (setter)
    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    // accessor (getter)
    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    // polymorphism (overloading)
    public String displayInfo() {
        return "Kode Produk: " + getKodeProduk() + "\nNama Produk: " + getNamaProduk();
    }

    public String displayInfo(String lokasiRak) {
        return displayInfo() + "\nLokasi Rak: " + lokasiRak;
    }
}
