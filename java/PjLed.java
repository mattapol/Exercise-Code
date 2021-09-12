import java.util.Scanner;
public class PjLed{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input ;
    do {
    System.out.print("Please enter a word : ");
    input = sc.nextLine();
  } while (input.length()==11);
    if (input.length()<=10) {
  for (int i = 0;i<input.length();i++ ) {
    char b[] = new char[1];
    b[0] = input.charAt(i);
    String a = String.copyValueOf(b);
    play1(a);
    System.out.print("o");
}
System.out.println();
  for (int i = 0;i<input.length();i++ ) {
    char b[] = new char[1];
    b[0] = input.charAt(i);
    String a = String.copyValueOf(b);
    play2(a);
    System.out.print("o");
  }
System.out.println();
  for (int i = 0;i<input.length();i++ ) {
    char b[] = new char[1];
    b[0] = input.charAt(i);
    String a = String.copyValueOf(b);
    play3(a);
    System.out.print("o");
}
System.out.println();
for (int i = 0;i<input.length();i++ ) {
  char b[] = new char[1];
  b[0] = input.charAt(i);
  String a = String.copyValueOf(b);
  play4(a);
  System.out.print("o");
}
System.out.println();
for (int i = 0;i<input.length();i++ ) {
  char b[] = new char[1];
  b[0] = input.charAt(i);
  String a = String.copyValueOf(b);
  play5(a);
  System.out.print("o");
}
System.out.println();
for (int i = 0;i<input.length();i++ ) {
  char b[] = new char[1];
  b[0] = input.charAt(i);
  String a = String.copyValueOf(b);
  play6(a);
  System.out.print("o");
}
System.out.println();
for (int i = 0;i<input.length();i++ ) {
  char b[] = new char[1];
  b[0] = input.charAt(i);
  String a = String.copyValueOf(b);
  play7(a);
  System.out.print("o");
}
System.out.println();
}else if(input.length()>10){
}
}
  public static void play1 (String name) {
    switch (name) {
  case "A":case "a":
  System.out.print("o###o");
  break;
  case "B":case "b":
  System.out.print("####o");
  break;
  case "C":case "c":
  System.out.print("o###o");
  break;
  case "D":case "d":
  System.out.print("###oo");
  break;
  case "E":case "e":
  System.out.print("#####");
  break;
  case "F":case "f":
  System.out.print("#####");
  break;
  case "G":case "g":
  System.out.print("o###o");
  break;
  case "H":case "h":
  System.out.print("#ooo#");
  break;
  case "I":case "i":
  System.out.print("o###o");
  break;
  case "J":case "j":
  System.out.print("oo###");
  break;
  case "K":case "k":
  System.out.print("#ooo#");
  break;
  case "L":case "l":
  System.out.print("#oooo");
  break;
  case "M":case "m":
  System.out.print("#ooo#");
  break;
  case "N":case "n":
  System.out.print("#ooo#");
  break;
  case "O":case "o":
  System.out.print("o###o");
  break;
  case "P":case "p":
  System.out.print("####o");
  break;
  case "Q":case "q":
  System.out.print("o###o");
  break;
  case "R":case "r":
  System.out.print("####o");
  break;
  case "S":case "s":
  System.out.print("o###o");
  break;
  case "T":case "t":
  System.out.print("#####");
  break;
  case "U":case "u":
  System.out.print("#ooo#");
  break;
  case "V":case "v":
  System.out.print("#ooo#");
  break;
  case "W":case "w":
  System.out.print("#ooo#");
  break;
  case "X":case "x":
  System.out.print("#ooo#");
  break;
  case "Y":case "y":
  System.out.print("#ooo#");
  break;
  case "Z":case "z":
  System.out.print("#####");
  break;
  case "0":
  System.out.print("o###o");
  break;
  case "1":
  System.out.print("oo#oo");
  break;
  case "2":
  System.out.print("o###o");
  break;
  case "3":
  System.out.print("#####");
  break;
  case "4":
  System.out.print("ooo#o");
  break;
  case "5":
  System.out.print("#####");
  break;
  case "6":
  System.out.print("oo##o");
  break;
  case "7":
  System.out.print("#####");
  break;
  case "8":
  System.out.print("o###o");
  break;
  case "9":
  System.out.print("o###o");
  break;
  }
  }
  public static void play2 (String name) {
    switch (name) {
  case "A":case "a":
  System.out.print("#ooo#");
  break;
  case "B":case "b":
  System.out.print("#ooo#");
  break;
  case "C":case "c":
  System.out.print("#ooo#");
  break;
  case "D":case "d":
  System.out.print("#oo#o");
  break;
  case "E":case "e":
  System.out.print("#oooo");
  break;
  case "F":case "f":
  System.out.print("#oooo");
  break;
  case "G":case "g":
  System.out.print("#ooo#");
  break;
  case "H":case "h":
  System.out.print("#ooo#");
  break;
  case "I":case "i":
  System.out.print("oo#oo");
  break;
  case "J":case "j":
  System.out.print("ooo#o");
  break;
  case "K":case "k":
  System.out.print("#oo#o");
  break;
  case "L":case "l":
  System.out.print("#oooo");
  break;
  case "M":case "m":
  System.out.print("##o##");
  break;
  case "N":case "n":
  System.out.print("#ooo#");
  break;
  case "O":case "o":
  System.out.print("#ooo#");
  break;
  case "P":case "p":
  System.out.print("#ooo#");
  break;
  case "Q":case "q":
  System.out.print("#ooo#");
  break;
  case "R":case "r":
  System.out.print("#ooo#");
  break;
  case "S":case "s":
  System.out.print("#oooo");
  break;
  case "T":case "t":
  System.out.print("oo#oo");
  break;
  case "U":case "u":
  System.out.print("#ooo#");
  break;
  case "V":case "v":
  System.out.print("#ooo#");
  break;
  case "W":case "w":
  System.out.print("#ooo#");
  break;
  case "X":case "x":
  System.out.print("#ooo#");
  break;
  case "Y":case "y":
  System.out.print("#ooo#");
  break;
  case "Z":case "z":
  System.out.print("oooo#");
  break;
  case "0":
  System.out.print("#ooo#");
  break;
  case "1":
  System.out.print("o##oo");
  break;
  case "2":
  System.out.print("#ooo#");
  break;
  case "3":
  System.out.print("ooo#o");
  break;
  case "4":
  System.out.print("oo##o");
  break;
  case "5":
  System.out.print("#oooo");
  break;
  case "6":
  System.out.print("o#ooo");
  break;
  case "7":
  System.out.print("oooo#");
  break;
  case "8":
  System.out.print("#ooo#");
  break;
  case "9":
  System.out.print("#ooo#");
  break;
  }
  }
  public static void play3 (String name) {
    switch (name) {
  case "A":case "a":
  System.out.print("#ooo#");
  break;
  case "B":case "b":
  System.out.print("#ooo#");
  break;
  case "C":case "c":
  System.out.print("#oooo");
  break;
  case "D":case "d":
  System.out.print("#ooo#");
  break;
  case "E":case "e":
  System.out.print("#oooo");
  break;
  case "F":case "f":
  System.out.print("#oooo");
  break;
  case "G":case "g":
  System.out.print("#oooo");
  break;
  case "H":case "h":
  System.out.print("#ooo#");
  break;
  case "I":case "i":
  System.out.print("oo#oo");
  break;
  case "J":case "j":
  System.out.print("ooo#o");
  break;
  case "K":case "k":
  System.out.print("#o#oo");
  break;
  case "L":case "l":
  System.out.print("#oooo");
  break;
  case "M":case "m":
  System.out.print("#o#o#");
  break;
  case "N":case "n":
  System.out.print("##oo#");
  break;
  case "O":case "o":
  System.out.print("#ooo#");
  break;
  case "P":case "p":
  System.out.print("#ooo#");
  break;
  case "Q":case "q":
  System.out.print("#ooo#");
  break;
  case "R":case "r":
  System.out.print("#ooo#");
  break;
  case "S":case "s":
  System.out.print("#oooo");
  break;
  case "T":case "t":
  System.out.print("oo#oo");
  break;
  case "U":case "u":
  System.out.print("#ooo#");
  break;
  case "V":case "v":
  System.out.print("#ooo#");
  break;
  case "W":case "w":
  System.out.print("#ooo#");
  break;
  case "X":case "x":
  System.out.print("o#o#o");
  break;
  case "Y":case "y":
  System.out.print("#ooo#");
  break;
  case "Z":case "z":
  System.out.print("ooo#o");
  break;
  case "0":
  System.out.print("#oo##");
  break;
  case "1":
  System.out.print("oo#oo");
  break;
  case "2":
  System.out.print("oooo#");
  break;
  case "3":
  System.out.print("oo#oo");
  break;
  case "4":
  System.out.print("o#o#o");
  break;
  case "5":
  System.out.print("####o");
  break;
  case "6":
  System.out.print("#oooo");
  break;
  case "7":
  System.out.print("ooo#o");
  break;
  case "8":
  System.out.print("#ooo#");
  break;
  case "9":
  System.out.print("#ooo#");
  break;
  }
  }
  public static void play4 (String name) {
    switch (name) {
  case "A":case "a":
  System.out.print("#ooo#");
  break;
  case "B":case "b":
  System.out.print("####o");
  break;
  case "C":case "c":
  System.out.print("#oooo");
  break;
  case "D":case "d":
  System.out.print("#ooo#");
  break;
  case "E":case "e":
  System.out.print("####o");
  break;
  case "F":case "f":
  System.out.print("####o");
  break;
  case "G":case "g":
  System.out.print("#o###");
  break;
  case "H":case "h":
  System.out.print("#####");
  break;
  case "I":case "i":
  System.out.print("oo#oo");
  break;
  case "J":case "j":
  System.out.print("ooo#o");
  break;
  case "K":case "k":
  System.out.print("##ooo");
  break;
  case "L":case "l":
  System.out.print("#oooo");
  break;
  case "M":case "m":
  System.out.print("#o#o#");
  break;
  case "N":case "n":
  System.out.print("#o#o#");
  break;
  case "O":case "o":
  System.out.print("#ooo#");
  break;
  case "P":case "p":
  System.out.print("####o");
  break;
  case "Q":case "q":
  System.out.print("#ooo#");
  break;
  case "R":case "r":
  System.out.print("####o");
  break;
  case "S":case "s":
  System.out.print("o###o");
  break;
  case "T":case "t":
  System.out.print("oo#oo");
  break;
  case "U":case "u":
  System.out.print("#ooo#");
  break;
  case "V":case "v":
  System.out.print("#ooo#");
  break;
  case "W":case "w":
  System.out.print("#o#o#");
  break;
  case "X":case "x":
  System.out.print("oo#oo");
  break;
  case "Y":case "y":
  System.out.print("o#o#o");
  break;
  case "Z":case "z":
  System.out.print("oo#oo");
  break;
  case "0":
  System.out.print("#o#o#");
  break;
  case "1":
  System.out.print("oo#oo");
  break;
  case "2":
  System.out.print("ooo#o");
  break;
  case "3":
  System.out.print("ooo#o");
  break;
  case "4":
  System.out.print("#oo#o");
  break;
  case "5":
  System.out.print("oooo#");
  break;
  case "6":
  System.out.print("####o");
  break;
  case "7":
  System.out.print("oo#oo");
  break;
  case "8":
  System.out.print("o###o");
  break;
  case "9":
  System.out.print("o####");
  break;
  }
  }
  public static void play5 (String name) {
    switch (name) {
  case "A":case "a":
  System.out.print("#####");
  break;
  case "B":case "b":
  System.out.print("#ooo#");
  break;
  case "C":case "c":
  System.out.print("#oooo");
  break;
  case "D":case "d":
  System.out.print("#ooo#");
  break;
  case "E":case "e":
  System.out.print("#oooo");
  break;
  case "F":case "f":
  System.out.print("#oooo");
  break;
  case "G":case "g":
  System.out.print("#ooo#");
  break;
  case "H":case "h":
  System.out.print("#ooo#");
  break;
  case "I":case "i":
  System.out.print("oo#oo");
  break;
  case "J":case "j":
  System.out.print("ooo#o");
  break;
  case "K":case "k":
  System.out.print("#o#oo");
  break;
  case "L":case "l":
  System.out.print("#oooo");
  break;
  case "M":case "m":
  System.out.print("#ooo#");
  break;
  case "N":case "n":
  System.out.print("#oo##");
  break;
  case "O":case "o":
  System.out.print("#ooo#");
  break;
  case "P":case "p":
  System.out.print("#oooo");
  break;
  case "Q":case "q":
  System.out.print("o###o");
  break;
  case "R":case "r":
  System.out.print("#o#oo");
  break;
  case "S":case "s":
  System.out.print("oooo#");
  break;
  case "T":case "t":
  System.out.print("oo#oo");
  break;
  case "U":case "u":
  System.out.print("#ooo#");
  break;
  case "V":case "v":
  System.out.print("#ooo#");
  break;
  case "W":case "w":
  System.out.print("#o#o#");
  break;
  case "X":case "x":
  System.out.print("o#o#o");
  break;
  case "Y":case "y":
  System.out.print("oo#oo");
  break;
  case "Z":case "z":
  System.out.print("o#ooo");
  break;
  case "0":
  System.out.print("##oo#");
  break;
  case "1":
  System.out.print("oo#oo");
  break;
  case "2":
  System.out.print("oo#oo");
  break;
  case "3":
  System.out.print("oooo#");
  break;
  case "4":
  System.out.print("#####");
  break;
  case "5":
  System.out.print("oooo#");
  break;
  case "6":
  System.out.print("#ooo#");
  break;
  case "7":
  System.out.print("#oooo");
  break;
  case "8":
  System.out.print("#ooo#");
  break;
  case "9":
  System.out.print("oooo#");
  break;
  }
  }
  public static void play6 (String name) {
    switch (name) {
  case "A":case "a":
  System.out.print("#ooo#");
  break;
  case "B":case "b":
  System.out.print("#ooo#");
  break;
  case "C":case "c":
  System.out.print("#ooo#");
  break;
  case "D":case "d":
  System.out.print("#oo#o");
  break;
  case "E":case "e":
  System.out.print("#oooo");
  break;
  case "F":case "f":
  System.out.print("#oooo");
  break;
  case "G":case "g":
  System.out.print("#ooo#");
  break;
  case "H":case "h":
  System.out.print("#ooo#");
  break;
  case "I":case "i":
  System.out.print("oo#oo");
  break;
  case "J":case "j":
  System.out.print("#oo#o");
  break;
  case "K":case "k":
  System.out.print("#oo#o");
  break;
  case "L":case "l":
  System.out.print("#oooo");
  break;
  case "M":case "m":
  System.out.print("#ooo#");
  break;
  case "N":case "n":
  System.out.print("#ooo#");
  break;
  case "O":case "o":
  System.out.print("#ooo#");
  break;
  case "P":case "p":
  System.out.print("#oooo");
  break;
  case "Q":case "q":
  System.out.print("ooo#o");
  break;
  case "R":case "r":
  System.out.print("#oo#o");
  break;
  case "S":case "s":
  System.out.print("oooo#");
  break;
  case "T":case "t":
  System.out.print("oo#oo");
  break;
  case "U":case "u":
  System.out.print("#ooo#");
  break;
  case "V":case "v":
  System.out.print("o#o#o");
  break;
  case "W":case "w":
  System.out.print("#o#o#");
  break;
  case "X":case "x":
  System.out.print("#ooo#");
  break;
  case "Y":case "y":
  System.out.print("oo#oo");
  break;
  case "Z":case "z":
  System.out.print("#oooo");
  break;
  case "0":
  System.out.print("#ooo#");
  break;
  case "1":
  System.out.print("oo#oo");
  break;
  case "2":
  System.out.print("o#ooo");
  break;
  case "3":
  System.out.print("#ooo#");
  break;
  case "4":
  System.out.print("oooo#");
  break;
  case "5":
  System.out.print("#ooo#");
  break;
  case "6":
  System.out.print("#ooo#");
  break;
  case "7":
  System.out.print("#oooo");
  break;
  case "8":
  System.out.print("#ooo#");
  break;
  case "9":
  System.out.print("ooo#o");
  break;
  }
  }
  public static void play7 (String name) {
    switch (name) {
  case "A":case "a":
  System.out.print("#ooo#");
  break;
  case "B":case "b":
  System.out.print("####o");
  break;
  case "C":case "c":
  System.out.print("o###o");
  break;
  case "D":case "d":
  System.out.print("###oo");
  break;
  case "E":case "e":
  System.out.print("#####");
  break;
  case "F":case "f":
  System.out.print("#oooo");
  break;
  case "G":case "g":
  System.out.print("o####");
  break;
  case "H":case "h":
  System.out.print("#ooo#");
  break;
  case "I":case "i":
  System.out.print("o###o");
  break;
  case "J":case "j":
  System.out.print("o##oo");
  break;
  case "K":case "k":
  System.out.print("#ooo#");
  break;
  case "L":case "l":
  System.out.print("#####");
  break;
  case "M":case "m":
  System.out.print("#ooo#");
  break;
  case "N":case "n":
  System.out.print("#ooo#");
  break;
  case "O":case "o":
  System.out.print("o###o");
  break;
  case "P":case "p":
  System.out.print("#oooo");
  break;
  case "Q":case "q":
  System.out.print("oooo#");
  break;
  case "R":case "r":
  System.out.print("#ooo#");
  break;
  case "S":case "s":
  System.out.print("o###o");
  break;
  case "T":case "t":
  System.out.print("oo#oo");
  break;
  case "U":case "u":
  System.out.print("o###o");
  break;
  case "V":case "v":
  System.out.print("oo#oo");
  break;
  case "W":case "w":
  System.out.print("o#o#o");
  break;
  case "X":case "x":
  System.out.print("#ooo#");
  break;
  case "Y":case "y":
  System.out.print("oo#oo");
  break;
  case "Z":case "z":
  System.out.print("#####");
  break;
  case "0":
  System.out.print("o###o");
  break;
  case "1":
  System.out.print("o###o");
  break;
  case "2":
  System.out.print("#####");
  break;
  case "3":
  System.out.print("o###o");
  break;
  case "4":
  System.out.print("oooo#");
  break;
  case "5":
  System.out.print("o###o");
  break;
  case "6":
  System.out.print("o###o");
  break;
  case "7":
  System.out.print("#oooo");
  break;
  case "8":
  System.out.print("o###o");
  break;
  case "9":
  System.out.print("o##oo");
  break;
  }
  }
}
