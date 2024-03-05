package Program;
import javax.swing.*;

public class MENU {

    // Array (GLOBAL)
    public static String NToko[]    = new String[25];
    public static String Alamat[]   = new String[25];
    public static String Pemilik[]  = new String[25];
    public static String JUsaha[]   = new String[25];
    public static int    Modal[]    = new int[25];
    public static String Penjualan[]= new String[25];
    public static String Pembeli[]  = new String[25];
    public static String Cabang[]   = new String[25];
    public static String Email[]    = new String[25];
    public static String Sosmed[]   = new String[25];
    public static String NoHP[]     = new String[25];
    public static String Status[]   = new String[25];
    public static int    PHarian[]  = new int[25];
    
    // Var x (GLOBAL)
    public static int x = -1, itgl, ibln, ithn;
    public static String tempat, tanggal, bulan, ketbulan, tahun; 
    
    
    // Var MENU
    private static boolean putar = true, salah = true;
    private static String pilih;
    
    public static void main(String[] args) {
        
        // Input Tempat
        do {
            tempat = JOptionPane.showInputDialog("Masukkan Tempat Survei");

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
        
        //Input Tanggal Survei
        do {
            try {
                tanggal  = JOptionPane.showInputDialog("Masukkan Tanggal Survei [1 - 31]");
                    itgl = Integer.parseInt(tanggal);
                salah = false;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                salah = true;
            }
        }
        while(salah | !(itgl >= 1 && itgl <= 31) );
        
        // Input Bulan Survei
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
                                                """);
                 ibln = Integer.parseInt(bulan);
                salah = false;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                salah = true;
            }
        }
        while(salah | !(ibln >= 1 && ibln <= 12));
        
        //Input Tahun Survei
        do {
            try {
                tahun  = JOptionPane.showInputDialog("Masukkan Tahun Survei [2020 - 2025]");
                    ithn = Integer.parseInt(tahun);
                salah = false;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                salah = true;
            }
        }
        while(salah | !(ithn >= 2020 && ithn <= 2025) );
        
        //--Menu
        do {
            
            pilih = JOptionPane.showInputDialog("""
                                                Menu Sistem Pedagang
                                                  Kota Pekalongan
                                                  dan Sekitarnya 

                                                1. INPUT Data Pedagang
                                                2. EDIT Data Pedagang
                                                3. HAPUS Data Pedagang
                                                4. Laporan Data Pedagang
                                                5. Laporan Statistik Pedagang
                                                6. Laporan Alamat Usaha
                                                7. Laporan Alamat Pedagang 
                                                8. Laporan Inovasi Mahasiswa
                                                9. Edit Tempat/Tanggal Survei
                                                0. EXIT / KELUAR

                                                      Pilih [ 1 - 0 ]
                                                """);
            
            switch (pilih) {
                
                case "1" : {
                    INPUT.Input();
                    break;
                }
                
                case "2" : {
                    EDIT.Data();
                    break;
                }
                
                case "3" : {
                    HAPUS.Hapus();
                    break;
                }
                
                case "4" : {
                    LDP.Laporan_DP();
                    break;
                }
                
                case "5" : {
                    LSP.Laporan_S();
                    break;
                }
                
                case "6" : {
                    LAU.Laporan_AU();
                    break;
                }
                
                case "7" : {
                    LAP.Laporan_AP();
                    break;
                }
                
                case "8" : {
                    LIM.Laporan_IM();
                    break;
                }
                
                case "9" : {
                    EDIT.Tanggal();
                    break;
                }
                
                case "0" : {
                    putar = false;
                    break;
                }
                
                // Saat Input pilih tidak sesuai dengan [1-8]
                default : {
                    JOptionPane.showMessageDialog(null ,"Inputan Salah Ulangi Lagi!!", "WARNING", JOptionPane.WARNING_MESSAGE);
                    break;
                }
            }
        }
        while(putar);
        System.exit(0);
    }
}
