package Program;
import javax.swing.*;
// Import MENU
import static Program.MENU.*;

public class INPUT {
    
    // Var INPUT
    private static String tampil, input;
    private static String toko, alamat, pemilik, jenis, modal, penjualan, pembeli, 
                          cabang, email, sosmed, nohp, status, pharian,
                          ketJ, ketPj, ketPb, ketC, ketSm, ketSt;
    private static int no , imodal, ipharian;
    private static boolean putar = true, salah = true;
    
    static void Input() {
        
        // Jika Data Penuh
        if(x == 23 ) {
            JOptionPane.showMessageDialog(null ,"Data Penuh!!", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {
        
            no = x + 1 ;

            do {

                do{
                    input = JOptionPane.showInputDialog("Mau Input Data?? [Y/T]");
                }
                while(!("y".equals(input) | "Y".equals(input) | "t".equals(input) 
                        | "T".equals(input)) );

                // Mmembuat Perulangan Untuk Input Data Lagi
                while("Y".equals(input) | "y".equals(input)) { 

                    // Agar tidak ada error karena kelebihan data
                    if (x == 23) {
                        JOptionPane.showMessageDialog(null ,"Data Penuh!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                        input = "T";
                    }
                    else {

                    switch (input) {

                        case "Y","y" : {

                            tampil = ""; // riset tampil
                            x++ ; no++;

                            // Input Nama Toko
                            do {
                                toko = JOptionPane.showInputDialog("Masukkan Nama Toko");

                                // Cek apakah data kosong atau tidak
                                if(toko.equals("")) {
                                    //Jika data kosong maka akan memunculkan peringatan
                                    JOptionPane.showMessageDialog(null ,"Data tidak boleh kosong!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                    salah = true;
                                } else {
                                    //Jika data terisi akan lanjut
                                    salah = false;
                                }
                                NToko[x] = toko;
                            }
                            while(salah);

                            //Input Alamat
                            do {
                                alamat = JOptionPane.showInputDialog("Masukkan Alamat Toko");

                                // Cek apakah data kosong atau tidak
                                if(alamat.equals("")) {
                                    //Jika data kosong maka akan memunculkan peringatan
                                    JOptionPane.showMessageDialog(null ,"Data tidak boleh kosong!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                    salah = true;
                                } else {
                                    //Jika data terisi akan lanjut
                                    salah = false;
                                }
                                Alamat[x] = alamat;
                            }
                            while(salah);

                            //Input Nama Pemilik
                            do {
                                pemilik = JOptionPane.showInputDialog("Masukkan Nama Pemilik Toko");

                                // Cek apakah data kosong atau tidak
                                if(pemilik.equals("")) {
                                    //Jika data kosong maka akan memunculkan peringatan
                                    JOptionPane.showMessageDialog(null ,"Data tidak boleh kosong!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                    salah = true;
                                } else {
                                    //Jika data terisi akan lanjut
                                    salah = false;
                                }
                                Pemilik[x] = pemilik;
                            }
                            while(salah);

                            //Input Jenis Usaha
                            do {
                                jenis = JOptionPane.showInputDialog("""
                                                                    Jenis Usaha

                                                                    1. Pakaian      5. Elektronik
                                                                    2. Sarung       6. Barang Bekas
                                                                    3. Makanan      7. Bahan Pokok
                                                                    4. Sepatu/Tas   8. Lain-lain

                                                                            Pilih [ 1 - 8 ]
                                                                    """);

                                // Keterangan Jenis Usaha
                                switch (jenis) {

                                    case "1" : {
                                        ketJ = "Pakaian";
                                        salah = false;
                                        break;
                                    }

                                    case "2" : {
                                        ketJ = "Sarung";
                                        salah = false;
                                        break;
                                    }

                                    case "3" : {
                                        ketJ = "Makanan";
                                        salah = false;
                                        break;
                                    }

                                    case "4" : {
                                        ketJ = "Sepatu/Tas";
                                        salah = false;
                                        break;
                                    }
                                    
                                    case "5" : {
                                        ketJ = "Elektronik";
                                        salah = false;
                                        break;
                                    }

                                    case "6" : {
                                        ketJ = "Barang Bekas";
                                        salah = false;
                                        break;
                                    }

                                    case "7" : {
                                        ketJ = "Bahan Pokok";
                                        salah = false;
                                        break;
                                    }

                                    case "8" : {
                                        ketJ = "Lain-lain";
                                        salah = false;
                                        break;
                                    }

                                    default : {
                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                        salah = true;
                                        break;
                                    }
                                }
                            }
                            while(salah);
                            JUsaha[x] = ketJ;

                            //Input Modal Toko
                            do {
                                try {
                                    modal  = JOptionPane.showInputDialog("Masukkan Modal Toko");
                                    imodal = Integer.parseInt(modal);
                                    salah = false;
                                }
                                catch (Exception e) {
                                    JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                    salah = true;
                                }
                            }
                            while(salah | imodal <= 0);
                            Modal[x] = imodal;

                            //Input Penjualan
                            do {
                                penjualan = JOptionPane.showInputDialog("""
                                                                    Penjualan

                                                                    [D] Dalam Negeri
                                                                    [L] Luar Negeri
                                                                    [S] Dalam dan Luar Negeri

                                                                    """);

                            // Keterangan Penjualan
                                switch (penjualan) {

                                    case "D","d" : {
                                        ketPj = "Dalam Negeri";
                                        salah = false;
                                        break;
                                    }

                                    case "L","l" : {
                                        ketPj = "Luar Negeri";
                                        salah = false;
                                        break;
                                    }

                                    case "S","s" : {
                                        ketPj = "Dalam dan Luar Negeri";
                                        salah = false;
                                        break;
                                    }

                                    default : {
                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                        salah = true;
                                        break;
                                    }
                                }
                            }
                            while(salah);
                            Penjualan[x] = ketPj;

                            //Input Pembeli
                            do {
                                pembeli = JOptionPane.showInputDialog("""
                                                                    Pembeli

                                                                    [D] Domestik
                                                                    [L] Luar
                                                                    [C] Campuran

                                                                    """);

                                // Keterangan Pembelli
                                switch (pembeli) {

                                    case "D","d" : {
                                        ketPb = "Domestik";
                                        salah = false;
                                        break;
                                    }

                                    case "L","l" : {
                                        ketPb = "Luar";
                                        salah = false;
                                        break;
                                    }

                                    case "C","c" : {
                                        ketPb = "Campuran";
                                        salah = false;
                                        break;
                                    }

                                    default : {
                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                        salah = true;
                                        break;
                                    }
                                }
                            }
                            while(salah);
                            Pembeli[x] = ketPb;

                            //Input Cabang
                            do {
                                cabang = JOptionPane.showInputDialog("""
                                                                    Cabang

                                                                    [T] Tidak Ada
                                                                    [A] Ada

                                                                    """);

                                // Keterangan Pembelli
                                switch (cabang) {

                                    case "T","t" : {
                                        ketC = "Tidak Ada";
                                        salah = false;
                                        break;
                                    }

                                    case "A","a" : {
                                        ketC = "Ada";
                                        salah = false;
                                        break;
                                    }

                                    default : {
                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                        salah = true;
                                        break;
                                    }
                                }
                            }
                            while(salah);
                            Cabang[x] = ketC;

                            //Input Alamat Email
                            do {
                                email = JOptionPane.showInputDialog("""
                                                                    Masukkan Alamat Email
                                                                    Jika tidak ada masukkan -
                                                                    """);

                                // Cek apakah data kosong atau tidak
                                if(email.equals("")) {
                                    //Jika data kosong maka akan memunculkan peringatan
                                    JOptionPane.showMessageDialog(null ,"Data tidak boleh kosong!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                    salah = true;
                                } else {
                                    //Jika data terisi akan lanjut
                                    salah = false;
                                }
                                Email[x] = email;
                            }
                            while(salah);

                            //Input Sosial Media
                            do {
                                sosmed = JOptionPane.showInputDialog("""
                                                                    Sosial Media

                                                                    1. Facebook       4. Telegram
                                                                    2. WhatsApp       5. Dan Lain-lain
                                                                    3. Instagram      

                                                                            Pilih [ 1 - 5 ]
                                                                    """);

                                // Keterangan Jenis Sosial Media
                                switch (sosmed) {

                                    case "1" : {
                                        ketSm = "Facebook";
                                        salah = false;
                                        break;
                                    }

                                    case "2" : {
                                        ketSm = "WhatsApp";
                                        salah = false;
                                        break;
                                    }

                                    case "3" : {
                                        ketSm = "Instagram";
                                        salah = false;
                                        break;
                                    }

                                    case "4" : {
                                        ketSm = "Telegram";
                                        salah = false;
                                        break;
                                    }

                                    case "5" : {
                                        ketSm = "Dan Lain-lain";
                                        salah = false;
                                        break;
                                    }

                                    default : {
                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                        salah = true;
                                        break;
                                    }
                                }
                            }
                            while(salah);
                            Sosmed[x] = ketSm;

                            //Input No HP/Telepon (Pake String agar 0 tidak hilang)
                            do {
                                nohp  = JOptionPane.showInputDialog("Masukkan No HP/Telepon"
                                                                      + "\n Jika tidak ada masukkan -");

                                // Cek apakah data kosong atau tidak
                                if(nohp.equals("")) {
                                    //Jika data kosong maka akan memunculkan peringatan
                                    JOptionPane.showMessageDialog(null ,"Data tidak boleh kosong!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                    salah = true;
                                } else {
                                    //Jika data terisi akan lanjut
                                    salah = false;
                                }
                                NoHP[x] = nohp;
                            }
                            while(salah);
                            

                            //Input Status Pemilik Toko
                            do {
                                status = JOptionPane.showInputDialog("""
                                                                    Status Pemilik Toko

                                                                    [N] Nikah
                                                                    [B] Belum

                                                                    """);

                                // Keterangan Pembelli
                                switch (status) {

                                    case "N","n" : {
                                        ketSt = "Nikah";
                                        salah = false;
                                        break;
                                    }

                                    case "B","b" : {
                                        ketSt = "Belum";
                                        salah = false;
                                        break;
                                    }

                                    default : {
                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                        salah = true;
                                        break;
                                    }
                                }
                            }
                            while(salah);
                            Status[x] = ketSt;

                            //Input Pendapatan Harian (Inovasi)
                            do {
                                try {
                                    pharian  = JOptionPane.showInputDialog("Masukkan Pendapatan Harian Toko");
                                    ipharian = Integer.parseInt(pharian);
                                    salah = false;
                                }
                                catch (Exception e) {
                                    JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                    salah = true;
                                }
                            }
                            while(salah | ipharian <= 0);
                            PHarian[x] = ipharian;

                            //----------------------------------
                            // Tampilan

                            tampil = "" ; //Riset
                            tampil += "Nama Toko         = "+ NToko     [x] +"\n";
                            tampil += "Alamat Toko       = "+ Alamat    [x] +"\n";
                            tampil += "Nama Pemilik      = "+ Pemilik   [x] +"\n";
                            tampil += "Jenis Usaha       = "+ JUsaha    [x] +"\n";
                            tampil += "Modal Toko        = "+ Modal     [x] +"\n";
                            tampil += "Penjualan         = "+ Penjualan [x] +"\n";
                            tampil += "Pembeli           = "+ Pembeli   [x] +"\n";
                            tampil += "Cabang            = "+ Cabang    [x] +"\n";
                            tampil += "Alamat Email      = "+ Email     [x] +"\n";
                            tampil += "Sosial Media      = "+ Sosmed    [x] +"\n";
                            tampil += "No HP/Telepon     = "+ NoHP      [x] +"\n";
                            tampil += "Status Pemilik    = "+ Status    [x] +"\n";
                            tampil += "Pendapatan Harian = "+ PHarian   [x] +"\n";

                            JOptionPane.showMessageDialog(null, tampil, "No Data : "+no , JOptionPane.INFORMATION_MESSAGE);

                            putar = true;
                            break;
                        }

                        case "T","t" : {
                            putar = false;
                            break;
                        }

                        default : {
                            JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                            break;
                        }
                    }

                    }
                    // Input Data Lagi
                    do{
                        if(x == 23) {
                            JOptionPane.showMessageDialog(null ,"Data Penuh!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                            input = "T";
                        }
                        else {
                            input = JOptionPane.showInputDialog("Input Data Lagi?? [Y / T]");
                        }
                    }
                    while(!("y".equals(input) | "Y".equals(input) | "t".equals(input) 
                            | "T".equals(input)) );
                }
                //-Keluar
                putar = false;

            }
            while(putar);

        }
    }
    
}
