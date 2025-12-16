public class findEvendigit {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findEvendigit(arr));
    }
    static int findEvendigit(int[] arr){
        int count =0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigit =0;
        while(num>0){
            num = num/10;
            numberofdigit++;
        }
        return numberofdigit % 2 == 0;
    }
    
}
