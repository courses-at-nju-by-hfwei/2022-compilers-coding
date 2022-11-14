package dragon;

/**
 * Types of tokens (in groups)
 */
public enum TokenType {
  // Group 0
  EOF,
  WS,
  UNKNOWN,

  // Group 1
  // lookahead 1 char (LA(1))
  IF, ELSE,
  ID,
  INT,

  // Group 2
  // =, <>, <, <=, >, >=
  // lookahead 2 chars (LA(2))
  EQ, NE, LT, LE, GT, GE,

  // Group 3
  // lookahead k chars
  REAL,
  SCI,
}