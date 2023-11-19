package uk.co.dpmatheson.datatypes;

public class Variables {

    public static final String PUBLIC_STATIC_FINAL_CONSTANT = "This is a public static final constant";
    public final String PUBLIC_FINAL_CONSTANT = "This is a public final constant";

    private String attribute = "This is a private attribute";


    public Variables(){
        System.out.println("Noarg Constructor: attribute = " + attribute); // don't need this since there is no variable in scope of constructor with same name as attribute.
    }

    public Variables(String attribute){
        this.attribute = attribute; //use this keyword to access the attribute of the object since the param variable attribute hides the instance variable.
    }

    public static void main(String[] args) {

        System.out.println("Static variables can be accessed directly via the class: " + Variables.PUBLIC_STATIC_FINAL_CONSTANT);

        Variables v1 = new Variables();
        System.out.println("Instance variable is accessed via the instance: " + v1.attribute);

        Variables v2 = new Variables("This is an attribute passed as a param");
        System.out.println("Instance variable is accessed via the instance which has set the value via the constructor: " + v2.attribute);

    }



}
