public class Table {
    int l = 0;
    private String name;
    private int itemCount = 0;
    private MenuItem[] order = new MenuItem[10];

    public Table(String name, MenuItem[] order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(MenuItem m) {
        order[itemCount] = m;
        itemCount++;
    }

    public MenuItem[] getItems() {
    return MenuItem[];
    }

    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += order[i].getItemPrice();
        }
        return total;
    }

    public int determinePrepTime() {
        int y = 0;
        for (int i = 0; i < order.length; i++) {
            if (order[i].getPrepTime() > y) {
                y = order[i].getPrepTime();
            }
        }
        return y;
    }


    public String toString() {
        String x = "";
        String c = "";
        for (int i = 0; i < order.length; i++) {
            if (order[i] != null) {
                x = x + " " + order[i].getName();
            }
        }
    String b = "Table " + name + " ordered:" + c  + "." + "It will take " + c + " minutes. The total cost will be: "
            + l + " dollars.";
        return b;
    }
}
