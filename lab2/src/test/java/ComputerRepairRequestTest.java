import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    
    @Test
    @DisplayName("test 1")
    void test1() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        assertEquals(computerRepairRequest.getOwnerName(), "");
        computerRepairRequest.setOwnerName("Vin Diesel");
        assertEquals(computerRepairRequest.getOwnerName(), "Vin Diesel");
    }

    @Test
    @DisplayName("test 2")
    void test2() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        assertEquals(computerRepairRequest.getPhoneNumber(), "");
        computerRepairRequest.setPhoneNumber("0060");
        assertEquals(computerRepairRequest.getPhoneNumber(), "0060");
    }
}
