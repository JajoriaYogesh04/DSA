public class Loops{
    public static void main(String[] args) {
        // for(int i=0; i<5; i++){                 //Simple Loops
        //     System.out.println(i);
        // }

        // for(int i=0; i<5; i++){                     //Nested Loops 1
        //     for(int j=i+1; j<5; j++){
        //         System.out.println(i+" "+j);
        //     }
        // }

        for(int i=0; i<5; i++){                        //Nested Loops 2
            for(int j=0; j<i; j++){
                System.out.println(i+" "+j);
            }
        }
    }
}