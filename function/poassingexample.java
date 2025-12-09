public class poassingexample {
    public static void main(String[] args) {
        String name = "Gaurav Kumar";
        greet(name);
    }
    static void greet(String ram){
        System.out.println(ram);
    }
}
//Yahan name ek variable hai jisme value hai "Gaurav Kumar".

// Jab aap greet(name) call karte ho…

// 👉 Java sirf value pass karta hai, variable ka naam nahi.
// 👉 Function ke andar String naam ek naya variable hota hai.