import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int countTrees(List<Tree> forest, double angle){
        if (forest == null || forest.isEmpty()){
            return 0;
        }
        if (forest.size() == 1){
            return 1;
        }
        if (angle < 0){ // can also throw an error...
            angle = angle * -1;
        }
        //calculate the degree from center to each tree
        for (Tree t : forest){
            t.calculateAndSetDegree(0,0);
        }
        //sort the forest by degree
        Collections.sort(forest);
        //we need to do a bit more then 1 full circle (360+angle angle)
        int currIndex = 0;
        int firstTreeIndex = 0;
        int maxTreesInAngle = 0;
        int currTreesInAngle = 0;
        while (currIndex < forest.size()){
            if (treesCanBeFoundOnSameViewAngle(forest.get(firstTreeIndex), forest.get(currIndex), angle)){
                currTreesInAngle++;
                maxTreesInAngle = Math.max(currTreesInAngle, maxTreesInAngle);
            }else{
                while(firstTreeIndex <= currIndex){ //we will move firstTreeIndex to the next tree which is relevant
                    if (treesCanBeFoundOnSameViewAngle(forest.get(firstTreeIndex), forest.get(currIndex), angle)) {
                        break; //TODO: check for edge cases (maybe should do+- 1 tree in currTreesInAngle)
                    }else{
                        currTreesInAngle--; //we will decrease by 1 currTreesInAngle
                    }
                    firstTreeIndex++;
                }
            }
            currIndex++;
            if (currIndex == forest.size()){ //we finished circle, need to keep going on angle more
                maxTreesInAngle = countTreesFromCertainIndexToAngleMore(forest, angle, firstTreeIndex,
                        currTreesInAngle, maxTreesInAngle);
            }
        }

        return maxTreesInAngle;
    }

    //could have made a more complicated implementation that uses only 1 while loop in countTrees function
    //decided to keep it Stupid&Simple with a bit of duplication (if I had more time I would have done that)
    private static int countTreesFromCertainIndexToAngleMore(List<Tree> forest, double angle, int firstTreeIndex,
                                                             int currTreesInAngle, int maxTreesInAngle) {
        int currIndex = 0;
        while (firstTreeIndex < forest.size() && forest.get(currIndex).getDegreeFromCenter() <= angle){
            if (treesCanBeFoundOnSameViewAngle(forest.get(firstTreeIndex), forest.get(currIndex), angle)){
                currTreesInAngle++;
                maxTreesInAngle = Math.max(currTreesInAngle, maxTreesInAngle);
            }else{
                while(firstTreeIndex <= forest.size()){ //we will move firstTreeIndex to the next tree which is relevant
                    if (treesCanBeFoundOnSameViewAngle(forest.get(firstTreeIndex), forest.get(currIndex), angle)) {
                        break; //TODO: check for edge cases (maybe should do+- 1 tree in currTreesInAngle)
                    }else{
                        currTreesInAngle--; //we will decrease by 1 currTreesInAngle
                    }
                    firstTreeIndex++;
                }
            }
            currIndex++;
        }
        return maxTreesInAngle;
    }


    public static boolean treesCanBeFoundOnSameViewAngle(Tree t1, Tree t2, double angle){
        return Math.abs(t1.getDegreeFromCenter() - t2.getDegreeFromCenter()) <= angle;

    }

    public static void main(String[] args) {

        List<Tree> forest = new ArrayList<Tree>();
        double angle = 12.0;
        Tree tree1 = new Tree(40,50);
        Tree tree2 = new Tree(40,80);
        forest.add(tree1);
        forest.add(tree2);
        System.out.println(countTrees(forest, angle));
    }
}
