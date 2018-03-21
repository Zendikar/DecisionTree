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
public class Student {

    private boolean answer1, answer2, answer3, answer4;

    public Student(boolean answer1, boolean answer2, boolean answer3, boolean answer4) {
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }
    public boolean[] toArray(){
        boolean[] array = {answer1, answer2, answer3, answer4};
        return array;
    }

    public boolean isAnswer1() {
        return answer1;
    }

    public void setAnswer1(boolean answer1) {
        this.answer1 = answer1;
    }

    public boolean isAnswer2() {
        return answer2;
    }

    public void setAnswer2(boolean answer2) {
        this.answer2 = answer2;
    }

    public boolean isAnswer3() {
        return answer3;
    }

    public void setAnswer3(boolean answer3) {
        this.answer3 = answer3;
    }

    public boolean isAnswer4() {
        return answer4;
    }

    public void setAnswer4(boolean answer4) {
        this.answer4 = answer4;
    }

}
