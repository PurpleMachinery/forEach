package teste;

public class App {
	public static void main(String[] args) {
		int[][] map = new int[10][10];
		int kk = 1;
		for (int i = 0; i < 10; i++) {
			for (int ii = 0; ii < 10; ii++) {
				map[i][ii] = kk;
				kk++;
			}
		}
		for (int[] x : map) {
			for(int i : x) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}