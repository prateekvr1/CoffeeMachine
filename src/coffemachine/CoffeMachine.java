/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
Here I have created a Coffee Machine Using Java it takes user input and prints stock price and 
status of coffee the recipe and cost are private and can be changed by atuhorized user
to add a new recipe just add its class and add it to list of menus 
the machine will dispaly message when low on stock*/
package coffemachine;

/**
 *
 * @author shipi
 */
import java.util.*;
   class Ingredients{
        private static int coffee=100;
        private static  int cream=100;
        private static  int sugar=100;
        private int costsugar=25;
        private int costcream=25;
        private int costcoffee=75;
        public  int getcoffe(){
            return coffee;
        }
        public int getcream(){
            return cream;
        }
        public  int getsugar(){
            return sugar;
        }
        public  void setcoffe(int coffee){
            this.coffee=coffee;
        
        }
        public   void setcream(int cream){
            this.cream=cream;
        }
        public  void setsugar(int sugar){
            this.sugar=sugar;
        }
        public int getcreamcost(){
            return costcream;
        }
        public int getcoffeecost(){
            return costcoffee;
        }
        public int getsugarcost(){
            return costsugar;
        }
        
        
    }
     class Cappuccino extends Ingredients{
         final private int cof=5;
        final private int sug=4;
        final private int cre=3;
         private  int recipe(){
        int x=getsugar();
        int y=getcoffe();
        int z=getcream();
      
        if(x>=sug &&y>=cof&&z>=cre){
           setcoffe(x-sug);
           setcream(z-cre);
           setsugar(y-sug);
            return x+y+z;
        }
        else
            return 0;
        
    }
        public int costCoffe(){
            return (cof*getcoffeecost()+sug*getsugarcost()+cre*getcreamcost());
        }
        public  int acesrecipe(){
            return recipe();
        }
    }
        class Espresso extends Ingredients{
             final private int cof=8;
        final private int sug=3;
        final private int cre=4;
            private  int recipe(){
        
        int x=getsugar();
        int y=getcoffe();
        int z=getcream();
      
         if(x>=sug &&y>=cof&&z>=cre){
           setcoffe(x-sug);
           setcream(z-cre);
           setsugar(y-sug);
            return x+y+z;
         }
        else
            return 0;
        
    }
        public int costCoffe(){
            return (cof*getcoffeecost()+sug*getsugarcost()+cre*getcreamcost());
        }
        public  int acesrecipe(){
            return recipe();
        }
    }
        class FlatWhite extends Ingredients{
         final private int cof=5;
        final private int sug=2;
        final private int cre=4;
            private  int recipe(){
        int x=getsugar();
        int y=getcoffe();
        int z=getcream();
      
        if(x>=sug &&y>=cof&&z>=cre){
           setcoffe(x-cof);
           setcream(z-cre);
           setsugar(y-sug);
            return x+y+z;
         }
        else
            return 0;
        
    }
         public int costCoffe(){
            return (cof*getcoffeecost()+sug*getsugarcost()+cre*getcreamcost());
        }
        public  int acesrecipe(){
            return recipe();
        }
    }
           class LongBlack extends Ingredients{
        final private int cof=10;
        final private int sug=5;
        final private int cre=3;
               private  int recipe(){
        int x=getsugar();
        int y=getcoffe();
        int z=getcream();
        
 if(x>=sug &&y>=cof&&z>=cre){
           setcoffe(x-cof);
           setcream(z-cre);
           setsugar(y-sug);
            return x+y+z;
         }
        else
            return 0;
        
    }
        public int costCoffe(){
            return (cof*getcoffeecost()+sug*getsugarcost()+cre*getcreamcost());
        }
        public  int acesrecipe(){
            return recipe();
        }
    }
    
        class Mochacino extends Ingredients{
        final private int cof=15;
        final private int sug=10;
        final private int cre=8;
            private   int recipe(){
        int x=getsugar();
        int y=getcoffe();
        int z=getcream();
        
       if(x>=sug &&y>=cof&&z>=cre){
           setcoffe(x-cof);
           setcream(z-cre);
           setsugar(y-sug);
            return x+y+z;
         }
        else
            return 0;
        
    }
        public int costCoffe(){
            return (cof*getcoffeecost()+sug*getsugarcost()+cre*getcreamcost());
        }
        public  int acesrecipe(){
            return recipe();
        }
    }
public class CoffeMachine {
  
    

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str="R";
           String str1="r";
              String str2="q";
                 String str3="Q";
        
       
        ArrayList<String> menulist=new ArrayList<>();
        
        menulist.add("Espresso");
        menulist.add("Long Black");
        menulist.add("Flat White");
        menulist.add("Cappuccino");
        menulist.add("Mochacino");
        Collections.sort(menulist);
        
        
        while(true){
        System.out.println("Select a coffee");
        System.out.println("--MENU--");
        
        Ingredients ing=new Ingredients();
        System.out.println("Remaining Coffee"+ing.getcoffe());
        if(ing.getcoffe()<=10){
            System.out.println("Need to Restock");
        }
          System.out.println("Remaining Cream"+ing.getcream()); 
          if(ing.getcream()<=10){
            System.out.println("Need to Restock");
        }
          System.out.println("Remaining Sugar:"+ing.getsugar());
          if(ing.getsugar()<=10){
            System.out.println("Need to Restock");
            
        }
         
        
        
        for(int i=0;i<menulist.size();i++){
            System.out.println(menulist.get(i));
        }
        Cappuccino cap=new Cappuccino();
         Espresso es=new Espresso();
         FlatWhite fw=new FlatWhite();
           LongBlack lb=new LongBlack();
           Mochacino mc=new Mochacino();
           System.out.println("Press 1 for Cappuccino"+"Cost:"+cap.costCoffe());
        System.out.println("Press 2 for Espresso"+"Cost:"+es.costCoffe());
        System.out.println("Press 3 for Flat White "+"Cost :"+fw.costCoffe());
        System.out.println("Press 4 for Long Black"+"Cost is"+lb.costCoffe());
        System.out.println("Press 5 for Mochaccino"+"Cost is"+mc.costCoffe());
       
          System.out.println("Please Enter your choice"); 
          System.out.println("Press R or r for Restock");
         String menu=sc.next();
         System.out.println(menu);
        int tem=0;    
             if(menu.equals(str) || menu.equals(str1) ){
                 System.out.println("Enter sugar to stock");
                 int a=sc.nextInt();
                 ing.setsugar(a+ing.getsugar());
                 System.out.println("Enter Coffee to stock");
                 int b=sc.nextInt();
                 ing.setcoffe(b+ing.getcoffe());
                 System.out.println("Enter Cream to stock");
                 int c=sc.nextInt();
                 ing.setcream(c+ing.getcream());
                 
                 
             }
             else if(menu.equals(str3)|| menu.equals(str2)){
        System.out.println("Quitting the task GoodBye!!");
        break;
             }
        
        else if( menu.equals(String.valueOf(1))){
               
                tem=cap.acesrecipe();
               
                   if(tem==0){
                       System.out.println("Required material not available in stock");
               }
                   else{
                       System.out.println("Dispensing Your Desired Coffee"+"Cost is"+cap.costCoffe());
                   }
               
            }
                else if(menu.equals(String.valueOf(2))){
             
               tem=es.acesrecipe();
                 if(tem==0){
                       System.out.println("Required material not available in stock");
               }
                   else{
                       System.out.println("Dispensing Your Desired Coffee"+"Cost is"+es.costCoffe());
                   }
               
            }
            else if(menu.equals(String.valueOf(3))){
              
               tem=fw.acesrecipe();
                 if(tem==0){
                       System.out.println("Required material not available in stock");
               }
                   else{
                       System.out.println("Dispensing Your Desired Coffee"+"Cost is"+fw.costCoffe());
                   }
               
            }
            else if(menu.equals(String.valueOf(4))){
            
               tem=lb.acesrecipe();
                 if(tem==0){
                       System.out.println("Required material not available in stock");
               }
                   else{
                       System.out.println("Dispensing Your Desired Coffee"+"Cost is"+lb.costCoffe());
                   }
            }
            else if(menu.equals(String.valueOf(5))){
              
               tem=mc.acesrecipe();
                 if(tem==0){
                       System.out.println("Required material not available in stock");
               }
                   else{
                       System.out.println("Dispensing Your Desired Coffee"+"Cost is"+mc.costCoffe());
                   }
               
            }
              else{
                 System.out.println("Enter valid Command"); 
              }
           
        
        }
        System.out.println("Bye");
    }
    
}
