package Step;
import Page.HomePage;

public class FormSteps extends HomePage{

    public void enterFirstName (){
        String First_Name = "Dennys";
        this.first_name.sendKeys(First_Name);
    }

    public void click_Highest_lever_of_education(){
        this.college.click();
    }
}
