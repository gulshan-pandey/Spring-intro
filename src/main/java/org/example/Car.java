package org.example;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car {

    Car(){
        System.out.println("Car created...");
    }
    Engine engine;

    public void setEngine(Engine engine) {
        System.out.println("setter called...");
        this.engine = engine;
    }


    public Car(Engine engine) {
        System.out.println("Car 1 arg constructor called...");
        this.engine = engine;
    }

    public void drive() {
        int result = engine.start();
        if(result>0){
            System.out.println("car started...");
        }else {
            System.out.println("car not started...");
        }
    }


    /**
     * Bean Lifecycle-- consist of init and destroy method which can we used for cleaning up, closing connections,external works...
     */

//    @PreDestroy
//    @Override
    public void destroy() throws Exception {
        System.out.println("Car destroy method called...");
    }


//    @Override
    public void start() throws Exception {
        System.out.println("Car init method called...");
    }
}
