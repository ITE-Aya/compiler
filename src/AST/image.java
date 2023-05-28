package AST;

import AST.val.*;

import java.util.*;
import AST.string_val.*;
import AST.widget.Widget;

public class image extends Widget {
    ArrayList <stringval>stringval;
    ArrayList <varname>varname;
    boolean fit;
    public image(){
        stringval=new ArrayList<>();
        varname=new ArrayList<>();
        fit=false;
    }

    public void addstringval(stringval s){
        stringval.add(s);

    }
    public void addvarname(varname v){
        varname.add(v);
    }
    public void setFit(){
        fit=true;
    }

    @Override
    public String toString() {
       if (varname.size()==0){
           StringBuilder s=new StringBuilder();
           s.append(stringval.get(0));
           if (fit){
               return "Image.asset ( "+s.toString()+",fit:BoxFill.fill)\n";
           }else{
               return "Image.asset ( "+s.toString()+" )\n";
           }
       }else if (stringval.size()==0){

           StringBuilder s=new StringBuilder();
           s.append(varname.get(0));
           if (fit){
               return "Image.asset ( ( "+s.toString()+" ) ,fit:BoxFit.fill)\n";
           }else{
               return "Image.asset ( "+s.toString()+" )\n";
           }
       }else {
           StringBuilder s=new StringBuilder();
           s.append(stringval.get(0));
           StringBuilder a=new StringBuilder();
           a.append(varname.get(0));
           if (fit){
               return "Image.asset ( "+a.toString()+" [index]["+s.toString()+"],fit:BoxFit.fill)\n";
           }else {
               return "Image.asset ( "+a.toString()+" [index]["+s.toString()+"])";
           }
       }





    }
}
