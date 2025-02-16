package org.example;

import org.example.Common.Symbol;
import org.example.Pojo.People;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.printResult();
    }

    private void printResult() {
        String request = "张三#18#男";
        String[] split = request.split(Symbol.pound);
        People people = new People();
        List<Consumer<String>> consumers = new ArrayList<>(List.of(
                people::setName,
                (age) -> people.setAge(Integer.parseInt(age)),
                people::setSex
        ));
        for (int i = 0; i < consumers.size(); i++) {
            consumers.get(i).accept(split[i]);
        }
        System.out.println(people);
    }
}