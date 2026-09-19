public class container_with_most_water {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
   System.out.println(max_water(arr));
    }
    public static int max_water(int[] height){
         int i=0;
        int j=height.length-1;
        int area=0;
        int ans=0;
        while(i<j){
            //cal area
         int small=Math.min(height[i], height[j]);
         area=small*(j-i);
         //cal the ans
         ans=Math.max(ans, area);
         if(height[i]<height[j]){
            //moving the pointers
            i++;
         }
            else{
                j--;
            }
        }
        return ans;
    }
}
