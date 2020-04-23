import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {





    public static int countTrees(List<Tree> forest, double angle){
        //calculate the degree from center to each tree
        for (Tree t : forest){
            t.calculateAndSetDegree(0,0);
        }
        //sort the forest by degree
        Collections.sort(forest);
        

        return 0;
    }

    public static void main(String[] args) {

        List<Tree> forest = new ArrayList<Tree>();
        double angle = 10.0;
        Tree tree1 = new Tree(40,50);
        tree1.calculateAndSetDegree(0,0);
        System.out.println(tree1.getDegreeFromCenter());
        System.out.println(countTrees(forest, angle));
    }
}
