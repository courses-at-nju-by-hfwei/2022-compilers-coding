package cymbol.callgraph;

import cymbol.CymbolBaseListener;
import cymbol.CymbolParser;

public class FunctionCallListener extends CymbolBaseListener {
  private Graph graph = new Graph();
  private String currentFunctionName = null;

  public Graph getGraph() {
    return graph;
  }


  @Override
  public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
    currentFunctionName = ctx.ID().getText();
    graph.addNode(currentFunctionName);
  }

  @Override
  public void enterCall(CymbolParser.CallContext ctx) {
    String calledFunctionName = ctx.ID().getText();
    graph.addEdge(currentFunctionName, calledFunctionName);
  }
}
