import java.util.Scanner;

 public class ArrayWithString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array of strings
        String[] lines = new String[10];

        int i = 0;
        while (true) {
            String input = sc.nextLine();
            if (input.equals("stop")) {
                break;
            }

            lines[i] = input;
            i++;
        }

        for (int j = lines.length - 1; j >= 0; j--) {
            if (lines[j] != null) {
                System.out.println(lines[j]);
            }
        }


    }
}
