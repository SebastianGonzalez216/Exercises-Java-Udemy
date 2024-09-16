package org.sebastian.junitapp.ejemplos.models;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.sebastian.junitapp.ejemplos.exceptions.DineroInsuficienteException;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

Cuenta cuenta;
TestInfo testInfo;
TestReporter testReporter;

@BeforeEach
    void initMetodoTest(TestInfo testInfo, TestReporter testReporter){
    this.testInfo = testInfo;
    this.testReporter = testReporter;
    System.out.println("Iniciando el metodo");
    testReporter.publishEntry("ejecutando:" + testInfo.getDisplayName() + " " + testInfo.getTestMethod() + " con las etiquetas " + testInfo.getTags());
    this.cuenta = new Cuenta("Sebastian", new BigDecimal("1000.43543"));

    }

    @AfterEach
    void finMedotodTest(){
        System.out.println("Finalizando metodo de prueba");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Iniciando el test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Finalizando el test");
    }

    @Test
    @DisplayName("Probando coincidencia del nombre de la cuenta")
    void testNombreCuenta() {
        //cuenta.setPersona("Sebastian");
        System.out.println(testInfo.getTags());
        if(testInfo.getTags().contains("cuenta")){
            System.out.println("hacer algo con la etiqueta cuenta");
        }
        String esperado = "Sebastian";
        String real = cuenta.getPersona();
        Assertions.assertEquals(esperado, real, () -> "El nombre de la cuenta no es el que se esperaba");

    }

    @Test
    @DisplayName("Probando que el saldo de la cuenta sea mayor a 0")
    void testSaldoCuenta() {
        cuenta = new Cuenta("Sebastian", new BigDecimal("1000.43543"));
        Assertions.assertEquals(1000.43543, cuenta.getSaldo().doubleValue());
        Assertions.assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
    }

    @Test
    @DisplayName("Probando la comparacion de cuentas mediante sus atributos")
    void testReferenciaCuenta() {
        Cuenta cuenta = new Cuenta("Pedro Lopez", new BigDecimal("5000.3456"));
        Cuenta cuenta2 = new Cuenta("Pedro Lopez", new BigDecimal("5000.3456"));

        Assertions.assertEquals(cuenta, cuenta2);
    }

    @Test
    void testDebitoCuenta() {
        cuenta = new Cuenta("Arturo", new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(900, cuenta.getSaldo().intValue());
        assertEquals("900.12345", cuenta.getSaldo().toEngineeringString());
    }

    @Test
    void testCreditoCuenta() {
        cuenta = new Cuenta("Arturo", new BigDecimal("1000.12345"));
        cuenta.credito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(1100, cuenta.getSaldo().intValue());
        assertEquals("1100.12345", cuenta.getSaldo().toEngineeringString());
    }

    @Test
    void testDineroInsuficienteExceptionCuenta() {
        cuenta = new Cuenta("Maria", new BigDecimal("1000.5678"));
        Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
            cuenta.debito(new BigDecimal(1500));
        });
        String actual = exception.getMessage();
        String esperado = "Dinero insuficiente";
        assertEquals(esperado, actual);
    }

    @Test
    void testTransferirDineroCuentas() {
        Cuenta cuenta1 = new Cuenta("Fernando", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Adriana", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.setNombre("BBVA");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
        assertEquals("1000.8989", cuenta2.getSaldo().toPlainString());
        assertEquals("3000", cuenta1.getSaldo().toPlainString());
    }

    @Test
    @Disabled
    void testRelacionBancoCuentas() {
        Cuenta cuenta1 = new Cuenta("Fernando", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Adriana", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.addCuenta(cuenta1);
        banco.addCuenta(cuenta2);
        banco.setNombre("BBVA");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));

        assertAll(() -> assertEquals("1000.8989", cuenta2.getSaldo().toPlainString()),
                () -> assertEquals("3000", cuenta1.getSaldo().toPlainString()),
                () -> assertEquals(2, banco.getCuentas().size()),
                () -> assertEquals("BBVA", cuenta1.getBanco().getNombre()),
                () -> assertEquals("Adriana", banco.getCuentas().stream()
                            .filter(c -> c.getPersona().equals("Adriana"))
                            .findFirst()
                            .get().getPersona()));
    }

    @Nested
    class SistemasOperativostest {
        @Test
        @EnabledOnOs(OS.WINDOWS)
        void testSoloWindows() {
        }

        @Test
        @EnabledOnOs({OS.LINUX, OS.MAC})
        void testSoloLinuxMac() {
        }

        @Test
        @DisabledOnOs(OS.WINDOWS)
        void testNoWindows() {
        }
    }

    @Nested
    class JavaVersionesTest {
        @Test
        @EnabledOnJre(JRE.JAVA_8)
        void testSoloJDK8() {
        }

        @Test
        @DisabledOnJre(JRE.OTHER)
        void testNoJDK17() {
        }
    }

    @Nested
    class PropiedadesSistemaTest {
        @Test
        @DisabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
        void testSolo64Bits() {
        }
    }

    @RepeatedTest(6)
    void testDebitoCuentaRepetir() {
        cuenta = new Cuenta("Arturo", new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(900, cuenta.getSaldo().intValue());
        assertEquals("900.12345", cuenta.getSaldo().toEngineeringString());
    }

    @Tag("param")
    @Nested
    class PruebasParametrizadas {
        @ParameterizedTest
        @ValueSource(strings = {"100","200","300","400","500","700","1000"})
        void testDebitoCuentaParametrizado(String monto) {
            cuenta.debito(new BigDecimal(monto));
            assertNotNull(cuenta.getSaldo());
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
        }

        @ParameterizedTest
        @CsvSource({"1,100","2,200","3,300","4,400","5,500","6,700","7,1000"})
        void testDebitoCuentaCsv(String index, String monto) {
            cuenta.debito(new BigDecimal(monto));
            assertNotNull(cuenta.getSaldo());
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
        }

        @ParameterizedTest
        @CsvSource({"300,100","250,200","280,300","400,400","800,500","900,700","1500,1000"})
        void testDebitoCuentaCsv2(String saldo, String monto) {
            cuenta.setSaldo(new BigDecimal(saldo));
            cuenta.debito(new BigDecimal(monto));
            assertNotNull(cuenta.getSaldo());
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
        }


    }

    @Test
    @Timeout(5)
    void pruebaTimeout() throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
    }

}