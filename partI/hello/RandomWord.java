import edu.princeton.cs.algs4.Knuth;

public class RandomWord {

    public static void main(String[] args) {

        Knuth.shuffle(args);

        for (String arg: args) {
            System.out.print(arg+" ");
        }

    }
}
