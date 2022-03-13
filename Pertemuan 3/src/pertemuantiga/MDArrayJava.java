package pertemuantiga;

public class MDArrayJava {
	public static void main(String[] args){
	 //One Dimensional Arrays
	 int[] fisrtArray = {2, 5, 3}; 
	 int[] secondArray = {9, 5, 3}; 
	 int[] thirdArray = {2, 4, 9}; 
	 int[] fourthArray = {10, 11, 12}; 
	 int[] fifthArray = {13, 14, 15}; 
	 int[] sixthArray = {16, 17, 18}; 
	 int[] seventhArray = {19, 20, 21}; 
	 int[] eighthArray = {22, 23, 24}; 
	 int[] ninthArray = {25, 26, 27}; 
	 //Two Dimensional Arrays
	 int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
	 int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
	 int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
	 //Three Dimensional Array
	 int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
	 
	 //output layar array 3 dimensi
	 for (int counter1 = 0; counter1 < 3; counter1++) {
		 System.out.print("\n{");
		 for (int counter2 = 0; counter2 < 3; counter2++) {
			 System.out.print("{");
			 for (int counter3 = 0; counter3 < 3; counter3++) {
				  System.out.print(threeDimensionalArray[counter1][counter2][counter3]);
				  System.out.print(" ");
			 }
			 System.out.print("} ");
		 }
		 System.out.print("} ");
	 }
	 
	 }

}
