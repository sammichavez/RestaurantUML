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

    public void addItem(MenuItem m){
        order[itemCount] = m;
        itemCount++;
    }
    public MenuItem[] getItems(){

    }
    public double getTotalPrice(){
         double total = 0;
         for(int i = 0; i< itemCount; i++){
             total += order[i].getItemPrice();
         }
            return total;
    }
    public int getdeterminePrepTime(){

    }

    public String toString() {
        return super.toString();
    }
}
