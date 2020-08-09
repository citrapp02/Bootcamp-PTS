package main

import (
	"fmt"
)

func main(){
	var name string
	var age int
	var weight, income float64

	fmt.Print("Hello. What is your name? ")
	fmt.Scan(&name)

	fmt.Printf("Hi, %s! How old are you? ", name)
	fmt.Scan(&age)

	fmt.Printf("So you're %d, eh? That's not very old.\n", age)
	fmt.Printf("How much do you weigh, %s? ", name)
	fmt.Scan(&weight)

	fmt.Printf("%f! Better keep that quiet!!\n", weight)
	fmt.Printf("Finally, whats's your income, %s? ", name)
	fmt.Scan(&income)

	fmt.Printf("Hopefully that is %f per hour", income)
	fmt.Print("and not per year!")
	fmt.Print("Well, thanks for answering my rude questions, ")
	fmt.Printf("%s.",name)
}