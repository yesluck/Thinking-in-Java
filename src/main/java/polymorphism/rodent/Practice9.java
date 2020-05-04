package polymorphism.rodent;

public class Practice9 {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster()};
        for (int i = 0; i < 3; i++)
            rodents[i].bite();
    }
}

/* output:
Mouse bite
Gerbil bite
Hamster bite
 */