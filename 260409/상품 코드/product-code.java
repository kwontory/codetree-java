import java.util.*;

class Product {
    String name;
    int code;

    public Product() {
        this.name = "codetree";
        this.code = 50;
        print();
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
        print();
    }
    void print() {
        System.out.printf("product %d is %s\n", this.code, this.name);
    }
    
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();
        Product p2 = new Product(sc.next(), sc.nextInt());
    }
}