public class Tugas1 {
  public static void main(String[] args) {
 	int baris = 5;

 	int a = 1;
 	while (a <= baris) {
 	int j = 1;
 	  while (j <= a) {
		System.out.print(" "+j);
 		j++;
 	  }
 		System.out.println();
 		a++;
 	 }

	 a = baris - 1;
	 while (a >= 1) {
	 int j = 1;
	   while (j <= a) {
		 System.out.print(" "+j);
		 j++;
	   }
		 System.out.println();
		 a--;
	 }
  }
}