// 1. Ye file 'app' package me hai
package app;

// 2. 'calculator' package se 'Calculator' class ko yahan mangwao (IMPORT karo)
import Calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        // 3. Dusre package ki class ka object banao
        Calculator calc = new Calculator();
    

    //4. uska mathod call karo
    int result = calc.add(20,30);
    System.out.print("Result hai:"+ result);
    
}
}


// 1. Compile Command (Code ko build karne ke liye)
//----------- javac calculator/Calculator.java app/Main.java
// Isse kya hoga: Ye dono .java files ko check karega aur unki .class files bana dega.

//2. Run Command (Program chalaane ke liye)
//---------------- java app.Main
// Isse kya hoga: Ye app package ke andar jo Main class hai usko execute karega.




// Direct Method (Alternative Command)
// Agar aap saari files ko ek saath auto-compile karna chahte hain:

// Bash
// javac -d . calculator/*.java app/*.java
// Bash
// java app.Main
// Dhyan rakhein: java command chalate waqt hamesha package_name.Class_Name (app.Main) hi likhna hai, .java ya .class mat lagana.