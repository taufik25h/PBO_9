 public class Main {
        public static void main(String[] args) {
            // Method length()
            String str = "mang mamat";
            int length = str.length();
            System.out.println("jumlah karakter: " + length);
    
            // Method substring()
            String substring = str.substring(0,4);
            System.out.println("karakternya adalah : " + substring);
    
            // Method charAt()
            char character = str.charAt(7); // Mengambil karakter pada indeks ke-7
            System.out.println("Karakter pada indeks ke 7: " + character);
    
            // Method toLowerCase()
            String lowercaseStr = str.toLowerCase();
            System.out.println("String dalam huruf kecil: " + lowercaseStr);
    
            // Method toUpperCase()
            String uppercaseStr = str.toUpperCase();
            System.out.println("String dalam huruf besar: " + uppercaseStr);
    
            // Method replace()
            String replacedStr = str.replace("mang", "kang"); 
            System.out.println("String setelah penggantian: " + replacedStr);
    
            // Method contains()
            boolean containsJava = str.contains("mang"); // Memeriksa apakah string mengandung "Java"
            System.out.println("String contains 'mang': " + containsJava);
    
            // Method equals()
            String str2 = "mang";
            boolean isEqual = str.equals(str2); // Memeriksa apakah kedua string sama
            System.out.println("Kedua string sama: " + isEqual);
    
            // Method equalsIgnoreCase()
            String str3 = "mang";
            boolean isEqualIgnoreCase = str.equalsIgnoreCase(str3); // Memeriksa apakah kedua string sama tanpa memperhatikan case
            System.out.println("Kedua string sama (tanpa memperhatikan case): " + isEqualIgnoreCase);
    
            // Method endsWith()
            boolean endsWithWorld = str.endsWith("mamat"); // Memeriksa apakah string diakhiri dengan "World!"
            System.out.println("String diakhiri dengan 'mamat': " + endsWithWorld);
        }
    }
    