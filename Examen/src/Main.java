public class Main {
    /**
     * @param device ---> operación que se desea realizar (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN)
     * @param num1 ---> primer número de la operación
     * @param num2 ---> segundo número de la operación (divisor si es una división y en caso de raiz cuadrada el primero nuemero es el radicando y el segundo el indice)
     * @return resultado o null si hay un error.
     */
    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        float num1 = 9;
        float num2 = 2;
        Float resultado = metodos.realizar(Metodos.RAIZ_CUADRADA, num1, num2);

        System.out.println("El resultado de la raiz es: " + resultado);

    }

}