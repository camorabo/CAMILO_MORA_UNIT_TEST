/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.unittestsample.Operations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Natucha
 */
public class OperationsTest {

    public OperationsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void NextNumber_UserNumberGTown_AddedANumber() {
        //Alistamiento de lo que necesitamos
        //Inyeccion de dependencias
        //Arrange
        int userNumber = 10;
        int expectedResult = 11;
        //Llamado a métodos

        //Act
        int result = Operations.NextNumber(userNumber);
        //Verificacion
        //Assert
        assertEquals(11, result);

    }

    @Test
    public void IsDivisible_TwoIntegerNumbers_Isdivisible() {
        //Alistamiento de lo que necesitamos
        //Inyeccion de dependencias
        //Arrange
        int firstNumber = 5;
        int secondNumber = 25;
        
        //Llamado a métodos
        //Act
        boolean methodResult = Operations.IsDivisible(firstNumber, secondNumber);
        
        //Verificacion
        //Assert
        assertTrue(methodResult);      
    }
    
    @Test
    public void IsDivisible_TwoIntegerNumbers_IsNotdivisible() {
        //Alistamiento de lo que necesitamos
        //Inyeccion de dependencias
        //Arrange
        int firstNumber = 5;
        int secondNumber = 6;
        
        //Llamado a métodos
        //Act
        boolean methodResult = Operations.IsDivisible(firstNumber, secondNumber);
        
        //Verificacion
        //Assert
        assertFalse(methodResult);      
    }
    
    @Test
    public void TemperatureConverter_CelsiusToFahrenheit_CorrectResult(){
        //Arrange
        double temperatureCelsius = 25;
        double expectedResult = 77;
        //Llamado a métodos

        //Act
        double result = Operations.TemperatureConverter(temperatureCelsius);
        //Verificacion
        //Assert
        assertEquals(expectedResult, result);

    }
    @Test
    public void DigitSum_4Digits_CorrectResult(){
        //Arrange
        int number = 1492;
        int expectedResult = 16;
        //Llamado a métodos

        //Act
        double result = Operations.DigitSum(number);
        //Verificacion
        //Assert
        assertEquals(expectedResult, result);

    }
}
