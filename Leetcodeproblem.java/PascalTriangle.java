import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public static void main(String[] args) {
        //new constructor calllll ho raha hai
        //obj.generate(numRows);
        //obj = PascalTriangle ka object
        //obj.generate() = class ke andar defined method
        //object banaya gaya hai non static method ko call karne ke liye
        //kyoki non static method ko ham direct call nah kar sakten hain
        PascalTriangle obj = new PascalTriangle();

        int numRows = 5;   // yahan change karke test kar sakte ho
        List<List<Integer>> result = obj.generate(numRows);
        //array list of integer List<List<Integer>>

        // print Pascal Triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle  = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add( triangle.get(i-1).get(j-1)+ triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
            
        }
        return triangle;
    }
}
