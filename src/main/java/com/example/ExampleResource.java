package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Path("/apidue")
public class ExampleResource {

    private static Logger log = LoggerFactory.getLogger(ExampleResource.class);

    @GET
    @Path("/hi")
    public String hi() {
        log.info("Access /hi");
        return "Hi\n";
    }

    @GET
    @Path("/getneutrinoflow")
    public String neutrinoFlow() {
        log.info("Access /getNeutrinoFlow");

        long leftLimit = 1000000L;
        long rightLimit = 10000000L;
        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        return "Sei attraversato da "+generatedLong+" neutrini\n";
    }

    @GET
    @Path("/randomneutrino")
    public String randomNeutrino() {
        log.info("Access /randomNeutrino");

        List<String> greetings = Arrays.asList("neutrino elettronico", "neutrino tau", "neutrino muonico");
        Random rand = new Random();

        int randomNum = rand.nextInt(greetings.size());
        return greetings.get(randomNum);
    }
}
