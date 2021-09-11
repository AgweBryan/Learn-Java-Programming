//Done by Neba Emmanuel
//Look me up on https://github.com/Neba-Emmanuel/

public class pyramidPattern{
    public static void main(String args[]){
        int min_stars = 1;
        int p_height = 5;
        int p_space = p_height - 1;
        for(int i = 0; i < p_height; i++){
            for(int j = p_space; j > i; j--){
                System.out.println("");
            }
            for(int k = 0; k < min_stars; k++){
                System.out.println("*")
            }
            min_stars += 2;
            System.out.println();
        }
    }
}

/*         OutPut
              *
           *  *  *
        *  *  *  *  *
     *  *  *  *  *  *  *
  *  *  *  *  *  *  *  *  *

*\        