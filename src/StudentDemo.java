public class StudentDemo {
    public static void main(String[] args) {
        Student siswa1 = new Student();
        siswa1.setNama("Yant0");
        siswa1.setUmur(19);
        siswa1.setPeringkat(1);

        Student siswa2 = new Student();
        siswa2.setNama("Herland");
        siswa2.setUmur(12);
        siswa2.setPeringkat(2);

        Student siswa3 = new Student();
        siswa3.setNama("Dava");
        siswa3.setUmur(10);
        siswa3.setPeringkat(9);

        siswa1.tampilkanData();
        siswa2.tampilkanData();
        siswa3.tampilkanData();
    }
}