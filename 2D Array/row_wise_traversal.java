import java.util.ArrayList;

public class row_wise_traversal { 
    public void twoDimensional(ArrayList<ArrayList<Integer>> mat) {
        // code here
        for(int i = 0; i < mat.size(); i++){
            for(int j = 0; j < mat.get(i).size(); j++){
                System.out.print(mat.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

//GFG:-................................................................................
// For ArrayList, use:

// mat.size() → number of rows
// mat.get(i).size() → number of columns
// mat.get(i).get(j) → element at row i, column j
