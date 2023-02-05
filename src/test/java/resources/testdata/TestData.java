package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Bhavesh
 */
public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                                            {"test1@gmail.com", "test123"},
                                             {"test2@gmail.com", "test456"},
                                             {"test3@gmail.com", "test789"}
        };
        return data;
    }



}
