package main.java.homework_6;

abstract class Figure {
   protected String name;

   Figure(String name){
       this.name = name;
   }
   abstract void showName();
   public String getName() {
       return name;
   }


}
