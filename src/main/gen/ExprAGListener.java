// Generated from java-escape by ANTLR 4.11.1

package ag;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprAGParser}.
 */
public interface ExprAGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprAGParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExprAGParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprAGParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExprAGParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprAGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprAGParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprAGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprAGParser.ExprContext ctx);
}