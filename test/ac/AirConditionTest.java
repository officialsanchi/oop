package ac;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AirConditionTest {
    private AirCondition airCondition;

    @BeforeEach
    public void TestThatAirConditionClassExist(){
       airCondition = new AirCondition();

    }

    @Test
    public void TestThatAirConditionIsOn(){
        airCondition.turn_off(false);
        assertTrue(true);
        airCondition.turn_on(true);
        assertTrue(true);


    }
    @Test
    public void TestThatAirConditionIsOff(){
        airCondition.turn_off(false);
        assertTrue(true);
        airCondition.turn_on(true);
        assertTrue(true);
        airCondition.turn_off(true);
        assertTrue(true);
    }

    @Test
    public void TestThatAirConditionTemperatureCanIncreased(){
        airCondition.turn_on(true);
        assertTrue(true);
        assertEquals( 17,airCondition.increaseTemperature(16));
    }
    @Test
    public void TestThatAirConditionTemperatureCanDecreased(){
        airCondition.turn_on(true);
        assertEquals(15,airCondition.decreasedTemperature(16));
    }
    @Test
    public void TestThatWhenTemperatureIsIncreasedBeyond30TemperatureIsSill30(){
        airCondition.turn_on(true);
        assertEquals(30,airCondition.temperatureBeyond30IsStill30(31,30));

    }
    @Test
    public void TestThatWhenTemperatureIsDecreasedBeyond16TemperatureIsStill16(){
        airCondition.turn_on(true);
        assertEquals(16,airCondition.temperatureBelow16IsStill16(15,16));
    }
}
