public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = {1, 3, 5, 7, 9};

//        for (int i=0; i<arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }
//
//        for (int num: arr2) {
//            System.out.println(num);
//        }

        int[][] arr2d = new int[3][];
        arr2d[0] = new int[] {1, 2, 3};
        arr2d[1] = new int[] {1, 2, 3, 4, 5, 6};
        arr2d[2] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
