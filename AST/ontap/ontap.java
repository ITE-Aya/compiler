package AST.ontap;

import AST.setstate.setstate;
import AST.navigate;

public class ontap {
    setstate ss;
    navigate n;

    public ontap() {
        this.ss = new setstate();
        this.n = new navigate();
    }


    public void setSetstate(setstate ee) {
        this.ss = ee;
    }

    public void setNavigate(navigate n) {
        this.n = n;
    }

    @Override
    public String toString() {
        if (ss != null)
            return "onTap:(){setState((){" +
                    ss + "}"
                    ;
        else
            return "onTap:(){" +
                    n.toString() + "}"
                    ;
    }
}
