//Done by Neba Emmanuel
//Look me up on https://github.com/Neba-Emmanuel/

public class diamondPattern{
    public static void main(String args[]){
        int size = 4;
        int i,j,k;
        for(i = size; i >= size; i--){
            for(j = 1; j <= math.abs(i); j++){
                System.out.println("");
            }
            for(k = size; k >= Math.abs(i); k--){
                System.out.println("* "); //space after *
            }
            System.out.println();
        }        
    }
}