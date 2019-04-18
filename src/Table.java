public class Table {
     private String name;
     private int itemCount = 0;
     private MenuItem[] order = new MenuItem[10];
    public Table(String name, int itemCount, MenuItem[] order) {
        this.name = name;
        this.itemCount = itemCount;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
