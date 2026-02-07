
class ExtractDigits {
    
    public static void main(String[] args) {
        String str = "Java0De2vloper9";
        
        String result = extractDigits(str);
        System.out.println(result);
    }
    
    public static String extractDigits(String str) {
        return str.replaceAll("[^0-9]", "");
    }
}
