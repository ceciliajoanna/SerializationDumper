// Generated from /Users/jds5109/Documents/Portfolio-GitHub/SerializationDumper/src/Serialization.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SerializationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SerializationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SerializationParser#stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream(SerializationParser.StreamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SerializationParser#contents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContents(SerializationParser.ContentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SerializationParser#magic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagic(SerializationParser.MagicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SerializationParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(SerializationParser.VersionContext ctx);
}