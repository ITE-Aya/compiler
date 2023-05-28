package app;

import AST.flutter;

import Visit.*;
import Compiler.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String []args) {
      try{
          String source="Files/ss.txt";
          CharStream charStream=fromFileName(source);
          dartLexer lexer=new dartLexer(charStream);
          CommonTokenStream commonTokenStream=new CommonTokenStream(lexer);
          dartParser parser=new dartParser(commonTokenStream);
          dartParser.FlutterContext parseTree=parser.flutter();
          visit v=new visit();
         flutter imp= (flutter) v.visit(parseTree);
          System.out.println("-------------------------\n\n\n");
          System.out.println(imp);

      }catch (Exception exception){}
    }




}
