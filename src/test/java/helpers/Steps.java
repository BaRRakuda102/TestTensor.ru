package helpers;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class Steps {

    @Step("Открытие страницы")

    public void openPage () {
        Selenide.open("https://tensor.ru/");
    }
    @Step ("Проверка текста")
    public void checkText () {
        $(".tensor_ru-content_wrapper").shouldHave(text("РАЗРАБОТКА ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ"));
    }
    @Step ("Переход по ссылке")
    public void goLink () {
        $(".tensor_ru-Header__menu-item-2 > .tensor_ru-Header__menu-link").click();
    }
    @Step ("Переход по ссылке 2")
    public void goLink2 () {
        $(".s-Grid-col:nth-child(6) .tensor_ru-Branches-photos__img").click();
    }
    @Step ("Переключение между вкладками")
    public void switchTo () {
        Selenide.switchTo().window(1);
    }
    @Step ("Проверка текста 2")
    public void checkText2 (){
        $(".news-NewsViewer__title").shouldHave(text("Дорогу юниорам!"));
    }
}
