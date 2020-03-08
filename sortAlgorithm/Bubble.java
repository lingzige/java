
/*

冒泡排序；int[] arr = new int[]{3,6,7,4,2,5,1,9,0};
*/

public class Bubble{
	public int[] sort(int[] arr){
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

	}
}