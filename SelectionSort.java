
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,7,8,10,0,14};
		for(int i = 0; i<arr.length-1; i++) {
			int min = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min]   = temp;
		}
		for(int i: arr) {
			System.out.println(i);
		}

	}

}
