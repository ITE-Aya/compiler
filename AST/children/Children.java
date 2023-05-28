package AST.children;

import AST.ifDart.IfDart;
import AST.widget.wid;

import java.util.ArrayList;
import java.util.List;

public class Children {
    List<IfDart> child1= new ArrayList<IfDart>();
    List<wid> child2=new ArrayList<wid>();

    public List<IfDart> getChild1() {
        return child1;
    }

    public List<wid> getChild2() {
        return child2;
    }

    public void setChild1(List<IfDart> child1) {
        this.child1 = child1;
    }

    public void setChild2(List<wid> child2) {
        this.child2 = child2;
    }

    @Override
   public String toString() {
        StringBuilder s=new StringBuilder();
        if(child1.size()>0){
            s.append(child1.get(0).toString());
            for (int i=1;i<child1.size();i++){
                s.append(',');
                s.append(child2.get(i-1).toString());
                s.append(',');
                s.append(child1.get(i).toString());
            }
            return "children:["+s.toString()+"]";
        }else {
            StringBuilder ifd2=new StringBuilder();
            for (int i = 0; i < child2.size(); i++) {
            if (i>0)
                ifd2.append(',');
            ifd2.append(child2.get(i).toString());


        }
            return  "children:["+ifd2.toString()+"]";

        }
//        StringBuilder ifd=new StringBuilder();
//        for (int i = 0; i < child1.size(); i++) {
//            if (i>0)
//                ifd.append(',');
//            ifd.append(child1.get(i).toString());
//
//        }
//        StringBuilder ifd2=new StringBuilder();
//        for (int i = 0; i < child2.size(); i++) {
//            if (i>0)
//                ifd2.append(',');
//            ifd2.append(child2.get(i).toString());
//
//
//        }
//        return "children:[" + ifd.toString() +""+ ifd2.toString() +
//                ']';
    }
}