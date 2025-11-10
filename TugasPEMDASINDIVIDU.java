import java.util.Scanner;
public class TugasPEMDASINDIVIDU {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Massa,Kecepatan,Ketinggian,G=10;
        System.out.print("Masukan Nilai Massa : ");
        Massa = input.nextInt();
        System.out.print("Masukan Nilai Kecepatan : ");
        Kecepatan = input.nextInt();
        System.out.print("Masukan Nilai Ketinggian : ");
        Ketinggian = input.nextInt();
        double EP = Massa*G*Ketinggian;
        double EK = 0.5*Massa*(Kecepatan*Kecepatan);
        double EM = EP + EK;

        System.out.println("Massa = "+Massa+", Kecepatan = "+Kecepatan+", dan Ketinggian = "+Ketinggian);
        System.out.println("Energi Potensial = "+EP);
        System.out.println("Energi Kinetik = "+EK);
        System.out.println("Energi Mekanik = "+EM);
         input.close(); 
    }
}

