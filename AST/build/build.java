package AST.build;
import AST.widget.*;
public class build {
    wid wid;

    public build(){}

    public void setWid(AST.widget.wid wid) {
        this.wid = wid;
    }

    @Override
    public String toString() {
        return "Widget build(BuildContext context){return " +
                wid +
                ";}";
    }
}
