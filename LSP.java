package Program;
import javax.swing.*;
// Import MENU
import static Program.MENU.*;

public class LSP {
    
    private static String tampil ="";
    private static int no, sisa, Hal , x1, x2;
    private static int tm, pemd, pemc, peml, pend, penl, pens, t, a,
                       gtm, tpemd, tpemc, tpeml, tpend, tpenl, tpens, tt, ta;
    private static int rm = 0, bagi = 0;
    
    static void Laporan_S() {
        
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
            
            // Data unutk bagi agar tidak riset
            rm = 0; bagi = 0;
            
            // Riset total rekap
            bagi = 0; gtm = 0;
            tpemd = 0; tpemc = 0; tpeml = 0; 
            tpend = 0; tpenl = 0; tpens = 0;
            tt = 0 ; ta = 0; 
            
            // Halaman Utama
            for(int h = 1 ; h <= Hal+1 ; h++) {
                
                no = 0; // Agar no riset
                
                //Reset data pada footer
                tm = 0;
                pemd = 0; pemc = 0; peml = 0; 
                pend = 0; penl = 0; pens = 0;
                t = 0 ; a = 0;
                
                //--
                
                if (h == Hal+1) {
                    
                    // Rata-rata Modal
                    rm = gtm / bagi;
                    
                    tampil  = "";
                    tampil += "     LAPORAN REKAP STATISTIK PEDAGANG \n";
                    tampil += "Tanggal : 0"+tanggal+"/"+bulan+"/"+tahun+"        ";
                    tampil += "Hal : "+h+"\n";
                    tampil += "--------------------------------------- \n";
                    tampil += "PENJUALAN : D = "+tpend+ " L = "+tpenl+" S = "+tpens+"\n";
                    tampil += "PEMBELI   : D = "+tpemd+ " C = "+tpemc+" L = "+tpeml+"\n";
                    tampil += "CABANG    : T = "+tt   + " A = "+ta+"\n";
                    tampil += "RATA-RATA MODAL : "+rm+"\n";
                    tampil += "--------------------------------------- \n";
                }
                else {
                
                tampil  = "";
                tampil += "     LAPORAN STATISTIK PEDAGANG \n";
                tampil += "Tanggal : 0"+tanggal+"/"+bulan+"/"+tahun+"        ";
                tampil += "Hal : "+h+"\n";
                tampil += "--------------------------------------- \n";
                tampil += "No   |   Nama Toko   |   Modal  |   Penjualan    |   Pembeli   | Cabang \n";
                tampil += "--------------------------------------- \n";
                
                // Hanya dipake hal terakhir
                if(h == Hal) {
                    x2 = (x + 1);
                }
                
                // Data Didalam Halaman
                for(int d = x1 ; d <= x2 ; d++) {
                    
                    no = no + 1;
                    bagi = bagi + 1;
                    
                    switch (Penjualan[d-1]) {
                        case "Dalam Negeri" : {
                            pend = pend + 1;
                            break;
                        }
                        case "Luar Negeri" : {
                            penl = penl + 1;
                            break;
                        }
                        case "Dalam dan Luar Negeri" : {
                            pens = pens + 1;
                            break;
                        }  
                    }
                    
                    switch (Pembeli[d-1]) {
                        case "Domestik" : {
                            pemd = pemd + 1;
                            break;
                        }
                        case "Luar" : {
                            peml = peml + 1;
                            break;
                        }
                        case "Campuran" : {
                            pemc = pemc + 1;
                            break;
                        }
                    }
                    
                    switch (Cabang[d-1]) {
                        case "Ada" : {
                            a = a + 1;
                            break;
                        }
                        case "Tidak Ada" : {
                            t = t + 1;
                            break;
                        }
                    }
                    
                    tampil += " " +no+"  "+NToko[d-1]+"  "+Modal[d-1]+"  "+Penjualan[d-1]+"  "+Pembeli[d-1]+"  "+Cabang[d-1]+"\n"; 
                    tm = tm + Modal[d-1];
                    
                }
                tampil += "\n";
                tampil += "--------------------------------------- \n";
                tampil += "PENJUALAN : D = "+pend+ " L = "+penl+" S = "+pens+"\n";
                tampil += "PEMBELI   : D = "+pemd+ " C = "+pemc+" L = "+peml+"\n";
                tampil += "CABANG    : T = "+t   + " A = "+a+"\n";
                tampil += "TOTAL MODAL : "+tm+"\n";
                
                // Total
                tpemd = tpemd  + pemd;
                tpemc = tpemc  + pemc;
                tpeml = tpeml  + peml;
                tpend = tpend + pend;
                tpenl = tpenl  + penl;
                tpens = tpens + pens;
                   tt = tt + t;
                   ta = ta + a;
                
                //--Tampil
                JOptionPane.showMessageDialog(null, tampil, "Laporan Statistik Pedagang",
                                          JOptionPane.INFORMATION_MESSAGE);
                // Grand Total Modal
                gtm = gtm + tm;
                
                x1 = x1 + 4;
                // Hanya dipake bukan hal terakhir
                x2 = x2 + 4;
                
                }
            }
            
            JOptionPane.showMessageDialog(null, tampil, "Laporan Rekap Statistik Pedagang",
                                          JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
}
