
/* Palindromo es un programa que comprueba si la palabra pasada como argumento de entrada
   es palíndroma (se lee igual del derecho que del revés) */

public class Palindromo {

    static boolean esPalindromo(String pal) {
        char [] palArr = pal.toCharArray(); // Necesitamos convertir la palabra en array de caracteres
        int i = 1;

        while (i-1 < palArr.length/2 && palArr[i-1] == palArr[palArr.length - i]){
          System.out.println(palArr[i-1] + " y " + palArr[palArr.length - i]);
          i++;
        }
        return i - 1 == palArr.length / 2; // En caso de no encontrar discrepancias retornamos true
    }

    public static void main(String args[]) {
        String palabra = args[0]; 
        System.out.println(palabra + " es palíndroma? " + esPalindromo(palabra));

    }
}
