public class Employee {
    int id;
    String name;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name, int id) {
        this(id); // コンストラクタの呼び出しは最初に書く
        this.name = name;
    }

    public void showEmployeeInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Duke", 0);
        emp.showEmployeeInfo();
    }
}

