package testSoap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.tools.SoapUITestCaseRunner;

/**
 * Created by Denys_Koval on 11/7/2016.
 */
public class TestSoap {
    private static final String PATH_TO_XML_FILE = "src/main/resources/CarMaintenance-soapui-project.xml";

    @Test
    public void main() throws Exception {
        SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
        runner.setProjectFile(PATH_TO_XML_FILE);
        runner.setPrintReport(true);
        runner.run();
    }

    @Test
    public void testTestCaseRunner() throws Exception {
        WsdlProject project = new WsdlProject(PATH_TO_XML_FILE);
        TestSuite testSuite = project.getTestSuiteByName("TestSuite 1");
        TestCase testCase = testSuite.getTestCaseByName("TestCase 1");
        // create empty properties and run synchronously
        TestRunner runner = testCase.run(new PropertiesMap(), false);
        assertEquals(TestRunner.Status.FINISHED, runner.getStatus());
    }
}
