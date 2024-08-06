class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr1=Arrays.stream(nums1).filter((e)-> e!=0).toArray();
        int[] arr2=Arrays.stream(nums2).filter((e)-> e!=0).toArray();
        int left=arr1.length-1;
        int right=0;
        while(left>=0 && right<n){
            if(arr1[left]>=arr2[right]){
                swap(arr1,arr2,left,right);
            }
            else{
                break;
            }
            left--;
            right++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    private void swap(int[] arr1,int[] arr2, int i, int j){
        int temp=arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=temp;
    }
    private void print(int[] b){
        for(int i:b){
            System.out.print(String.valueOf(i)+" ");
        }
        System.out.println();
    }
}
