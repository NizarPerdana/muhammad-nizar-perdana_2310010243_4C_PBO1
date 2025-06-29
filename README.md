# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Product menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa kodeProduk dan namaProduk, dan memberikan output berupa informasi detail dari kodeProduk tersebut seperti Kategori, Jenis Produk, dan nomor Stok

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Product`, `ProductDetail`, dan `ProductBeraksi` adalah contoh dari class.

```bash
public class Product{
    ...
}

public class ProductDetail extends Product{
    ...
}

public class ProductBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarProduk[i] = new ProductDetail(kode, nama);` adalah contoh pembuatan object.

```bash
daftarProduk[i] = new ProductDetail(kode, nama);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `kodeProduk` dan `namaProduk` adalah contoh atribut.

```bash
String kodeProduk;
String namaProduk;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Product` dan `ProductDetail`.

```bash
public Product(String kodeProduk, String namaProduk) {
    this.kodeProduk = kodeProduk;
    this.namaProduk = namaProduk;
}

public ProductDetail(String kodeProduk, String namaProduk) {
    super(kodeProduk, namaProduk);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setKodeProduk` dan `setNamaProduk` adalah contoh method mutator.

```bash
public void setKodeProduk(String kodeProduk) {
    this.kodeProduk = kodeProduk;
}

public void setNamaProduk(String namaProduk) {
    this.namaProduk = namaProduk;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getKodeProduk`, `getNamaProduk`, `getKategori`, `getJenisProduk`, dan `getNomorStok` adalah contoh method accessor.

```bash
public String getKodeProduk() {
    return kodeProduk;
}

public String getNamaProduk() {
    return namaProduk;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String kodeProduk;
private String namaProduk;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ProductDetail` mewarisi `Product` dengan sintaks `extends`.

```bash
public class ProductDetail extends  Product {
    public ProductDetail(String kodeProduk, String namaProduk) {
        super(kodeProduk, namaProduk);
    }
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Product` merupakan overloading method `displayInfo` dan `displayInfo` di `ProductDetail` merupakan override dari method `displayInfo` di `Product`.

```bash
public String displayInfo(String lokasiRak) {
     return displayInfo() + "\nLokasi Rak: " + lokasiRak;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKategori` dan seleksi `switch` dalam method `getJenisProduk`.

```bash
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

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarProduk.length; i++) {
    System.out.print("Nama Produk ke-" + (i + 1) + ": ");
    String nama = input.nextLine();
    System.out.print("Kode Produk ke-" + (i + 1) + ": ");
    String kode = input.nextLine();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Nama produk ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\n=== Daftar Produk ===");
System.out.println(p.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `ProductDetail[] daftarProduk = new ProductDetail[2];` adalah contoh penggunaan array.

```bash
ProductDetail[] daftarProduk = new ProductDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Kesalahan: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Nizar Perdana
NPM: 2310010243
