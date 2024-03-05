package Program;
import javax.swing.*;
// Import MENU
import static Program.MENU.*;

public class HAPUS {

    // Var HAPUS
    private static String tampil="", hapus;
    private static String data_hapus;
    private static int no_hapus;
    private static boolean putar = true, salah = true;
    
    static void Hapus() {
        
        // Jika Belum/Tidak Ada Data
        if(x < 0 ) {
            JOptionPane.showMessageDialog(null, "Belum ada data yang bisa di Hapus", "WARNING", JOptionPane.WARNING_MESSAGE);
            
        }
        else {
        
            do {
                
                do{
                    hapus = JOptionPane.showInputDialog("Mau Hapus Data?? [Y/T]");
                }
                while(!("y".equals(hapus) | "Y".equals(hapus) | "t".equals(hapus) 
                        | "T".equals(hapus)) );

                // Mmembuat Perulangan Untuk Input Data Lagi
                while("Y".equals(hapus) | "y".equals(hapus)) { 

                    switch (hapus) {

                        case "Y","y" : {

                            // Inputan no data yg akan di HAPUS
                            do {
                                try {
                                    data_hapus = JOptionPane.showInputDialog(null, "Data Di Hapus [ 1 - "+(x+1)+" ]");
                                    no_hapus = Integer.parseInt(data_hapus);

                                    if(!(no_hapus >= 1 && no_hapus <= (x+1)) ) {
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
                            while(salah || !(no_hapus >= 1 && no_hapus <= (x+1)) );

                            //--Tampilan data yg akan dihapus
                            tampil = ""; //Riset
                            tampil += "Nama Toko         = "+ NToko     [no_hapus-1] +"\n";
                            tampil += "Alamat Toko       = "+ Alamat    [no_hapus-1] +"\n";
                            tampil += "Nama Pemilik      = "+ Pemilik   [no_hapus-1] +"\n";
                            tampil += "Jenis Usaha       = "+ JUsaha    [no_hapus-1] +"\n";
                            tampil += "Modal Toko        = "+ Modal     [no_hapus-1] +"\n";
                            tampil += "Penjualan         = "+ Penjualan [no_hapus-1] +"\n";
                            tampil += "Pembeli           = "+ Pembeli   [no_hapus-1] +"\n";
                            tampil += "Cabang            = "+ Cabang    [no_hapus-1] +"\n";
                            tampil += "Alamat Email      = "+ Email     [no_hapus-1] +"\n";
                            tampil += "Sosial Media      = "+ Sosmed    [no_hapus-1] +"\n";
                            tampil += "No HP/Telepon     = "+ NoHP      [no_hapus-1] +"\n";
                            tampil += "Status Pemilik    = "+ Status    [no_hapus-1] +"\n";
                            tampil += "Pendapatan Harian = "+ PHarian   [no_hapus-1] +"\n";

                            JOptionPane.showMessageDialog(null, tampil, "No Data : "+no_hapus , JOptionPane.INFORMATION_MESSAGE);

                            // Hapus Diantara
                            if(no_hapus>=1 && no_hapus <= x)
                            {
                                for (int p = no_hapus; p <= x ; p++ ) 
                                {   
                                    // Menggantikan data / Data Maju
                                    NToko    [p-1] = NToko    [p];
                                    Alamat   [p-1] = Alamat   [p];
                                    Pemilik  [p-1] = Pemilik  [p];
                                    JUsaha   [p-1] = JUsaha   [p];
                                    Modal    [p-1] = Modal    [p];
                                    Penjualan[p-1] = Penjualan[p];
                                    Pembeli  [p-1] = Pembeli  [p];
                                    Cabang   [p-1] = Cabang   [p];
                                    Email    [p-1] = Email    [p];
                                    Sosmed   [p-1] = Sosmed   [p];
                                    NoHP     [p-1] = NoHP     [p];
                                    Status   [p-1] = Status   [p];
                                    PHarian  [p-1] = PHarian  [p];
                                }
                            }
                            
                            // Hapus Diakhir data
                            x = x -1;
                            
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
                    
                    // Hapus data Habis
                    if(x < 0){
                        JOptionPane.showMessageDialog(null, "Data Telah Habis");
                        putar = false;
                        hapus = "t";
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");

                        // Hapus Data Lagi
                        do{
                            hapus = JOptionPane.showInputDialog("Mau Hapus Data Lagi?? [Y/T]");
                        }
                        while(!("y".equals(hapus) | "Y".equals(hapus) | "t".equals(hapus) 
                                | "T".equals(hapus)) );
                        
                    }
                }
                //-Keluar
                putar = false;            
            }
            while(putar);
            //-
        }
        
    }
}
