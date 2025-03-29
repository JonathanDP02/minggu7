public class mahasiswaBerprestasi07 {
    mahasiswa07 [] listMhs = new mahasiswa07[5];
    int idx;

    mahasiswaBerprestasi07(){}

    public int sequentialSearching(double cari){
        int posisi = -1;
        for(int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("nim\t: " + listMhs[pos].nim);
            System.out.println("nama\t: " + listMhs[pos].nama);
            System.out.println("kelas\t: " + listMhs[pos].kelas);
            System.out.println("ipk\t: " + x);
        }
    }
}
