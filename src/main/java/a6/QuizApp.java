package a6;

import lightning.Lightning;
import lightning.util.Flags;

public class QuizApp {
  public static void main(String[] args) throws Exception {
    Flags.parse(args);
    Lightning.launch(Flags.getFile("config"));
  }
}
