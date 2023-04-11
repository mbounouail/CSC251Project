public class Policy {
    private String policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private int policyholderHeightInches;
    private int policyholderWeightPounds;

    // Default constructor
    public Policy() {
        policyNumber = "";
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        policyholderSmokingStatus = "";
        policyholderHeightInches = 0;
        policyholderWeightPounds = 0;
    }

    // Constructor with arguments
    public Policy(String policyNumber, String providerName, String policyholderFirstName, String policyholderLastName, int policyholderAge, String policyholderSmokingStatus, int policyholderHeightInches, int policyholderWeightPounds) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.policyholderSmokingStatus = policyholderSmokingStatus;
        this.policyholderHeightInches = policyholderHeightInches;
        this.policyholderWeightPounds = policyholderWeightPounds;
    }

    // Getters and setters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    public void setPolicyholderFirstName(String policyholderFirstName) {
        this.policyholderFirstName = policyholderFirstName;
    }

    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    public void setPolicyholderLastName(String policyholderLastName) {
        this.policyholderLastName = policyholderLastName;
    }

    public int getPolicyholderAge() {
        return policyholderAge;
    }

    public void setPolicyholderAge(int policyholderAge) {
        this.policyholderAge = policyholderAge;
    }

    public String getPolicyholderSmokingStatus() {
        return policyholderSmokingStatus;
    }

    public void setPolicyholderSmokingStatus(String policyholderSmokingStatus) {
        this.policyholderSmokingStatus = policyholderSmokingStatus;
    }

    public int getPolicyholderHeightInches() {
        return policyholderHeightInches;
    }

    public void setPolicyholderHeightInches(int policyholderHeightInches) {
        this.policyholderHeightInches = policyholderHeightInches;
    }

    public int getPolicyholderWeightPounds() {
        return policyholderWeightPounds;
    }

    public void setPolicyholderWeightPounds(int policyholderWeightPounds) {
        this.policyholderWeightPounds = policyholderWeightPounds;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        double heightInMeters = policyholderHeightInches / 39.37;
        double weightInKilos = policyholderWeightPounds / 2.205;
        return weightInKilos / (heightInMeters * heightInMeters);
    }

    // Method to calculate insurance policy price
    public double calculatePrice() {
        double baseFee = 600.0;
        double additionalFee = 0.0;

    // Check for additional fees based on age, smoking status, and BMI
    if (policyholderAge > 50) {
            additionalFee += 75.0;
    }
    if (policyholderSmokingStatus.equals("smoker")) {
            additionalFee += 100.0;
    }
    double bmi = calculateBMI();
    if (bmi > 35.0) {
        additionalFee += (bmi - 35.0) * 20.0;
    }
    return baseFee + additionalFee;
    }
}