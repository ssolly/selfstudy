package selfstudy;

public class StudyInnerLoop {

	public static void main(String args[]) {
		
		/*
		 [day06_while] Quiz05 
		  2. ���� �ﰢ�� �����
		  *
		  **
		  ***
		  *****
		 */
		for(int i=1; i<5; i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 [day06_while] Quiz05 
		  3. ���� ���ﰢ�� �����
		  *****
		  ****
		  ***
		  **
		  *
		 */
		for(int i=1; i<6; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
