/*
插入排序
*/


public class Insert{
	public void sort(){
		nt[] arr = new int[]{3,6,7,4,2,5,1,9,0,10,21,12,11,15};
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            while(j<arr.length){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
	}
}