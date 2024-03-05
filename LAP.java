package Program;
import javax.swing.*;
// Import MENU
import static Program.MENU.*;

public class LAP {
    
    private static String tampil ="", ketbulan;
    private static int no, sisa, Hal , x1, x2;
    private static int tmodal;
    
    static void Laporan_AP() {
        
        // Jika Belum/Tidak Ada Data
        if(x < 0 ) {
            JOptionPane.showMessageDialog(null, "Belum ada data yang bisa di Rekap/Laporan", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {
            
            // Keterangan Bulan
            switch (bulan) {

                case "1" : {
                    ketbulan = "Januari";
                    break;
                }

                case "2" : {
                    ketbulan = "Februari";
                    break;
                }

                case "3" : {
                    ketbulan = "Maret";
                    break;
                }

                case "4" : {
                    ketbulan = "April";
                    break;
                }

                case "5" : {
                    ketbulan = "Mei";
                    break;
                }

                case "6" : {
                    ketbulan = "Juni";
                    break;
                }

                case "7" : {
                    ketbulan = "Juli";
                    break;
                }

                case "8" : {
                    ketbulan = "Agustus";
                    break;
                }
                
                case "9" : {
                    ketbulan = "September";
                    break;
                }
                
                case "10" : {
                    ketbulan = "Oktober";
                    break;
                }
                
                case "11" : {
                    ketbulan = "November";
                    break;
                }

                case "12" : {
                    ketbulan = "Desember";
                    break;
                }
            }
            
            //--
            // Laporan Perhalaman
            sisa = (x + 1) % 6;
            
            // Sisa Bagi
            if(sisa == 0) {
                Hal = (x + 1) / 6;
            }
            else{
                Hal = ((x + 1) / 6) + 1;
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
                x2 = 6;
            }
            
            // Halaman Utama
            for(int h = 1 ; h <= Hal ; h++) {
                no = 0; // Agar no riset
                // Riset total modal pada footer
                tmodal = 0;
                
                tampil  = "";
                tampil += "     LAPORAN ALAMAT PEDAGANG DI "+tempat+"\n";
                tampil += "        PEKALONGAN BULAN "+ketbulan+" TAHUN "+tahun+"\n";
                tampil += "Hal : "+h+"\n";
                tampil += "--------------------------------------- \n";
                tampil += "No   |   Nama Toko   |   Alamat  |   Nama Pemilik    |   Status \n";
                tampil += "--------------------------------------- \n";
                
                // Hanya dipake hal terakhir
                if(h == Hal) {
                    x2 = (x + 1);
                }
                
                // Data Didalam Halaman
                for(int d = x1 ; d <= x2 ; d++) {
                    no = no + 1;
                    
                    tampil += " " +no+"  "+NToko[d-1]+"  "+Alamat[d-1]+"  "+Pemilik[d-1]+"  "+Status[d-1]+"\n";
                    
                    //total modal
                    tmodal = tmodal + Modal[d-1];
                    
                }
                tampil += "\n";
                tampil += "--------------------------------------- \n";
                tampil += "Total Keseluruhan Modal : "+tmodal+"      "+"[Tekan ENTER Untuk Lanjut]\n";
                
                //--Tampil
                JOptionPane.showMessageDialog(null, tampil, "Laporan Alamat Pedagang",
                                          JOptionPane.INFORMATION_MESSAGE);
                
                x1 = x1 + 6;
                // Hanya dipake bukan hal terakhir
                x2 = x2 + 6;
            }
        }
        
    }
    
}
