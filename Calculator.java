package com.example.main;

import java.util.Stack;

public class Calculator {

    String getAnswer(String prob){
        return setAnswer(prob);
    }

    String setAnswer(String prob){
        String temp = "";
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prob.length(); i++) {
            char c = prob.charAt(i);
            int x,y;
            switch (c) {
                //if number char, add to string "temp"
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    if(temp.equals("")){
                        temp = String.valueOf(c);
                    }
                    else{
                        temp = temp + String.valueOf(c);
                    }
                    break;
                //if temp is empty replace first char with prob char
                case ' ':
                    boolean errCheck = false;
                    //checks if item to be added to stack is a number
                    if(temp.equals("") || temp.equals(" ") || temp.equals("+") || temp.equals("*") || temp.equals("-") || temp.equals("/")){
                        errCheck = true;
                    }
                    if(errCheck == true){
                        return "ERROR";
                    }
                    else{
                        stack.push(Integer.parseInt(temp));
                        temp = "";
                    }
                    break;
                //if the symbol is +
                case '+':
                    if(stack.size() < 2){
                        return "ERROR";
                    }
                    else{
                        x = stack.pop();
                        y = stack.pop();
                        stack.push(x + y);
                        i++;    //advances past operator because stack will be empty when space occurs
                    }
                    break;
                //if the symbol is *
                case '*':
                    if(stack.size() < 2){
                        return "ERROR";
                    }
                    else{
                        x = stack.pop();
                        y = stack.pop();
                        stack.push(x * y);
                        i++;
                    }
                    break;
                //if the symbol is -
                case '-':
                    if(stack.size() < 2){
                        return "ERROR";
                    }
                    else{
                        x = stack.pop();
                        y = stack.pop();
                        stack.push(y - x);
                        i++;
                    }
                    break;
                //if the symbol is /
                case '/':
                    if(stack.size() < 2){
                        return "ERROR";
                    }
                    else{
                        x = stack.pop();
                        y = stack.pop();
                        if(x == 0)
                        {
                            return "ERROR";
                        }
                        else{
                            stack.push(y / x);
                        }
                        i++;
                    }
                    break;
            }
        }
        return String.valueOf(stack.pop());
    }

}
