public class ValueHolder{
 static double hp;
static  double shields;
static  double powermax;
static  double armor;
static  double sprintspeed;
  
static  double impactdmg;
static  double slashdmg;
static  double punctrdmg;
static  double toxindmg;
static  double heatdmg;
static  double colddmg;
static  double elecdmg;
static  double magnetdmg;
static  double blastdmg;
static  double viraldmg;
static  double gasdmg;
static  double raddmg;
static  double corrosivedmg;
static  double statuschance;
static  double critchance;
static  double critmultiplier;
  
static  double flightspeed;
static  double maxammo;
static  double reloadspeed;
static  double magazinesize;
static  double firerate;
static  double accuracy;
  
  
  public void whatFrame(String v){
    if(v.equalsIgnoreCase("Excalibur")){
      hp=100;
      shields=100;
      armor=225;
      power=100;
      sprintspeed=1;
      
    } else if(v.equalsIgnoreCase("Loki")){
      hp=75;
      shields=75;
      armor=65;
      power=150;
      sprintspeed=1.25;
      
    }
  }
  public void whatRifle(String d){
    if(d.equalsIgnoreCase("Soma")){
      magazinesize=100;
      firerate=15;
      impactdmg=1;
      punctrdmg=4;
      slashdmg=5;
      critchance=0.3;
      critmultiplier=3;
      statuschance=0.07;
      reloadspeed=3;
      accuracy=28.6;
      maxammo=540;
      flightspeed=0;
    } else if(d.equalsIgnoreCase("Latron")){
      magazinesize=15;
      firerate=4.2;
      reloadspeed=2.4;
      critchance=0.1;
      critmultiplier=2;
      statuschance=0.1;
      maxammo=540;
      punctrdmg=38.5;
      slashdmg=8.2;
      impactdmg=8.3;
      accuracy=28.6;
      flightspeed=0;
    }
  }
  public void whatShotgun(String s){
    if(s.equalsIgnoreCase("hek")){
      critchance=0.1;
      critmultiplier=2;
      statuschance=0.25;
      magazinesize=4;
      reloadspeed=2;
      impactdmg=78.75;
      punctrdmg=341.25;
      slashdmg=105;
      firerate=2.17;
      accuracy=9.1;
      maxammo=120;
      flightspeed=0;
  } else if(s.equalsIgnoreCase("boar")){
    critchance=0.1;
    critmultiplier=1.5;
    statuschance=0.2;
    impactdmg=96.8;
    slashdmg=52.8;
    punctrdmg=26.4;
    reloadspeed=2.7;
    magazinesize=20;
    accuracy=5;
    maxammo=120;
    flightspeed=0;
  }
  
}
