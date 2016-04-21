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
                String wf=sc.nextLine();
                all.whatFrame(wf);
                
            }
            
        } else if(input2==2){
            while(loop==1){
                System.out.println("1:Rifles, 2:Shotguns or 3:Melee?");
                String wep = "hdo";
                input2=sc.nextInt();
                if(input2==1){
                    System.out.println("1: Soma or 2: Latron?");
                    input2=sc.nextInt();
                    if(input2==1){
                        wep="soma";
                        all.whatRifle(wep);
                    } else if(input2==2){
                        wep="Latron";
                        all.whatRifle(wep);
                    }
                } else if(input2==2){
                    System.out.println("1: Hek or 2: Boar?");
                    input2=sc.nextInt();
                    
                    if(input2==1){
                        wep="hek";
                        all.whatShotgun(wep);
                    } else if(input2==2){
                        wep="boar";
                        all.whatShotgun(wep);
                    }
                } else if(input2==3){
                    
                }
                int orikin=0;
                while(loop=1){
                System.out.println(wep+": 30");
                if(orikin==1){
                    System.out.println("Potato Installed");
                }
                System.out.println("[ ] [ ] [ ] [ ]");
                System.out.println("[ ] [ ] [ ] [ ]");
                System.out.println("enter forma to add a polarity, orikin to add/remove a catalyst, mod to add a mod, remove to remove one, switch to switch mods");
                input=sc.nextLine();
                if(input.equalsIgnoreCase("forma")){
                    
                } else if(input.equalsIgnoreCase("orikin"){
                    
                } else if(input.equalsIgnoreCase("mod")){
                    
                } else if(input.equalsIgnoreCase("remove")){
                    
                } else if(input.equalsIgnoreCase("switch")){
                    
                } else {
                    System.out.println("Huh? Enter that again.");
                }
                }
            }
            
        } else {
            System.out.println("Please use 1 or 2 to enter the builder.");
        }
        
        }
        
    }
    
}
