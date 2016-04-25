import org.fluentlenium.adapter.FluentTest;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
  }

  @Test
  public void triangleTestIsAnEquilateral() {
    goTo("http://localhost:4567/");
    fill("#Side1").with("5");
    fill("#Side2").with("5");
    fill("#Side3").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is a(n) equilateral!");
  }

  @Test
  public void triangleTestIsAnIsoceles() {
    goTo("http://localhost:4567/");
    fill("#Side1").with("5");
    fill("#Side2").with("5");
    fill("#Side3").with("10");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is a(n) isosceles!");
  }

  @Test
  public void triangleTestIsScalene() {
    goTo("http://localhost:4567/");
    fill("#Side1").with("6");
    fill("#Side2").with("4");
    fill("#Side3").with("10");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is a(n) scalene!");
  }

  @Test
  public void triangleTestIsNotATriangle() {
    goTo("http://localhost:4567/");
    fill("#Side1").with("2");
    fill("#Side2").with("4");
    fill("#Side3").with("10");
    submit(".btn");
    assertThat(pageSource()).contains("Your input is not a triangle, it did not pass the rigorous triangle test!");
  }


}
