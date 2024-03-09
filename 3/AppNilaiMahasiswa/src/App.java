import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        KelasMahasiswa kelasMahasiswa = new KelasMahasiswa();

        boolean inputData = true;
        do {
            try {
                System.out.println("INPUT DATA MAHASISWA");

                System.out.print("NIM\t: ");
                String nim = scanner.nextLine();

                System.out.print("Nama\t: ");
                String nama = scanner.nextLine();

                System.out.print("Nilai\t: ");
                int nilai = scanner.nextInt();
                scanner.nextLine();

                Mahasiswa mahasiswa = new Mahasiswa(nim, nama, nilai);
                kelasMahasiswa.tambahMahasiswa(mahasiswa);

                System.out.println("==================================");
                System.out.print("Input mahasiswa lagi? ya/tidak : ");
                String yaTidak = scanner.nextLine();

                inputData = yaTidak.equals("ya");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println();
            }
        } while(inputData);

        kelasMahasiswa.printInfo();
        scanner.close();
    }
}
