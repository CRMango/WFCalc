import java.util.Scanner;
import java.util.Random;
public class Calc{
    public static void main(String[]args){
        ValueHolder all = new ValueHolder();
        int loop=1;
        while(loop==1){
        Scanner sc = new Scanner(System.in);
        String input = "hi";
        int input2 = 2;
        System.out.println("This is (supposedly) a build calculator for WF");
        System.out.println("What do you want to test?");
        System.out.println("1: Warframes 2: Weapons");
        input=sc.nextInt();
        if(input2==1){
            while(loop==1){
                System.out.println("What Warframe will you choose?");
                System.out.println("Ash, Banshee, Loki, Atlas, Ivara, Frost, Ember, Chroma, Saryn, Vauban, Nekros, Excalibur,");
                System.out.println("Oberon, Inaros, Mirage, Mesa, Nova, Nyx, Valkyr, Mag, Trinity, Volt, Nezha, Wukong, Hydroid,");
                System.out.println("Rhino, Limbo, Equinox, or Zephyr.");
                
            }
            
        } else if(input2==2){
            while(loop==1){
                
            }
            
        } else {
            System.out.println("Please use 1 or 2 to enter the builder.");
        }
        
        }
        
    }
    
}
