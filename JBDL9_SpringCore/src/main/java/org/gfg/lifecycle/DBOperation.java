package org.gfg.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DBOperation implements InitializingBean, DisposableBean {

    boolean isConnectedToDB = false;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Connected to DB");
        isConnectedToDB = true;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Connection closed");
        isConnectedToDB = false;
    }

   /* public void initMethod(){
        System.out.println("Connected to DB");
        isConnectedToDB = true;
    }

    public void destroyMethod(){
        System.out.println("Connection closed");
        isConnectedToDB = false;
    }*/



}
