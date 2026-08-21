public class EvenNumbers {
    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < 100; i += 2) {
            result += i;
            if (i < 98) {
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
