package ObjectConstructor;

import org.testng.annotations.Test;

public class AirplaneTest {

    @Test
    public void TestMethod(){
        Airplane avion1 = new Airplane("Pasageri", "Boeing", "B-1345",
                270, "Kerosen");
        avion1.prezentAirplane();

        Airplane avion2 = new Airplane("Charter", "Boeing", "C-3245",
                450, "Kerosen");
        avion2.prezentAirplane();

        Airplane avion3 = new Airplane("Pasageri","Boeing","B-130",
                300,"Kerosen",150);
        avion3.prezentAirplane();

    }

}