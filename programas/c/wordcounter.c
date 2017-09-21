#include <stdio.h> // Librería estándar de C
#include <fcntl.h> // Librería de control de ficheros

/*                ---------- WORD COUNTER (cuentalíneas) ----------- */
/* Este programa, dado un fichero, devuelve el número de caracteres,
   líneas y palabras del mismo.
   El algoritmo de este programa es sencillo: recorremos todos los 
   caracteres del fichero que damos y aumentamos los contadores en
   función de cada caso.                                             */

#define OUT 0 // Definimos dos estados: dentro y fuera de palabra
#define IN 1

int main(int argc, char *argv[]) {

  int c, state;
  int nl = 0; // Número de líneas
  int nw = 0; // Número de palabras
  int nc = 0; // Número de caracteres
  FILE *fp; // Puntero a fichero

  fp = fopen(argv[1], "r"); // Abrimos el fichero que pasamos como argumento

  while((c = fgetc(fp)) != EOF) { // Mientras existan caracteres en el fichero
    printf("%c", c); 
    nc++; 
    if (c == '\n') // Si hay salto de línea se acaba la línea
      nl++; 
    if (c == ' ' || c == '\n' || c == '\t') // Si se acaba la palabra (tab, espacio o salto de línea)
      state = OUT; // salimos de palabra
    else if (state == OUT){ // en el caso de estar fuera ya (nótese el else if)
      state = IN; // volvemos a entrar en palabra
      nw++; 
    }
  }

  fclose(fp);

  printf("Lines: %d\n",nl);
  printf("Words: %d\n",nw);
  printf("Chars: %d\n",nc);
}
