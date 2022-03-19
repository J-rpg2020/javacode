package com.assignment.results;

public class test {
    public static void main(String[]args){
        String name1="Mark";
         String name2="Mark";
         String name3="Mary";
        if(name1.equals(name2)) {
            System.out.println(name1 +" and "+ name2 + " are the same");
        }
          else{
              System.out.println(name1 + "and" + name2 + " are NOT the same");
        }
          if(name1.equals(name3)){
              System.out.println(name1 + " and " + name3 + " are the same");
          }
          else{
              System.out.println(name1 + " and " + name3 + " are NOT the same");
          }
    }
}
