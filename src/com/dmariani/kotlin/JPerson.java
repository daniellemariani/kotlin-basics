package com.dmariani.kotlin;

/**
 * @author danielle.mariani
 */
public class JPerson {

    // attributes
    private String firstName;
    private String lastName;
    private int age;

    // constants
    private static final String DEFAULT_FIRST_NAME = "Danielle";
    private static final String DEFAULT_LAST_NAME = "Mariani";
    private static final int DEFAULT_AGE = 28;

    // first constructor
    public JPerson() {
        firstName = DEFAULT_FIRST_NAME;
        lastName = DEFAULT_LAST_NAME;
        age = DEFAULT_AGE;
    }

    // second constructor
    public JPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // other methods

    public void foo() {
        System.out.println("JPerson foo");
    }

}
