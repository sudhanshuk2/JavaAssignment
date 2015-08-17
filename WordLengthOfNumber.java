import java.util.*;
public class WordLengthOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		m1.put(1,3);
		m1.put(2,3);
		m1.put(3,5);
		m1.put(4,4);
		m1.put(5,4);
		m1.put(6,3);
		m1.put(7,5);
		m1.put(8,5);
		m1.put(9,4);
		m1.put(10,3);
		m1.put(11,6);
		m1.put(12,6);
		m1.put(13,8);
		m1.put(14,8);
		m1.put(15,7);
		m1.put(16,7);
		m1.put(17,9);
		m1.put(18,8);
		m1.put(19,8);
		m1.put(20,6);
		m1.put(30,6);
		m1.put(40,5);
		m1.put(50,5);
		m1.put(60,5);
		m1.put(70,7);
		m1.put(80,6);
		m1.put(90,6);
		m1.put(100,7);
		m1.put(1000,8);
		
		
		
		
		long sum = 0;
		
		for(int i=1; i<=20; i++){
			
			sum = sum + m1.get(i);
		}
		
		System.out.println(sum);
		int rem = 0;
		int quo = 0;
		for(int i=21;i<100; i++){
			
			rem = i % 10;
			quo = i - rem;
			
			sum = sum + m1.get(quo);
			
			if(rem != 0)
				sum = sum + m1.get(rem);
		}
		
		sum = sum + m1.get(100);
		System.out.println(sum);
		
		int rem1 = 0;
//		for(int i=101;i<120;i++){
//			quo = i / 100;
//			sum = sum + m1.get(quo) + m1.get(100) + 3;
//			rem = i % 100;
//			sum = sum + m1.get(rem);
//		}
//		
//		System.out.println(sum);
		
		int quo1;
		for(int i=101;i<1000;i++){
			quo = i / 100;
			sum = sum + m1.get(quo) + m1.get(100) + 3;
			quo1 = i % 100;
			
			if(quo1 == 0){								// for 200, 300, ... cases
				sum = sum - 3;
			}
			else if(quo1 > 0 && quo1 <= 20){			
				sum = sum + m1.get(quo1);
			}
			else{
				rem1 = quo1 / 10;
				if(rem1 != 0)
					sum = sum + m1.get(rem1*10);
				
				rem = quo1 % 10;
				
				if(rem != 0)
					sum = sum + m1.get(rem);
			}
		}
		
		sum = sum + m1.get(1000);
		
		System.out.println("No. of Characters from 1 to 1000 in words is : " + sum);
		
	}

}
