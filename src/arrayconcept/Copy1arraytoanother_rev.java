package arrayconcept;

public class Copy1arraytoanother_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] originalArray = {"gita", "anu", "sita", "manu"}; // Example original array
	        String[] reversedArray = new String[originalArray.length]; // Array to store reversed values

	        // Copying values in reverse order
	        for (int i = 0; i < originalArray.length; i++) {
	            reversedArray[i] = originalArray[originalArray.length - 1 - i];
	        }

	        // Displaying original array
	        System.out.print("Original array: ");
	        for (String num : originalArray) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Displaying reversed array
	        System.out.print("Reversed array: ");
	        for (String num : reversedArray) {
	            System.out.print(num + " ");
	}
	}
}
