package AST.listview;

import AST.widget.Widget;
import AST.widget.wid;

public class listview extends Widget {
    itb Itb;
    sb Sb;
    ic Ic;
    wid widget;
    wid widget2;

  public   listview()
  {
      this.Ic=new ic();
      this.widget=new wid();
      this.Itb=new itb();
      this.Sb=new sb();
  }

    public void setIc(ic ic) {
        Ic = ic;
    }

    public void setItb(itb itb) {
        Itb = itb;
    }

    public void setSb(sb sb) {
        Sb = sb;
    }

    public void setWidget(wid widget) {
        this.widget = widget;
    }

    public void setWidget2(wid widget2) {
        this.widget2 = widget2;
    }

    @Override
    public String toString() {
        return "ListView.separated(" + Itb +
                 widget +
                ','+
                  Sb + widget2+','+
                  Ic +
                ')';
    }
}
