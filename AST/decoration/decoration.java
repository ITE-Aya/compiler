package AST.decoration;

public class decoration {
    col col;
    border border;

    public decoration() {
        this.col = new col();
        this.border = new border();
    }

    public void addchild(col col,border border) {
        this.col = col;
        this.border = border;
    }

    @Override
    public String toString() {
        return "decoration: BoxDecoration(" +
                "\n"+ "color: "+col +","+
                "\n" + border +
                "\n"+
                ')';
    }
}
