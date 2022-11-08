package simpleexprlexer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import simpleexpr.SimpleExprLexer;

public class SimpleExprLexerTest {
  public static void main(String[] args) throws IOException {
    InputStream is = System.in;

    String file;
    if (args.length > 0) {
      file = args[0];
      is = new FileInputStream(file);
    }

    CharStream input = CharStreams.fromStream(is);
    SimpleExprLexer lexer = new SimpleExprLexer(input);

    for (Token token : lexer.getAllTokens()) {
      System.out.println(token);
    }
  }
}