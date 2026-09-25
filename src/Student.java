public class Student {
    String nama;
    int umur;
    int peringkat;

    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }

    public void setUmur(int umurBaru) {
        this.umur = umurBaru;
    }

    public void setPeringkat(int peringkatBaru) {
        this.peringkat = peringkatBaru;
    }

    public void tampilkanData() {
        System.out.println("Nama      : " + this.nama);
        System.out.println("Umur      : " + this.umur + " tahun");
        System.out.println("Peringkat : " + this.peringkat);
        System.out.println("===================================");
    }
}