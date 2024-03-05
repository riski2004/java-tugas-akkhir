package Program;
import javax.swing.*;
// Import MENU
import static Program.MENU.*;

public class LIM {
    
    private static String tampil ="";
    private static int no, sisa, Hal , x1, x2;
    private static int tpharian;
    private static double rpharian = 0.0, bagi = 0.0;
    
    static void Laporan_IM() {
        
        // Jika Belum/Tidak Ada Data
        if(x < 0 ) {
            JOptionPane.showMessageDialog(null, "Belum ada data yang bisa di Rekap/Laporan", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {
            
            // Laporan Perhalaman
            sisa = (x + 1) % 10;
            
            // Sisa Bagi
            if(sisa == 0) {
                Hal = (x + 1) / 10;
            }
            else{
                Hal = ((x + 1) / 10) + 1;
            }
            
            // Data Pada Halaman
            if(Hal == 1) {
                // Rumus Hal == 1
                x1 = 1;
                x2 = (x + 1);
            }
            else {
                // Rumus Hal <= 2
                x1 = 1;
                x2 = 10;
            }
            
            no = 0; // Agar no tidak riset
            
            // Halaman Utama
            for(int h = 1 ; h <= Hal ; h++) {
                
                //Reset data pada footer
                tpharian = 0;
                rpharian = 0;
                bagi = 0; //Untuk pembagi rata" PHarian
                
                //--
                tampil  = "";
                tampil += "     LAPORAN INOVASI MAHASISWA \n";
                tampil += "Hal : "+h+"        ";
                tampil += "Tanggal : 0"+tanggal+"/"+bulan+"/"+tahun+"\n";
                tampil += "--------------------------------------- \n";
                tampil += "No   |   Nama Toko   |   Pendapatan Harian   \n";
                tampil += "--------------------------------------- \n";
                
                // Hanya dipake hal terakhir
                if(h == Hal) {
                    x2 = (x + 1);
                }
                
                // Data Didalam Halaman
                for(int d = x1 ; d <= x2 ; d++) {
                    
                    no = no + 1;
                    bagi = bagi + 1;
                    
                    tampil += " " +no+"  "+NToko[d-1]+"  "+PHarian[d-1]+"\n";
                    
                    //Total Pendapatan Harian
                    tpharian = tpharian + PHarian[d-1];
                }
                
                // Rata-rata Pendapatan Harian
                rpharian = tpharian / bagi;
                
                tampil += "\n";
                tampil += "--------------------------------------- \n";
                tampil += "REKAP : \n";
                tampil += "Total Pendapatan Harian : "+tpharian+"\n";
                tampil += "Total Rata-rata Pendapatan Harian : "+rpharian+"\n";
                
                //--Tampil
                JOptionPane.showMessageDialog(null, tampil, "Laporan Alamat Usaha",
                                          JOptionPane.INFORMATION_MESSAGE);
                
                x1 = x1 + 10;
                // Hanya dipake bukan hal terakhir
                x2 = x2 + 10;
            }
            
        }
        
    }
    
}
