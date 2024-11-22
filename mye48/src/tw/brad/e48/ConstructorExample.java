package tw.brad.e48;

public class ConstructorExample {
    String name;
    int age;

    // 無參數的建構式
    public ConstructorExample() {
        this.name = "Unknown";
        this.age = 0;
    }

    // 帶參數的建構式
    public ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // 使用無參數建構式
        ConstructorExample example1 = new ConstructorExample();
        example1.display(); // 輸出: Name: Unknown, Age: 0

        // 使用帶參數建構式
        ConstructorExample example2 = new ConstructorExample("Alice", 25);
        example2.display(); // 輸出: Name: Alice, Age: 25
    }
}
