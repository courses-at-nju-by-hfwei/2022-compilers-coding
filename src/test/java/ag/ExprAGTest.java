package ag;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExprAGTest {
  InputStream is = System.in;
  BufferedReader br = new BufferedReader(new InputStreamReader(is));

  @BeforeMethod
  public void setUp() throws IOException {
  }

  @AfterMethod
  public void tearDown() {
  }

  @Test
  public void testExprAG() throws IOException {
    String expr = br.readLine();
    int line = 1;

    ExprAGParser parser = new ExprAGParser(null);
    parser.setBuildParseTree(false);

    while (expr != null) {
      CharStream input = CharStreams.fromStream(is);
      ExprAGLexer lexer = new ExprAGLexer(input);
      lexer.setLine(line);
      lexer.setCharPositionInLine(0);

      CommonTokenStream tokens = new CommonTokenStream(lexer);
      parser.setInputStream(tokens);
      parser.stat();

      expr = br.readLine();
      line++;
    }
  }
}