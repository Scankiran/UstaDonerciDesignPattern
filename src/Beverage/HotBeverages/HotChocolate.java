package Beverage.HotBeverages;

import Beverage.HotBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotChocolate extends HotBeverage {
    private double cost = 2.5;
    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public void brew() {
        System.out.println("Preparing Your delicious hot chocolate ");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding extra chocolate");
    }

    //Hook
    public boolean customerWantsCondiment(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            cost = cost + 1.5;
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like extra chocolate? --- 1.0$ (y/n)");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(answer == null){
            answer = "no";
        }

        return answer;
    }
}
