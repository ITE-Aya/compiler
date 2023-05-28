package AST.sizedBox;

public class width extends sar{
    String width;

    public  width()
    {
        this.width=new String();
    }
    public void addChild(String text)
    {
        this.width=new String(text);
    }

    @Override
    public String toString() {
        return "" +
                "width:" + width  ;
    }
}
