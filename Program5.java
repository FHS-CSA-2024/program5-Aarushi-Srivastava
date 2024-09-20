//import stuff here?

//Your code here
public class Program5{
    public static void main(String[] args){
        int rm=286;
        int kkm=412;
        int pfm=361;
        int bm=161;
            
        int rg=9;
        int kkg=40;
        int pfg=18;
        int bg=11;
        
        double av1= (double)rm/rg;
        double av2= (double)kkm/kkg;
        double av3= (double)pfm/pfg;
        double av4= (double)bm/bg;
        
        av1=Math.round(av1*10.0)/10.0;
        av2=Math.round(av2*10.0)/10.0;
        av3=Math.round(av3*10.0)/10.0;
        av4=Math.round(av4*10.0)/10.0;
        
        System.out.println("Royale averaged "+av1+"m/g");
        System.out.println("Koopa King averaged "+av2+"m/g");
        System.out.println("Pipe Frame averaged "+ av3+"m/g");
        System.out.println("Badwagon averaged "+av4+"m/g");
    }
}
//Paste console output below:
/*
Royale averaged 31.8m/g
Koopa King averaged 10.3m/g
Pipe Frame averaged 20.1m/g
Badwagon averaged 14.6m/g

*/
