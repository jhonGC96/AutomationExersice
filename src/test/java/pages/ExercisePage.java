package pages;

public class ExercisePage extends BasePage {

    private String homeLogo = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]";
    private String homeCarousel = "//div[@id='slider-carousel']";
    private String homeSignup = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";
    private String signupText = "//h2[contains(text(),'New User Signup!')]";
    private String nameTextbox = "//input[@data-qa='signup-name']";
    private String emailAdressTextbox = "//input[@data-qa='signup-email']";
    private String signupButton = "//button[contains(text(),'Signup')]";
    private String enterAccountInformationText = "//b[contains(text(),'Enter Account Information')]";
    private String titleCheckbox = "//input[@id='id_gender1']";
    private String passTextBox = "//input[@id='password']";
    private String dayDropdown = "//select[@id='days']";
    private String monthDropdown = "//select[@id='months']";
    private String yearDropdown = "//select[@id='years']";
    private String newsletterCheckbox = "//input[@id='newsletter']";
    private String offersCheckbox = "//input[@id='optin']";
    private String firstNameTextbox = "//input[@id='first_name']";
    private String lastNameTextbox = "//input[@id='last_name']";
    private String adressTextbox = "//input[@id='address1']";
    private String countryDropdown = "//select[@id='country']";
    private String stateTextbox = "//input[@id='state']";
    private String cityTextbox = "//input[@id='city']";
    private String zipcodeTextbox = "//input[@id='zipcode']";
    private String numberTextbox = "//input[@id='mobile_number']";
    private String createAccountButton = "//button[contains(text(),'Create Account')]";
    private String createdAccountText = "//b[contains(text(),'Account Created!')]";
    private String continueLink = "Continue";
    private String checkloggedAsUser = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]";
    private String deleteAccountLink = "Delete Account";
    private String accountDeletedText = "//b[contains(text(),'Account Deleted!')]";
    private String loginAccountText = "//h2[contains(text(),'Login to your account')]";
    private String emailAdressTextboxLogin = "//input[@data-qa='login-email']";
    private String passwordTextboxLogin = "//input[@data-qa='login-password']";
    private String loginButton = "//button[contains(text(),'Login')]";



    public ExercisePage (){
        super(driver);
    }

    public void navigateToHomePage(){
        navigateTo("https://automationexercise.com/");
    }

    public boolean verifyHomePageVisibility(){
        boolean result;
         if (elementIsDisplayed(homeLogo) && elementIsDisplayed(homeCarousel)) {
            result = true;
         } else {
            result = false;
         }
        return result;
    }

    public void clickSignupLink (){
        cliclElement(homeSignup);
    }

    public String verifyNewUserSignupIsVisible(){
        return textFromElement(signupText);
    }

    public void fillSignupForm(String name, String email){
        write(nameTextbox, name);
        write(emailAdressTextbox, email);
    }

    public void clickSignupButton (){
        cliclElement(signupButton);
    }

    public String checkEnterAccountVisivility(){
        return textFromElement(enterAccountInformationText);
    }

    public void fillForm(String pass, String firstName, String lastName, String address, String country, String state, String city, String cp, String number){
        cliclElement(titleCheckbox);
        write(passTextBox, pass);
        selectFromDropdownByText(dayDropdown, "5");
        selectFromDropdownByText(monthDropdown, "May");
        selectFromDropdownByText(yearDropdown, "1996");
        cliclElement(newsletterCheckbox);
        cliclElement(offersCheckbox);
        write(firstNameTextbox, firstName);
        write(lastNameTextbox, lastName);
        write(adressTextbox, address);
        selectFromDropdownByText(countryDropdown, country);
        write(stateTextbox, state);
        write(cityTextbox, city);
        write(zipcodeTextbox, cp);
        write(numberTextbox, number);
    }

    public void clickCreateAccountButton(){
        cliclElement(createAccountButton);
    }
    

    public String checkAccountCreatedIsVisible(){
        return textFromElement(createdAccountText);
    }

    public void clickContinueButton(){
        goToLinkText(continueLink);
    }

    public String checkLoggedInAsUsernameIsVisible(){
        return textFromElement(checkloggedAsUser);
    }

    public void clickDeleteAccountLink(){
        goToLinkText(deleteAccountLink);
    }

    public String checkAccountDeletedIsVisible(){
        return textFromElement(accountDeletedText);
    }

    public String checkLoginIsVisible(){
        return textFromElement(loginAccountText);
    }

    public void fillLoginForm (String email, String pass){
        write(emailAdressTextboxLogin, email);
        write(passwordTextboxLogin, pass);
    }

    public void clickLoginButton(){
        cliclElement(loginButton);
    }

}