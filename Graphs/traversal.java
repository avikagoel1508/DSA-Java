import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class traversal {
     HashMap<Integer, HashMap<Integer, Integer>> map;
    public traversal(int v){
        map=new HashMap<>();
        for (int i = 1; i <=v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void BFT(){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        for(int key:map.keySet()){
            if (visited.contains(key)) {
                continue;
            }
            q.add(key);
            while (!q.isEmpty()) {
                //1.rmeove
                int rv=q.poll();

                //2.ignore
                if (visited.contains(rv)) {
                    continue;
                }

                //3.add visited
                visited.add(rv);

                //4.self work
                System.out.print(rv+" ");

                //5.add unvisited
                for(int nbrs:map.get(rv).keySet()){
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
    }
    public void DFT(){
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        for(int key:map.keySet()){
            if (visited.contains(key)) {
                continue;
            }
            st.add(key);
            while (!st.isEmpty()) {
                //1.rmeove
                int rv=st.pop();

                //2.ignore
                if (visited.contains(rv)) {
                    continue;
                }

                //3.add visited
                visited.add(rv);

                //4.self work
                System.out.print(rv+" ");

                //5.add unvisited
                for(int nbrs:map.get(rv).keySet()){
                    if (!visited.contains(nbrs)) {
                       st.push(nbrs);
                    }
                }
            }
        }
    }
}
