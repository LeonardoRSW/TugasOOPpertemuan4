public class PersonBeraksi{
public static void main(String[] args) {
Person anton = new Person();

anton.nama = "Anton";
anton.JK = "Laki-laki";
anton.U = 19;

System.out.println("Nama : " + anton.nama);
System.out.println("JenisKelamin :" + anton.JK); 
System.out.println("Umur : " + anton.U);

System.out.println("------------------------------------------");
Person Riko = new Person();

Riko.nama = "Riko";
Riko.JK = "Laki-laki";
Riko.U = 18;

System.out.println("Nama : " + Riko.nama);
System.out.println("JenisKelamin :" + Riko.JK); 
System.out.println("Umur : " + Riko.U);

}
}