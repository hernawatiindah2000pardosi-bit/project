import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kata, balik = "";

        System.out.print("Masukkan kata: ");
        kata = input.next();

        for (int i = kata.length() - 1; i >= 0; i--) {
            balik += kata.charAt(i);
        }

        if (kata.equals(balik)) {
            System.out.println("Hasil: Iya, ini palindrom");
        } else {
            System.out.println("Hasil: Tidak, ini bukan palindrom");
        }

        input.close();
    }
}
