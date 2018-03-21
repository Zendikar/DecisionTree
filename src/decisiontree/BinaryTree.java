/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisiontree;

/**
 *
 * @author Tobias Mouer
 */
public class BinaryTree {

    private int nodeID;
    private String questAns = null;
    private BinaryTree yesBranch = null;
    private BinaryTree noBranch = null;

    public BinaryTree(int nodeID, String questAns) {
        this.nodeID = nodeID;
        this.questAns = questAns;
    }

    public int getNodeID() {
        return nodeID;
    }

    public void setNodeID(int nodeID) {
        this.nodeID = nodeID;
    }

    public String getQuestAns() {
        return questAns;
    }

    public void setQuestAns(String questAns) {
        this.questAns = questAns;
    }

    public BinaryTree getYesBranch() {
        return yesBranch;
    }

    public void setYesBranch(BinaryTree yesBranch) {
        this.yesBranch = yesBranch;
    }

    public BinaryTree getNoBranch() {
        return noBranch;
    }

    public void setNoBranch(BinaryTree noBranch) {
        this.noBranch = noBranch;
    }

    @Override
    public String toString() {
        return "BinaryTree{" + "nodeID=" + nodeID + ", questAns=" + questAns + ", yesBranch=" + yesBranch + ", noBranch=" + noBranch + '}';
    }

//    @Override
//    public String toString() {
//        return "BinaryTree{" + "questAns=" + questAns + '}';
//    }

   
    
    
}
