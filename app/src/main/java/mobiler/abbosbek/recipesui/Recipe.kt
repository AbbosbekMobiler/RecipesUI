package mobiler.abbosbek.recipesui

import androidx.annotation.DrawableRes

data class Recipe(
    val title : String,
    val category : String,
    val cookingTime : String,
    val energy : String,
    val rating : String,
    val description : String,
    val reviews : String,
    val ingredient : List<Ingredient>
)

data class Ingredient(@DrawableRes val image : Int,val title : String, val subtitle : String)

val strawberryCake = Recipe(
    title =     "Strawberry Cake",
    category = "Dessert",
    cookingTime = "50 min",
    energy = "620 kcal",
    rating = "4.9",
    description = "This dessert is very testy and not difficult to prepare.Also,you can replace strawberries with any other berry yo like,",
    reviews = "84 photos     430 commits",
    ingredient = listOf(
        Ingredient(R.drawable.flour,"Flour","450 g"),
        Ingredient(R.drawable.eggs,"Eggs","4"),
        Ingredient(R.drawable.juce,"Lemon Juice","150 g"),
        Ingredient(R.drawable.strawberry,"Strawberry","200 g"),
        Ingredient(R.drawable.sugar,"Sugar","1 cup"),
        Ingredient(R.drawable.mind,"Mind","20 g"),
        Ingredient(R.drawable.vanilla,"Vanila","1/2 teaspoon"),
    )
)