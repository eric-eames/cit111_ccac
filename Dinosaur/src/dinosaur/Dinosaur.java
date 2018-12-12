/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinosaur;
import java.util.Random;
/**
 *
 * @author eric.eames
 */
public class Dinosaur {

        public int weight;
        public String name;
        public boolean canFly;
        public String food;
        public int height;
        public Boolean feathers;
        public Boolean aquatic;
        public int strength;
        private static int populationTown = 400;
        private static int populationAtlantis = 1200;
        
        public void feed(){
            System.out.println("You just fed " + name + " " + food);
        }
        
        public void attackTown(){
            Random rand = new Random();
            int numCasualtiesTown = rand.nextInt(populationTown);
            System.out.println(name + " attacked a Village of 400. There were " + numCasualtiesTown + " Casualties");
        }
        
        public void attackAtlantis(){
            Random rand = new Random();
            int numCasualtiesAtlantis = rand.nextInt(populationAtlantis);
            System.out.println(name + " has attacked Atlantis, A town of 1200. There were " +numCasualtiesAtlantis + " casualties");
        }
}
    