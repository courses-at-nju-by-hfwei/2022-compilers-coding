package dragon;

public class DragonLexer extends Lexer {
  private final KeywordTable kwTable = new KeywordTable();

  public DragonLexer(String input) {
    super(input);
  }

  @Override
  public Token nextToken() {
    if (peek == EOF) {
      return Token.EOF;
    }

    if (Character.isWhitespace(peek)) {
      WS();
    }

    if (Character.isLetter(peek)) {
      return ID();
    }

    if (Character.isDigit(peek)) {
      return INT();
    }

    if (peek == '=') {
      consume();
      return Token.EQ;
    }

    if (peek == '<') {
      consume();
      if (peek == '=') {
        consume();
        return Token.LE;
      }

      if (peek == '>') {
        consume();
        return Token.NE;
      }

      return Token.LT;
    }

    if (peek == '>') {
      consume();

      if (peek == '=') {
        consume();
        return Token.GE;
      }

      return Token.GT;
    }

    Token unknown = new Token(TokenType.UNKNOWN, Character.toString(peek));
    consume();
    return unknown;
  }

  private Token WS() {
    while (Character.isWhitespace(this.peek)) {
      consume();
    }

    return Token.WS;
  }

  private Token ID() {
    StringBuilder sb = new StringBuilder();

    do {
      sb.append(peek);
      consume();
    } while (Character.isLetterOrDigit(peek));

    Token token = this.kwTable.getKeyword(sb.toString());
    if (token == null) {
      return new Token(TokenType.ID, sb.toString());
    }

    return token;
  }

  private Token INT() {
    StringBuilder sb = new StringBuilder();

    do {
      sb.append(peek);
      consume();
    } while (Character.isDigit(peek));

    return new Token(TokenType.INT, sb.toString());
  }
}
