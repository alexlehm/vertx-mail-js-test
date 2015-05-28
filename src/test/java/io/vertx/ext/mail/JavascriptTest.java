package io.vertx.ext.mail;

import io.vertx.test.lang.js.JSRunner;

import org.junit.Test;

/**
 * @author <a href="http://oss.lehmann.cx/">Alexander Lehmann</a>
 *
 * run a javascript test file in e.g. eclipse
 */
public class JavascriptTest {

  @Test
  public void runJavascriptTest() throws Exception {
    new JSRunner().run("javascript/test.js", "*");
  }

}
