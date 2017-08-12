
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 9, 17, 23, 1, 53};
		for(int i = 1; i<arr.length; i++) {
			int val = arr[i];
			int index = i;
			while(index>0 && arr[index-1] > val) {
				arr[index] = arr[index-1];
				index--;
			}
			arr[index] = val;
		}
		for(int i : arr) {
			System.out.println(i);
		}


	}

}
