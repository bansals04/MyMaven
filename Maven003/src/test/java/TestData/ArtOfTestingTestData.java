package TestData;

import DataModels.ArtOfTesting;
import DataObjects.ArtOfTestingConfigurationData;
import org.testng.annotations.DataProvider;

public class ArtOfTestingTestData {

    @DataProvider(name="ArtOfTestingDateset1")
    public static Object[][] dataForArtOfTesting1(){
        ArtOfTesting firstData = ArtOfTestingConfigurationData.Datset1;
        ArtOfTesting secondData = ArtOfTestingConfigurationData.Datset2;

        Object[][] testData = new Object[1][2];
        testData[0][0] = firstData;
        testData[0][1] = secondData;
        return testData;
    }

    @DataProvider(name="ArtOfTestingDateset2")
    public  static ArtOfTesting[][] dataForArtOfTesting2(){

        ArtOfTesting[][] testData = new ArtOfTesting[2][1];
        testData[0][0] = ArtOfTestingConfigurationData.Datset1();
        testData[1][0] = ArtOfTestingConfigurationData.Datset2();

        return  testData;

    }
}
