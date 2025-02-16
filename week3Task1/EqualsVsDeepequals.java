package Task1;

import java.util.Arrays;
import java.util.Objects;

public class EqualsVsDeepequals {
    public static void main(String[] args) {
        // Primitive array
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        // Object array
        Integer[] objArr1 = {1, 2, 3};
        Integer[] objArr2 = {1, 2, 3};

        // Regular equals() - compares references for arrays
        System.out.println("arr1.equals(arr2): " + arr1.equals(arr2)); // false
        System.out.println("objArr1.equals(objArr2): " + objArr1.equals(objArr2)); // false

        // deepEquals() - performs deep content comparison
        System.out.println("Objects.deepEquals(arr1, arr2): " + Objects.deepEquals(arr1, arr2)); // true
        System.out.println("Objects.deepEquals(objArr1, objArr2): " + Objects.deepEquals(objArr1, objArr2)); // true

        // Arrays.equals() also works for one-dimensional arrays
        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2)); // true
        System.out.println("Arrays.equals(objArr1, objArr2): " + Arrays.equals(objArr1, objArr2)); // true

        // Deep comparison for nested arrays
        Integer[][] nestedArr1 = {{1, 2}, {3, 4}};
        Integer[][] nestedArr2 = {{1, 2}, {3, 4}};

        System.out.println("nestedArr1.equals(nestedArr2): " + nestedArr1.equals(nestedArr2)); // false
        System.out.println("Objects.deepEquals(nestedArr1, nestedArr2): " + Objects.deepEquals(nestedArr1, nestedArr2)); // true
        System.out.println("Arrays.deepEquals(nestedArr1, nestedArr2): " + Arrays.deepEquals(nestedArr1, nestedArr2)); // true
    }
}



