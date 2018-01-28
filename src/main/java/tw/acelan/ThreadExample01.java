package tw.acelan;

public class ThreadExample01 {
	public static void main(String[] args){
		int count1 = 0;
		int count2 = 0;
		
		for(int i=1;i<=10;i++){
			count1 = count1 + 1;
			System.out.println("count1="+count1);
		}
		
		for(int i=1;i<=10;i++){
			count2 = count2 + 1;
			System.out.println("count2="+count2);
		}
		
	}
}
