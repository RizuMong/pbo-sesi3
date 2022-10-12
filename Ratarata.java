import java.util.Scanner;
import java.util.ArrayList;

public class Ratarata {

  private static boolean add;

  /**
   * @param args
   */
  public static void main(String args[]) {
    try (Scanner masuk = new Scanner(System.in)) {
      int i, n, lulus, tidak_lulus;
      float rata, z, jumlah;
      String y, grade1, grade2, grade3, grade4, grade5;

      System.out.print("================ Program Berbasis Objek Menghitung Rata-Rata =================");

      System.out.print("\nBerapa Inputan yang Dimasukan: ");
      n = masuk.nextInt();
      if (n == 0) {
        System.out.print("Data Berhasil Diinputkan!");
        System.exit(1);
      }

      jumlah = 0;
      i = 1;

      ArrayList nama2 = new ArrayList<>();
      ArrayList nilai_2 = new ArrayList<>();
      ArrayList grade_a = new ArrayList<>();
      ArrayList grade_b = new ArrayList<>();
      ArrayList grade_c = new ArrayList<>();
      ArrayList grade_d = new ArrayList<>();
      ArrayList grade_e = new ArrayList<>();
      ArrayList nama_a = new ArrayList<>();
      ArrayList nama_b = new ArrayList<>();
      ArrayList nama_c = new ArrayList<>();
      ArrayList nama_d = new ArrayList<>();
      ArrayList nama_e = new ArrayList<>();

      while (i <= n) {
        System.out.print("NIM" + ":");
        masuk.nextFloat();

        System.out.print("NAMA" + ":");
        y = masuk.next();

        extracted(y, nama2);
        System.out.print("NILAI" + " + ");
        z = masuk.nextFloat();
        add = nilai_2.add(z);

        if (z >= 100) {
          System.out.println("Inputan anda Salah!");
          System.exit(1);
        }
        if (z < 0) {
          System.out.println("Inputan anda Salah!");
          System.exit(1);
        } else if (z >= 80) {
          grade1 = "A";
          extracted(grade1, grade_a);
          extracted(y, nama_a);
          System.out.println("Grade : A");
        } else if (z >= 70) {
          grade2 = "B";
          extracted(grade2, grade_b);
          extracted(y, nama_b);
          System.out.println("Grade : B");
        } else if (z >= 60) {
          grade3 = "C";
          extracted(grade3, grade_c);
          extracted(y, nama_c);
          System.out.println("Grade : C");
        } else if (z >= 50) {
          grade4 = "D";
          extracted(grade4, grade_d);
          extracted(y, nama_d);
          System.out.println("Grade : D");
        } else if (z <= 50) {
          grade5 = "E";
          extracted(grade5, grade_e);
          extracted(y, nama_e);
          System.out.println("Grade : E");
        } else {
          System.out.print("Inputan anda Salah");
          System.exit(1);
        }

        jumlah += z;
        i++;
        System.out.print("=================================");

      }

      rata = jumlah / n;
      lulus = grade_a.size() + grade_b.size() + grade_c.size();
      tidak_lulus = grade_d.size() + grade_e.size();

      System.out.println("Jumlah Mahasiswa: " + n + "Adalah: " + nama2);
      System.out.println("Jumlah Mahasiswa Lulus: " + lulus + "Adalah: " + nama_a + nama_b + nama_c);
      System.out.println("Jumlah Mahasiswa Tidak Lulus: " + tidak_lulus + "Adalah: " + nama_d + nama_e);

      System.out.println("Jumlah Mahasiswa Nilai A: " + grade_a.size() + "Adalah: " + nama_a);
      System.out.println("Jumlah Mahasiswa Nilai B: " + grade_b.size() + "Adalah: " + nama_b);
      System.out.println("Jumlah Mahasiswa Nilai C: " + grade_c.size() + "Adalah: " + nama_c);
      System.out.println("Jumlah Mahasiswa Nilai D: " + grade_d.size() + "Adalah: " + nama_d);
      System.out.println("Jumlah Mahasiswa Nilai E: " + grade_e.size() + "Adalah: " + nama_e);

      System.out.println("Jadi, Nilai Rata-rata Mahasiswa Adalah: " + nilai_2 + "/" + n + ":" + rata);
    }

  }

  private static boolean extracted(String y, ArrayList nama2) {
    return nama2.add(y);
  }
}