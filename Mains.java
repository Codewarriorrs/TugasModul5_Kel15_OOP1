import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        NoteManager note = new NoteManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("SELAMAT DATANG DI SISTEM CATATAN KELOMPOK 15");
            System.out.println("1. Buat catatan baru");
            System.out.println("2. Lihat semua catatan");
            System.out.println("3. Edit catatan");
            System.out.println("4. Hapus catatan");
            System.out.println("5. Keluar");
            System.out.print("Apa yang ingin kamu lakukan : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("------------------------------------");
                    note.addNote(scanner);
                    System.out.println("------------------------------------");
                    break;
                case 2:
                    System.out.println("------------------------------------");
                    note.viewNotes();
                    System.out.println("------------------------------------");
                    break;
                case 3:
                    System.out.println("------------------------------------");
                    note.editNote(scanner);
                    System.out.println("------------------------------------");
                    break;
                case 4:
                    System.out.println("------------------------------------");
                    note.deleteNote(scanner);
                    System.out.println("------------------------------------");
                    break;
                case 5:
                    System.out.println("Terimakasih sudah menggunakan catatan!");
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 5);

        scanner.close();
    }
}
