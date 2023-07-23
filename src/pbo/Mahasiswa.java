package pbo;

public class Mahasiswa {
    //    atribut dan enkapsulasi
    private String nama;
    private String npm;
    
//    construktor
    public Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }
    
//    mutator (seter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

//    accesor (getter)
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }
    
    public String displayInfo(){
       return "Nama: "+getNama()+
              "\nNPM: "+getNpm(); 
    }
    
//    polymorphism (overloading)
    public String displayInfo(String kelas){
        return displayInfo() + "\nKelas: "+kelas;
    }
}
