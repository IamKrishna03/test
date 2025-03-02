package cucumber.Cucutest;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.messages.types.DataTable;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Given ("user enter {string} username password")
	void enterData (DataTable dt) {
		List<String> data = dt.cells();
	}
    
}
