# Journal
Write your Journal questions and notes here.

# Phase 1 Journal

I used a `final int` constant for the array size because the capacity should stay the same and not be changed accidentally. When an array index contains an object, I can access information from that object. When an index is `null`, it means there is no object assigned to that slot yet.

# Phase 2 Journal

A `double` can store decimal numbers, while an `int` only stores whole numbers. When I cast a `double` to an `int`, the decimal part is removed. Java makes me explicitly cast because converting from a `double` to an `int` can cause data to be lost.

# Phase 3 Journal

The two array elements showed the same change because both runes were connected to the same RuneCore object. When I changed the power source through the first rune, the second rune saw the change too. A primitive variable stores its actual value, while a reference variable stores the location of an object in memory.

# Phase 4 Journal

For Phase 4, I used a for loop to go through every index in the runes array. I used runes. length in the loop so it stays within the boundaries of the array. Before accessing a rune's information, 1 checked if runes[1] I- null. This prevents a NullPointerException and allows the program to print a message when a slot is empty.
For my presentation, this code will help me demonstrate how to access array elements using indexes and how the loop goes through each slot in the array. Using runes length also shows the boundaries of the array. The array has a fixed capacity of 5, so its size cannot be changed at runtime. Some slots can be empty, which is why checking for null is important.