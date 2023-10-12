public class Dosen {
    private String kdDosen;
    private String[] nimMhs;
    private int jmlMahasiswa;

    public void setkdDosen(String kdDosen) {
        this.kdDosen = kdDosen;
    }

    public void setNimMahasiswa(String nimMhs) {
        if(this.jmlMahasiswa < 5) {
            this.nimMhs[this.jmlMahasiswa] = nimMhs;
            this.jmlMahasiswa++;
        }
    }

    public String getKdDosen() {
        return this.kdDosen;
    }

    public int getJmlMahasiswa() {
        return this.jmlMahasiswa;
    }

    public String getMahasiswa(int i){
        return (nimMhs[i]);
    }
}
