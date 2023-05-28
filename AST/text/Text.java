package AST.text;

import AST.string_val.stringval;
import AST.widget.Widget;

import java.util.ArrayList;

public class Text  extends Widget {
ArrayList<stringval> text;
 ArrayList<String> string;
public Text()
{

    this.text=new ArrayList<>();
    this.string=new ArrayList<>();
}


    public void addChild(stringval s)

{
text.add(s);
}


    public void setString(String string) {
        this.string.add(string);
    }

    @Override
    public String toString() {
        if(string.size()==0)
        {
            if (text.get(0)==null)
                return "Text('') ";
            return "Text("+text.get(0)+")";
        }
        else if(text.size()==0)
        {
            return "Text("+string.get(0)+")";
        }
        else
            return "Text("+string.get(0)+"[index]"+"["+text.get(0)+"])";

    }
}
