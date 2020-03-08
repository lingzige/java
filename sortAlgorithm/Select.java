/*

选择排序
*/

public class Select{
	public void sort(){
		int[] arr = new int[]{3,6,7,4,2,5,1,9,0};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
	}
}