
public class largestelement {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 89, 12, 90};

        int largest = arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element is : " + largest);
    }
}
