import java.util.*;

public class Main {
	public static void main(String[] args) {
		int N;
		int cnt = 0;
		List<Integer> list = new ArrayList<>();
		int arr[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		//배열 arr에  N을 42로 나눈 나머지 input한 후 list에 넣기
		for(int i=0; i<10; i++) {
			N = sc.nextInt();
			arr[i] = N%42;
			list.add(arr[i]);
		}
		
		Set<Integer> set = new HashSet<Integer>(list);
		for(Integer num : set) {
			//중복되지 않는 나머지의 개수
			if(num==0 && Collections.frequency(list, num)==10) {
				cnt = 1;
			}else {
				cnt = set.size();
			}
		}
		System.out.println(cnt);
	}	
}