package a6.controllers;

import lightning.ann.*;
import static lightning.enums.HTTPMethod.*;
import static lightning.server.Context.*;

@Controller
public class QuizController {
  @Route(path="/", methods={GET})
  public String handleHome() throws Exception {
    String name = isLoggedIn() ? user().getUserName() : "GUEST";
    String link = isLoggedIn() ? "/logout" : "/login";
    String linkText = isLoggedIn() ? "Log Out" : "Log In";
    return String.format("Hello, %s! (<a href='%s'>%s</a>)", name, link, linkText);
  }
}
