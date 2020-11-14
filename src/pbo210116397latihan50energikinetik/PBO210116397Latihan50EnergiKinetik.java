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
public class PBO210116397Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         BaseBall ball = new BaseBall();
        ball.setMassa(145);
        ball.setKecepatan(25);
        System.out.println("sebuah bola baseball dengan massa = " + ball.getMassa() + " g");
        System.out.println("baseball dilempar dengan kecepatan = " + ball.getKecepatan() + " m/s");
        
        double massa = ball.getMassa();
        double kecepatan = ball.getKecepatan();
        
        System.out.println("A. Energi Kinetik = " + ball.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + ball.usaha());
        System.out.println("Catatan : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }
    
}
