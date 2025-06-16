package week2.day1;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
	String text = "We learn Java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		
for (int i = 0; i < split.length; i++) {
	
	int count = 0;
	for (int j = 0; j < split.length; j++) {
		
		if (split[i].equalsIgnoreCase(split[j])) {
		
		 count++;
		 if (count>1) {
			 split[j]= " ";
		
		 }
		 
		}
		
	}
	
	System.out.print(split[i]+" ");
	
	}
	}
	}


