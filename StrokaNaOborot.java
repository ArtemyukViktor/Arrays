import java.util.Arrays;
/**
 * 
 * @author user,
* System.out.println(stroka1.indexOf("o")); // ≈сли нету буквы в строке возвращает -1, если есть дает индекс букы
*System.out.print(stroka1.charAt(1)); // выводит букву по заданому индексу
*System.out.print(stroka1.substring(3,5)); // выводит строку с _, по _ Ќ≈ »Ќƒ≈ —ј а –≈јЋ№Ќќ√ќ ѕќ–яƒ ј(Ќ≈ — Ќ”Ћя)
*System.out.print(stroka1.replace("o", "z")); // замена буквы или слова на новое значение
 */
public class StrokaNaOborot {

	public static void main(String[] args) {
		String stroka = "Hello world";
		
		for (int i = stroka.length()-1; i >=0;  i--) {    //1 SPOSOB
			String s = stroka.substring(i, i+1);
			System.out.print(s);
	}
		System.out.println();// 
		
		String str = "Hello world";						//2 SPOSOB
		char [] ch = str.toCharArray();				
		for (int i = ch.length-1; i >=0; i--  ) {
			System.out.print(ch[i]);
			
			
		}
		System.out.println();//
		
		int [] a = {1,3,3,5,6}; 						//3 SPOSOB dlya massiva
		for (int i = a.length-1; i >=0;  i--) {
			System.out.print(a[i]+", ");
			
		}

		System.out.println();//
		
		
		String stroka1 = "Hello world";
		System.out.println(stroka1.indexOf("o")); // ≈сли нету буквы в строке возвращает -1, если есть дает индекс букы
		System.out.print(stroka1.charAt(1)); // выводит букву по заданому индексу
		System.out.println();//
		System.out.print(stroka1.substring(4,5)+ "_____ќбрати внимание!!!"); // выводит строку с _, по _ (включительно) Ќ≈ »Ќƒ≈ —ј а –≈јЋ№Ќќ√ќ ѕќ–яƒ ј(Ќ≈ — Ќ”Ћя)
		System.out.println();//
		System.out.print(stroka1.replace("o", "z")); // замена буквы или слова на новое значение
		System.out.println();//
		System.out.print(stroka1.length());
	}

}
