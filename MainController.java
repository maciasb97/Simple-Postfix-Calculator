package com.example.main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    //variable
    @FXML
    private Label theOutcome;

    private String calcEntry = "";

    //Main Buttons
    @FXML
    protected void clearButton() {
        calcEntry = "";
        theOutcome.setText(calcEntry);
    }
    @FXML
    protected void deleteButton() {
        calcEntry = calcEntry.substring(0,calcEntry.length()-1);
        theOutcome.setText(calcEntry);
    }


    //1st Number Row Buttons
    @FXML
    protected void sevenButton() {
        if(calcEntry.equals("")){
            calcEntry = "7";
        }
        else {
            calcEntry = calcEntry + "7";
        }
        theOutcome.setText(calcEntry);
    }
    @FXML
    protected void eightButton() {
        if(calcEntry.equals("")){
            calcEntry = "8";
        }
        else{
            calcEntry = calcEntry + "8";
        }
        theOutcome.setText(calcEntry);
    }
    @FXML
    protected void nineButton() {
        if(calcEntry.equals("")){
            calcEntry = "9";
        }
        else{
            calcEntry = calcEntry + "9";
        }
        theOutcome.setText(calcEntry);
    }


    //2nd Number Row Buttons
    @FXML
    protected void fourButton() {
        if(calcEntry.equals("")){
            calcEntry = "4";
        }
        else{
            calcEntry = calcEntry + "4";
        }
        theOutcome.setText(calcEntry);
    }
    @FXML
    protected void fiveButton() {
        if(calcEntry.equals("")){
            calcEntry = "5";
        }
        else{
            calcEntry = calcEntry + "5";
        }
        theOutcome.setText(calcEntry);
    }
    @FXML
    protected void sixButton() {
        if(calcEntry.equals("")){
            calcEntry = "6";
        }
        else{
            calcEntry = calcEntry + "6";
        }
        theOutcome.setText(calcEntry);
    }



    //3rd Number Row Buttons
    @FXML
    protected void oneButton() {
        if(calcEntry.equals("")){
            calcEntry = "1";
        }
        else{
            calcEntry = calcEntry + "1";
        }
        theOutcome.setText(calcEntry);
    }
    @FXML
    protected void twoButton() {
        if(calcEntry.equals("")){
            calcEntry = "2";
        }
        else{
            calcEntry = calcEntry + "2";
        }
        theOutcome.setText(calcEntry);
    }
    @FXML
    protected void threeButton() {
        if(calcEntry.equals("")){
            calcEntry = "3";
        }
        else{
            calcEntry = calcEntry + "3";
        }
        theOutcome.setText(calcEntry);
    }
    @FXML
    protected void zeroButton() {
        if(calcEntry.equals("")){
            calcEntry = "0";
        }
        else{
            calcEntry = calcEntry + "0";
        }
        theOutcome.setText(calcEntry);
    }


    //Action Buttons
    @FXML
    protected void equalsButton() {
        //CheckBalance a = new CheckBalance();
        Calculator a = new Calculator();
        String temp = a.getAnswer(calcEntry);
        theOutcome.setText(temp);
    }

    @FXML
    protected void minusButton() {
        if(!calcEntry.equals("")){
            calcEntry = calcEntry + "-";
        }
        theOutcome.setText(calcEntry);
    }

    @FXML
    protected void multiplyButton() {
        if(!calcEntry.equals("")){
            calcEntry = calcEntry + "*";
        }
        theOutcome.setText(calcEntry);
    }

    @FXML
    protected void divideButton() {
        if(!calcEntry.equals("")){
            calcEntry = calcEntry + "/";
        }
        theOutcome.setText(calcEntry);
    }

    @FXML
    protected void plusButton() {
        if(!calcEntry.equals("")){
            calcEntry = calcEntry + "+";
        }
        theOutcome.setText(calcEntry);
    }

    @FXML
    protected void spaceButton(){
        //only if not first character in string
        if(!calcEntry.equals("")){
            calcEntry = calcEntry + " ";
        }
        theOutcome.setText(calcEntry);
    }

}