
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {10, 9, 17, 23, 1, 100};
		for(int i = 1; i<arr.length; i++) {
			boolean flag = false;
			for(int j = 0; j<arr.length-i-1; j++) {
				
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false) {
				break;
			}
		}
		for(int i : arr) {
			System.out.println(i);
		}
		
	}

}
