import com.codeborne.selenide.Selenide;
import helpers.Steps;
import helpers.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class TensorTests  extends TestBase {
    @Test
    @DisplayName("Test Tensor.ru")
    public void tensorTests() {
        Steps steps = new Steps();

        steps.openPage();
        steps.checkText();
        steps.goLink();
        steps.goLink2();
        steps.switchTo();
        steps.checkText2();
    }
}
