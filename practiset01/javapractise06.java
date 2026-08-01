package practiset01;

public class javapractise06 {
    public static void main(String[] args) {

        int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5 } };
        int arr2[] = new int[] { 1, 2, 3 ,4, 5 };

        // 1. int arr[][] = new int[][] {{1,2,3},{4,5}};

        // 2. int arr[][] = {{1,2,3},{4,5}};

        // 3. int arr[][];
        
        // arr = new int[][]{{1,2,3},{4,5}};

        for (int index = 0; index < arr.length; index++) {
            for (int j = 0; j < arr[index].length; j++) {
                System.out.println(arr[index][j]);
            }
        }
    }
}
