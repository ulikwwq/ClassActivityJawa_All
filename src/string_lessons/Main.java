package string_lessons;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.length()); // 5

        String s2 = "Hello, World!";
        System.out.println(s2.substring(7, 12)); // World

        String s3 = "Java Programming";
        System.out.println(s3.toUpperCase()); // JAVA PROGRAMMING
        System.out.println(s3.toLowerCase()); // java programming

        String s4 = "   Trim me   ";
        System.out.println(s4.trim()); // "Trim me"

        String s5 = "apple,banana,cherry";
        String[] fruits = s5.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

