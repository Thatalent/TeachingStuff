package Experimental.VideoGame;

public class CriticalHit {

 public boolean landCritical(float attackCrit, int enemyLuck){
     boolean critHit = false;
     double actualCritChance = attackCrit / enemyLuck;
     if(Math.random() <= actualCritChance){
         critHit = true;
         System.out.print("You got a crit! :D");
     }
     return critHit;
 }
}