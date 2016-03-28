package demos.fileshare;

import lightning.Lightning;
import lightning.util.Flags;

public class FileShareApp {
  public static void main(String[] args) throws Exception {
    Flags.parse(args);
    Lightning.launch(Flags.getFile("config"));
  }
}
