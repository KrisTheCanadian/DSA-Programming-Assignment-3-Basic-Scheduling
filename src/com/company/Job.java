package com.company;


public class Job {
    String jobName;
    int jobLength; //between 1 and 70
    int currentJobLength;
    int jobPriority; //between 1 and 40 (1 being the highest)
    int finalPriority;
    long entryTime;
    long endTime;
    long waitTime;

    Job(String jobName, int jobLength, int jobPriority){
        entryTime = System.currentTimeMillis();
        this.jobName = jobName;
        this.jobLength = jobLength;
        this.jobPriority = jobPriority;
        this.finalPriority = jobPriority;
        currentJobLength = jobLength;
    }

}
