package examples.exception;

public class Test {


		public static void processArray(int[] values){
	        int sum = 0;
	        int i = 0;
	        try{
	            while(values[i]<100){
	                sum = sum +values[i];
	                i++;
	            }
	        }
	        catch(Exception e){ }
	        System.out.println("sum = "+sum);
				}
		

		public static void main(String[] args) {
		int[] testArray = {6,9,14,7,8,96,678,246,15};
		processArray(testArray);
		}
}
