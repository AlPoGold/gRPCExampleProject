package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {

        Server server = ServerBuilder
                .forPort(8443)
                .addService(new GreetingServiceImpl())
                .build();

        server.start();
        System.out.println("Server was started!");

        server.awaitTermination();

    }
}
