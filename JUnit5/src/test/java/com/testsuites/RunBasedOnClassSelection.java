package com.testsuites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import com.app.AppTests;
import com.test.JUnitJupiterTests;

@RunWith(JUnitPlatform.class)
@SelectClasses({AppTests.class, JUnitJupiterTests.class})
public class RunBasedOnClassSelection {

}
