import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return  new ModelAndView(new HashMap(),"index.hbs");
        },new HandlebarsTemplateEngine());
    }
}
