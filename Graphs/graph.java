import java.util.*;
public class graph{
    HashMap<Integer, HashMap<Integer, Integer>> map;
    public graph(int v){
        map=new HashMap<>();
        for (int i = 1; i <=v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void AddVertex(int v){
        map.put(v, new HashMap<>());
    }

    public boolean containsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2);
    }

    public boolean containVertex(int v1){
        return map.containsKey(v1);
    }

    public int noOfEdge(){
        int sum=0;
        for(int key:map.keySet()){
            sum+=map.get(key).size();
        }
        return sum/2;
    }

    public void removeEdge(int v1, int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void removeVertex(int v1){
        for(int nbrs: map.get(v1).keySet()){
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);
    }

    public void display(){
        for(int key:map.keySet()){
            System.out.println(key +" "+ map.get(key));
        }
    }

    public boolean haspath(int src, int des, HashSet<Integer> visited){
       if (src==des) {
         return true;
       }
       visited.add(src);
       for(int nbrs: map.get(src).keySet()){
       if (!visited.contains(nbrs)) {
         boolean ans=haspath(nbrs, des, visited);
         if (ans) {
             return ans;
         }
       }
       }
       return false;
    }
    public void printpath(int src, int des, HashSet<Integer> visited, String ans){
       if (src==des) {
         System.out.println(ans+des);
         return ;
       }
       visited.add(src);
       for(int nbrs: map.get(src).keySet()){
       if (!visited.contains(nbrs)) {
       printpath(nbrs, des, visited, ans+src);
       }
       }
       visited.remove(src);
    }

    public boolean BFS(int src, int des){
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
        //1.remove
        int rv=q.poll();

        //2.ignore
        if (visited.contains(rv)) {
            continue;
        }
        //3.add visited to the set
        visited.add(rv);

        //4.self work
        if (rv==des) {
            return true;
        }
        //5.add unvisited
        for(int nbrs:map.get(rv).keySet()){
           if (!visited.contains(nbrs)) {
             q.add(nbrs);
           }
        }
    }
    return false;
    }
    public boolean DFS(int src, int des){
        HashSet<Integer> visited=new HashSet<>();
        Stack<Integer> st=new Stack<>();
        st.push(src);
        while (!st.isEmpty()) {
        //1.remove
        int rv=st.pop();

        //2.ignore
        if (visited.contains(rv)) {
            continue;
        }
        //3.add visited to the set
        visited.add(rv);

        //4.self work
        if (rv==des) {
            return true;
        }
        //5.add unvisited
        for(int nbrs:map.get(rv).keySet()){
           if (!visited.contains(nbrs)) {
             st.push(nbrs);
           }
        }
    }
    return false;
    }
 public static void main(String[] args) {
    graph g=new graph(7);
    g.AddEdge(1, 4, 6);
    g.AddEdge(1, 2, 10);
    g.AddEdge(2, 3, 7);
    g.AddEdge(3, 4, 5);
    g.AddEdge(4, 5, 1);
    g.AddEdge(5, 6, 4);
    g.AddEdge(7, 5, 2);
    g.AddEdge(6, 7, 3);
    // g.removeVertex(1);
    g.display();
    System.out.println(g.haspath(1, 4, new HashSet<>()));
     g.printpath(1, 4, new HashSet<>(), "");
 }
}