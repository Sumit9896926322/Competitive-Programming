package test;

import java.io.*;
import java.util.*;

public class AtCoder3 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public static int[] nextArr() throws IOException {
		String elements[] = br.readLine().split(" ");
		int arr[] = new int[elements.length];
		for (int j = 0; j < elements.length; j++)
			arr[j] = Integer.parseInt(elements[j]);
		return arr;
	}

	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr);
	}

	public static String next() throws IOException {
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {

		int T = nextInt();
		while (T-- > 0) {

			while (T-- > 0) {
				int n = nextInt();
				int arr[] = nextArr();

				for (int i = 0; i < n; i++)
					arr[i] = nextInt();

				int currmax = 0, max = Integer.MIN_VALUE;

				for (int i = 0; i < arr.length; i++) {

					currmax += arr[i];
					max = Math.max(max, currmax);
					if (currmax <= 0)
						currmax = 0;

				}
				System.out.println(max);
		}

	}
}

}
