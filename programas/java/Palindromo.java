
/* Palindromo es un programa que comprueba si la palabra pasada como argumento de entrada
   es palíndroma (se lee igual del derecho que del revés) */

public class Palindromo {

    static boolean esPalindromo(String pal) {
        char [] palArr = pal.toCharArray(); // Necesitamos convertir la palabra en array de caracteres

        for (int i = 1; i-1 < palArr.length / 2; i++){ // El rango del for es hasta la mitad de la palabra
            System.out.println(palArr[i-1] + " y " + palArr[palArr.length - i]);
            if (palArr[i-1] != palArr[palArr.length - i]){ // Si el caracter de la izquierda no corresponde
                System.out.println("falso"); // con el de la parte en "espejo"
                return false; // retornamos el valor falso
            }
        }
        return true; // En caso de no encontrar discrepancias retornamos true
    }

    public static void main(String args[]) {
        String palabra = args[0]; 
        System.out.println(palabra + " es palíndroma? " + esPalindromo(palabra));

    }
}
