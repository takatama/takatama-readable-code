package com.example.recipe;

/**
 * Created by takatama on 15/03/19.
 */
public class Console {
    static void log(Recipe recipe) {
        System.out.println(recipe.getTitle());
    }

    public static void main(String[] args) {
        Recipe recipe = new Recipe("オムライス");
        Console.log(recipe);
    }
}
