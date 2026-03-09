
package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println("🚀 Java App Running in Docker via GitHub Actions!");

        while(true){
            try{
                Thread.sleep(5000);
                System.out.println("Application is running...");
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }

}
