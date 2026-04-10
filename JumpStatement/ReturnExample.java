public class ReturnExample {
    public static void checkNumber(int num){
        if(num < 0){
            System.out.println("Negative Number");
            return;
        }
        System.out.println("Positive Number");
    }
    public static void main(String[] args) {
        checkNumber(-5);
        
    }
}
