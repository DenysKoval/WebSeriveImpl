<<<<<<< 89d0ba0d4f3b0ff2c79b4c8a590f11ea8c91fbc3
import com.eviware.soapui.tools.SoapUITestCaseRunner;

/**
 * Created by Denys_Koval on 11/7/2016.
 */
public class Test extends com.eviware.soapui.tools.SoapUITestCaseRunner{

    @org.junit.Test
    public static void main(String[] args) throws Exception {
        SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
        runner.setProjectFile("CarMaintenance-soapui-project.xml");
        runner.setPrintReport(true);
        runner.run();

    }
}
