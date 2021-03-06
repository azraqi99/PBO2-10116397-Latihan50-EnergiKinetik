/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Energi Kinetik
 */
package pbo210116397latihan50energikinetik;

/**
 *
 * @author Zetro
 */
public class BaseBall {
    
    private double massa;
    private double kecepatan;
    private double energikinetik1;
    private double energikinetik2;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik1(double m, double k) {
        energikinetik1 = 0.5 * m * (k * k);
        return energikinetik1;
    }
    
    public void hitungEnergiKinetik2(double m) {
        this.energikinetik2 = 0.5 * m * 0;
    }
    
    public double usaha() {
        return energikinetik1 - energikinetik2;
    }
    
}

