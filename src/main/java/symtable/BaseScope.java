package symtable;

import com.google.common.base.MoreObjects;

import java.util.LinkedHashMap;
import java.util.Map;

public class BaseScope implements Scope {
  private final Scope enclosingScope;
  private final Map<String, Symbol> symbols = new LinkedHashMap<>();
  private String name;

  public BaseScope(String name, Scope enclosingScope) {
    this.name = name;
    this.enclosingScope = enclosingScope;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public Scope getEnclosingScope() {
    return this.enclosingScope;
  }

  public Map<String, Symbol> getSymbols() {
    return this.symbols;
  }

  @Override
  public void define(Symbol symbol) {
    // TODO
  }

  @Override
  public Symbol resolve(String name) {
    // TODO
    return null;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("name", name)
        .add("symbols", symbols.values().toString())
        .toString();
  }
}
