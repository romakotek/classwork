package com.company.lesson_18.Task_1;

public class Phone {
    private String phoneNumber;
    private String model;
    private double weight;

    //region CONSTRUCTORS
    public Phone() {

    }

    public Phone(String phoneNumber, String model, double weight) {
        this(phoneNumber, model);
//      this.model = model;
        this.weight = weight;
    }

    public Phone(String phoneNumber, String model) {
        this.phoneNumber = phoneNumber;
        this.model = model;
    }
//endregion

    //region GETTERS/SETTERS

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //endregion

    //region METHODS
    public void receiveCall(String name) {
        System.out.println(name + " calls");
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println(name + " calls (" + phoneNumber + ")");
    }

    public void sendMessage (String [] phoneNumbers){
        for (int i = 0; i < phoneNumbers.length; i++){
            System.out.println(phoneNumbers[i]);
        }
    }
//    public void sendMessage (String... phoneNumbers){
//        for (int i = 0; i<phoneNumbers.length; i++){
//            System.out.println(phoneNumbers[i]);
//        }
//    }
    //endregion

//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    @Override
    public String toString() {
        return "Phone { phoneNumber = " + phoneNumber + ", model = " + model + ", weight = " + weight + " }";
    }
}
