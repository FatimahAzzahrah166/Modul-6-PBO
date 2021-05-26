package Modul5;

public class opBilCetak {
    public static void main(String[] args) {
        System.out.println("Nilai A = 6.5, Nilai B = 0.5 \n");
        OperasiBilangan [] operasiBilangans = new OperasiBilangan [4];
        operasiBilangans[0]=new OperasiPenjumlahan();
        operasiBilangans[1]=new OperasiPengurangan();
        operasiBilangans[2]=new OperasiPerkalian();
        operasiBilangans[3]=new OperasiPembagian();

        for(int i=0; i < operasiBilangans.length; i++){
            operasiBilangans[i].setA(6.5);
            operasiBilangans[i].setB(0.5);
            operasiBilangans[i].setC();
            operasiBilangans[i].getA();
            operasiBilangans[i].getB();
            operasiBilangans[i].getC();
            operasiBilangans[i].tampil();
        }
    }
}