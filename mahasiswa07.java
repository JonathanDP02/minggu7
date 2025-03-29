public class mahasiswa07{
    String nim;
    String nama;
    String kelas;
    double ipk;

    mahasiswa07(){}

    mahasiswa07(String nm, String name, String kls, double ip){
        nm = nim;
        name = nama;
        kls = kelas;
        ip = ipk;
    }

    public void tampilInformasi(){
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("Kelas\t: " + kelas);
        System.out.println("IPK\t: " + ipk);
        System.out.println("-------------------------");
    }
}