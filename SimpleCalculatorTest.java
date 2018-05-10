import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class SimpleCalculatorTest {
    @org.junit.Test
    public void add() throws Exception {
    }

    @org.junit.Test
    public void subtract() throws Exception {
    }

    @org.junit.Test
    public void multiply() throws Exception {
    }

    @org.junit.Test
    public void divide() throws Exception {
    }

    private SimpleCalculator calculator;
    @Before
    public void setUp() {
        this.calculator = new SimpleCalculator();
    }


    @Test
    public void testAddSuma() {
        System.out.println("Suma dos números positivos");
        float n1 = 7;
        float n2 = 6;
        float expected = 13;
        float actual;
        actual = this.calculator.add(n1, n2);
        assertEquals(expected, actual, 0.000);
    }

    @Test
    public void assertTestSuma(){
        System.out.println("Suma dos números positivos");
        Integer resultado = 7+6;
        Assert.assertNotNull(resultado);
        System.out.println(resultado);
    }


   @Test
    public void Resta(){
       System.out.println("Resta dos números");
        Integer resultado = 7-6;
        Assert.assertNotNull(resultado);
       System.out.println(resultado);
    }
    @Test
    public void Multiplicacion(){
        System.out.println("Multiplica dos números");
        Integer resultado = 7*6;
        Assert.assertNotNull(resultado);
        System.out.println(resultado);
    }

    @Test
    public void Divide(){
        System.out.println("Divide dos números");
        Integer resultado = 7/6;
        Assert.assertNotNull(resultado);
        System.out.println(resultado);
    }

    @Test
    public void DivideCero(){
        System.out.println("Divide dos números");
        Integer resultado = 7/0;
        Assert.assertNotNull(resultado);
        System.out.println(resultado);
    }
    int number;
    @Test
    public void par4() {
        System.out.println("¿Son pares o impares?");
        number=4;
        assertTrue(this.calculator.isEvenNumber(number));
    }

    @Test
    public void par6() {
        System.out.println("¿Son pares o impares?");
        number=6;
        assertTrue(this.calculator.isEvenNumber(number));
    }

    @Test
    public void impar5() {
        System.out.println("¿Son pares o impares?");
        number=5;
        assertTrue(this.calculator.isEvenNumber(number));
    }

    @Test
    public void impar7() {
        System.out.println("¿Son pares o impares?");
        number=7;
        assertTrue(this.calculator.isEvenNumber(number));
    }

    
        @Test

        public void testCero() {

            String s = SimpleCalculator.povOf2(0);

            assertEquals("0", s);

        }

        @Test

        public void testOne() {

            String s = SimpleCalculator.povOf2(1);

            assertEquals("2", s);

        }

        @Test

        public void testFive() {

            String s = SimpleCalculator.povOf2(5);

            assertEquals("32", s);

        }

        @Test

        public void testSix() {

            String s = SimpleCalculator.povOf2(6);

            assertEquals("64", s);

        }

        @Test

        public void test256() {

            String s = SimpleCalculator.povOf2(100);

            assertEquals("1267650600228229401496703205376", s);

        }



}