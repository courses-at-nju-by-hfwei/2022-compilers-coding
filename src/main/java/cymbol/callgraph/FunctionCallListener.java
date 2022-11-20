package cymbol.callgraph;

import cymbol.CymbolBaseListener;
import cymbol.CymbolParser;

public class FunctionCallListener extends CymbolBaseListener {
  private final Graph graph = new Graph();
  private String currentFunctionName = null;

  @Override
  public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
    currentFunctionName = ctx.ID().getText();
    graph.addNode(currentFunctionName);
  }

  @Override
  public void enterCall(CymbolParser.CallContext ctx) {
    String funcName = ctx.ID().getText();
    graph.addEdge(currentFunctionName, funcName);
  }

  public Graph getGraph() {
    return graph;
  }
}