package symtable;

import cymbol.CymbolBaseListener;

public class SymbolTableListener extends CymbolBaseListener {
  private final SymbolTableTreeGraph graph = new SymbolTableTreeGraph();

  private GlobalScope globalScope = null;
  private Scope currentScope = null;
  private int localScopeCounter = 0;

  // Adding Code Below

  public SymbolTableTreeGraph getGraph() {
    return graph;
  }
}