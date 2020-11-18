package com.codegym;

public class Number {
    private int firstNumber;
    private int secondNumber;
    public int divine;
    public Number(int x, int y){
        this.firstNumber = x;
        this.secondNumber = y;
    }

    public int sum(){
        int sum = firstNumber + secondNumber;
        return sum;
    }
    public void divine(){
        divine = firstNumber / secondNumber;

    }
}
