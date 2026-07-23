public class book_allocation {
    public static void main(String[] args) {
        int[] pages={10,20,30,40};
        int nos=2;
        System.out.println(max_pages(pages, nos));

    }
    public static int max_pages(int[] pages, int nos){
        int lo=0;
        int sum=0;
        int ans=0;
        for (int i = 0; i < pages.length; i++) {
            sum+=pages[i];
        }
        int hi=sum;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isitpossible(pages, nos, mid)==true){
                ans=mid;
             hi=mid-1;
            }
            else{
                lo=mid+1;
            }   

        }
        return ans;
    }
    public static boolean isitpossible(int[] pages, int nos, int mid) {
       int students=1;
       int readpages=0;
       int i=0;
       while(i<pages.length){
        if (readpages+pages[i]<=mid) {
            readpages+=pages[i];
            i++;
        }
        else{
            readpages=0;
            students++;
        }
        if (students>nos) {
            return false;
        }
       }
       return true;
    }
}
