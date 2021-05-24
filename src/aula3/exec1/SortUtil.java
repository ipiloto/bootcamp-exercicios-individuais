package aula3.exec1;

public class SortUtil {

	@SuppressWarnings("unchecked")
	public static <T> void sort(Precedente<T> arr[]){
		int n = arr.length;
		Precedente<T> temp = null;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j].precedeA((T) arr[j - 1])) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
