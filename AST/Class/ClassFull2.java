package AST.Class;

import AST.build.build;
import AST.declarevar;
import AST.*;

import java.util.ArrayList;

public class ClassFull2 {

  //  ArrayList<varname> varnames;
    String v1,v2;
    ArrayList<declarevar> declarevars;
   initState initState;
    AST.build.build build;
    public ClassFull2 (){}
    public ClassFull2 (String v1,String  v2){
        this.v1=v1;
        this.v2=v2;
        declarevars=new ArrayList<>();

    }



    public void setInitState(AST.initState initState) {
        this.initState = initState;
    }

    public void setBuild(build build) {
        this.build = build;
    }
    public void adddeclarevar(declarevar declarevar){
        declarevars.add(declarevar);

    }
//    public void addvarname(varname declarevar){
//        varnames.add(declarevar);
//
//    }

    @Override
    public String toString() {
        if (declarevars.size()!=0){

            StringBuilder s=new StringBuilder();
            for (int i = 0; i < declarevars.size(); i++) {
                s.append(declarevars.get(i));
                //s.append('\n');
            }
            return "class "+ v1
                    +" extends State<"+v2+">{ \n"+s.toString()+
                    "@override\n"+
                    initState+"\n"+"@override\n"+
                    build+"\n}"
                    ;}
        return "class "+ v1
                +" extends State<"+v2+">{ \n"+
                "@override\n"+
                initState+"\n"+"@override\n"+
                build+"\n}"
                ;
    }
}
