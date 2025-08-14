import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Variable para almacenar la instancia de Calculadora
    Calculadora calc;

    // Este método se ejecuta ANTES de cada prueba (@Test)
    @BeforeEach
    void setup() {
        System.out.println("Iniciando prueba...");
        // Creamos una nueva instancia de la calculadora antes de cada prueba
        calc = new Calculadora();
    }

    // Este método se ejecuta DESPUÉS de cada prueba (@Test)
    @AfterEach
    void cleanup() {
        System.out.println("Prueba finalizada!");
    }

    // Prueba unitaria para el método restar
    @Test
    void testRestar() {
        System.out.println("Ejecutando testRestar...");
        // Prueba normal
        int resultado = calc.restar(10, 5);
        System.out.println("Probando resta: 10 - 5, resultado esperado: 5, resultado obtenido: " + resultado);
        assertEquals(5, resultado, "La resta debe ser 5");
        // Prueba con valores negativos
        resultado = calc.restar(-5, -10);
        System.out.println("Probando resta: -5 - (-10), resultado esperado: 5, resultado obtenido: " + resultado);
        assertEquals(5, resultado, "La resta debe ser 5");
    }

    // Prueba unitaria para el método multiplicar
    @Test
    void testMultiplicar() {
        System.out.println("Ejecutando testMultiplicar...");
        // Prueba con cero
        int resultado = calc.multiplicar(0, 5);
        System.out.println("Probando multiplicación: 0 * 5, resultado esperado: 0, resultado obtenido: " + resultado);
        assertEquals(0, resultado, "La multiplicación debe ser 0");
        // Prueba con números negativos
        resultado = calc.multiplicar(-3, 4);
        System.out.println("Probando multiplicación: -3 * 4, resultado esperado: -12, resultado obtenido: " + resultado);
        assertEquals(-12, resultado, "La multiplicación debe ser -12");
    }

    // Prueba unitaria para el método porcentaje
    @Test
    void testPorcentaje() {
        System.out.println("Ejecutando testPorcentaje...");
        // Prueba normal
        double resultado = calc.porcentaje(25, 200);
        System.out.println("Probando porcentaje: (25 * 100) / 200, resultado esperado: 12.5, resultado obtenido: " + resultado);
        assertEquals(12.5, resultado, "El porcentaje debe ser 12.5");
        // Prueba con total = 0
        System.out.println("Probando porcentaje con total = 0...");
        assertThrows(ArithmeticException.class, () -> {
            calc.porcentaje(25, 0);
        });
        System.out.println("Se lanzó ArithmeticException como se esperaba.");
    }

    // Prueba unitaria para el método raizCuadrada
    @Test
    void testRaizCuadrada() {
        System.out.println("Ejecutando testRaizCuadrada...");
        // Prueba normal
        double resultado = calc.raizCuadrada(16);
        System.out.println("Probando raíz cuadrada: √16, resultado esperado: 4.0, resultado obtenido: " + resultado);
        assertEquals(4.0, resultado, "La raíz cuadrada debe ser 4.0");
        // Prueba con número negativo
        System.out.println("Probando raíz cuadrada con número negativo...");
        assertThrows(IllegalArgumentException.class, () -> {
            calc.raizCuadrada(-4);
        });
        System.out.println("Se lanzó IllegalArgumentException como se esperaba.");
    }
}
