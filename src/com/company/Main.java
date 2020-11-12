package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int numJobs = 100;
        Job[] jobs = autoCreateJobs(numJobs);
        var queue = new PriorityQueue_ArrayHeap<>(10, jobs[0]);
        CPU<?> cpu = new CPU<>(jobs, queue);
        cpu.processJobs();

    }

    public static Job[] autoCreateJobs(int number){
        Job[] jobs = new Job[number];
        Random rand;
        for(int i = 0; i < number; i++){
            rand = new Random();
            jobs[i] = new Job("J"+i, 1 + rand.nextInt(70),  1 + rand.nextInt(40));
        }
        return jobs;
    }
}
