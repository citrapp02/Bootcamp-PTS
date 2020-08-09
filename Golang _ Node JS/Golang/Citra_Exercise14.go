package main

import "fmt"

func main() {
	var age int
	var income, cute float64
	var allowed bool

	fmt.Print("Enter your age: ")
	fmt.Scanf("%d", &age)

	fmt.Print("Enter your yearly income: ")
	fmt.Scanf("\n%f", &income)

	fmt.Print("How cute are you, on a scale from 0.0 to 10.0? ")
	fmt.Scanf("\n%f", &cute)

	allowed = (age >25 && age < 40 && (income > 50000 || cute >= 8.5))

	fmt.Println("Allowed to date my grandchild? ", allowed)
}