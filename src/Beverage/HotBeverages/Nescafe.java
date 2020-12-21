package Beverage.HotBeverages;

import Beverage.HotBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nescafe extends HotBeverage {
    private double cost = 1.0;
    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Nescafe";
    }

    @Override
    public void brew() {
        System.out.println("Melting Nescafe on water");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding sugar");
    }

    //Hook
    public boolean customerWantsCondiment(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            cost = cost - 0.25;
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like extra sugar? --- (-0.25$) (y/n)");

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
