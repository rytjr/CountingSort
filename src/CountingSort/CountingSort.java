package CountingSort;

import java.util.*;
import java.io.*;

//카운팅 정렬은 주어지는 정수의 범위가 한정정일 때 유용하다 이유는 구해야 하는 정수 + 1만큼 배열을 만들기 때문이다.

public class CountingSort {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int Num = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[Num];
		
		for(int i =0; i < Num; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int i : arr) {
			arr[i]++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0 ; i < Num; i++) {
			while(arr[i] > 0) {
				sb.append(arr[i]).append("\n");
			}
		}
	}

}
