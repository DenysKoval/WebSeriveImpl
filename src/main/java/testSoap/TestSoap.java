package testSoap;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestStep;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Denys_Koval on 11/7/2016.
 */
public class TestSoap{

    @Test
    public void main() throws Exception {
        SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
        runner.setProjectFile("D:\\EPAM\\new.xml");
        runner.setPrintReport(true);
        runner.run();
    }

    @Test
    public void testTestCaseRunner() throws Exception
    {
        WsdlProject project = new WsdlProject( "D:\\EPAM\\new.xml" );
        TestSuite testSuite = project.getTestSuiteByName( "TestSuite 1" );
        TestCase testCase = testSuite.getTestCaseByName( "TestCase 1" );
        // create empty properties and run synchronously
        TestRunner runner = testCase.run( new PropertiesMap(), false );
        assertEquals( TestRunner.Status.FINISHED, runner.getStatus() );
    }
}
