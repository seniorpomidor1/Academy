package HW2;

public class Task3 {
	public static void main(String[] args) {
        String str1 = "Мама";
        String str2 = "Папа";
        System.out.println("Первое слово = " + str1);
        System.out.println("Второе слово = " + str2);
        String str3 = (str1.substring(0, str1.length()/2)) + 
                (str2.substring(str2.length()/2, str2.length()));
        System.out.println(str3);
    }
}
