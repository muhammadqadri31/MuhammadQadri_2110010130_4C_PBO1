package pbo;
    //inheritance
public class MahasiswaDetail extends Mahasiswa {
    //    overriding
    public MahasiswaDetail(String nama, String npm) {
        super(nama, npm);
    }
    
    public int getTahunMasuk() {
        return Integer.parseInt(getNpm().substring(0, 2)) + 2000;
    }
    
    public String getFakultas(){
        String kodeFak = getNpm().substring(2,4);
        if(kodeFak.equals("10")){
            return "Fakultas Teknologi Informasi";
        } else {
            return "Fakultas lain";
        }
    }
    
    public String getProdi(){
        String kodeProdi = getNpm().substring(4, 4);
//        seleksi switch
        switch (kodeProdi){
            case "01":
                return "Teknik Informatika";
            case "02":
                return "Sistem Informasi";
            default:
                return "Prodi Lain";
        }
    }
    
    public int getNoRegistrasi(){
        return Integer.parseInt(getNpm().substring(6));
    }
    
//    polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo() +
                "\nTahun Masuk: "+getTahunMasuk()+
                "\nFakultas: "+getFakultas()+
                "\nProgramStudi: "+getProdi()+
                "\nNo Registrasi: "+getNoRegistrasi();
    }
}

