package com.brush_up.problem;

public class 최빈값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
		// 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
		// 최빈값이 여러 개면 -1을 return 합니다.

		int[] data = { 1,1,2,2,3};
		int mode = 0; // 최빈값
		int arrayMax = 0; // 배열의 최대값
		for (int i = 0; i < data.length; i++) {
			if (arrayMax < data[i]) {
				arrayMax = data[i];
			}
		}
		int[] count = new int[arrayMax + 1]; // 최대값 +1

		for (int i = 0; i < count.length; i++) {
			count[data[i]]++; // 특정값 순서에 1 씩추가
			
		}
		int countMax = 0;
		for (int i = 0; i < count.length; i++) {
			
			if (countMax < count[i]) {
				countMax = count[i];
				mode = i;
			}

		}
		int rep = 0;
		for (int i = 0; i < count.length; i++) {
			if (countMax == count[i]) {
                   rep++;
			}
		}
if (rep!=1) {
	mode=-1;
}
System.out.println(mode);
	}

}
