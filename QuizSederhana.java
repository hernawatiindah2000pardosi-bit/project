import java.util.Scanner;

public class QuizSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char jawaban;
        int skor = 0;

        System.out.println("=== QUIZ SEDERHANA ===\n");

        System.out.println("1. Siapakah pencipta bahasa pemrograman Java?");
        System.out.println("A. Bill Gates");
        System.out.println("B. James Gosling");
        System.out.println("C. Linus Torvalds");
        System.out.println("D. Mark Zuckerberg");
        System.out.print("jawab: ");
        jawaban = input.next().charAt(0);
        if (jawaban == 'B' || jawaban == 'b') skor++;

        System.out.println("\n2. 2 + 5 = ?");
        System.out.println("A. 5");
        System.out.println("B. 6");
        System.out.println("C. 7");
        System.out.println("D. 8");
        System.out.print("jawab: ");
        jawaban = input.next().charAt(0);
        if (jawaban == 'C' || jawaban == 'c') skor++;

        System.out.println("\n3. Bahasa pemrograman C++ menggunakan?");
        System.out.println("A. Compiler");
        System.out.println("B. Interpreter");
        System.out.println("C. Browser");
        System.out.println("D. Server");
        System.out.print("jawab: ");
        jawaban = input.next().charAt(0);
        if (jawaban == 'A' || jawaban == 'a') skor++;

        System.out.println("\n4. Simbol untuk komentar satu baris di C++?");
        System.out.println("A. /* */");
        System.out.println("B. <!-- -->");
        System.out.println("C. //");
        System.out.println("D. ##");
        System.out.print("jawab: ");
        jawaban = input.next().charAt(0);
        if (jawaban == 'C' || jawaban == 'c') skor++;

        System.out.println("\n5. Tipe data untuk bilangan bulat?");
        System.out.println("A. float");
        System.out.println("B. char");
        System.out.println("C. double");
        System.out.println("D. int");
        System.out.print("jawab: ");
        jawaban = input.next().charAt(0);
        if (jawaban == 'D' || jawaban == 'd') skor++;

        System.out.println("\nSkor akhir kamu: " + skor + " / 5");

        input.close();
    }
}

