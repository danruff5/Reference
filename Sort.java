package UsefullFiles;

/**
 * Bunch of sorting algorithms.
 * @author DanielKrauskopf
 */
public class Sort {

    /**
     * Swaps values in an String array.
     * @param toSwap The array to use for swapping.
     * @param indexOne The first index location to swap.
     * @param indexTwo The second index location to swap.
     */
    public static void swap(String[] toSwap, int indexOne, int indexTwo) {
        String temp = toSwap[indexOne];
        toSwap[indexOne] = toSwap[indexTwo];
        toSwap[indexTwo] = temp;
    }

    /**
     * Swaps values in an Integer array.
     * @param toSwap The array to use for swapping.
     * @param indexOne The first index location to swap.
     * @param indexTwo The second index location to swap.
     */
    public static void swap(int[] toSwap, int indexOne, int indexTwo) {
        int temp = toSwap[indexOne];
        toSwap[indexOne] = toSwap[indexTwo];
        toSwap[indexTwo] = temp;
    }

    public static void swap(double[] toSwap, int indexOne, int indexTwo) {
        double temp = toSwap[indexOne];
        toSwap[indexOne] = toSwap[indexTwo];
        toSwap[indexTwo] = temp;
    }

    /**
     * Uses Cocktail sort.
     * @param toSort The integer array thats to be sorted.
     * @return The sorted array.
     */
    public static int[] cocktail(int[] toSort) {
        int count = toSort.length - 1;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int up = 0; up < count; up++) {
                if (toSort[up] > toSort[up + 1]) {
                    Sort.swap(toSort, up, up + 1);
                    sorted = false;
                }
            }
            for (int down = count; down > 0; down--) {
                if (toSort[down] < toSort[down - 1]) {
                    Sort.swap(toSort, down, down - 1);
                    sorted = false;
                }

            }
            count--;
        }
        return toSort;
    }

    /**
     * Uses bubble sort.
     * @param toSort The integer array thats to be sorted.
     * @return The sorted array.
     */
    public static int[] bubble(int[] toSort) {
        boolean sorted = false;
        int count = toSort.length - 1;
        while (!sorted) {
            sorted = true;
            for (int up = 0; up < count; up++) {
                if (toSort[up] > toSort[up + 1]) {
                    Sort.swap(toSort, up, up + 1);
                    sorted = false;
                }
            }
            count--;
        }
        return toSort;
    }

    /**
     * uses bubble sort.
     * @param toSort The double array to sort.
     * @return The sorted array
     */
    public static double[] bubble(double[] toSort) {
        boolean sorted = false;
        int count = toSort.length - 1;
        while (!sorted) {
            sorted = true;
            for (int up = 0; up < count; up++) {
                if (toSort[up] > toSort[up + 1]) {
                    Sort.swap(toSort, up, up + 1);
                    sorted = false;
                }
            }
            count--;
        }
        return toSort;
    }

    /**
     * Uses bubble sort.
     * @param toSort The string array thats to be sorted.
     * @return The sorted array.
     */
    public static String[] bubble(String[] toSort) {
        boolean sorted = false;
        int count = toSort.length - 1;
        while (!sorted) {
            sorted = true;
            for (int up = 0; up < count; up++) {
                if (toSort[up].compareToIgnoreCase(toSort[up + 1]) > 0) {
                    Sort.swap(toSort, up, up + 1);
                    sorted = false;
                }
            }
            count--;
        }
        return toSort;
    }

    /**
     * Sorts Two dimensional array based on the second dimension.
     * @param toSort The two dimensional array to sort.
     * @return the sorted array.
     */
    public static String[][] bubble(String[][] toSort) {
        boolean sorted = false;
        int count = toSort[0].length;
        while (!sorted) {
            sorted = true;
            for (int up = 0; up < count; up++) {
                if (toSort[0][up].compareToIgnoreCase(toSort[0][up + 1]) > 0) {
                    Sort.swap(toSort[0], up, up + 1);
                    Sort.swap(toSort[1], up, up + 1);
                    sorted = false;
                }
            }
            count--;
        }
        return toSort;
    }

    /**
     * Sorts Two dimensional array based on the second dimension. (integer)
     * @param toSort The two dimensional array to sort.
     * @return the sorted array.
     */
    public static String[][] bubbleOther(String[][] toSort) {
        boolean sorted = false;
        int count = toSort[0].length;
        while (!sorted) {
            sorted = true;
            for (int up = 0; up < count; up++) {
                if (Integer.parseInt(toSort[0][up]) > Integer.parseInt(toSort[0][up + 1])) {
                    Sort.swap(toSort[0], up, up + 1);
                    Sort.swap(toSort[1], up, up + 1);
                    sorted = false;
                }
            }
            count--;
        }
        return toSort;
    }
}
