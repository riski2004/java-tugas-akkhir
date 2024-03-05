package Program;
import javax.swing.*;
// Import MENU
import static Program.MENU.*;

public class EDIT {

    // Var EDIT
    private static String tampil="", edit, pilih, edit_survei , pilih_survei;
    private static String toko, alamat, pemilik, jenis, modal, penjualan, pembeli,
                          cabang, email, sosmed, nohp, status, pharian,
                          ketJ, ketPj, ketPb, ketC, ketSm, ketSt, data_edit, cek;
    private static int imodal, ipharian, inohp, no_edit;
    private static boolean putar = true, salah = true, salpil = true;
    
    // Edit Tempat/Tanggal Survei
    static void Tanggal() {
        
        do{
            do{
                edit_survei = JOptionPane.showInputDialog("Mau Edit Tempat/Tanggal Survei?? [Y/T]");
            }
            while(!("y".equals(edit_survei) | "Y".equals(edit_survei) | "t".equals(edit_survei) | "T".equals(edit_survei)) );
            
            // Mmembuat Perulangan Untuk Edit Data Lagi
            while("Y".equals(edit_survei) | "y".equals(edit_survei)) {
                        
                switch (edit_survei) {
                    case "y","Y" : {
                        //Pilihan Mana yang akan di EDIT
                        //== Cek Apakah Sudah Benar Semua
                        do { 
                            //== Ulang Jika salah input
                            do{
                                pilih_survei = JOptionPane.showInputDialog("""
                                                            Pilih yang Ingin di Edit

                                                            1. Tempat Survei
                                                            2. Tanggal Survei
                                                            3. Bulan Survei
                                                            4. Tahun Survei

                                                                Pilih [ 1 - 4 ]   
                                                            """);
                                switch (pilih_survei) {
                                    case "1" : {

                                        // Edit Tempat
                                        do {
                                            tempat = JOptionPane.showInputDialog("Masukkan Tempat Survei"
                                                                            + "\n Sebelumnya = "+tempat);

                                            // Cek apakah data kosong atau tidak
                                            if(tempat.equals("")) {
                                                //Jika data kosong maka akan memunculkan peringatan
                                                JOptionPane.showMessageDialog(null ,"Data tidak boleh kosong!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                                salah = true;
                                            } else {
                                                //Jika data terisi akan lanjut
                                                salah = false;
                                            }
                                        }
                                        while(salah);

                                        salpil = false;
                                        break;
                                    }

                                    case "2" : {

                                        //Edit Tanggal Survei
                                        do {
                                            try {
                                                tanggal  = JOptionPane.showInputDialog("Masukkan Tanggal Survei [1 - 31]"
                                                                                  + "\n Sebelumnya = "+tanggal);
                                                    itgl = Integer.parseInt(tanggal);
                                                salah = false;
                                            }
                                            catch (Exception e) {
                                                JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                                salah = true;
                                            }
                                        }
                                        while(salah | !(itgl >= 1 && itgl <= 31) );

                                        salpil = false;
                                        break;
                                    }

                                    case "3" : {

                                        // Edit Bulan Survei
                                        do {
                                            try {
                                                bulan = JOptionPane.showInputDialog("""
                                                                                Masukkan Bulan Survei

                                                                                1. Januari
                                                                                2. Februari
                                                                                3. Maret
                                                                                4. April
                                                                                5. Mei
                                                                                6. Juni
                                                                                7. Juli
                                                                                8. Agustus
                                                                                9. September
                                                                                10. Oktober
                                                                                11. November
                                                                                12. Desember

                                                                                    Pilih [1-12]
                                                                                Sebelumnya = """+bulan);
                                                 ibln = Integer.parseInt(bulan);
                                                salah = false;
                                            }
                                            catch (Exception e) {
                                                JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                                salah = true;
                                            }
                                        }
                                        while(salah | !(ibln >= 1 && ibln <= 12));

                                        salpil = false;
                                        break;
                                    }

                                    case "4" : {

                                        //Edit Tahun Survei
                                        do {
                                            try {
                                                tahun  = JOptionPane.showInputDialog("Masukkan Tahun Survei [2020 - 2025]"
                                                        + "\n Sebelumnya = "+tahun);
                                                    ithn = Integer.parseInt(tahun);
                                                salah = false;
                                            }
                                            catch (Exception e) {
                                                JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                                salah = true;
                                            }
                                        }
                                        while(salah | !(ithn >= 2020 && ithn <= 2025) );

                                        salpil = false;
                                        break;
                                    }

                                    default : {
                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                                        salpil = true;
                                        break;
                                    }
                                }
                            }
                            while(salpil);
                            //---

                            do {
                                // Tampilan ket Survei yang sudah diedit
                                tampil  = ""; //Riset
                                tampil += "Tempat  = "+tempat +"\n";
                                tampil += "Tanggal = "+tanggal+"\n";
                                tampil += "Bulan   = "+bulan  +"\n";
                                tampil += "tahun   = "+tahun  +"\n";

                                //---Opsi Lain Tampil
                                tampil += "\n Sudah Benar Semua?? [Y/T] \n";
                                cek = JOptionPane.showInputDialog(null, tampil, "Keterangan Survei" , JOptionPane.INFORMATION_MESSAGE);

                                switch (cek) {
                                    case "Y","y" : {
                                        salpil = false;
                                        break;
                                    }
                                    case "T","t" : {
                                        salpil = true;
                                        break;
                                    }
                                    default : {
                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                    JOptionPane.WARNING_MESSAGE);
                                        salpil = true;
                                        break;
                                    }
                                }
                            }
                            while(!( "Y".equals(cek) | "y".equals(cek) | "T".equals(cek) | "t".equals(cek)));
                            
                        //==
                        }
                        while(salpil);
                        
//                        putar = true;
                        break;
                    }

                    case "T","t" : {
                        putar = false;
                        break;
                    }

                    default : {
                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                        putar = true;
                        break;
                    }
                }
                edit_survei = "t";
            }
            //-Keluar
            putar = false;
        }
        while(putar);
        
    }
    
    // Edit Data
    static void Data() {
        
        // Jika Belum/Tidak Ada Data
        if(x < 0 ) {
            JOptionPane.showMessageDialog(null, "Belum ada data yang bisa di Edit", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {
        
            do {
                
                do{
                    edit = JOptionPane.showInputDialog("Mau Edit Data?? [Y/T]");
                }
                while(!("y".equals(edit) | "Y".equals(edit) | "t".equals(edit) 
                        | "T".equals(edit)) );

                // Mmembuat Perulangan Untuk Edit Data Lagi
                while("Y".equals(edit) | "y".equals(edit)) { 

                    switch (edit) {

                        case "Y","y" : {

                            // Inputan no data yg akan di EDIT
                            do {
                                try {
                                    data_edit = JOptionPane.showInputDialog(null, "Data Di Edit [ 1 - "+(x+1)+" ]");
                                    no_edit = Integer.parseInt(data_edit);

                                    if(!(no_edit >= 1 && no_edit <= (x+1)) ) {
                                        JOptionPane.showMessageDialog(null, 
                                                    "Data Hanya 1 - "+(x+1)+" Saja", 
                                                    "Peringatan", JOptionPane.WARNING_MESSAGE);
                                    }
                                    salah = false;
                                }
                                catch(Exception e) {
                                    JOptionPane.showMessageDialog(null, "Inputan Salah!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                                    salah = true;
                                }
                            }              
                            while(salah || !(no_edit >= 1 && no_edit <= (x+1)) );

                            //--
                            // Tampilan Data yang akan diedit
                            tampil = ""; //Riset
                            tampil += "Nama Toko         = "+ NToko     [no_edit-1] +"\n";
                            tampil += "Alamat Toko       = "+ Alamat    [no_edit-1] +"\n";
                            tampil += "Nama Pemilik      = "+ Pemilik   [no_edit-1] +"\n";
                            tampil += "Jenis Usaha       = "+ JUsaha    [no_edit-1] +"\n";
                            tampil += "Modal Toko        = "+ Modal     [no_edit-1] +"\n";
                            tampil += "Penjualan         = "+ Penjualan [no_edit-1] +"\n";
                            tampil += "Pembeli           = "+ Pembeli   [no_edit-1] +"\n";
                            tampil += "Cabang            = "+ Cabang    [no_edit-1] +"\n";
                            tampil += "Alamat Email      = "+ Email     [no_edit-1] +"\n";
                            tampil += "Sosial Media      = "+ Sosmed    [no_edit-1] +"\n";
                            tampil += "No HP/Telepon     = "+ NoHP      [no_edit-1] +"\n";
                            tampil += "Status Pemilik    = "+ Status    [no_edit-1] +"\n";
                            tampil += "Pendapatan Harian = "+ PHarian   [no_edit-1] +"\n";

                            JOptionPane.showMessageDialog(null, tampil, "No Data : "+no_edit , JOptionPane.INFORMATION_MESSAGE);

                            //Pilihan Mana yang akan di EDIT
                            //== Cek Apakah Sudah Benar Semua
                            do { 
                                //== Ulang Jika salah input
                                do { 

                                    pilih = JOptionPane.showInputDialog("""
                                                                        Pilih yang Ingin di Edit

                                                                        1. Nama Toko
                                                                        2. Alamat Toko
                                                                        3. Nama Pemilik Toko
                                                                        4. Jenis Usaha
                                                                        5. Modal
                                                                        6. Penjualan
                                                                        7. Pembeli
                                                                        8. Cabang
                                                                        9. Email
                                                                        10. Sosial Media
                                                                        11. No HP/Telepon
                                                                        12. Status Pemilik
                                                                        13. Pendapatan Harian

                                                                                Pilih [ 1 - 13 ]
                                                                        """);

                                    switch (pilih) {

                                        case "1" : {

                                            // Edit Nama Toko
                                            do {
                                                toko = JOptionPane.showInputDialog("Masukkan Nama Toko"
                                                        + "\n Sebelumnya = "+NToko[no_edit-1]);

                                                // Cek apakah data kosong atau tidak
                                                if(toko.equals("")) {
                                                    //Jika data kosong maka akan memunculkan peringatan
                                                    JOptionPane.showMessageDialog(null ,"Data tidak boleh kosong!!", "WARNING", 
                                                                JOptionPane.WARNING_MESSAGE);
                                                    salah = true;
                                                } else {
                                                    //Jika data terisi akan lanjut
                                                    salah = false;
                                                }
                                                NToko[no_edit-1] = toko;
                                            }
                                            while(salah);

                                            salpil = false;
                                            break;
                                        }

                                        case "2" : {

                                            //Edit Alamat
                                            do {
                                                alamat = JOptionPane.showInputDialog("Masukkan Alamat Toko"
                                                        + "\n Sebelumnya = "+Alamat[no_edit-1]);

                                                // Cek apakah data kosong atau tidak
                                                if(alamat.equals("")) {
                                                    //Jika data kosong maka akan memunculkan peringatan
                                                    JOptionPane.showMessageDialog(null ,"Data tidak boleh kosong!!", "WARNING", 
                                                                JOptionPane.WARNING_MESSAGE);
                                                    salah = true;
                                                } else {
                                                    //Jika data terisi akan lanjut
                                                    salah = false;
                                                }
                                                Alamat[no_edit-1] = alamat;
                                            }
                                            while(salah);

                                            salpil = false;
                                            break;
                                        }

                                        case "3" : {

                                            //Edit Nama Pemilik
                                            do {
                                                pemilik = JOptionPane.showInputDialog("Masukkan Nama Pemilik Toko"
                                                        + "\n Sebelumnya = "+Pemilik[no_edit-1]);

                                                // Cek apakah data kosong atau tidak
                                                if(pemilik.equals("")) {
                                                    //Jika data kosong maka akan memunculkan peringatan
                                                    JOptionPane.showMessageDialog(null ,"Data tidak boleh kosong!!", "WARNING", 
                                                                JOptionPane.WARNING_MESSAGE);
                                                    salah = true;
                                                } else {
                                                    //Jika data terisi akan lanjut
                                                    salah = false;
                                                }
                                                Pemilik[no_edit-1] = pemilik;
                                            }
                                            while(salah);

                                            salpil = false;
                                            break;
                                        }

                                        case "4" : {

                                            //Edit Jenis Usaha
                                            do {
                                                jenis = JOptionPane.showInputDialog("""
                                                                                    Jenis Usaha

                                                                                    1. Pakaian      5. Elektronik
                                                                                    2. Sarung       6. Barang Bekas
                                                                                    3. Makanan      7. Bahan Pokok
                                                                                    4. Sepatu/Tas   8. Lain-lain

                                                                                            Pilih [ 1 - 8 ]
                                                                                    Sebelumnya = """+JUsaha[no_edit-1]);

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
                                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                                    JOptionPane.WARNING_MESSAGE);
                                                        salah = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            while(salah);
                                            JUsaha[no_edit-1] = ketJ;

                                            salpil = false;
                                            break;
                                        }

                                        case "5" : {

                                            //Edit Modal Toko
                                            do {
                                                try {
                                                    modal  = JOptionPane.showInputDialog("Masukkan Modal Toko"
                                                            + "\n Sebelumnya = "+Modal[no_edit-1]);
                                                    imodal = Integer.parseInt(modal);
                                                    salah = false;
                                                }
                                                catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                                JOptionPane.WARNING_MESSAGE);
                                                    salah = true;
                                                }
                                            }
                                            while(salah | imodal <= 0);
                                            Modal[no_edit-1] = imodal;

                                            salpil = false;
                                            break;
                                        }

                                        case "6" : {

                                            //Edit Penjualan
                                            do {
                                                penjualan = JOptionPane.showInputDialog("""
                                                                                    Penjualan

                                                                                    [D] Dalam Negeri
                                                                                    [L] Luar Negeri
                                                                                    [S] Dalam dan Luar Negeri

                                                                                    Sebelumnya = """+Penjualan[no_edit-1]);
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
                                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                                    JOptionPane.WARNING_MESSAGE);
                                                        salah = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            while(salah);
                                            Penjualan[no_edit-1] = ketPj;

                                            salpil = false;
                                            break;
                                        }

                                        case "7" : {

                                            //Edit Pembeli
                                            do {
                                                pembeli = JOptionPane.showInputDialog("""
                                                                                    Pembeli

                                                                                    [D] Domestik
                                                                                    [L] Luar
                                                                                    [C] Campuran

                                                                                    Sebelumnya = """+Pembeli[no_edit-1]);
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
                                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                                    JOptionPane.WARNING_MESSAGE);
                                                        salah = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            while(salah);
                                            Pembeli[no_edit-1] = ketPb;

                                            salpil = false;
                                            break;
                                        }

                                        case "8" : {

                                            //Edit Cabang
                                            do {
                                                cabang = JOptionPane.showInputDialog("""
                                                                                    Cabang

                                                                                    [T] Tidak Ada
                                                                                    [A] Ada

                                                                                    Sebelumnya = """+Cabang[no_edit-1]);

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
                                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                                    JOptionPane.WARNING_MESSAGE);
                                                        salah = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            while(salah);
                                            Cabang[no_edit-1] = ketC;

                                            salpil = false;
                                            break;
                                        }

                                        case "9" : {

                                            //Edit Alamat Email
                                            do {
                                                email = JOptionPane.showInputDialog("""
                                                                        Masukkan Alamat Email
                                                                        Jika tidak ada masukkan -

                                                                        Sebelumnya = """+Email[no_edit-1]);

                                                // Cek apakah data kosong atau tidak
                                                if(email.equals("")) {
                                                    //Jika data kosong maka akan memunculkan peringatan
                                                    JOptionPane.showMessageDialog(null ,"Data tidak boleh kosong!!", "WARNING", 
                                                                JOptionPane.WARNING_MESSAGE);
                                                    salah = true;
                                                } else {
                                                    //Jika data terisi akan lanjut
                                                    salah = false;
                                                }
                                                Email[no_edit-1] = email;
                                            }
                                            while(salah);

                                            salpil = false;
                                            break;
                                        }

                                        case "10" : {

                                            //Edit Sosial Media
                                            do {
                                                sosmed = JOptionPane.showInputDialog("""
                                                                                    Sosial Media

                                                                                    1. Facebook       4. Telegram
                                                                                    2. WhatsApp       5. Dan Lain-lain
                                                                                    3. Instagram      

                                                                                            Pilih [ 1 - 5 ]
                                                                                    Sebelumnya = """+Sosmed[no_edit-1]);

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
                                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                                    JOptionPane.WARNING_MESSAGE);
                                                        salah = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            while(salah);
                                            Sosmed[no_edit-1] = ketSm;

                                            salpil = false;
                                            break;
                                        }

                                        case "11" : {

                                            //Edit No HP/Telepon
                                            do {
                                                try {
                                                    nohp  = JOptionPane.showInputDialog("Masukkan Modal Toko"
                                                            + "\n Sebelumnya = "+NoHP[no_edit-1]);
                                                    inohp = Integer.parseInt(nohp);
                                                    salah = false;
                                                }
                                                catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                                JOptionPane.WARNING_MESSAGE);
                                                    salah = true;
                                                }
                                            }
                                            while(salah | inohp <= 0 );
                                            NoHP[no_edit-1] = nohp;

                                            salpil = false;
                                            break;
                                        }

                                        case "12" : {

                                            //Edit Status Pemilik Toko
                                            do {
                                                status = JOptionPane.showInputDialog("""
                                                                                    Status Pemilik Toko

                                                                                    [N] Nikah
                                                                                    [B] Belum

                                                                                    Sebelumnya = """+Status[no_edit-1]);
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
                                                        JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                                    JOptionPane.WARNING_MESSAGE);
                                                        salah = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            while(salah);
                                            Status[no_edit-1] = ketSt;

                                            salpil = false;
                                            break;
                                        }

                                        case "13" : {

                                            //Edit Pendapatan Harian (Inovasi)
                                            do {
                                                try {
                                                    pharian  = JOptionPane.showInputDialog("Masukkan Pendapatan Harian Toko"
                                                            + "\n Sebelumnya = "+PHarian[no_edit-1]);
                                                    ipharian = Integer.parseInt(pharian);
                                                    salah = false;
                                                }
                                                catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                                JOptionPane.WARNING_MESSAGE);
                                                    salah = true;
                                                }
                                            }
                                            while(salah | ipharian <= 0);
                                            PHarian[no_edit-1] = ipharian;

                                            salpil = false;
                                            break;
                                        }

                                        default : {
                                            JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                        JOptionPane.WARNING_MESSAGE);
                                            salpil = true;
                                            break;
                                        }
                                    }
                                }
                                while(salpil);
                                    //---

                                do {
                                    // Tampilan Data yang sudah diedit
                                    tampil = ""; //Riset
                                    tampil += "Nama Toko         = "+ NToko     [no_edit-1] +"\n";
                                    tampil += "Alamat Toko       = "+ Alamat    [no_edit-1] +"\n";
                                    tampil += "Nama Pemilik      = "+ Pemilik   [no_edit-1] +"\n";
                                    tampil += "Jenis Usaha       = "+ JUsaha    [no_edit-1] +"\n";
                                    tampil += "Modal Toko        = "+ Modal     [no_edit-1] +"\n";
                                    tampil += "Penjualan         = "+ Penjualan [no_edit-1] +"\n";
                                    tampil += "Pembeli           = "+ Pembeli   [no_edit-1] +"\n";
                                    tampil += "Cabang            = "+ Cabang    [no_edit-1] +"\n";
                                    tampil += "Alamat Email      = "+ Email     [no_edit-1] +"\n";
                                    tampil += "Sosial Media      = "+ Sosmed    [no_edit-1] +"\n";
                                    tampil += "No HP/Telepon     = "+ NoHP      [no_edit-1] +"\n";
                                    tampil += "Status Pemilik    = "+ Status    [no_edit-1] +"\n";
                                    tampil += "Pendapatan Harian = "+ PHarian   [no_edit-1] +"\n";
                                    
                                    //---Opsi Lain Tampil
                                    tampil += "\n Sudah Benar Semua?? [Y/T] \n";
                                    cek = JOptionPane.showInputDialog(null, tampil, "No Data : "+no_edit , JOptionPane.INFORMATION_MESSAGE);

                                    switch (cek) {
                                        case "Y","y" : {
                                            salpil = false;
                                            break;
                                        }
                                        case "T","t" : {
                                            salpil = true;
                                            break;
                                        }
                                        default : {
                                            JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", 
                                                        JOptionPane.WARNING_MESSAGE);
                                            salpil = true;
                                            break;
                                        }
                                    }
                                }
                                while(!( "Y".equals(cek) | "y".equals(cek) | "T".equals(cek) | "t".equals(cek)));
                            
                            //==
                            }
                            while("T".equals(cek) | "t".equals(cek));
                            
                            putar = true;
                            break;
                        }

                        case "T","t" : {
                            putar = false;
                            break;
                        }

                        default : {
                            JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                            putar = true;
                            break;
                        }
                    }

                    // Edit Data Lagi
                    
                    do{
                        edit = JOptionPane.showInputDialog("Mau Edit Data Lagi?? [Y/T]");
                    }
                    while(!("y".equals(edit) | "Y".equals(edit) | "t".equals(edit) 
                            | "T".equals(edit)) );
                }
                //-Keluar
                putar = false;            
            }
            while(putar);
        //-
        }
    }
}
