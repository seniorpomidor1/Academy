package HW2;

public class Task3 {
	public static void main(String[] args) {
        String str1 = "����";
        String str2 = "����";
        System.out.println("������ ����� = " + str1);
        System.out.println("������ ����� = " + str2);
        String str3 = (str1.substring(0, str1.length()/2)) + 
                (str2.substring(str2.length()/2, str2.length()));
        System.out.println(str3);
    }
}
