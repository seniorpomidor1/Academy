package by.academy.lesson.operators;

public class operators {
	
	public static void main(String[] asgs) {
        int number = 5;
        number = -number;
        number = +number;
        System.out.println(number);
        boolean bool = true;
        bool = !bool;
        
        System.out.println(bool);
        char a = 'a';
        a = (char) (a+1);
        System.out.println(a);
        
        int number1 = 10;
        System.out.println(number1);
        number1 += 10;
        System.out.println(number1);
        number1 -= 10;
        System.out.println(number1);
        number1 *= 10;
        System.out.println(number1);
        number1 /= 10;
        System.out.println(number1);
        number1 %= 10;
        
        int i = 1;
        i++;
        System.out.println(i);
        i += 1;
        System.out.println(i);
        i = i + 1;
        
        int j = 0;
        j++;
        --j;
        System.out.println(j++);    //0
        System.out.println(++j);    //2
	}
}  
   
