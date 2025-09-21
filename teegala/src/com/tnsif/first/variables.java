package com.tnsif.first;

class VariableExample {
    // Instance variable (belongs to the object)
    int instanceVar = 50;

    public void display() {
        // Local variable (exists only inside this method)
        int localVar = 20;

        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableExample obj = new VariableExample(); // create object
        obj.display();  // call method
}
}