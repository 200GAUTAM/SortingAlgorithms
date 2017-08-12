class Sort {
	int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int index = start;
		for(int i = start; i<end; i++) {
			if(arr[i] <= pivot) {
				
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index++;
			}
		}
		
		int temp = arr[index];
		arr[index] = arr[end];
		arr[end] = temp;
		return index++;
		
		
	}
	void sort(int[] arr, int start, int end) {
		if(start<end) {
			int index = partition(arr, start, end);
			sort(arr,start, index-1);
			sort(arr,index+1, end);
		}
	}
}
public class QuickSort {

	public static void main(String[] args) {
		Sort st = new Sort();
		int[] arr = {8,7,9,0,14,17};
		st.sort(arr,0,5);
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
