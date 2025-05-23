public class Item {
    private  int id;
    private String name;

    public Item() {
        this(2, "Book");
    }

    public Item(int id, String name) {
        // thisがないと、引数自身の代入
        id = id;
        name = name;
    }

    public void dipplay() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        new Item(1, "Apple").dipplay();
        new Item().dipplay();
    }
}
