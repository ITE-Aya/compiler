package Visit;

import AST.*;
import AST.Class.*;
import AST.Class.Class;
import AST.Import.Import;
import AST.List.List;
import AST.List.Objects;
import AST.List.Varible;
import AST.Row.Row;
import AST.appBar.AppBar;
import AST.body.body;
import AST.build.build;
import AST.child.Child;
import AST.children.Children;
import AST.column.COLUMN;
import AST.container.Container;
import AST.decoration.border;
import AST.decoration.col;
import AST.decoration.decoration;
import AST.expanded.Expanded;
import AST.gesture.gestureDetector;
import AST.ifDart.IfDart;
import AST.listview.ic;
import AST.listview.itb;
import AST.listview.listview;
import AST.listview.sb;
import AST.main.main;
import AST.main.runapp;
import AST.material_app.debugmode;
import AST.material_app.home;
import AST.material_app.materialapp;
import AST.ontap.ontap;
import AST.padding.Padding;
import AST.padding.Padding1;
import AST.scaffold.Scaffold;
import AST.setstate.setstate;
import AST.setstate.setstate1;
import AST.sizedBox.SizedBox;
import AST.sizedBox.height;
import AST.sizedBox.width;
import AST.string_val.stringval;
import AST.text.Text;
import AST.val.boolval;
import AST.val.numval;
import AST.val.val;
import AST.widget.wid;
import SymbolTable.scope;
import SymbolTable.*;
import Compiler.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class visit extends dartParserBaseVisitor {
    symbolTable st = new symbolTable();
    scope currentScope;
    RuntimeException e;
    ArrayList<String> myPackage = new ArrayList<>(Arrays.asList("package:flutter/cupertino.dart","package:flutter/material.dart","package:flutter/rendering.dart"));

    @Override
    public navigate visitNavigate_screen(dartParser.Navigate_screenContext ctx) {
        String to = ctx.TO().getText();
        String off = ctx.OFF().getText();
        varname v = new varname();
        v.setString(ctx.VAR_NAME().toString());
        navigate n;
        if (to != null)
            n = new navigate(v.toString(), to);
        else
            n = new navigate(v.toString(), off);

        return n;
    }

    @Override
    public flutter visitFlutter(dartParser.FlutterContext ctx) {
        currentScope = new scope(null);
        flutter flutter = new flutter();

        for (int i = 0; i < ctx.imporT().size(); i++) {
            flutter.addimport(visitImporT(ctx.imporT().get(i)));
        }
        for (int i = 0; i < ctx.list().size(); i++) {
            flutter.addlist(visitList(ctx.list().get(i)));
        }
        for (int i = 0; i < ctx.class_().size(); i++) {
            flutter.addclass(visitClass(ctx.class_().get(i)));
        }

        flutter.setMain(visitMain(ctx.main()));
        st.addScopes(currentScope);
        st.printSymbols();
        return flutter;
    }

    @Override
    public Import visitImporT(dartParser.ImporTContext ctx) {
        Import I = new Import();
        I.addchild(visitString_val(ctx.string_val()));
     //   I.checkArray(myPackage);
        return I;
    }

    @Override
    public Class visitClass(dartParser.ClassContext ctx) {
        Class clas = new Class();
        if (ctx.class_full() != null) {
            clas.addCF(visitClass_full(ctx.class_full()));
        } else clas.addCL(visitClass_less(ctx.class_less()));

        return clas;
    }

    @Override
    public ClassFull visitClass_full(dartParser.Class_fullContext ctx) {

        ClassFull classFull = new ClassFull();
        classFull.setClassFull1(visitClass_full1(ctx.class_full1()));
        classFull.setClassFull2(visitClass_full2(ctx.class_full2()));

        return classFull;
    }

    @Override
    public ClassFull1 visitClass_full1(dartParser.Class_full1Context ctx) {

        varname v = new varname();
        state s = new state();
        v.setString(ctx.VAR_NAME().toString());
        if (currentScope.lookup(ctx.VAR_NAME().toString()) != null) {
            e = new RuntimeException("the class " + ctx.VAR_NAME().toString() + " already found");
            System.out.println(e.toString());
            throw e;
        }
        currentScope.define(new symbol(v.toString(), "stateFullWidget", currentScope));
        s = visitState(ctx.state());
        ClassFull1 c = new ClassFull1();
        c.setChild1(v);
        c.setChild2(s);
        return c;
    }

    @Override

    public ClassFull2 visitClass_full2(dartParser.Class_full2Context ctx) {
        String v1 = ctx.VAR_NAME(0).toString();
        String v2 = ctx.VAR_NAME(1).toString();

        if (currentScope.lookup(v2) == null) {
            e = new RuntimeException("dynamic dosen't confirm to the bound stateFullWidget of the type parameter T ");
            System.out.println(e.toString() + ctx.start.getLine());
            throw e;
        }
        if (currentScope.lookup(ctx.VAR_NAME(0).toString()) != null) {
            e = new RuntimeException("the class " + ctx.VAR_NAME(0).getText() + "  already found");
            System.out.println(e.toString());
            throw e;
        }
        currentScope.define(new symbol(v1, "state", currentScope));
        currentScope = new scope(currentScope);
        ClassFull2 classFull2 = new ClassFull2(ctx.VAR_NAME(0).toString(), v2);
        for (int i = 0; i < ctx.declear_var().size(); i++) {
            classFull2.adddeclarevar((visitDeclear_var(ctx.declear_var(i))));
        }
        classFull2.setBuild(visitBuild(ctx.build()));

        classFull2.setInitState(visitInitstate(ctx.initstate()));
        st.addScopes(currentScope);
        currentScope = currentScope.getParentScope();
        return classFull2;
    }

    @Override
    public ClassLess visitClass_less(dartParser.Class_lessContext ctx) {
        ClassLess classLess = new ClassLess();
        varname v = new varname();
        v.setString(ctx.VAR_NAME().toString());
        classLess.setVarname(v);
        if (currentScope.lookup(ctx.VAR_NAME().toString()) != null) {
            e = new RuntimeException("the class " + ctx.VAR_NAME().toString() + "already found");
            System.out.println(e.toString());
            throw e;
        }
        currentScope.define(new symbol(ctx.VAR_NAME().toString(), "stateLessWidget", currentScope));

//        currentScope = new scope(currentScope);

        classLess.setBuild(visitBuild(ctx.build()));
        for (int i = 0; i < ctx.declear_var().size(); i++) {
            classLess.adddeclarevar((visitDeclear_var(ctx.declear_var(i))));
        }
//        st.addScopes(currentScope);
//        currentScope = currentScope.getParentScope();
        return classLess;
    }

    //list
// ***********************************************************
    @Override
    public List visitList(dartParser.ListContext ctx) {
        List list = new List();
        list.setVal(ctx.VAR_NAME().getText());
        if (currentScope.lookup(ctx.VAR_NAME().getText()) != null) {
            e = new RuntimeException("the list" + ctx.VAR_NAME().getText() + " cannot defined ");
            System.out.println(e.toString());
            throw e;
        }
        currentScope.define(new symbol(ctx.VAR_NAME().getText(), "list", currentScope));
        for (int i = 0; i < ctx.object().size(); i++) {
            list.addChild(visitObject(ctx.object(i)));
        }
        return list;
    }

    @Override
    public Objects visitObject(dartParser.ObjectContext ctx) {
        Objects objects = new Objects();
        for (int i = 0; i < ctx.varible().size(); i++) {
            objects.addChild(visitVarible(ctx.varible(i)));
        }
        return objects;
    }

    @Override
    public Varible visitVarible(dartParser.VaribleContext ctx) {
        Varible varible = new Varible();
        for (int i = 0; i < ctx.string_val().size(); i++) {
            varible.addChild(visitString_val(ctx.string_val(i)));
        }
        return varible;
    }

    @Override
    public stringval visitString_val(dartParser.String_valContext ctx) {
        if (ctx.STRING_VAL() != null) {

            stringval stringval = new stringval();

            stringval.addArrayList(ctx.STRING_VAL().toString());
            return stringval;
        }
        return null;

    }


    @Override
    public SizedBox visitSizedbox(dartParser.SizedboxContext ctx) {
        SizedBox sizedBox = new SizedBox();

        return sizedBox;

    }

    @Override
    public height visitHieght(dartParser.HieghtContext ctx) {
        height height = new height();
        height.addChild(ctx.NUM_VAL().toString());
        return height;
    }

    @Override
    public width visitWidth(dartParser.WidthContext ctx) {
        width width = new width();
        width.addChild(ctx.NUM_VAL().toString());
        return width;
    }

    @Override
    public Expanded visitExpanded(dartParser.ExpandedContext ctx) {

        Expanded expanded = new Expanded();
        expanded.addChild(visitChild(ctx.child()));
        return expanded;
    }

    @Override
    public wid visitWidget(dartParser.WidgetContext ctx) {
        wid w = new wid();
        if (ctx.text() != null) {
            w.addChild(visitText(ctx.text()));
        } else if (ctx.expanded() != null) {
            w.addChild(visitExpanded(ctx.expanded()));
        } else if (ctx.column() != null) {
            w.addChild(visitColumn(ctx.column()));
        } else if (ctx.padding() != null) {
            w.addChild(visitPadding(ctx.padding()));
        } else if (ctx.image() != null) {
            w.addChild(visitImage(ctx.image()));
        } else if (ctx.row() != null) {
            w.addChild(visitRow(ctx.row()));
        } else if (ctx.scaffold() != null) {
            w.addChild(visitScaffold(ctx.scaffold()));
        } else if (ctx.materialapp() != null) {
            w.addChild(visitMaterialapp(ctx.materialapp()));
        } else if (ctx.container() != null) {
            w.addChild(visitContainer(ctx.container()));
        } else if (ctx.listview() != null) {
            w.addChild(visitListview(ctx.listview()));
        } else if (ctx.sizedbox() != null) {
            w.addChild(visitSizedbox(ctx.sizedbox()));
        } else if (ctx.gestureDetector() != null) {
            w.addChild(visitGestureDetector(ctx.gestureDetector()));
        }
        return w;
    }

    @Override
    public COLUMN visitColumn(dartParser.ColumnContext ctx) {
        COLUMN colo = new COLUMN();
        if (ctx.children() != null)
            colo.addchild(visitChildren(ctx.children()));
        return colo;
    }

    @Override
    public IfDart visitIfdart(dartParser.IfdartContext ctx) {
        IfDart id = new IfDart();
        if (currentScope.lookup(ctx.VAR_NAME().getText()) == null) {
            e = new RuntimeException("variable for condition if not found " + ctx.start.getLine());
            System.out.print(e);
            throw e;
        }
        id.setString(ctx.VAR_NAME().getText());
        id.addchild1(visitString_val(ctx.string_val()));
        for (int i = 0; i < ctx.widget().size(); i++)
            id.getChild2().add(visitWidget(ctx.widget(i)));
        return id;
    }


    @Override
    public Text visitText(dartParser.TextContext ctx) {

        Text text = new Text();
        if (ctx.VAR_NAME() == null && ctx.string_val() == null) {
            return text;
        }
        if (ctx.VAR_NAME() == null) {
            text.addChild(visitString_val(ctx.string_val()));
        } else if (ctx.string_val() == null) {
            System.out.println(currentScope);
            if (currentScope.lookup(ctx.VAR_NAME().toString()) == null) {
                e = new RuntimeException("var name not found already ");
                System.out.println(e + "" + ctx.start.getLine());
                throw e;
            }
            text.setString(ctx.VAR_NAME().toString());
        } else {
            if (currentScope.lookup(ctx.VAR_NAME().toString()) == null) {
                e = new RuntimeException("var name not found already ");
                System.out.println(e + "" + ctx.start.getLine());
                throw e;
            }
            text.addChild(visitString_val(ctx.string_val()));
            text.setString(ctx.VAR_NAME().toString());
        }
        return text;
    }

    @Override
    public Child visitChild(dartParser.ChildContext ctx) {

        Child child = new Child();
        child.addChild(visitWidget(ctx.widget()));
        return child;
    }

    @Override
    public Padding1 visitPadding1(dartParser.Padding1Context ctx) {
        Padding1 padding1 = new Padding1();

        return padding1;
    }

    @Override
    public Padding visitPadding(dartParser.PaddingContext ctx) {
        Padding padding = new Padding();
        padding.addChild(visitChild(ctx.child()), visitPadding1(ctx.padding1()));
        return padding;
    }


    @Override
    public setstate1 visitSetstate1(dartParser.Setstate1Context ctx) {

        setstate1 set = new setstate1();
        set.addchild(ctx.VAR_NAME(0).toString(), ctx.VAR_NAME(1).toString(), visitString_val(ctx.string_val()));

        return set;
    }

    @Override
    public setstate visitSetstate(dartParser.SetstateContext ctx) {
        setstate s = new setstate();
        for (int i = 0; i < ctx.setstate1().size(); i++)
            s.addchild(visitSetstate1(ctx.setstate1(i)));
        return s;
    }

    @Override
    public ontap visitOntap(dartParser.OntapContext ctx) {
        ontap s = new ontap();
        if (ctx.setstate() != null)
            s.setSetstate(visitSetstate(ctx.setstate()));
        if (ctx.navigate_screen() != null)
            s.setNavigate(visitNavigate_screen(ctx.navigate_screen()));
        return s;

    }

    @Override
    public gestureDetector visitGestureDetector(dartParser.GestureDetectorContext ctx) {
        gestureDetector s = new gestureDetector();
        s.addchild(visitOntap(ctx.ontap()));
        s.setChild(visitChild(ctx.child()));
        return s;

    }

    @Override
    public Container visitContainer(dartParser.ContainerContext ctx) {
        Container container = new Container();
        container.addChild(visitPadding1(ctx.padding1()), visitChild(ctx.child()), visitDecoration(ctx.decoration()));
        return container;
    }

    @Override
    public border visitBord_rad(dartParser.Bord_radContext ctx) {
        border border = new border();
        border.addmode(ctx.BORDER2().getText(), ctx.CIRCULAR().getText(), Integer.parseInt(ctx.NUM_VAL().toString()));

        return border;
    }

    @Override
    public col visitColors(dartParser.ColorsContext ctx) {
        col Col = new col();
        Col.setCol(ctx.COL().getText());
        return Col;
    }

    @Override
    public decoration visitDecoration(dartParser.DecorationContext ctx) {
        decoration decoration = new decoration();
        decoration.addchild(visitColors(ctx.color().colors()), visitBord_rad(ctx.bord_rad()));
        return decoration;
    }

    @Override
    public Scaffold visitScaffold(dartParser.ScaffoldContext ctx) {

        Scaffold scaffold = new Scaffold();
        scaffold.addChild(visitBody(ctx.body()), visitAppbar(ctx.appbar()));
        return scaffold;
    }

    @Override
    public AppBar visitAppbar(dartParser.AppbarContext ctx) {
        AppBar appBar = new AppBar();
        appBar.addChild(visitColors(ctx.colors()));
        return appBar;
    }

    @Override
    public body visitBody(dartParser.BodyContext ctx) {
        body body = new body();
        body.addChild(visitWidget(ctx.widget()));
        return body;
    }

    @Override
    public Row visitRow(dartParser.RowContext ctx) {
        Row ro = new Row();
        if (ctx.children() != null)
            ro.addchild(visitChildren(ctx.children()));
        return ro;
    }

    @Override
    public Children visitChildren(dartParser.ChildrenContext ctx) {
        Children chis = new Children();
        for (int i = 0; i < ctx.ifdart().size(); i++) {
            if (ctx.ifdart() != null)
                chis.getChild1().add(visitIfdart(ctx.ifdart(i)));

        }
        for (int i = 0; i < ctx.widget().size(); i++) {
            if (ctx.widget() != null)
                chis.getChild2().add(visitWidget(ctx.widget(i)));

        }
        return chis;
    }

    //----------
    @Override
    public main visitMain(dartParser.MainContext ctx) {
        runapp r = visitRunapp(ctx.runapp());
        main m = new main();
        m.setchild(r);
        return m;

    }

    @Override
    public runapp visitRunapp(dartParser.RunappContext ctx) {
        varname v = new varname();
        v.setString(ctx.VAR_NAME().toString());
        runapp r = new runapp();
        r.setchild(v);
        if (currentScope.lookup(ctx.VAR_NAME().toString()) == null) {
            e = new RuntimeException("The function" +ctx.VAR_NAME().toString()+ "isn't defined");
            System.out.println(e.toString());
            throw e;
        }
        return r;
    }

    @Override
    public state visitState(dartParser.StateContext ctx) {
        varname v1 = new varname();
        varname v2 = new varname();
        state s = new state();
        v1.setString(ctx.VAR_NAME(0).toString());
        v2.setString(ctx.VAR_NAME(1).toString());
        s.setChild1(v1);
        s.setChild2(v2);
        return s;
    }

    @Override
    public val visitVal(dartParser.ValContext ctx) {
        val v = new val();
        if (ctx.string_val() != null) {
            v.setV(visitString_val(ctx.string_val()));
        } else if (ctx.BOOL_VAL() != null) {
            boolval b = new boolval();
            b.setChild(ctx.BOOL_VAL().toString());
            v.setV(b);
        } else if (ctx.NUM_VAL() != null) {
            numval b = new numval();
            b.setString(ctx.NUM_VAL().toString());
            v.setV(b);
        }
        return v;
    }

    @Override
    public declarevar visitDeclear_var(dartParser.Declear_varContext ctx) {
        declarevar v = new declarevar();
        if(ctx.TYPE()!=null)////////////////////
        v.setType(ctx.TYPE().toString());
        for (int i = 0; i < ctx.VAR_NAME().size(); i++) {
            varname name = new varname();
            name.setString(ctx.VAR_NAME(i).toString());
            v.addvarnames(name);
            if (ctx.val(i) != null) {
                val value = visitVal(ctx.val(i));
                v.addval(value);
            }

            if (currentScope.lookup(ctx.VAR_NAME(i).toString()) != null) {
                e = new RuntimeException("variable already found");
                System.out.println(e.toString());
                throw e;
            }
            if (v.semanticType(ctx.TYPE().toString(), visitVal(ctx.val(i)))) {
                symbol s1 = new symbol(ctx.VAR_NAME(i).toString(), ctx.TYPE().toString(), currentScope);
                currentScope.define(s1);
            }
        }
        return v;
    }

    @Override
    public itb visitItb(dartParser.ItbContext ctx) {
        itb i = new itb();
        return i;
    }

    @Override
    public ic visitIc(dartParser.IcContext ctx) {
        ic IC = new ic();
        if (ctx.NUM_VAL() != null) {
            numval n = new numval();
            n.setString(ctx.NUM_VAL().toString());
            IC.setChild2(n);
            return IC;
        } else {
            varname v = new varname();
            v.setString(ctx.VAR_NAME(0).toString());
            IC.addchild1(v);
            v = new varname();
            v.setString(ctx.VAR_NAME(1).toString());
            IC.addchild1(v);
            return IC;
        }


    }

    @Override
    public sb visitSb(dartParser.SbContext ctx) {
        sb s = new sb();
        return s;
    }

    @Override
    public image visitImage(dartParser.ImageContext ctx) {
        image i = new image();
        if (ctx.FIT() != null) {
            i.setFit();
        }
        if (ctx.VAR_NAME() != null) {
            varname v = new varname();
            v.setString(ctx.VAR_NAME().toString());
//            if (currentScope.lookup(ctx.VAR_NAME().toString()) == null) {
//                e = new RuntimeException("variable not found");
//                System.out.println(e.toString());
//                throw e;
//            }
            i.addvarname(v);
        }
        if (ctx.string_val() != null) {
            stringval s = visitString_val(ctx.string_val());
            i.addstringval(s);
        }
        return i;
    }

    @Override
    public listview visitListview(dartParser.ListviewContext ctx) {
        listview listview = new listview();
        listview.setIc(visitIc(ctx.ic()));
        listview.setItb(visitItb(ctx.itb()));
        listview.setWidget(visitWidget(ctx.widget(0)));
        listview.setWidget2(visitWidget(ctx.widget(1)));
        listview.setSb(visitSb(ctx.sb()));
        return listview;

    }


    @Override
    public materialapp visitMaterialapp(dartParser.MaterialappContext ctx) {
        materialapp materialapp = new materialapp();
        materialapp.addchild(visitHome(ctx.home()), visitDebugshowmode(ctx.debugshowmode()));
        return materialapp;
    }

    @Override
    public debugmode visitDebugshowmode(dartParser.DebugshowmodeContext ctx) {
        debugmode debugmode = new debugmode();

        debugmode.addmode(ctx.BOOL_VAL().toString());
        return debugmode;
    }

    @Override
    public home visitHome(dartParser.HomeContext ctx) {
        home home = new home();
        home.addmode(ctx.VAR_NAME().toString());
        return home;
    }

    @Override
    public build visitBuild(dartParser.BuildContext ctx) {
        build build = new build();
        build.setWid(visitWidget(ctx.widget()));
        return build;
    }

    @Override
    public initState visitInitstate(dartParser.InitstateContext ctx) {
        initState initState = new initState();
        return initState;

    }

}
