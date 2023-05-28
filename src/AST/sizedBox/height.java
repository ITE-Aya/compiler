package AST.sizedBox;

public class height extends sar {
    String height;

    public height() {
        this.height = new String();
    }

    public void addChild(String text) {
        this.height = new String(text);
    }

    @Override
    public String toString() {
        return "" +
                "height:" + height;
    }
}
