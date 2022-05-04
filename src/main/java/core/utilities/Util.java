package core.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

    public Util() {
    }

    public String generateNameRandom() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        return firstName;
    }

    public String generateNumAletorio() {
        Faker faker = new Faker();
        int numFaker = faker.number().numberBetween(123456789, 999999999);
        //String numfin = faker.number().digits(9);
        String numFakerFinal = String.valueOf(numFaker);
        return numFakerFinal;

    }

    public boolean waitAlert(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.alertIsPresent());
        } catch(Exception e) {
            return false;
        }
        return true;
    }


}
