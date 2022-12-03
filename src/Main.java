
public class Main {

	public static void main(String[] args) {
		
		int n1 =10;
		int n2 =20;
		int n3 =30;
		
		System.out.println("3번씩 반복");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		System.out.println("일반 for문 사용");
		
		int [] arr = new int [3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i = 0; i< arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		System.out.println("향상된for문 사용");
		//향상된 for문은 스스로 알아서 범위를 처음부터 끝까지 지정해준다
		//개발자가 범위를 스스로 지정할수 없다 
		for (int n : arr) {
			
		System.out.println(n);			
		}
		
	}

}
