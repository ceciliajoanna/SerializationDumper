// Generated from /Users/jds5109/Documents/Portfolio-GitHub/SerializationDumper/src/Serialization.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SerializationParser}.
 */
public interface SerializationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SerializationParser#stream}.
	 * @param ctx the parse tree
	 */
	void enterStream(SerializationParser.StreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SerializationParser#stream}.
	 * @param ctx the parse tree
	 */
	void exitStream(SerializationParser.StreamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SerializationParser#contents}.
	 * @param ctx the parse tree
	 */
	void enterContents(SerializationParser.ContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SerializationParser#contents}.
	 * @param ctx the parse tree
	 */
	void exitContents(SerializationParser.ContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SerializationParser#magic}.
	 * @param ctx the parse tree
	 */
	void enterMagic(SerializationParser.MagicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SerializationParser#magic}.
	 * @param ctx the parse tree
	 */
	void exitMagic(SerializationParser.MagicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SerializationParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(SerializationParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SerializationParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(SerializationParser.VersionContext ctx);
}