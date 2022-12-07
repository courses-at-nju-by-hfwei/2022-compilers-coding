package types;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

import symtable.Type;
import symtable.VariableSymbol;

public class TypeCheckingListener extends ArrayBaseListener {
  private final Map<String, VariableSymbol> symbolTable = new HashMap<>();
  private final ParseTreeProperty<Type> arrayTypeProperty = new ParseTreeProperty<>();
  private final ParseTreeProperty<Type> basicTypeProperty = new ParseTreeProperty<>();

  /**
   * (1) Pass the basic type from top to bottom
   */

  /**
   * (2) Construct the array type from bottom to top
   */

  /**
   * (3) Type reference and inference
   */

  /**
   * (4) Type inference in array index expression
   */

  /**
   * (5) Type checking in "assignment"
   */
}