public class Main {
    /**
     * @param device ---> operación que se desea realizar (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN)
     * @param num1 ---> primer número de la operación
     * @param num2 ---> segundo número de la operación (divisor si es una división)
     * @return resultado o null si hay un error.
     */
    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        float num1 = 20;
        float num2 = 10;
        Float resultado = metodos.realizar(Metodos.SUMA, num1, num2);

        System.out.println("El resultado de la suma es: " + resultado);

    }

}