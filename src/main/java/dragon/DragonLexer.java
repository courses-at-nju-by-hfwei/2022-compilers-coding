package dragon;

public class DragonLexer extends Lexer {
  private final KeywordTable kwTable = new KeywordTable();

  public DragonLexer(String input) {
    super(input);
  }

  @Override
  public Token nextToken() {
    // add code below

    // unknown tokens (characters)
    Token unknown = new Token(TokenType.UNKNOWN, Character.toString(peek));
    advance();
    return unknown;
  }

  private Token WS() {

    return Token.WS;
  }

  private Token ID() {

    return null;
  }

  private Token INT() {

    return null;
  }

  private Token NUMBER() {
    StringBuilder intStr = new StringBuilder();
    intStr.append(peek);
    advance();

    int state = 13;
    while (true) {
      switch (state) {
        case 13:
          if (Character.isDigit(peek)) {
            // add code here

            advance();
            state = 13;
            break;
          } else if (peek == '.') {
            // add code here

            advance();
            state = 14;
            break;
          } else if (peek == 'E' || peek == 'e') {
            // add code here

            advance();
            state = 16;
            break;
          } else {
            break;
          }
        case 14:
          if (Character.isDigit(peek)) {
            // add code here

            advance();
            state = 15;
            break;
          } else {
            break;
          }
        case 15:
          if (Character.isDigit(peek)) {
            // add code here

            advance();
            state = 15;
            break;
          } else if (peek == 'E') {
            // add code here

            advance();
            state = 16;
            break;
          } else {
            break;
          }
        case 16:
          if (peek == '+' || peek == '-') {
            // add code here

            advance();
            state = 17;
            break;
          } else if (Character.isDigit(peek)) {
            // add code here

            advance();
            state = 18;
            break;
          } else {
            break;
          }
        case 17:
          if (Character.isDigit(peek)) {
            // add code here

            advance();
            state = 18;
            break;
          } else {
            break;
          }
        case 18:
          if (Character.isDigit(peek)) {
            // add code here

            advance();
            state = 18;
            break;
          } else {
            break;
          }
        default:
          System.err.println("Unreachable");
      }
      // TODO: remove the following line of code; it is just for suppressing the warning
      return null;
    }
  }
}
