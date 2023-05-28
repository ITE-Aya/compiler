package AST.sizedBox;

import AST.widget.Widget;

import java.util.ArrayList;

public class SizedBox extends Widget {

    height height;
    width width;

    public SizedBox()
    {

    }

    public void addChild(height height)
    {
        this.height=height;

    }
   public void addChild2(width width)
    {
        this.width=width;
    }

    @Override
    public String toString() {
        if(height==null)
        {
            return "SizedBox("+ width +
                    ')';
        }
        else if(width==null)
        {
            return "SizedBox(" + height+
                    ')';
        }
        else
        return "SizedBox(" + height+',' + width +
                ')';
    }
}
