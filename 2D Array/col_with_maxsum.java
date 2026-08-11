public class col_with_maxsum {
    public static void main(String[] args) {
                 int[][] mat={{1,2,3}, {4,5,6},{7,8,9}};
        int sum=0;
        int ans=-1;
        int maxsum=0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
              
                sum+=mat[j][i];
                
            }
           if (sum>maxsum) {
            ans=i;
            maxsum=sum;
           }
           
           sum=0;
            
           
            
        }
        System.out.println(maxsum);
        System.out.println(ans);
      
    }
}
