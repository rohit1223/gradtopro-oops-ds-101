
Class - Blueprint of the system 

Car

Property
    What does car have: {
        Color:
        Engine:
        Brand:
        Model:
        Wheels(count):
        No of Doors:
        Touque:
        No of seats:
        .....
    }

Method 
    What can a car do: {
        drive()
        stand()
        honk()
        start()
        off()
    }


Object  -- Instance of a Class (Car) -- Actual Car

{
    Brand: BMW
    Model: m340i
    Wheels: 4
    Engine: 3L 6 cylinder inline engine
    Color: Red
    No of Doors: 4
    No of seat: 3

    drive("Can can move upto 5 KMs")
    honk("Honk honk honk)
    stand(false)
    start(true)

}

{
    Brand: Honda
    Model: Civic
    Wheels: 4
    Engine: 2L 
    Color: Black
    No of Doors: 4
    No of seat: 3

    drive("Can can move upto 5 KMs")
    honk("Honk honk honk)
    stand(false)
    start(true)

}


