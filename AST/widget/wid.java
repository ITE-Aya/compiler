package AST.widget;

import AST.text.Text;

public class wid {
 public    Widget widget;
 public    wid(){
 }
 public void addChild(Widget widget)
 {
     this.widget=widget;
 }


    @Override
    public String toString() {
        return  widget.toString() ;
    }
}
