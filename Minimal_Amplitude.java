import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = { 5, 6, 7};

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        for(int n : result)
            System.out.print(n + " ");
    }
}
