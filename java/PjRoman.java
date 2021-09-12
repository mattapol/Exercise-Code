import  java.util.*;
public class PjRoman {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  int Sum=0;
        System.out.print("Enter a Roman numeral: ");
        String R = sc.nextLine(); RomanToDecimal(R);
        System.out.print("Enter a Roman numeral: ");
        String G = sc.nextLine(); RomanToDecimal(G);
        System.out.print("=Plase select=\n+ [1]\n* [2]\nSelect = ");
        char select = sc.next().charAt(0);  String unknow = " ";
        switch (select) {
          case '1': case '+': Sum = RomanToDecimal(R) + RomanToDecimal(G); unknow = "+"; break;
          case '2': case '*': Sum = RomanToDecimal(R) * RomanToDecimal(G); unknow = "*"; break;
        }
        System.out.print(R + "(" + RomanToDecimal(R)+ ") " + unknow + " " + G + "(" + RomanToDecimal(G) + ") = " + decimalToRoman(Sum) + " (" + Sum + ")");

    }
    private static int RomanToDecimal(String R){
        int Decimal = 0;
        char Previous;
        for (int x = 0; x < R.length(); x++){
            Previous = R.charAt(x);
            if(R.charAt(x) == 'I')
                Decimal += 1;
            if(R.charAt(x) == 'V'){
                if (Previous == 'I')
                    Decimal -= 1;
                else
                    Decimal += 5;}
            if(R.charAt(x) == 'X'){
                if (Previous == 'I')
                    Decimal-= 1;
                else
                    Decimal+= 10;}
            if(R.charAt(x) == 'L'){
                if (Previous == 'X')
                    Decimal -= 10;
                else
                    Decimal+=50;}
            if(R.charAt(x) == 'C'){
                if (Previous == 'X')
                    Decimal -= 10;
                else
                    Decimal += 100;}
            if(R.charAt(x) == 'D'){
                if (Previous == 'C')
                    Decimal -= 100;
                else
                    Decimal += 500;}
            if(R.charAt(x) == 'M'){
                if (Previous == 'C')
                    Decimal -= 100;
                else
                    Decimal+= 1000;}
            Previous = R.charAt(x);}
        return Decimal;
    }
    private static String decimalToRoman(int number) {
        String[] romans = {"M", "CM", "D", "C", "XC", "L", "X", "IX", "V", "I"};
        int[] values = {1000, 900, 500, 100, 90, 50, 10, 9, 5, 1};
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            int times= number / values[i];

            if (times== 0) {
                continue;
            }

            if (times == 4 && i > 0) {
                builder.append(romans[i]);
                builder.append(romans[i - 1]);
            } else {
                for (int x = 0; x < times; x++) {
                    builder.append(romans[i]);
                }
            }

            number = number % values[i];
        }
        return builder.toString();
    }
  }
