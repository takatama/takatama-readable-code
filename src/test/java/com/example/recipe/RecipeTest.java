package com.example.recipe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RecipeTest {

    @Test
    public void testGetTitle() throws Exception {
        Recipe recipe = new Recipe("オムライス");
        assertThat(recipe.getTitle(), is("オムライス"));
    }
}