// Generated from C:/Users/Abeer/IdeaProjects/compileedit/src/Compiler\dartParser.g4 by ANTLR 4.10.1
package Compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dartParser}.
 */
public interface dartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dartParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(dartParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(dartParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#file_syntax}.
	 * @param ctx the parse tree
	 */
	void enterFile_syntax(dartParser.File_syntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#file_syntax}.
	 * @param ctx the parse tree
	 */
	void exitFile_syntax(dartParser.File_syntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declear_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclear_var(dartParser.Declear_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declear_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclear_var(dartParser.Declear_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#string_val}.
	 * @param ctx the parse tree
	 */
	void enterString_val(dartParser.String_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#string_val}.
	 * @param ctx the parse tree
	 */
	void exitString_val(dartParser.String_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(dartParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(dartParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#ifdart}.
	 * @param ctx the parse tree
	 */
	void enterIfdart(dartParser.IfdartContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#ifdart}.
	 * @param ctx the parse tree
	 */
	void exitIfdart(dartParser.IfdartContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(dartParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(dartParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(dartParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(dartParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(dartParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(dartParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(dartParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(dartParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#flutter}.
	 * @param ctx the parse tree
	 */
	void enterFlutter(dartParser.FlutterContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#flutter}.
	 * @param ctx the parse tree
	 */
	void exitFlutter(dartParser.FlutterContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#imporT}.
	 * @param ctx the parse tree
	 */
	void enterImporT(dartParser.ImporTContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#imporT}.
	 * @param ctx the parse tree
	 */
	void exitImporT(dartParser.ImporTContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(dartParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(dartParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#runapp}.
	 * @param ctx the parse tree
	 */
	void enterRunapp(dartParser.RunappContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#runapp}.
	 * @param ctx the parse tree
	 */
	void exitRunapp(dartParser.RunappContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(dartParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(dartParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class_less}.
	 * @param ctx the parse tree
	 */
	void enterClass_less(dartParser.Class_lessContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class_less}.
	 * @param ctx the parse tree
	 */
	void exitClass_less(dartParser.Class_lessContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class_full}.
	 * @param ctx the parse tree
	 */
	void enterClass_full(dartParser.Class_fullContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class_full}.
	 * @param ctx the parse tree
	 */
	void exitClass_full(dartParser.Class_fullContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class_full1}.
	 * @param ctx the parse tree
	 */
	void enterClass_full1(dartParser.Class_full1Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class_full1}.
	 * @param ctx the parse tree
	 */
	void exitClass_full1(dartParser.Class_full1Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(dartParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(dartParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(dartParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(dartParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class_full2}.
	 * @param ctx the parse tree
	 */
	void enterClass_full2(dartParser.Class_full2Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class_full2}.
	 * @param ctx the parse tree
	 */
	void exitClass_full2(dartParser.Class_full2Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#initstate}.
	 * @param ctx the parse tree
	 */
	void enterInitstate(dartParser.InitstateContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#initstate}.
	 * @param ctx the parse tree
	 */
	void exitInitstate(dartParser.InitstateContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#build}.
	 * @param ctx the parse tree
	 */
	void enterBuild(dartParser.BuildContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#build}.
	 * @param ctx the parse tree
	 */
	void exitBuild(dartParser.BuildContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterWidget(dartParser.WidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitWidget(dartParser.WidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void enterChild(dartParser.ChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void exitChild(dartParser.ChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#materialapp}.
	 * @param ctx the parse tree
	 */
	void enterMaterialapp(dartParser.MaterialappContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#materialapp}.
	 * @param ctx the parse tree
	 */
	void exitMaterialapp(dartParser.MaterialappContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigate_screen}.
	 * @param ctx the parse tree
	 */
	void enterNavigate_screen(dartParser.Navigate_screenContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigate_screen}.
	 * @param ctx the parse tree
	 */
	void exitNavigate_screen(dartParser.Navigate_screenContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(dartParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(dartParser.HomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(dartParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(dartParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#theme}.
	 * @param ctx the parse tree
	 */
	void enterTheme(dartParser.ThemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#theme}.
	 * @param ctx the parse tree
	 */
	void exitTheme(dartParser.ThemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#debugshowmode}.
	 * @param ctx the parse tree
	 */
	void enterDebugshowmode(dartParser.DebugshowmodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#debugshowmode}.
	 * @param ctx the parse tree
	 */
	void exitDebugshowmode(dartParser.DebugshowmodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(dartParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(dartParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(dartParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(dartParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#children}.
	 * @param ctx the parse tree
	 */
	void enterChildren(dartParser.ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#children}.
	 * @param ctx the parse tree
	 */
	void exitChildren(dartParser.ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(dartParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(dartParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(dartParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(dartParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#appbar}.
	 * @param ctx the parse tree
	 */
	void enterAppbar(dartParser.AppbarContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#appbar}.
	 * @param ctx the parse tree
	 */
	void exitAppbar(dartParser.AppbarContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(dartParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(dartParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#padding1}.
	 * @param ctx the parse tree
	 */
	void enterPadding1(dartParser.Padding1Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#padding1}.
	 * @param ctx the parse tree
	 */
	void exitPadding1(dartParser.Padding1Context ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#padding}.
	 * @param ctx the parse tree
	 */
	void enterPadding(dartParser.PaddingContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#padding}.
	 * @param ctx the parse tree
	 */
	void exitPadding(dartParser.PaddingContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#expanded}.
	 * @param ctx the parse tree
	 */
	void enterExpanded(dartParser.ExpandedContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#expanded}.
	 * @param ctx the parse tree
	 */
	void exitExpanded(dartParser.ExpandedContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#sizedbox}.
	 * @param ctx the parse tree
	 */
	void enterSizedbox(dartParser.SizedboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#sizedbox}.
	 * @param ctx the parse tree
	 */
	void exitSizedbox(dartParser.SizedboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#hieght}.
	 * @param ctx the parse tree
	 */
	void enterHieght(dartParser.HieghtContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#hieght}.
	 * @param ctx the parse tree
	 */
	void exitHieght(dartParser.HieghtContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(dartParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(dartParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#listview}.
	 * @param ctx the parse tree
	 */
	void enterListview(dartParser.ListviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#listview}.
	 * @param ctx the parse tree
	 */
	void exitListview(dartParser.ListviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#itb}.
	 * @param ctx the parse tree
	 */
	void enterItb(dartParser.ItbContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#itb}.
	 * @param ctx the parse tree
	 */
	void exitItb(dartParser.ItbContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#sb}.
	 * @param ctx the parse tree
	 */
	void enterSb(dartParser.SbContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#sb}.
	 * @param ctx the parse tree
	 */
	void exitSb(dartParser.SbContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#ic}.
	 * @param ctx the parse tree
	 */
	void enterIc(dartParser.IcContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#ic}.
	 * @param ctx the parse tree
	 */
	void exitIc(dartParser.IcContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(dartParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(dartParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#bord_rad}.
	 * @param ctx the parse tree
	 */
	void enterBord_rad(dartParser.Bord_radContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#bord_rad}.
	 * @param ctx the parse tree
	 */
	void exitBord_rad(dartParser.Bord_radContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(dartParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(dartParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#colors}.
	 * @param ctx the parse tree
	 */
	void enterColors(dartParser.ColorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#colors}.
	 * @param ctx the parse tree
	 */
	void exitColors(dartParser.ColorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#decoration}.
	 * @param ctx the parse tree
	 */
	void enterDecoration(dartParser.DecorationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#decoration}.
	 * @param ctx the parse tree
	 */
	void exitDecoration(dartParser.DecorationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(dartParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(dartParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(dartParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(dartParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#varible}.
	 * @param ctx the parse tree
	 */
	void enterVarible(dartParser.VaribleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#varible}.
	 * @param ctx the parse tree
	 */
	void exitVarible(dartParser.VaribleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#gestureDetector}.
	 * @param ctx the parse tree
	 */
	void enterGestureDetector(dartParser.GestureDetectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#gestureDetector}.
	 * @param ctx the parse tree
	 */
	void exitGestureDetector(dartParser.GestureDetectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#ontap}.
	 * @param ctx the parse tree
	 */
	void enterOntap(dartParser.OntapContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#ontap}.
	 * @param ctx the parse tree
	 */
	void exitOntap(dartParser.OntapContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#setstate}.
	 * @param ctx the parse tree
	 */
	void enterSetstate(dartParser.SetstateContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#setstate}.
	 * @param ctx the parse tree
	 */
	void exitSetstate(dartParser.SetstateContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#setstate1}.
	 * @param ctx the parse tree
	 */
	void enterSetstate1(dartParser.Setstate1Context ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#setstate1}.
	 * @param ctx the parse tree
	 */
	void exitSetstate1(dartParser.Setstate1Context ctx);
}