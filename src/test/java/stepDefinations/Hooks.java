package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@RegTest")
	public void beforeregvalidation()
	{
		System.out.println("Before Reg hook");
	}
	
	@After("@RegTest")
	public void afterregvalidation()
	{
		System.out.println("After Reg hook");
	}
	
	@Before("@SanityTest")
	public void beforesanityvalidation()
	{
		System.out.println("Before sanity hook");
	}
	
	@After("@SanityTest")
	public void aftersanityvalidation()
	{
		System.out.println("After sanity hook");
	}
	
	
	

}
