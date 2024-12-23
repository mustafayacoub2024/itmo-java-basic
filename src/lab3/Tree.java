package lab3;

public class Tree {
    int age;
    boolean aliveOrNotAlive;
    String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean aliveOrNotAlive, String name) {
        this.age = age;
        this.aliveOrNotAlive = aliveOrNotAlive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Возраст дерево " + age +
               ", живое ли дерево " + aliveOrNotAlive +
               ", название дерево '" + name + '\'';
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(150, "Берёза");
        Tree tree3 = new Tree(125, true, "Елка");

        tree1.age = 35;
        tree1.aliveOrNotAlive = true;
        tree1.name = "Сосна";

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}