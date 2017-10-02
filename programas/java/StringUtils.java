public class StringUtils {
    static char[] letrasEspecialesMinus = {'á', 'é', 'í', 'ó', 'ú', 'ü', 'ñ', 'ç'};
    static char[] letrasEspecialesMayus = {'Á', 'É', 'Í', 'Ó', 'Ú', 'Ü', 'Ñ', 'Ç'};

    static int buscar(char[] array, char c) {
	int index = -1;
	for (int i = 0; i < array.length && index == -1; i++) {
	    if (c == array[i]) {
		index = i;
	    }
	}

	return index;
    }

    static boolean esMayuscula(char c) {
	return (c >= 'A' && c <= 'Z') || buscar(letrasEspecialesMayus, c) != -1;
    }

    static boolean esMinuscula(char c) {
	return (c >= 'a' && c <= 'z') || buscar(letrasEspecialesMinus, c) != -1;
    }

    static boolean esLetra(char c) {
	return esMayuscula(c) || esMinuscula(c);
    }

    static boolean esNumero(char c) {
	return c >= '0' && c <= '9';
    }

    static String tipoCaracter(char c) {
	if (esMayuscula(c)) {
	    return "letra, mayúscula";
	} else if (esMinuscula(c)) {
	    return "letra, minúscula";
	} else if (esNumero(c)) {
	    return "número";
	} else if (c == ' ') {
	    return "espacio";
	} else if (c == '.') {
	    return "punto";
	} else if (c == ':') {
	    return "dos puntos";
	} else if (c == ';') {
	    return "punto y coma";
	} else if (c < 256) {
	    return "otro carácter ASCII";
	} else {
	    return "otro carácter Unicode";
	}
    }

    static char aMayuscula(char c) {
	if (c >= 'a' && c <= 'z') {
	    return (char) (c - 'a' + 'A');
	} else {
	    int especialIndice = buscar(letrasEspecialesMinus, c);
	    if (especialIndice == -1) {
		return c;
	    } else {
		return letrasEspecialesMayus[especialIndice];
	    }
	}
    }

    static char aMinuscula(char c) {
	if (c >= 'A' && c <= 'Z') {
	    return (char) (c - 'A' + 'a');
	} else {
	    int especialIndice = buscar(letrasEspecialesMayus, c);
	    if (especialIndice == -1) {
		return c;
	    } else {
		return letrasEspecialesMinus[especialIndice];
	    }
	}
    }

    static char[] aMayuscula(char[] caracteres) {
	char[] mayus = new char[caracteres.length];
	for (int i = 0; i < caracteres.length; i++) {
	    mayus[i] = aMayuscula(caracteres[i]);
	}
	return mayus;
    }

    
    static char[] aMinuscula(char[] caracteres) {
	char[] minus = new char[caracteres.length];
	for (int i = 0; i < caracteres.length; i++) {
	    minus[i] = aMinuscula(caracteres[i]);
	}
	return minus;
    }

    static int nLetras(char[] caracteres) {
	int n = 0;
	for (int i = 0; i < caracteres.length; i++) {
	    if (esLetra(caracteres[i])) {
		n++;
	    }
	}
	return n;
    }

    static int nNumeros(char[] caracteres) {
	int n = 0;
	for (int i = 0; i < caracteres.length; i++) {
	    if (esNumero(caracteres[i])) {
		n++;
	    }
	}
	return n;
    }

    static int nPalabras(char[] caracteres) {
	int longPalabra = 0;
	int n = 0;
	for (int i = 0; i < caracteres.length; i++) {
	    if (esNumero(caracteres[i]) || esLetra(caracteres[i])) {
		longPalabra++;
	    } else if (longPalabra > 0) {
		n++;
		longPalabra = 0;
	    }
	}

	if (longPalabra > 0) {
	    n++;
	}
	
	return n;
    }
    
    static void imprimirCaracteres(char[] c) {
	for (int i = 0; i < c.length; i++) {
	    System.out.print(c[i]);
	}
    }

    public static void main(String[] args) {
	if (args.length < 2) {
	    System.out.println("Uso:");
	    System.out.println("StringUtils <mayuscula | minuscula | info> texto");
	    return;
	}

	char[] texto = args[1].toCharArray();

	switch (args[0]) {
	case "mayuscula":
	    imprimirCaracteres(aMayuscula(texto));
	    break;
	case "minuscula":
	    imprimirCaracteres(aMinuscula(texto));
	    break;
	case "info":
	    System.out.println("Longitud: " + texto.length);
	    System.out.println("No. palabras: " + nPalabras(texto));
	    System.out.println("No. letras: " + nLetras(texto));
	    System.out.println("No. números: " + nNumeros(texto));
	    System.out.println();
	    
	    for (int i = 0; i < texto.length; i++) {
		char c = texto[i];
		System.out.println(c + "\t\t" + tipoCaracter(c));
	    }
	    break;
	default:
	    System.out.println("Comando desconocido: " + args[0]);
	}

			      
    }

					   

    

}
