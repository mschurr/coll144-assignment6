package a6;

import lightning.Lightning;
import lightning.util.Flags;

public class QuizApp {
  public static void main(String[] args) throws Exception {
    Lightning.launch(Flags.getFile("config"));
  }
}
