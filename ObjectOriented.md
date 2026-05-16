Car as a program

Class -- Blueprint of the system -- Car

Define a car. Design a blueprint of a car

What does a car have {
    - Brand
    - Model
    - 4 wheels
    - An engine
    - Colour
    - Number of Doors
    - Boot
    - Stearing
    - Seats
}

What does a car do {
    drive()
}

You can not drive a blueprint. 
You need something physical to drive. 

Object -- Instance of the Class -- Actual Car

This is just one of the instance. That is made from the blueprint.
{
    Brand: BMW
    Model: m340i
    Wheels: Made of Rubber
    Engine: 2 liter 6 cylinder
    Color: Red
    Number of Doors: 4
    Boot: 500L
    Stearing: Round
    Seat: Heated
}

Car myCar = new Car();

Car -- Blueprint (Class)
Constructor -- Assemby line inside a factory
new -- Factory (Creates an Object)
myCar -- Physical Car (Object)



Lets make a Car

<!-- Code car example -->

Abstraction 
The user of your class just types `myCar.drive(4)`
`myCar.honk(3)` Honks 3 times

drive()/ honk() could have been of 100s of lines of code. But the user doesn't care. For them its use drive() to drive and honk() to honk.



Inheritance
What if you want to create an Electric Car?

An Electric Car is-a Car. It does everything a car does, but it adds its own special 'Electric' flavor

Only Engine changes -  changes to a fixed type. All electric car will have Electric engine
And say it ha an additional property like batteryLevel

We can reuse the rest properties of the car
brand, model, and wheels 

<!-- class ElectricCar extends Car -->

Polymorphism

Same drive() method can be used to drive n number of block and also drive right or left

drive(int block)
drive(String direction)