// Generated from /home/slowcheetah/work_dir/StelixObjectFile/src/Sxf.g4 by ANTLR 4.9.1
package stelix.xfile.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SxfParser}.
 */
public interface SxfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SxfParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SxfParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SxfParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(SxfParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(SxfParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#array_object}.
	 * @param ctx the parse tree
	 */
	void enterArray_object(SxfParser.Array_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#array_object}.
	 * @param ctx the parse tree
	 */
	void exitArray_object(SxfParser.Array_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#data_object}.
	 * @param ctx the parse tree
	 */
	void enterData_object(SxfParser.Data_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#data_object}.
	 * @param ctx the parse tree
	 */
	void exitData_object(SxfParser.Data_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#array_block}.
	 * @param ctx the parse tree
	 */
	void enterArray_block(SxfParser.Array_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#array_block}.
	 * @param ctx the parse tree
	 */
	void exitArray_block(SxfParser.Array_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#struct_element}.
	 * @param ctx the parse tree
	 */
	void enterStruct_element(SxfParser.Struct_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#struct_element}.
	 * @param ctx the parse tree
	 */
	void exitStruct_element(SxfParser.Struct_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#struct_elements}.
	 * @param ctx the parse tree
	 */
	void enterStruct_elements(SxfParser.Struct_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#struct_elements}.
	 * @param ctx the parse tree
	 */
	void exitStruct_elements(SxfParser.Struct_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#data_block}.
	 * @param ctx the parse tree
	 */
	void enterData_block(SxfParser.Data_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#data_block}.
	 * @param ctx the parse tree
	 */
	void exitData_block(SxfParser.Data_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#data_block_elemenets}.
	 * @param ctx the parse tree
	 */
	void enterData_block_elemenets(SxfParser.Data_block_elemenetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#data_block_elemenets}.
	 * @param ctx the parse tree
	 */
	void exitData_block_elemenets(SxfParser.Data_block_elemenetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#data_block_element}.
	 * @param ctx the parse tree
	 */
	void enterData_block_element(SxfParser.Data_block_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#data_block_element}.
	 * @param ctx the parse tree
	 */
	void exitData_block_element(SxfParser.Data_block_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SxfParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SxfParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(SxfParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(SxfParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#data_types}.
	 * @param ctx the parse tree
	 */
	void enterData_types(SxfParser.Data_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#data_types}.
	 * @param ctx the parse tree
	 */
	void exitData_types(SxfParser.Data_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#state_true}.
	 * @param ctx the parse tree
	 */
	void enterState_true(SxfParser.State_trueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#state_true}.
	 * @param ctx the parse tree
	 */
	void exitState_true(SxfParser.State_trueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#state_false}.
	 * @param ctx the parse tree
	 */
	void enterState_false(SxfParser.State_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#state_false}.
	 * @param ctx the parse tree
	 */
	void exitState_false(SxfParser.State_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#state_null}.
	 * @param ctx the parse tree
	 */
	void enterState_null(SxfParser.State_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#state_null}.
	 * @param ctx the parse tree
	 */
	void exitState_null(SxfParser.State_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#s_integer}.
	 * @param ctx the parse tree
	 */
	void enterS_integer(SxfParser.S_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#s_integer}.
	 * @param ctx the parse tree
	 */
	void exitS_integer(SxfParser.S_integerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#s_double}.
	 * @param ctx the parse tree
	 */
	void enterS_double(SxfParser.S_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#s_double}.
	 * @param ctx the parse tree
	 */
	void exitS_double(SxfParser.S_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#s_float}.
	 * @param ctx the parse tree
	 */
	void enterS_float(SxfParser.S_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#s_float}.
	 * @param ctx the parse tree
	 */
	void exitS_float(SxfParser.S_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#s_short}.
	 * @param ctx the parse tree
	 */
	void enterS_short(SxfParser.S_shortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#s_short}.
	 * @param ctx the parse tree
	 */
	void exitS_short(SxfParser.S_shortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#s_string}.
	 * @param ctx the parse tree
	 */
	void enterS_string(SxfParser.S_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#s_string}.
	 * @param ctx the parse tree
	 */
	void exitS_string(SxfParser.S_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(SxfParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(SxfParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SxfParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SxfParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#block_start}.
	 * @param ctx the parse tree
	 */
	void enterBlock_start(SxfParser.Block_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#block_start}.
	 * @param ctx the parse tree
	 */
	void exitBlock_start(SxfParser.Block_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SxfParser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(SxfParser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link SxfParser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(SxfParser.Block_endContext ctx);
}