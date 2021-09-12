class ArrayWithInt {
    public static void main(String[] args) {
        // [type] [variable name] = [value]
        int x = 10;
        boolean y = true;
        double z = 3.141;
        char c = 'X';

        int[] a = { 10, 30, 20, 40, 50, 60 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 30) {
                System.out.println("Hello");
            }
            else {
                System.out.println(a[i]);
            }
        }

    }
}
