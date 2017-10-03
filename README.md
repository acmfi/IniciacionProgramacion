# Iniciación a la Programacion 2017
Material de Curso de Iniciación a la Programación 2017

Diapositivas: http://slides.com/devcexx/intr_prog_acm#/

- [Estructura](#estructura)
- [Compilar y Ejecutar](#compilar-y-ejecutar)
- [Ejercicios](#ejercicios)
- [Recursos](#recursos)

## Estructura

- ¿Qué es programar?
  - Paradigmas de la programación
  - ¿Para qué nos sirve?
  - La programación con Java

- Elementos básicos de la programación en Java
  - Variables, condiciones, repeticiones y organización.
  - Variables
  - Tipos
  - Operadores
  - Condicionales
  - Funciones
  - Recursión
  - Arrays
  - Loops
  - Switch

## Compilar y Ejecutar

En la terminal (cmd en Windows):

```bash
javac nombre_fichero.java  #Compilar
java  nombre_fichero       #Ejecutar un fichero que contenga un "main"
```

Si alguno de estos comandos no os se encuentran, revisad que Java está bien instalado: acmupm.es/instalar_java

## Ejercicios

No hace falta ejecutar los ejercicios. Se pueden hacer en papel simplemente. Recomendamos que si una vez pensados y hechos, se quieren probar, se mire la parte de recursos de [ejecutar un programa](#ejecutar-un-programa)

**CONSETO 0**: Si tras 5 minutos no se te ocurre como hacer un ejercicio, búscalo en Google. Nunca lo busques si no lo has pensado. Si no es vital para avanzar, tampoco hace falta buscarlo, es mejor seguir pensando en otro momento.

**CONSETO 1**: JAMÁS copies y pegues código. Primero trata de entenderlo, una vez lo hayas entendido, escríbelo a mano.

Comenzaremos con unos ejercicios sencillos para poner en práctica la definición de funciones y el uso de condicionales:

1. Dado un número que te de el siguiente (incremento)
2. Definir la función que toma 2 números y devuelve el mayor de ellos.
3. Definir la función que toma **3** números y devuelve el mayor de ellos.

Y para trabajar un pelín la recursión:

1. Definir una función que calcule el factorial de forma recursiva.
2. Definir mediante recursión la función de la potencia, que recibe una `base` y un `exponente`.
3. Definir una función que calcule el número `n` de fibbonaci de forma recursiva.

Ahora vamos a repasar unos conceptos que se olvidan mucho de java, que es cómo declarar arrays.

1. Declarar un array **sin inicializar**.
2. Declarar un array de tipo `int` e inicializarlo con tamaño 10.
3. Declarara un array de tipo `int` e inicializarlo en el momento con valores `1, 2, 3`

**CONSETO 3**: La perfección se consigue con el tiempo. Si no te acuerdas bien cómo era algo exactamente, déjalo indicado. Ya volverás a ello más adelante o preguntarás cómo se hace. 

Y para mezclar lo dado:

1. Mirar cómo se recorre de forma recursiva un array. Está en [las diapositivas](http://slides.com/devcexx/intr_prog_acm#/)
2. Dado un array de `int`, devolver el mayor número contenido en él.

## Recursos

Es importante tener un buen entorno de programación, que nos entienda y lo entendamos. De esta manera se creará una sinergia entre persona y máquina que nos ofrecerá la oportunidad de _escribir código_.

Recomendamos **mucho** alejarse de los IDEs. Los IDEs, como Eclipse, pueden ser muy bueno para programar en Java, pero no para _programar_ en general. Es decir, no nos interesa aprender Java, nos interesa aprender a programar.

Como solución a esto planteamos una serie de alternativas que harán que aprendamos muchos más sin necesariamente sufrir (mucho):

- Emacs, un editor amado, una curva de aprendizaje lenta y larga que se ve recompensada en el futuro siendo la herramienta más versátil de todas.
- Vim, un editor amado (y odiado). Históricas batallas entre estos dos editores. Cada persona funcionará mejor con uno de estos dos. No es quien programa quien elige el editor, es el editor el que te elige a ti.
- Sublime Text, el editor de fácil entrada. Tiene atajos que nos resultarán familiares y con un buen diseño. Ideal para empezar, quiźa no tanto para quedarse.
- Notepad++. Bueno. Algien te dirá que haces bien.


### Ejecutar un programa

Para poder ejecutar un archivo java es necesario que tenga cierta estrutura. La plantilla base es:


```java
class Clase {

  // Zona donde se definen funciones
  
  
  public static void main ( String [] args ) {
  
    // Zona de código que se ejecuta
  
  }

}
```

