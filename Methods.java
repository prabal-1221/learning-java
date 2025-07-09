public class Methods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(arr));

        String name = "otaku";
        System.out.println(changeName(name));
        System.out.println(name);

        Cat cat = new Cat();
        cat.name = "smthg";
        Cat newCat = newCat(cat);
        System.out.println(newCat.name);
        System.out.println(cat.name);

        /*
         * ==== MEMORY WALKTHROUGH ====
         *
         * Case 1: String
         *
         * main stack:
         *   name → 0xABC → "otaku" (on heap)
         *
         * when calling changeName(name):
         *   stack frame:
         *     name' → 0xABC → "otaku"
         *
         * then:
         *   name' = "not " + name'; // allocates new string
         *   name' → 0xDEF → "not otaku"
         *
         * after method returns:
         *   main.name still → 0xABC → "otaku"
         *
         * -----
         *
         * Case 2: Cat
         *
         * main stack:
         *   cat → 0x123 → Cat {
         *                     name → 0xABC → "smthg"
         *                   }
         *
         * when calling newCat(cat):
         *   stack frame:
         *     cat' → 0x123 → Cat {
         *                         name → 0xABC → "smthg"
         *                       }
         *
         * then:
         *   cat'.name = cat'.name.toUpperCase();
         *   // creates new string
         *   heap:
         *     0x999 → "SMTHG"
         *   and assigns:
         *     cat'.name → 0x999
         *
         * after method returns:
         *   main.cat → 0x123 → Cat {
         *                           name → 0x999 → "SMTHG"
         *                         }
         *
         * -----
         *
         * ✅ In both cases, Java copies the reference (memory address) into the method.
         * ✅ For String: reassigning local reference doesn’t affect caller.
         * ✅ For Cat: mutating shared object does affect caller.
         * ✅ Strings are immutable — so toUpperCase() or "not " + name always creates a new String object.
         */

        System.out.println(coolSum(1, 2, 3));
        System.out.println(coolSum(1, 2, 3, 4, 5, 6, 7));

        System.out.println(isPrime(100102));
        System.out.println(isPrime(100103));
    }

    private static Cat newCat(Cat cat) {
        cat.name = cat.name.toUpperCase();
        return cat;
    }

    private static String changeName(String name) {
        name = "not " + name;
        return name;
    }

    public static int sum(int[] arr) {
        int res = 0;
        for (int num : arr) {
            res += num;
        }
        return res;
    }

    public static int coolSum(int ...a) {
        int res = 0;
        for (int num: a) {
            res += num;
        }
        return res;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        boolean[] nums = new boolean[num+1];
        for (int i=0; i<=num; i++) {
            nums[i] = true;
        }
        nums[0] = false;
        nums[1] = false;

        for (int i=2; i*i <= num; i++) {
            if (nums[i]) {
                nums[i] = false;
                for (int j=i*i; j <= num; j+=i) {
                    nums[j] = false;
                }
            }
        }

        return nums[num];
    }
}
