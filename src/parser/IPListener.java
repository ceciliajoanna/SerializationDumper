package parser;// Generated from /Users/joanna/Documents/Portfolio/SerializationDumper/src/IP.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IPParser}.
 */
public interface IPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IPParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(IPParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(IPParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPParser#ip}.
	 * @param ctx the parse tree
	 */
	void enterIp(IPParser.IpContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPParser#ip}.
	 * @param ctx the parse tree
	 */
	void exitIp(IPParser.IpContext ctx);
}