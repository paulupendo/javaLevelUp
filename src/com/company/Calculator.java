package com.company;

public class Calculator {

    double result;

    public double runCalc(double leftVal, double  rightVal, char opCode) {

        switch(opCode) {
            case 'd' :
               this.result = leftVal/rightVal;
               System.out.println(this.result);
               break;

            case 'm':
                this.result = leftVal * rightVal;
                System.out.println(this.result);
                break;

            case 'a':
                this.result = leftVal + rightVal;
                System.out.println(this.result);
                break;

            case 's':
                this.result = leftVal - rightVal;
                System.out.println(this.result);
                break;

            default:
                System.out.println("Oops invalid opCode");
                break;
        }
        return this.result;
    }
}





