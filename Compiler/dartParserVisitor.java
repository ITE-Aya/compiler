// Generated from C:/Users/Abeer/IdeaProjects/compileedit/src/Compiler\dartParser.g4 by ANTLR 4.10.1
package Compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dartParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(dartParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#file_syntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_syntax(dartParser.File_syntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declear_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclear_var(dartParser.Declear_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#string_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_val(dartParser.String_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(dartParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#ifdart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdart(dartParser.IfdartContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(dartParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(dartParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(dartParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(dartParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#flutter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlutter(dartParser.FlutterContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#imporT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImporT(dartParser.ImporTContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(dartParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#runapp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunapp(dartParser.RunappContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(dartParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class_less}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_less(dartParser.Class_lessContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class_full}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_full(dartParser.Class_fullContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class_full1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_full1(dartParser.Class_full1Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(dartParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(dartParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class_full2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_full2(dartParser.Class_full2Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#initstate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitstate(dartParser.InitstateContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild(dartParser.BuildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(dartParser.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(dartParser.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#materialapp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialapp(dartParser.MaterialappContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigate_screen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigate_screen(dartParser.Navigate_screenContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(dartParser.HomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(dartParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#theme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheme(dartParser.ThemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#debugshowmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugshowmode(dartParser.DebugshowmodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(dartParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(dartParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(dartParser.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(dartParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(dartParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#appbar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppbar(dartParser.AppbarContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(dartParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#padding1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding1(dartParser.Padding1Context ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(dartParser.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#expanded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpanded(dartParser.ExpandedContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#sizedbox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedbox(dartParser.SizedboxContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#hieght}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHieght(dartParser.HieghtContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(dartParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#listview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListview(dartParser.ListviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#itb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItb(dartParser.ItbContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#sb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSb(dartParser.SbContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#ic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIc(dartParser.IcContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(dartParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#bord_rad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBord_rad(dartParser.Bord_radContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(dartParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#colors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColors(dartParser.ColorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#decoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoration(dartParser.DecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(dartParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(dartParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#varible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarible(dartParser.VaribleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#gestureDetector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGestureDetector(dartParser.GestureDetectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#ontap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOntap(dartParser.OntapContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#setstate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetstate(dartParser.SetstateContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#setstate1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetstate1(dartParser.Setstate1Context ctx);
}