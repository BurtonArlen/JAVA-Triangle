import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (req, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/triangle", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      int side1 = Integer.parseInt(request.queryParams("Side1"));
      int side2 = Integer.parseInt(request.queryParams("Side2"));
      int side3 = Integer.parseInt(request.queryParams("Side3"));

      Triangle myTriangle = new Triangle(side1, side2, side3);
      model.put("myTriangle", myTriangle);

      model.put("template", "templates/triangle.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

}
