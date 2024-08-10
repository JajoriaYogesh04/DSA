public class LaxicographicallyLargestString{
    public static void main(String args[]){
        String fruits[]= {"Mango", "Apple", "banana", "papaya", "orange", "pomogranate"};
        String largestString= fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largestString.compareTo(fruits[i])<0){
                largestString= fruits[i];
            }
            // if(largestString.compareToIgnoreCase(fruits[i])<0){
            //     largestString= fruits[i];
            // }
        }
        System.out.println(largestString);

        // String str1= "apple";
        // String str2= "Mango";
        // System.out.print(str1.compareTo(str2));
    }
}