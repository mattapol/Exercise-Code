class ArrayWithBoolean {
    public static void main(String[] args) {
        // [type] [variable name] = [value]
        boolean y = true;

        boolean[] b = { false, true, true, false, true };

        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                System.out.println("Fizz");
            }
            else if (b[i]) {
                System.out.println("Buzz");
            }
        }



    }
}
