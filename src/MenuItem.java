public class MenuItem {
    private Ingredient[] ingredients = new Ingredient[10];
    private String name;
    private int ingredientCount = 0;
    private int prepTime = 0;

    public MenuItem(String name , int prepTime) {
        this.name = name;

        this.prepTime = prepTime;

    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

   public void addIngredient(Ingredient i){
        ingredients[ingredientCount] = i;
        ingredientCount++;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getItemPrice(){
        double total = 0;
        for(int i = 0; i < ingredientCount; i++){
            total += ingredients[i].getPrice();
        }
        return total;
    }
    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }


}