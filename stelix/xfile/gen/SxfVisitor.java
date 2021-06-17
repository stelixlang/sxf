// Generated from /home/slowcheetah/work_dir/StelixObjectFile/src/Sxf.g4 by ANTLR 4.9.1
package stelix.xfile.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SxfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SxfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SxfParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SxfParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(SxfParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#array_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_object(SxfParser.Array_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#data_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_object(SxfParser.Data_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#array_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_block(SxfParser.Array_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#struct_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_element(SxfParser.Struct_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#struct_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_elements(SxfParser.Struct_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#data_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_block(SxfParser.Data_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#data_block_elemenets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_block_elemenets(SxfParser.Data_block_elemenetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#data_block_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_block_element(SxfParser.Data_block_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SxfParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(SxfParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#data_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_types(SxfParser.Data_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#state_true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_true(SxfParser.State_trueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#state_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_false(SxfParser.State_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#state_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_null(SxfParser.State_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#s_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_integer(SxfParser.S_integerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#s_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_double(SxfParser.S_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#s_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_float(SxfParser.S_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#s_short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_short(SxfParser.S_shortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#s_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_string(SxfParser.S_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(SxfParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SxfParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#block_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_start(SxfParser.Block_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SxfParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(SxfParser.Block_endContext ctx);
}