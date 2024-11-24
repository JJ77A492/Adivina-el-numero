import java.util.Scanner;
import java.util.Random; 
public class Juego{
	public static void main(String args[]){
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("-ADIVINA EL NUMERO-");
		int numX = random.nextInt(101);
		int num = 0;
		boolean valor = false;
		System.out.println("Ingrese un numero entre 0 y 100");
		num = sc.nextInt();
		do{
			if(num>= 0 && num<= 100){
				if (num < numX){
					System.out.println("Mmm no, el numero es mayor intenta de nuevo: ");
					num = sc.nextInt();				
				}else if (num > numX){
					System.out.println("Mmm no, el numero es menor intenta de nuevo: ");
					num = sc.nextInt();
				}else{
					valor = true;
				}
			}else{
				System.out.println("Valor fuera de rango\nIngrese un numero entre 0 y 100");
				num = sc.nextInt();
			}
			
		}while(valor == false);
		System.out.println("Genial! haz adivinado el numero");
	}
}