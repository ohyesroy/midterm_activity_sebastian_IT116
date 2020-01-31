/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

/**
 *
 * @author it11609
 */
public class Human {

    private String skin_color = "brown";
    private String eye_color = "black";
    private String gender = "boy";
    private int height = 198;
    private int weight = 89;
    private int age = 41;
    private String race = "American";
    private String name = "Kobe Bryant";
    
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        Human a = new Human ();
        children b = new children();
        
        System.out.println("skin color - "+a.skin_color);
        System.out.println("eye color - "+a.eye_color);
        System.out.println("gender : "+a.gender);
        System.out.println("height : "+a.height);
        System.out.println("weight : "+a.weight);
        System.out.println("age : "+a.age);
        System.out.println("race : "+a.race);
        System.out.println("name : "+a.name);
        System.out.println("intellegince rating - "+b.intellegince_rating);
        System.out.println("mood rating - "+b.mood_rating);
        System.out.println("genetic disease - "+b.genetic_disease[0]);
        System.out.println("wealth rating - "+b.wealth_rating);

    }
    
}
