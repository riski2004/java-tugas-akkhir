package Program;
import javax.swing.*;
// Import MENU
import static Program.MENU.*;

public class LDP {
    
    private static String tampil ="";
    private static int no, sisa, Hal , x1, x2;
    private static int p, s, m, st, e, bb, bp, ll,
                       tp, ts, tm , tst, te, tbb, tbp , tll;
    
    static void Laporan_DP() {
        
        // Jika Belum/Tidak Ada Data
        if(x < 0 ) {
            JOptionPane.showMessageDialog(null, "Belum ada data yang bisa di Rekap/Laporan", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {
            
            // Laporan Perhalaman
            sisa = (x + 1) % 4;
            
            // Sisa Bagi
            if(sisa == 0) {
                Hal = (x + 1) / 4;
            }
            else{
                Hal = ((x + 1) / 4) + 1;
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
                x2 = 4;
            }
            
            no = 0; // Agar no tidak riset
            // Riset total
            tp = 0; ts  = 0; tm  = 0; tst = 0;
            te = 0; tbb = 0; tbp = 0; tll = 0;  
            
            // Halaman Utama
            for(int h = 1 ; h <= Hal+1 ; h++) {
                
                //Reset data pada footer
                p = 0; s  = 0; m  = 0; st = 0;
                e = 0; bb = 0; bp = 0; ll = 0;
                //--
                
                if (h == Hal+1) {
                    tampil  = "";
                    tampil += "     LAPORAN REKAP DATA PEDAGANG \n";
                    tampil += "Tanggal : 0"+tanggal+"/"+bulan+"/"+tahun+"        ";
                    tampil += "Hal : "+h+"\n";
                    tampil += "--------------------------------------- \n";                    
                    tampil += "Pakaian    = "+tp+"                "+"Elektronik   = "+te +"\n";
                    tampil += "Saraung    = "+ts+"                "+"Barang Bekas = "+tbb+"\n";
                    tampil += "Makanan    = "+tm+"                "+"Bahan Pokok  = "+tbp+"\n";
                    tampil += "Sepatu/Tas = "+tst+"                "+"Lain-lain   = "+tll+"\n";
                    tampil += "--------------------------------------- \n";
                }
                else {
                
                tampil  = "";
                tampil += "     LAPORAN DATA PEDAGANG \n";
                tampil += "Tanggal : 0"+tanggal+"/"+bulan+"/"+tahun+"        ";
                tampil += "Hal : "+h+"\n";
                tampil += "--------------------------------------- \n";
                tampil += "No   |   Nama Toko   |   Alamat  |   Nama Pemilik   |   Jenis Usaha \n";
                tampil += "--------------------------------------- \n";
                
                // Hanya dipake hal terakhir
                if(h == Hal) {
                    x2 = (x + 1);
                }
                
                // Data Didalam Halaman
                for(int d = x1 ; d <= x2 ; d++) {
                    
                    no = no + 1;
                    
                    switch (JUsaha[d-1]) {
                        case "Pakaian" : {
                            p = p + 1;
                            break;
                        }
                        case "Sarung" : {
                            s = s + 1;
                            break;
                        }
                        case "Makanan" : {
                            m = m + 1;
                            break;
                        }
                        case "Sepatu/Tas" : {
                            st = st + 1;
                            break;
                        }
                        case "Elektronik" : {
                            e = e + 1;
                            break;
                        }
                        case "Barang Bekas" : {
                            bb = bb + 1;
                            break;
                        }
                        case "Bahan Pokok" : {
                            bp = bp + 1;
                            break;
                        }
                        case "Lain-lain" : {
                            ll = ll + 1;
                            break;
                        }
                    }
                    
                    tampil += " " +no+"  "+NToko[d-1]+"  "+Alamat[d-1]+"  "+Pemilik[d-1]+"  "+JUsaha[d-1]+"\n"; 
                    
                }
                tampil += "\n";
                tampil += "--------------------------------------- \n";
                tampil += "Pakaian    = "+p+"                "+"Elektronik   = "+e +"\n";
                tampil += "Saraung    = "+s+"                "+"Barang Bekas = "+bb+"\n";
                tampil += "Makanan    = "+m+"                "+"Bahan Pokok  = "+bp+"\n";
                tampil += "Sepatu/Tas = "+st+"                "+"Lain-lain   = "+ll+"\n";
                
                // Total
                tp  = tp  + p;
                ts  = ts  + s;
                tm  = tm  + m;
                tst = tst + st;
                te  = te  + e;
                tbb = tbb + bb;
                tbp = tbp + bp;
                tll = tll + ll;
                
                //--Tampil
                JOptionPane.showMessageDialog(null, tampil, "Laporan Data Pedagang",
                                          JOptionPane.INFORMATION_MESSAGE);
                
                x1 = x1 + 4;
                // Hanya dipake bukan hal terakhir
                x2 = x2 + 4;
                
                }
            }
            JOptionPane.showMessageDialog(null, tampil, "Laporan Rekap Data Pedagang",
                                          JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
}
