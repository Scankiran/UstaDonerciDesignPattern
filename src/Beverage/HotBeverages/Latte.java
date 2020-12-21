package Beverage.HotBeverages;

import Beverage.HotBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latte extends HotBeverage {
    private double cost = 3.5;
    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public void brew() {
        System.out.println("Dripping Latte through filter");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding extra milk");
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
        System.out.println("Would you like extra milk? --- 1.5$ (y/n)");

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
