package main

import "fmt"

func main(){
	var math int

	fmt.Println("Welcome to the UT Austin College Admission Interface!")
	fmt.Print("Please enter your SAT math score (200-800): ")
	fmt.Scanf("%d", &math)

	fmt.Print("Admittance status: ")

	if math >= 790 {
		fmt.Print("CERTAIN")
	} else if math >= 710 {
		fmt.Print("SAFE")
	} else if math >= 580 {
		fmt.Print("PROBABLE")
	} else if math >= 390 {
		fmt.Print("UNCERTAIN")
	} else {
		fmt.Print("DENIED")
	}
	fmt.Println()
}