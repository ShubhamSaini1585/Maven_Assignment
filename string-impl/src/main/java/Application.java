public class Application {
    public static void main(String[] args) {
        //StringFunctions class is from <string-api> sub-module
        String name ="Shubham Saini";
        int size = StringFunctions.sizeofString(name);
        String reversed_string = StringFunctions.reverseString(name);
        System.out.println(size+"\n"+reversed_string);
    }
}
