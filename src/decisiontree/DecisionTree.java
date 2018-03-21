/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisiontree;

import java.util.LinkedHashMap;

/**
 *
 * @author Tobias Mouer
 */
public class DecisionTree {

    public final static String[] questions = {"Read textbook", "Hand ins made in time", "Attend lectures", "Make exercises",
        "You could easily fail the exam", "You should be able to pass the exam"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TreeHandler tree = new TreeHandler(new LinkedHashMap<Integer, BinaryTree>());
        // 0 root node
        tree.setRootNode(questions[0]);
        tree.addNode(0, questions[1], true);
        tree.addNode(0, questions[1], false);

        tree.addNode(1, questions[2], true);
        //x
        tree.addNode(1, questions[4], false);

        tree.addNode(3, questions[3], true);
        tree.addNode(3, questions[3], false);

        tree.addNode(5, questions[5], true);
        tree.addNode(5, questions[5], false);

        tree.addNode(6, questions[5], true);
        tree.addNode(6, questions[4], false);

        tree.addNode(2, questions[2], true);
        //x
        tree.addNode(2, questions[4], false);

        tree.addNode(11, questions[5], true);
        tree.addNode(11, questions[4], false);

        tree.addNode(13, questions[5], true);
        tree.addNode(13, questions[5], false);

//        System.out.println(tree.toString());
        System.out.println(tree.getResult(tree.getTree().get(0), new Student(true, true, true, true)));
        System.out.println(tree.getResult(tree.getTree().get(0), new Student(true, false, true, true)));
        System.out.println(tree.getTree().get(0));
    }

}
