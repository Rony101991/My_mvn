package qReportPakage;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.internal.annotations.IListeners;
import tests1.BaseCoading;

import java.io.IOException;

public class IListnerReport extends TestListenerAdapter {
    public void onTestStart(ITestResult results) {


        System.out.println("Test Case is starting");
    }

    public void onTestSuccess(ITestResult results) {

        System.out.println("Test Case is successful");
    }

    public void onTestFailure(ITestResult results) {
    BaseCoading x= new BaseCoading();
        try {
            x.screenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Test Case Failed");
    }




    public void onTestSkipped(ITestResult results) {
        System.out.println("Test Case is being skipped");

    }
}
