public class FindTheSums {

	public static String arrayToString(int[][] a) {
		String array = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				array = array + a[i][j] + " ";
			}
			if (i < a.length - 1) {
				array = array + a[i][a[i].length - 1] + "\n";
			}
		}
		array = array + a[a.length - 1][a[0].length - 1];
		return array;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] array = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				array[i][j] = 0;
			}
		}
		int position = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			while (position != a[i].length) {
				for (int j = position; j < a[i].length; j++) {
					sum = sum + a[i][j];
					if (sum == sumToFind) {
						for (int k = position; k <= j; k++) {
							array[i][k] = a[i][k];
						}
					}
				}
				sum = 0;
				position++;
			}
			position = 0;
		}
		return array;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] array = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				array[i][j] = 0;
			}
		}
		int position = 0;
		int sum = 0;
		for (int i = 0; i < a[0].length; i++) {
			while (position != a.length) {
				for (int j = position; j < a.length; j++) {
					sum = sum + a[j][i];
					if (sum == sumToFind) {
						for (int k = position; k <= j; k++) {
							array[k][i] = a[k][i];
						}
					}
				}
				sum = 0;
				position++;
			}
			position = 0;
		}
		return array;
	}

}