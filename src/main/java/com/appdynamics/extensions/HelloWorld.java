package com.appdynamics.extensions;

/**
 * @author: {Vishaka Sekar} on {4/16/19}
 */
public class HelloWorld {
    public static void main(String args[]){
        System.out.println("SayHello");
        sayHelloOnFeaturebranch();
    }

    public static void sayHelloOnFeaturebranch(){
        System.out.println("Saying Hello oN Feature branch");
    }
}
