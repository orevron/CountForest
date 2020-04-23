import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MainTest {

    @Test
    void countTrees1() {

        List<Tree> forest = new ArrayList<Tree>();
        double angle = 15.0;
        Tree tree1 = new Tree(40,50);
        Tree tree2 = new Tree(40,80);
        forest.add(tree1);
        forest.add(tree2);
        Assertions.assertEquals(2, Main.countTrees(forest, angle));
    }

    @Test
    void countTrees2() {

        List<Tree> forest = new ArrayList<Tree>();
        double angle = 15.0;
        Tree tree1 = new Tree(40,50);
        Tree tree2 = new Tree(40,150);
        forest.add(tree1);
        forest.add(tree2);
        Assertions.assertEquals(1, Main.countTrees(forest, angle));
    }

    @Test
    void countTreesWithCongruent() {

        List<Tree> forest = new ArrayList<Tree>();
        double angle = 90.0;
        Tree tree1 = new Tree(40,40);
        Tree tree2 = new Tree(40,-40);
        Tree tree3 = new Tree(-40,40);
        Tree tree4 = new Tree(-40,-40);
        forest.add(tree1);
        forest.add(tree2);
        forest.add(tree3);
        forest.add(tree4);
        Assertions.assertEquals(2, Main.countTrees(forest, angle));
    }

    @Test
    void countTreesWithMaxAtTheEnd() {

        List<Tree> forest = new ArrayList<Tree>();
        double angle = 90.0;
        Tree tree1 = new Tree(40,40);
        Tree tree2 = new Tree(40,-40);
        Tree tree3 = new Tree(-40,40);
        Tree tree4 = new Tree(-52,50);
        Tree tree5 = new Tree(-63,60);
        Tree tree6 = new Tree(-40,-40);
        forest.add(tree1);
        forest.add(tree2);
        forest.add(tree3);
        forest.add(tree4);
        forest.add(tree5);
        forest.add(tree6);
        Assertions.assertEquals(4, Main.countTrees(forest, angle));
    }


    @Test
    void countTreesEmptyForest() {

        List<Tree> forest = new ArrayList<Tree>();
        double angle = 90.0;
        Assertions.assertEquals(0, Main.countTrees(forest, angle));
    }

 @Test
    void countTreesNullForest() {

        double angle = 90.0;
        Assertions.assertEquals(0, Main.countTrees(null, angle));
    }

 @Test
    void countTreesZeroAngel() {
     List<Tree> forest = new ArrayList<Tree>();
     double angle = 0.0;
     Tree tree1 = new Tree(40,40);
     Tree tree2 = new Tree(40,-40);
     Tree tree3 = new Tree(-40,40);
     Tree tree4 = new Tree(-52,50);
     Tree tree5 = new Tree(-63,60);
     Tree tree6 = new Tree(-40,-40);
     forest.add(tree1);
     forest.add(tree2);
     forest.add(tree3);
     forest.add(tree4);
     forest.add(tree5);
     forest.add(tree6);

     Assertions.assertEquals(1, Main.countTrees(forest, angle));
    }

@Test
    void countTrees360Angel() {
     List<Tree> forest = new ArrayList<Tree>();
     double angle = 360.0;
     Tree tree1 = new Tree(40,40);
     Tree tree2 = new Tree(40,-40);
     Tree tree3 = new Tree(-40,40);
     Tree tree4 = new Tree(-52,50);
     Tree tree5 = new Tree(-63,60);
     Tree tree6 = new Tree(-40,-40);
     forest.add(tree1);
     forest.add(tree2);
     forest.add(tree3);
     forest.add(tree4);
     forest.add(tree5);
     forest.add(tree6);

     Assertions.assertEquals(forest.size(), Main.countTrees(forest, angle));
    }

@Test
    void countTreesBigAngel() {
     List<Tree> forest = new ArrayList<Tree>();
     double angle = 350.0;
     Tree tree1 = new Tree(40,40);
     Tree tree2 = new Tree(40,-40);
     Tree tree3 = new Tree(-40,40);
     Tree tree4 = new Tree(-52,50);
     Tree tree5 = new Tree(-63,60);
     Tree tree6 = new Tree(-40,-40);
     forest.add(tree1);
     forest.add(tree2);
     forest.add(tree3);
     forest.add(tree4);
     forest.add(tree5);
     forest.add(tree6);

     Assertions.assertEquals(forest.size(), Main.countTrees(forest, angle));
    }


}