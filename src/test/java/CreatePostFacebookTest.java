import org.testng.annotations.Test;

public class CreatePostFacebookTest extends BaseTest{



    @Test
    public void toPostOnFacebookTest() throws InterruptedException
    {
        CreatePostFacebookClient dummyDomainFuzzerClient = new CreatePostFacebookClient(driver);
        dummyDomainFuzzerClient.toLoginOnFacebook("abc","dd","Hello");

    }

}







