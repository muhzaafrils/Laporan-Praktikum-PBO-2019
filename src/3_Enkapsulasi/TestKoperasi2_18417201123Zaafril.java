package minggu3;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author WINDOWS 10
 */
public class TestKoperasi2_18417201123Zaafril {
    static Scanner sc = new Scanner(System.in); 
    static String nomorKtp, nama; 
    static int limitPinjaman;
    static Anggota2_1841720123Zaafril member;
    
    public static void main(String[] args) {
        System.out.print("Input Nomor KTP   : ");
        nomorKtp = sc.nextLine();
    
        System.out.print("Input Nama        : ");
        nama = sc.nextLine();
        System.out.print("Limit Pinjaman    : ");
        limitPinjaman = sc.nextInt();

    member = new Anggota2_1841720123Zaafril(nomorKtp, nama, limitPinjaman); 
    while (true) {
        menu();
    }
    }
    
    private static void menu() {
    int input = 0;
    System.out.println("	Menu");
    System.out.println("==============");
    System.out.println("1. Pinjam");
    System.out.println("2. Angsur");
    System.out.println("3. Profil");
    System.out.println("4. quit");
    System.out.println("==============");
    System.out.print("Input : ");
    input = sc.nextInt();
    int uang = 0;
    
    switch (input) {
        case 1:
        System.out.print("Input Nominal Pinjam : ");
        uang = sc.nextInt();
        member.pinjamZaafril(uang);
        System.out.println("Jumlah Pinjaman : " +
        member.getJumlahPinjamanZaafril());
        break;
        
        case 2:
        System.out.print("Input Nominal Angsur : ");
        uang = sc.nextInt();
        member.angsurZaafril(uang);
        System.out.println("Jumlah Pinjaman : " +
        member.getJumlahPinjamanZaafril());
        break;
        
        case 3:
        System.out.println("Nomor Ktp   : " + nomorKtp);
        System.out.println("Nama        : " + member.getNamaZaafril());
        System.out.println("Limit Pinjaman : " + member.getLimitPinjamanZaafril());
        System.out.println("Jumlah Pinjaman : " + member.getJumlahPinjamanZaafril());
        break;
        
        case 4:
        System.exit(0);
        default:
        System.out.println("Input Salah");
    }
    }
}
