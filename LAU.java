package Program;
import javax.swing.*;
// Import MENU
import static Program.MENU.*;

public class LAU {

    private static String tampil ="";
    private static int no, sisa, Hal , x1, x2;
    private static int e, t, fb, wa, ig, tl, dll,
                       te, tt, tfb, twa, tig, ttl , tdll;
    
    static void Laporan_AU() {
        
        // Jika Belum/Tidak Ada Data
        if(x < 0 ) {
            JOptionPane.showMessageDialog(null, "Belum ada data yang bisa di Rekap/Laporan", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {
            
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
            
            // Riset total rekap
             te = 0;  tt = 0;
            tfb = 0; twa = 0; tig = 0; ttl = 0; tdll = 0;
            
            // Halaman Utama
            for(int h = 1 ; h <= Hal+1 ; h++) {
                
                no = 0; // Agar no riset
                
                //Reset data pada footer
                 e = 0;  t = 0;
                fb = 0; wa = 0; ig = 0; tl = 0; dll = 0;;
                
                //--
                
                if (h == Hal+1) {
                    
                    tampil  = "";
                    tampil += "     LAPORAN REKAP ALAMAT USAHA \n";
                    tampil += "Hal : "+h+"        ";
                    tampil += "Tanggal : 0"+tanggal+"/"+bulan+"/"+tahun+"\n";
                    tampil += "--------------------------------------- \n";
                    tampil += "TOTAL KESELURUHAN :\n";
                    tampil += "Email = "+te+"         ";
                    tampil += "Telepon = "+tt+"\n\n";
                    tampil += "TOTAL MEDIA SOSIAL :\n";
                    tampil += "FB = "+tfb+"  "+"WA = "+twa+"  "+"IG = "+tig+"  "+"TELEGRAM = "+ttl+"  "+"DLL = "+tdll+"  "+"\n";
                    tampil += "--------------------------------------- \n";
                }
                else {
                
                tampil  = "";
                tampil += "     LAPORAN ALAMAT USAHA \n";
                tampil += "Hal : "+h+"        ";
                tampil += "Tanggal : 0"+tanggal+"/"+bulan+"/"+tahun+"\n";
                tampil += "--------------------------------------- \n";
                tampil += "No   |   Nama Toko   |   Media Sosial  |   Email    |   Telepon/Hp \n";
                tampil += "--------------------------------------- \n";
                
                // Hanya dipake hal terakhir
                if(h == Hal) {
                    x2 = (x + 1);
                }
                
                // Data Didalam Halaman
                for(int d = x1 ; d <= x2 ; d++) {
                    
                    no = no + 1;
                    
                    switch (Email[d-1]) {
                        case "-" : {
                            e = e + 0;
                            break;
                        }
                        default : {
                            e = e + 1;
                            break;
                        } 
                    }
                    
                    switch (NoHP[d-1]) {
                        case "-" : {
                            t = t + 0;
                            break;
                        }
                        default : {
                            t = t + 1;
                            break;
                        } 
                    }
                    
                    switch (Sosmed[d-1]) {
                        case "Facebook" : {
                            fb = fb + 1;
                            break;
                        }
                        case "WhatsApp" : {
                            wa = wa + 1;
                            break;
                        }
                        case "Instagram" : {
                            ig = ig + 1;
                            break;
                        }
                        case "Telegram" : {
                            tl = tl + 1;
                            break;
                        }
                        case "Dan Lain-lain" : {
                            dll = dll + 1;
                            break;
                        }
                    }
                    
                    tampil += " " +no+"  "+NToko[d-1]+"  "+Sosmed[d-1]+"  "+Email[d-1]+"  "+NoHP[d-1]+"\n";
                    
                }
                tampil += "\n";
                tampil += "--------------------------------------- \n";
                tampil += "Jumlah Toko yang Memiliki Email : "+e+"\n";
                tampil += "Jumlah Toko yang Memiliki Telepon : "+t+"\n";
                tampil += "FB = "+fb+"  "+"WA = "+wa+"  "+"IG = "+ig+"  "+"TELEGRAM = "+tl+"  "+"DLL = "+dll+"  "+"\n";
                
                // Total
                te   = te   + e;
                tt   = tt   + t;
                tfb  = tfb  + fb;
                twa  = twa  + wa;
                tig  = tig  + ig;
                ttl  = ttl  + tl;
                tdll = tdll + dll;
                
                //--Tampil
                JOptionPane.showMessageDialog(null, tampil, "Laporan Alamat Usaha",
                                          JOptionPane.INFORMATION_MESSAGE);
                
                x1 = x1 + 6;
                // Hanya dipake bukan hal terakhir
                x2 = x2 + 6;
                
                }
            }
            
            JOptionPane.showMessageDialog(null, tampil, "Laporan Rekap Alamat Usaha",
                                          JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
}
