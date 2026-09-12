package week1;

/*
1.18.2 Some facts about Brain Development
easy
|
30 min
|
Share
Some facts about the brain development
The human brain contains approximately 100 billion neurons
and trillions of connections between neurons called synapses.

The brain can generate up to 23 watts of electrical power,
enough to power a small light bulb.

The average human brain weighs about 1.5 kg, making up 2%
of the body weight.

Infants are born with about 250 billion brain cells, which
will increase to about 1,000 billion by age 3.

Write a program that stores all measurable information in
variables with the most suitable data types and prints them
out with a description.

plain
Copy code
_____ numberOfNeurons               =  ____;
____  wattsOfElectricalPower        =  ____;
____  brainWeight                   =  ____;
____  infantBrainCellsAtBirth       =  ____;
The expected output: The human brain contains approximately
100000000000 neurons The brain can generate up to 23 watts of
electrical power The average human brain weight is about 1.5 kg
Infants are born with about 250000000000 brain cells
 */

public class Week1_18_2_SomeFactsAboutBrainDevelopment {
    public static void main(String[] args) {
        long numberOfNeurons = 100_000_000_000L;
        short wattsOfElectricalPower = 23;
        double brainWeight = 1.5;
        long infantBrainCellsAtBirth = 250_000_000_000L;

        System.out.println("The human brain contains approximately " + numberOfNeurons + " neurons");
        System.out.println("The brain can generate up to " + wattsOfElectricalPower + " watts of electrical power");
        System.out.println("The average human brain weight is about " + brainWeight + " kg");
        System.out.println("Infants are born with about " + infantBrainCellsAtBirth + " brain cells");
    }
}

