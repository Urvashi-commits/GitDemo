package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {
	
	@Given("^Validate the browser$")
	public void validate_the_browser() throws Throwable {
	   System.out.println("deciding the browser to open"); 
	}

	@When("^Browser is triggered$")
	public void browser_is_triggered() throws Throwable {
		System.out.println("Browser is triggered"); 
	}

	@Then("^check if browser is started$")
	public void check_if_broser_is_started() throws Throwable {
		System.out.println("Browser is started"); 
	}



   @Given("^User is on Udemy Landing Page$")
    public void user_is_on_udemy_landing_page() throws Throwable {
    	System.out.println("User is on Udemy Landing Page");
   }

    @When("^User login into application with \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_login_into_application_with_and_Password(String arg1, String arg2) throws Throwable {
        System.out.println(arg1);
        System.out.println(arg2);
        
    }
    
    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("dryRun");
    }


    @Then("^Home page must be displayed$")
    public void home_page_must_be_displayed() throws Throwable {
    	System.out.println("Home page must be displayed");
        
    }

    @Then("^Courses displayed are \"([^\"]*)\"$")
    public void courses_displayed_are(String arg1) throws Throwable {
    	System.out.println(arg1);
        
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    	List<List<String>> obj=data.raw();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));
    }
    
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_in_to_application_with_and_password(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);
    }

}