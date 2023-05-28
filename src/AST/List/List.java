package AST.List;

import java.util.ArrayList;

public class List {
    ArrayList<Object>objects;
    String val;

    public List()
    {
        this.objects=new ArrayList<>();
    }

    public void addChild(Object object)
    {
        objects.add(object);
    }

    public void setVal(String val) {
        this.val = new String(val);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("List "+val+"=[ \n");
       for(int i=0;i<objects.size();i++)
       {
           if(i>0)
               stringBuilder.append(",\n");
           stringBuilder.append('{');
           stringBuilder.append('\n');
           stringBuilder.append(objects.get(i));
           stringBuilder.append('}');

           stringBuilder.append('\n');
       }
            stringBuilder.append("];\n");
        return stringBuilder.toString();

    }

}
