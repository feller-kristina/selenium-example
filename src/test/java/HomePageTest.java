import core.SeleniumTest;
import org.junit.Test;
import pages.DocumentationPage;
import pages.HomePage;

import static junit.framework.TestCase.assertTrue;

public class HomePageTest extends SeleniumTest {

    @Test
    public void test1() {
        HomePage homePage = new HomePage(driver);
        DocumentationPage documentationPage = homePage.seeDocumentation();
        assertTrue(documentationPage.logo_is_visible());
    }

}
