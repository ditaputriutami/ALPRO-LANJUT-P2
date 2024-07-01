public class Pola2 {
    public static void main(String[] args) {
        int i,j;
        int d = 5;
           System.out.println("Pengulangan Bersarang Membentuk Pola");
        for(i=4;i>=1;i--){
           for(j=1;j<=i;j++){
             if(i>=j){
                System.out.print(" * ");
             }
           }
	        System.out.println("UTDI ");
        }
    }
}
