public class Jurusan {
    private String kodeJurusan, namaJurusan;
    private Mahasiswa[] daftar = new Mahasiswa[10];

    public Jurusan(String kodeJurusan, String namaJurusan) {
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }

    private static int jmlMhs = 0;

    public void addMahasiswa(Mahasiswa m) {
        this.daftar[jmlMhs] = m;
        jlmMhs++;
    }

    public void displayMahasiswa() {
        System.out.println("Kode Jurusan : " + this.kodeJurusan);
        System.out.println("Nama Jurusan : " + this.namaJurusan);
        System.out.println("Daftar Mahasiswa: ");

        for(int i = 0; i < jmlMhs; i++) {
            System.out.println(daftar[i].getNim() + " " + daftar[i].getNama());
        }
    }


}
