package com.example.publishSubscriber.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "publishedData")
public class PublishedData {

    @Id
    private String id;
    private String publishMasterId;
    private String publishSector;
    private String publishMessage;
    private boolean fetchedForBroker;
    private boolean column1; // New column
    private boolean column2; // New column

    // Constructors
    public PublishedData() {
        // Default constructor
        this.fetchedForBroker = false;
        this.column1 = false; // Set the default value to false
        this.column2 = false; // Set the default value to false
    }

    public PublishedData(String id, String publishMasterId, String publishSector, String publishMessage, boolean fetchedForBroker, boolean column1, boolean column2) {
        this.id = id;
        this.publishMasterId = publishMasterId;
        this.publishSector = publishSector;
        this.publishMessage = publishMessage;
        this.fetchedForBroker = fetchedForBroker;
        this.column1 = column1;
        this.column2 = column2;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublishMasterId() {
        return publishMasterId;
    }

    public void setPublishMasterId(String publishMasterId) {
        this.publishMasterId = publishMasterId;
    }

    public String getPublishSector() {
        return publishSector;
    }

    public void setPublishSector(String publishSector) {
        this.publishSector = publishSector;
    }

    public String getPublishMessage() {
        return publishMessage;
    }

    public void setPublishMessage(String publishMessage) {
        this.publishMessage = publishMessage;
    }

    public boolean isFetchedForBroker() {
        return fetchedForBroker;
    }

    public void setFetchedForBroker(boolean fetchedForBroker) {
        this.fetchedForBroker = fetchedForBroker;
    }

    public boolean isColumn1() {
        return column1;
    }

    public void setColumn1(boolean column1) {
        this.column1 = column1;
    }

    public boolean isColumn2() {
        return column2;
    }

    public void setColumn2(boolean column2) {
        this.column2 = column2;
    }

    // Other methods...
}
