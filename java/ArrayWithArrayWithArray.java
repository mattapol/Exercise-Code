class ArrayWithArray {
    public static void main(String[] args) {

        // Create array of arrays
        int[][][] t = { 
                        { { 0, 1 }, { 2, 3 } },
                        { { 4 }, { 5, 6, 7 } },
                        { { }, { 8, 9 }}
                    };

        System.out.println(t.length);  // 3
        System.out.println(t[0].length); // 2
        System.out.println(t[1][1].length);
        System.out.println(t[1][1][2]);

        int sum = 0;

        for (int i = 0; i < t.length; i++) {

            for (int j = 0; j < t[i].length; j++) {
                int x = t[i][j];
                sum += x;
            }
        }

        System.out.println(sum);

    }
}
