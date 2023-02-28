package Test;
import Step.FormSteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class FormTest {
 public void submitForm(){
     FormSteps actions = new FormSteps();
     actions.enterFirstName();
     actions.click_Highest_lever_of_education();
 }

}
