package com.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.testCase.HomePageTitleTest;
import com.testCase.SearchPageTitleTest;

@RunWith(Suite.class) 
@Suite.SuiteClasses({
	HomePageTitleTest.class,
	SearchPageTitleTest.class
})
public class AllTestSuite {


}
