# Laporan Praktikum #6 - Inheritance

## Kompetensi

1.	Memahami konsep dasar inheritance atau pewarisan.

2.	Mampu membuat suatu subclass dari suatu superclass tertentu.

3.	Mampu mengimplementasikan konsep single dan multilevel inheritance.

4.	Mampu membuat objek dari suatusubclass dan melakukan pengaksesan terhadap atribut dan method baik yang dimiliki sendiri atau turunan dari superclass nya.


## Ringkasan Materi

Inheritance atau pewarisan sifat merupakan suatu cara untuk menurunkan suatu class yang lebih umum menjadi suatu class yang lebih spesifik. Inheritance adalah salah satu ciri utama suatu bahasa program yang berorientasi pada objek. Inti dari pewarisan adalah sifat reusable dari konsep object oriented. Setiap subclass akan “mewarisi” sifat dari superclass selama bersifat protected ataupun public.

Dalam inheritance terdapat dua istilah yang sering digunakan. Kelas yang menurunkan disebut kelas dasar (base class/super class), sedangkan kelas yang diturunkan disebut kelas turunan (derived class/sub class/child class) . Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-­‐nya. Kata kunci extends tersebut memberitahu kompiler Java bahwa kita ingin melakukan perluasan class. Berikut adalah contoh deklarasi inheritance.

Single inheritance adalah Suatu class yang hanya mempunyai satu parent class. Multilevel inheritance adalah Suatu subclass bisa menjadi superclass bagi class yang lain. 

## Percobaan

### Percobaan 1

- Class classA1841720123Zaafril.java
![contoh screenshot](img/p1a.PNG)

Link kode program : [classA1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P1/classA1841720123Zaafril.java)

- Class classB1841720123Zaafril.java
![contoh screenshot](img/p1b.PNG)

Link kode program : [classB1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P1/classB1841720123Zaafril.java)

- Class Main, Percobaan1_1841720123Zaafril.java
![contoh screenshot](img/p1main.PNG)

Link kode program : [Percobaan1_1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P1/Percobaan1_1841720123Zaafril.java)

###Pertanyaan Percobaan 1

1.Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

- Class classB1841720123Zaafril.java
![contoh screenshot](img/p1b.PNG)

Link kode program : [classB1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P1/classB1841720123Zaafril.java)

- Class Main, Percobaan1_1841720123Zaafril.java
![contoh screenshot](img/p1main.PNG)

Link kode program : [Percobaan1_1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P1/Percobaan1_1841720123Zaafril.java)

2.Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!
- Program error terjadi karena kurangnya penambahan extends pada Class classB1841720123Zaafril.java, sehingga saat program dijalankan akan mengalami error

### Percobaan 2

- Class ClassA1841720123Zaafril.java
![contoh screenshot](img/p2a.PNG)

Link kode program : [ClassA1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P2/ClassA1841720123Zaafril.java)

- Class classB1841720123Zaafril.java
![contoh screenshot](img/p2b.PNG)

Link kode program : [ClassB1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P2/ClassB1841720123Zaafril.java)

- Class Main, Percobaan2_1841720123Zaafril.java
![contoh screenshot](img/p2main.PNG)

Link kode program : [Percobaan2_1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P2/Percobaan2_1841720123Zaafril.java)

## Pertanyaan Percobaan 2

1.Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

- Class ClassA1841720123Zaafril.java
![contoh screenshot](img/p2a.PNG)

Link kode program : [ClassA1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P2/ClassA1841720123Zaafril.java)

- Class classB1841720123Zaafril.java
![contoh screenshot](img/p2b.PNG)

Link kode program : [ClassB1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P2/ClassB1841720123Zaafril.java)

- Class Main, Percobaan2_1841720123Zaafril.java
![contoh screenshot](img/p2main.PNG)

Link kode program : [Percobaan2_1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P2/Percobaan2_1841720123Zaafril.java)

2.Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!

- Karena kurangnya penambahan method Getter pada ClassA1841720123Zaafril, ClassB1841720123Zaafril, dan kurangnya penambahan extends pada ClassB1841720123Zaafril. Sehingga ketika program dijalankan akan terjadi error

### Percobaan 3

- Class Bangun1841720123Zaafril.java
![contoh screenshot](img/p3bangun.PNG)

Link kode program : [Bangun1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P3/Bangun1841720123Zaafril.java)

- Class Tabung1841720123Zaafril.java
![contoh screenshot](img/p3tabung.PNG)

Link kode program : [Tabung1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P3/Tabung1841720123Zaafril.java)

- Class Main, Percobaan3_1841720123Zaafril.java
![contoh screenshot](img/p3main.PNG)

Link kode program : [Percobaan3_1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P3/Percobaan3_1841720123Zaafril.java)

## Pertanyaan Percobaan 3

1.Jelaskan fungsi “super” pada potongan program berikut di class Tabung!

![contoh screenshot](img/s31.PNG)

- Merujuk/mengakses atribut dari parent class/superclass

2.Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung!

![contoh screenshot](img/s32.PNG)

- "super" berfungsi untuk merujuk/mengakses atribut dari parent class/superclass, sedangkan "this" berfungsi untuk merujuk/mengakses atribut dari class itu sendiri

### Percobaan 4

- Class ClassA1841720123Zaafril.java
![contoh screenshot](img/p4a.PNG)

Link kode program : [ClassA1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P4/ClassA1841720123Zaafril.java)

- Class ClassB1841720123Zaafril.java
![contoh screenshot](img/p4b.PNG)

Link kode program : [ClassB1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P4/ClassB1841720123Zaafril.java)

- Class ClassC1841720123Zaafril.java
![contoh screenshot](img/p4c.PNG)

Link kode program : [ClassC1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P4/ClassC1841720123Zaafril.java)

- Class Main, Percobaan4_1841720123Zaafril.java
![contoh screenshot](img/p4main.PNG)

Link kode program : [Percobaan4_1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P4/Percobaan4_1841720123Zaafril.java)

### Pertanyaan Percobaan 4

1.Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya!

- superclass : ClassA1841720123Zaafril dan ClassB1841720123Zaafril
- subclass : ClassC1841720123Zaafril
- alasan : pertama ClassB1841720123Zaafril merupakan subclass dari ClassA1841720123Zaafril, sehingga dalam hal ini ClassA1841720123Zaafril adalah superclass dan ClassB1841720123Zaafril adalah subclass. Kemudian ClassB1841720123Zaafril yang awalnya merupakan subclass mempunyai subclass lagi yaitu ClassC1841720123Zaafril sehingga ClassB1841720123Zaafril menjadi superclass dari ClassC1841720123Zaafril, begitu juga seterusnya jika ClassC1841720123Zaafril memilki subclass lagi.

2.Ubahlah isi konstruktor default ClassC seperti berikut:
 
![contoh screenshot](img/s42.PNG)

Tambahkan kata super() di baris Pertama dalam konstruktor defaultnya. Coba jalankan kembali class Percobaan4 dan terlihat tidak ada perbedaan dari hasil outputnya!

- ![contoh screenshot](img/s421.PNG)

3.Ubalah isi konstruktor default ClassC seperti berikut:

![contoh screenshot](img/s43.PNG)

Ketika mengubah posisi super() dibaris kedua dalam kontruktor defaultnya dan terlihat ada error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang.
Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output seperti berikut pada saat instansiasi objek test dari class ClassC

![contoh screenshot](img/s433.PNG)

Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat!

- Karena fungsi awal dari super() adalah untuk merujuk / memanggil konstruktor parent class/superclass, sedangkan pada ClassB1841720123Zaafril hanya terdapat konstruktor default sehingga output yang dijalankan sama saja

4.Apakah fungsi super() pada potongan program dibawah ini di ClassC!

![contoh screenshot](img/s433.PNG)

- Jawaban nomor 4 sama dengan jawaban nomor 3, Karena fungsi awal dari super() adalah untuk merujuk / memanggil konstruktor parent class/superclass, sedangkan pada ClassB1841720123Zaafril hanya terdapat konstruktor default sehingga output yang dijalankan sama saja

### Percobaan 5

- Class Karyawan1841720123Zaafril.java
![contoh screenshot](img/p5karyawan.PNG)

Link kode program : [Karyawan1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P5/Karyawan1841720123Zaafril.java)

- Class Manager1841720123Zaafril.java
![contoh screenshot](img/p5manager.PNG)

Link kode program : [Manager1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P5/Manager1841720123Zaafril.java)

- Class Staff1841720123Zaafril.java
![contoh screenshot](img/p5staff.PNG)

Link kode program : [Staff1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P5/Staff1841720123Zaafril.java)

- Class Main, Inheritance1_1841720123Zaafril.java
![contoh screenshot](img/p5main1.PNG)

Link kode program : [Inheritance1_1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P5/Inheritance1_1841720123Zaafril.java)

### Pertanyaan Percobaan 5

1.Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas!

- superclass : Karyawan1841720123Zaafril.java
- subclass : Manager1841720123Zaafril.java dan Staff1841720123Zaafril.java

2.Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?

- subclass extends superclass

3.Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!

- atribut pada class Manager1841720123Zaafril.java : tunjangan
- atribut pada class Karyawan1841720123Zaafril.java : nama, alamat, jk, umur, gaji

4.Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager!

- Digunakan untuk merujuk/mengakses atribut gaji dari parent class/superclass Karyawan1841720123Zaafril

5.Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan alasannya!

- Single Inheritance, karena class Manager1841720123Zaafril dan Staff1841720123Zaafril hanya mempunyai satu parent class yaitu Karyawan1841720123Zaafril

### Percobaan 6

- Class StaffHarian1841720123Zaafril.java
![contoh screenshot](img/p5sh.PNG)

Link kode program : [StaffHarian1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P5/StaffHarian1841720123Zaafril.java)

- Class StaffTetap1841720123Zaafril.java
![contoh screenshot](img/p5st.PNG)

Link kode program : [StaffTetap1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P5/StaffTetap1841720123Zaafril.java)

- Class Main, Inheritance2_1841720123Zaafril.java
![contoh screenshot](img/p5main2.PNG)

Link kode program : [Inheritance2_1841720123Zaafril.java](../../src/6_Inheritance/minggu6_P5/Inheritance2_1841720123Zaafril.java)

### Pertanyaan Percobaan 6
1.Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?

- Single Inheritance : 
- Karyawan1841720123Zaafril, Manager1841720123Zaafril, dan Staff1841720123Zaafril
- Staff1841720123Zaafril, StaffHarian1841720123Zaafril, dan StaffTetap1841720123Zaafril

- Multilevel Inheritance :
- Karyawan1841720123Zaafril, Staff1841720123Zaafril, dan StaffHarian1841720123Zaafril
- Karyawan1841720123Zaafril, Staff1841720123Zaafril, dan StaffTetap1841720123Zaafril

2.Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!

- StaffHarian1841720123Zaafril : jmlJamKerja
- StaffTetap1841720123Zaafril : golongan dan asuransi
- Staff1841720123Zaafril : nama, alamat, jk, umur, gaji, lembur, dan potongan

3.Apakah fungsi potongan program berikut pada class StaffHarian

![contoh screenshot](img/s63.PNG)

- Berguna untuk merujuk / memanggil konstruktor berparamter dari superclass yaitu class Staff1841720123Zaafril.java

4.Apakah fungsi potongan program berikut pada class StaffHarian

![contoh screenshot](img/s64.PNG)

- Berfungsi untuk merujuk/memanggil method tampilDataStaffZaafril dari parent class/superclass yaitu class Staff1841720123Zaafril.java

5.Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap

![contoh screenshot](img/s65.PNG)

Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji, lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur, dan potongan?

- Karena sudah terdapat super(nama, alamat, jk, umur, gaji, potongan, lembur) didalam konstruktor StaffTetap1841720123Zaafril, sehingga jika ingin memanggil atribut dari class Staff1841720123Zaafril tidak perlu menggunakan super.namaAtribut

## Tugas

1.Buatlah sebuah program dengan konsep pewarisan seperti pada class diagram berikut ini. Kemudian buatlah instansiasi objek untuk menampilkan data pada class Mac, Windows dan Pc!.

![contoh screenshot](img/sctugas.PNG)

- Class Komputer1841720123Zaafril.java
![contoh screenshot](img/tugaskomputer.PNG)

Link kode program : [Komputer1841720123Zaafril.java](../../src/6_Inheritance/minggu6_Tugas/Komputer1841720123Zaafril.java)

- Class Laptop1841720123Zaafril.java
![contoh screenshot](img/tugaslaptop.PNG)

Link kode program : [Laptop1841720123Zaafril.java](../../src/6_Inheritance/minggu6_Tugas/Laptop1841720123Zaafril.java)

- Class Pc1841720123Zaafril.java
![contoh screenshot](img/tugaspc.PNG)

Link kode program : [Pc1841720123Zaafril.java](../../src/6_Inheritance/minggu6_Tugas/Pc1841720123Zaafril.java)

- Class Mac1841720123Zaafril.java
![contoh screenshot](img/tugasmac.PNG)

Link kode program : [Mac1841720123Zaafril.java](../../src/6_Inheritance/minggu6_Tugas/Mac1841720123Zaafril.java)

- Class Windows1841720123Zaafril.java
![contoh screenshot](img/tugaswindows.PNG)

Link kode program : [Windows1841720123Zaafril.java](../../src/6_Inheritance/minggu6_Tugas/Windows1841720123Zaafril.java)

- Class Main, Main1841720123Zaafril.java
![contoh screenshot](img/tugasmain.PNG)

Link kode program : [Main1841720123Zaafril.java](../../src/6_Inheritance/minggu6_Tugas/Main1841720123Zaafril.java)

## Kesimpulan

1.	Kita dapat memahami konsep dasar inheritance atau pewarisan.

2.	Kita dapat membuat suatu subclass dari suatu superclass tertentu.

3.	Kita dapat mengimplementasikan konsep single dan multilevel inheritance.

4.	Kita dapat membuat objek dari suatusubclass dan melakukan pengaksesan terhadap atribut dan method baik yang dimiliki sendiri atau turunan dari superclass nya.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Muhammad Zaafril Sodik)***
