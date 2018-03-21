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
public class TreeHandler {

    private final LinkedHashMap<Integer, BinaryTree> tree;

    public LinkedHashMap<Integer, BinaryTree> getTree() {
        return tree;
    }

    public TreeHandler(LinkedHashMap<Integer, BinaryTree> tree) {
        this.tree = tree;
    }

    public void setRootNode(String quest) {
        tree.put(0, new BinaryTree(0, quest));
    }

    public void addNode(int existingNode, String question, boolean yesnoNode) {
        if (yesnoNode) {
            BinaryTree node = new BinaryTree(tree.size(), question);
            tree.get(existingNode).setYesBranch(node);
            tree.put(tree.size(), node);

        } else {
            BinaryTree node = new BinaryTree(tree.size(), question);
            tree.get(existingNode).setNoBranch(node);
            tree.put(tree.size(), node);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < tree.size(); i++) {
            s = s + tree.get(i).toString();
        }
        return s;
    }
    public String getResult(BinaryTree start, Student s){
        BinaryTree node = start;
        for (int i = 0; i < s.toArray().length; i++){
            node = getResult(node, s.toArray()[i]);
        }
        return node.getQuestAns();
    }

    public BinaryTree getResult(BinaryTree start, boolean yesNo) {
        if (yesNo) {
            if (start.getYesBranch() == null) {
                return tree.get(start.getNodeID());
            }
            return tree.get(start.getYesBranch().getNodeID());
        } else {
            if (start.getYesBranch() == null) {
                return tree.get(start.getNodeID());
            }
            return tree.get(start.getNoBranch().getNodeID());
        }

    }

}
