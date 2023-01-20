import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RegistrationTests extends BaseTests{

    @Test
    public void testSubmitWithEmptyEmailField(){
        registrationPage.setEmail("example");
        registrationPage.setPassword("password");
        registrationPage.clickSubmit();
        assertTrue(registrationPage.isValidationMessageAppear(), "Validation message did not appear");
    }
}
