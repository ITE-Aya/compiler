package AST.List;

import AST.string_val.stringval;

import java.util.ArrayList;

public class Varible {

    ArrayList<stringval> stringvals;
   public Varible()
    {
        this.stringvals=new ArrayList<>();
    }
    public void addChild(stringval stringval)
    {
          this.stringvals.add(stringval);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder=new StringBuilder();
      for (int i=0;i<stringvals.size();i++)
      {
          if(i>0)
              stringBuilder.append(':');
          stringBuilder.append(stringvals.get(i));

      }
        return stringBuilder.toString();
    }
}
