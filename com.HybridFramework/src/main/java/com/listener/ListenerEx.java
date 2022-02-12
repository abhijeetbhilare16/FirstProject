package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;

public class ListenerEx extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case PASSED with name = " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Case FAILED with name = " + result.getName());
		test.addScreenCaptureFromPath(captureScreenshot(result.getName()));
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Case SKIPPED with name = " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		
	}

	public void onStart(ITestContext context) {

		
	}

	public void onFinish(ITestContext context) {

		
	}

}
