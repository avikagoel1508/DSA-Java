import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class is_bipartite {
    public boolean isbipartite(int[][] graph){
          Queue<bipartite> q=new LinkedList<>();
          HashMap<Integer, Integer> map=new HashMap<>();
          for (int key = 0; key < graph.length; key++) {
            if (map.containsKey(key)) {
                continue;
            }
            q.add(new bipartite(key, 0));
            while (!q.isEmpty()) {
                //1. remove
                bipartite rp=q.poll();

                //2. ignore
                if (map.containsKey(rp.vtx)) {
                    if (map.get(rp.vtx)!=rp.dis) {
                        return false;
                    }
                    continue;
                }

                //3. add visited
                map.put(rp.vtx, rp.dis);
                //4. self work(nothign here)
                //5. add unvisited
                for(int nbrs:graph[rp.vtx]){
                    if (!map.containsKey(nbrs)) {
                        q.add(new bipartite(nbrs, rp.dis+1));
                    }
                }

            }

          }
          return true;
    }
    public class bipartite{
        int vtx;
        int dis;
        public bipartite(int vtx, int dis){
               this.vtx=vtx;
               this.dis=dis;
        }
    }
}
