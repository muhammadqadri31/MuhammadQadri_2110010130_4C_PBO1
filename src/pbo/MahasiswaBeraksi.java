package pbo;
    import java.util.Scanner;

public class MahasiswaBeraksi {
   public static void main(String[] args) {
//        objek
//Mahasiswa mhs = new Mahasiswa ("Muhammad Qadri","2110010130");

//System.out.println(mhs.displayInfo());
//System.out.println(mhs.displayInfo("4C"));

//Error handling
try{
    //io sederhana
    Scanner scanner = new Scanner (System.in);

    //array
        MahasiswaDetail[] mhs = new MahasiswaDetail[2];
        for(int i=0; i<mhs.length; i++) {
                System.out.print("Masukkan nama mahasiswa "+(i+1)+" ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NPM mahasiswa "+(i+1)+" ");
                String npm = scanner.nextLine();

        //        objek
                mhs[i] = new MahasiswaDetail (nama, npm);
    }

        for(MahasiswaDetail data: mhs) {
            System.out.println("==================");
            System.out.println("Data Mahasiswa: ");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan format nomor: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format NPM: "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
    }
  }
} 
