import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class graph_valid_tree {
    class solution{
        public boolean validTree(int n, int[][] edges) {
         HashMap<Integer, List<Integer>> map=new HashMap<>();
         for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
         }
         for (int i = 0; i < edges.length; i++) {
            int v1=edges[i][0];
            int v2=edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
         }
          Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        int c=0;
        for(int key:map.keySet()){
            if (visited.contains(key)) {
                continue;
            }
            c++;
            q.add(key);
            while (!q.isEmpty()) {
                //1.rmeove
                int rv=q.poll();

                //2.ignore
                if (visited.contains(rv)) {
                    return false;
                }

                //3.add visited
                visited.add(rv);

                //5.add unvisited
                for(int nbrs:map.get(rv)){
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        return c==1;
    }
    
    }
}
