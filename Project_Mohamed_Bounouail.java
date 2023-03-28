import java.util.Scanner;

public class Policy {

    // Declare instance variables to store policy information
    private int policyNumber; // policy number
    private String providerName; // name of insurance provider
    private String policyholderFirstName; // first name of policyholder
    private String policyholderLastName; // last name of policyholder
    private int policyholderAge; // age of policyholder
    private String policyholderSmokingStatus; // smoking status of policyholder
    private double policyholderHeight; // height of policyholder in inches
    private double policyholderWeight; // weight of policyholder in pounds

    // No-arg constructor that sets default values for all fields
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "Unknown";
        this.policyholderFirstName = "Unknown";
        this.policyholderLastName = "Unknown";
        this.policyholderAge = 0;
        this.policyholderSmokingStatus = "Unknown";
        this.policyholderHeight = 0;
        this.policyholderWeight = 0;
    }

    // Constructor that accepts arguments to fully initialize the Policy object
    public Policy(int policyNumber, String providerName, String policyholderFirstName, String policyholderLastName, int policyholderAge, String policyholderSmokingStatus, double policyholderHeight, double policyholderWeight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.policyholderSmokingStatus = policyholderSmokingStatus;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
    }

    // Getter and setter methods for each instance variable
    public int getPolicyNumber() {
        return this.policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getPolicyholderFirstName() {
        return this.policyholderFirstName;
    }

    public void setPolicyholderFirstName(String policyholderFirstName) {
        this.policyholderFirstName = policyholderFirstName;
    }

    public String getPolicyholderLastName() {
        return this.policyholderLastName;
    }

    public void setPolicyholderLastName(String policyholderLastName) {
        this.policyholderLastName = policyholderLastName;
    }

    public int getPolicyholderAge() {
        return this.policyholderAge;
    }

    public void setPolicyholderAge(int policyholderAge) {
        this.policyholderAge = policyholderAge;
    }

    public String getPolicyholderSmokingStatus() {
        return this.policyholderSmokingStatus;
    }

    public void setPolicyholderSmokingStatus(String policyholderSmokingStatus) {
        this.policyholderSmokingStatus = policyholderSmokingStatus;
    }

    public double getPolicyholderHeight() {
        return this.policyholderHeight;
    }

    public void setPolicyholderHeight(double policyholderHeight) {
        this.policyholderHeight = policyholderHeight;
    }

    public double getPolicyholderWeight() {
        return this.policyholderWeight;
    }

    public void setPolicyholderWeight(double policyholderWeight) {
        this.policyholderWeight = policyholderWeight;
    }

    // Method to calculate the BMI of the policyholder
    public double calculateBMI() {
        double bmi = (this.policyholderWeight * 703) / (this.policyholderHeight *
