import java.util.Arrays;

public class A {
    public static void printA() {
        System.out.println("A");
    }

    public static String listNums(int x) {
        String res = "";
        for (int i = 0; i <= x; i++) {
            res += String.format("%d ", i);
        }
        return res;
    }

    public static String reverseListNums(int x) {
        StringBuilder res = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            res.append(String.format("%d ", i));
        }
        return res.toString();
    }

    public static String chet(int x) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            res.append(String.format("%d ", i));
        }
        return res.toString();
    }

    public static int pow(int x, int y) {
        int res = 1;
        for (int i = 0; i < y; i++) {
            res *= x;
        }
        return res;
    }

    public static int numLen(long x) {
        int i = 0;
        while (x > 0) {
            i++;
            x /= 10;
        }
        return i;
    }

    public static boolean equalNum(int x) {
        String str = String.valueOf(x);
        char firstChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != firstChar) {
                return false;
            }
        }
        return true;
    }

    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if ((x - i) <= j + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        int x = sc.nextInt();
        while (x != randomNum) {
            if (x > 9) {
                System.out.println("OMG, you're so stupid.");
            } else {
                System.out.println("No, try again");
            }
            x = sc.nextInt();
        }
        System.out.println("Yes, it`s " + randomNum);
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int maxAbs(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = (arr[i] < 0) ? -arr[i] : arr[i];
            int y = (tmp < 0) ? -tmp : tmp;
            if (x > y) {
                tmp = arr[i];
            }
        }
        return tmp;
    }

    public static int countPositive(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array can't ba nnull lol");
        }
        int tmp = 0;
        for (int i : arr) {
            if (i >= 0) {
                tmp += 1;
            }
        }
        return tmp;
    }

    public static boolean palindrom(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array can't be null, such a L");
        }
        int j = arr.length - 1;
        for (int i = 0; i <= j; i++) {
            if (arr[i] != arr[j--]) {
                return false;
            }
        }
        return true;
    }

    public static void reverse(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array can't be null, such a L");
        }

        int n = (arr.length - 1) / 2;
        int j = arr.length - 1;

        for (int i = 0; i < n; i++) {
            int x = arr[j];
            arr[j--] = arr[i];
            arr[i] = x;
        }
        System.out.printf("Результат: %s", Arrays.toString(arr));
    }

    public static int[] reverseBack(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array can't be null, such a L");
        }

        int j = arr.length - 1;
        int n = j / 2;
        int[] aaa_yapsih = new int[arr.length];

        for (int i = 0; i <= n; i++) {
            int x = arr[j];
            aaa_yapsih[j--] = arr[i];
            aaa_yapsih[i] = x;
        }

        return aaa_yapsih;
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        var res = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, res, 0, arr1.length);
        System.arraycopy(arr2, 0, res, arr1.length, arr2.length);
        return res;
    }

    public static int[] findAll(int[] arr, int x) {
        var res1 = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                res1[k++] = i;
            }
        }
        var res = new int[k];
        System.arraycopy(res1, 0, res, 0, k);
        return res;
    }

    /*Необходимо реализовать метод таким образом,
    чтобы он возвращал новый массив,
    в котором записаны все элементы массива arr, кроме отрицательных.
     */
    public static int[] deleteNegative(int[] arr) {
        var res1 = new int[arr.length];
        int k = 0;
        for (int i : arr){
            if(i>=0){
                res1[k++] = i;
            }
        }
        var res = new int[k];
        System.arraycopy(res1, 0,res,0,k);
        return res;
    }

    /*
    Необходимо реализовать метод таким образом,
    чтобы он возвращал новый массив,
    который будет содержать все элементы массива arr,
    но в позицию pos будет вставлено значение x.
     */
    public static int[] add(int[] arr, int x, int pos) {
        var res =new int[arr.length];
        System.arraycopy(arr, 0, res,0,arr.length);
        if (pos<arr.length){
            res[pos]=x;
            return res;
        }
        System.out.println("man, pos is too big");
        return res;
    }

    /*
    Необходимо реализовать метод таким образом,
    чтобы он возвращал новый массив,
    который будет содержать все элементы массива arr,
    но в позицию pos будут вставлены значения массива ins.
     */
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] res = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, res, 0, pos);
        System.arraycopy(ins, 0, res, pos, ins.length);
        System.arraycopy(arr, pos, res, pos+ins.length, arr.length-pos);
        return res;
    }



}
