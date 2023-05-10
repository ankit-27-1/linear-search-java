public class linear{
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(search(arr,2));
    }
    static int search(int[] arr,int a){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                return i;
            }
        }
        return 0;
    }
}
