import java.util.Scanner;

public class NoteManager {

    private String[][] notes = new String[100][2];
    private int jumlahCatatan = 0;

    public void addNote(Scanner scanner) {
        if (jumlahCatatan < 100) {
            System.out.print("Judul catatan: ");
            String judul = scanner.nextLine();
            System.out.print("Catat apa hari ini: ");
            String konten = scanner.nextLine();
            notes[jumlahCatatan][0] = judul;
            notes[jumlahCatatan][1] = konten;
            jumlahCatatan++;
            System.out.println("Berhasil menambahkan catatan baru berjudul: " + judul + " !");
        } else {
            System.out.println("Tidak bisa menambah catatan lagi, penyimpanan penuh!");
        }
    }

    public void viewNotes() {
        if (jumlahCatatan == 0) {
            System.out.println("Belum ada catatan apapun nih!");
        } else {
            System.out.println("------------------------");
            for (int i = 0; i < jumlahCatatan; i++) {
                System.out.println("Catatan #" + (i + 1) + ":");
                System.out.println("Judul: " + notes[i][0]);
                System.out.println("Konten: " + notes[i][1]);
                System.out.println("------------------------");
            }
        }
    }

    public void editNote(Scanner scanner) {
        System.out.print("Mau ngedit catatan nomor berapa?: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if (index >= 0 && index < jumlahCatatan) {
            System.out.print("Masukkan judul baru (kosongkan jika tidak ingin mengubah judul): ");
            String newJudul = scanner.nextLine();
            System.out.print("Masukkan catatan baru (kosongkan jika tidak ingin mengubah konten): ");
            String newKonten = scanner.nextLine();

            if (!newJudul.isEmpty()) {
                notes[index][0] = newJudul;
            }
            if (!newKonten.isEmpty()) {
                notes[index][1] = newKonten;
            }

            System.out.println("Berhasil mengedit catatan!");
        } else {
            System.out.println("Catatan dengan nomor " + (index + 1) + " belum ada!");
        }
    }

    public void deleteNote(Scanner scanner) {
        System.out.print("Catatan nomor berapa yang ingin dihapus?: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < jumlahCatatan) {
            for (int i = index; i < jumlahCatatan - 1; i++) {
                notes[i][0] = notes[i + 1][0];
                notes[i][1] = notes[i + 1][1];
            }
            jumlahCatatan--;
            System.out.println("Berhasil menghapus catatan nomor " + (index + 1) + "!");
        } else {
            System.out.println("Catatan dengan nomor " + (index + 1) + " belum ada!");
        }
    }
}
