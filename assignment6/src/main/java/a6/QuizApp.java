package a6;

import lightning.config.Config;
import lightning.mvc.Lightning;

import com.google.common.collect.ImmutableList;

public class QuizApp {
  public static void main(String[] args) throws Exception {    
    Config config = Config.newBuilder()
        .setEnableDebugMode(true)
        .setAutoReloadPrefixes(ImmutableList.of(
            "a6.controllers"
        ))
        .setScanPrefixes(ImmutableList.of(
            "a6.controllers",
            "lightning.examples.cas"
        ))
        .server.setPort(8080)
        .server.setHmacKey("Kas8FJsa01kfF")
        .server.setStaticFilesPath("a6/assets")
        .server.setTemplateFilesPath("a6/templates")
        .db.setHost("localhost")
        .db.setPort(3306)
        .db.setUsername("root")
        .db.setPassword("coll144")
        .db.setName("assignment6")
        .mail.setAddress("coll144@riceapps.org")
        .mail.setHost("host225.hostmonster.com")
        .mail.setPort(465)
        .mail.setUseSSL(true)
        .mail.setUsername("coll144@riceapps.org")
        .mail.setPassword("GET FROM OWLSPACE IF YOU NEED TO SEND EMAILS")
        .build();
    
    Lightning.launch(config);
  }
}
