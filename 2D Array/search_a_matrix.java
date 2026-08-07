public class search_a_matrix {
    public static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15}};
        int target=4;
        System.out.println(matrix[0].length);
        System.out.println(search(matrix, target));
    }

    public static boolean search(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while (i<matrix.length && j>=0) {
            if (matrix[i][j]>target) {
                j--;
            }
            else if (matrix[i][j]<target) {
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
