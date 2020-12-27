package Beverage.HotBeverages;

import Beverage.HotBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cappuccino extends HotBeverage {
    private double cost = 3.5;
    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Cappucino";
    }

    @Override
    public void brew() {
        System.out.println("Dripping Cappucino through filter");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding extra sugar");
    }

    //Hook
    public boolean customerWantsCondiment(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            cost = cost + 0.5;
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like extra sugar? --- 0.5$ (y/n)");

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
