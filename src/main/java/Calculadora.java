
public class Calculadora {

    //METODO RESTAR
    public int restar(int a, int b) {
        System.out.println("Método restar() llamado con a = " + a + ", b = " + b);
        int resultado = a - b;
        System.out.println("Resultado de restar: " + resultado);
        return resultado;
    }

    //METODO MULTIPLICAR
    public int multiplicar(int a, int b) {
        System.out.println("Método multiplicar() llamado con a = " + a + ", b = " + b);
        int resultado = a * b;
        System.out.println("Resultado de multiplicar: " + resultado);
        return resultado;
    }

    //METODO PORCENTAJE
    public double porcentaje(int parte, int total) {
        System.out.println("Método porcentaje() llamado con parte = " + parte + ", total = " + total);
        
        if (total == 0) {
            System.out.println("Error: División por cero detectada");
            throw new ArithmeticException("El total no puede ser cero.");
        }
        
        double resultado = (parte * 100.0) / total;
        System.out.println("Resultado del porcentaje: " + resultado + "%");
        return resultado;
    }

    //METODO RAIZ CUADRADA
    public double raizCuadrada(double x) {
        System.out.println("Método raizCuadrada() llamado con x = " + x);
        
        if (x < 0) {
            System.out.println("Error: Número negativo detectado");
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        
        double resultado = Math.sqrt(x);
        System.out.println("Resultado de la raíz cuadrada: " + resultado);
        return resultado;
    }

}