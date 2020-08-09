package main

import (
	"fmt"
)

func main() {
	var x, y int
	var seconds, e, checking float64
	var firstName, lastName, title string

	x = 10
	y = 400

	/* 	age = 39 (You sould knew that golang has that rules variables that 
		we have been declare, it must being used, if there's a variable are 
		declared but we never use it, it will causing ann error on compiling)
	*/

	seconds = 4.71
	e = 2.7182182845904523536
	checking = 1.89

	firstName = "Graham"
	lastName = "Mitchel"
	title = "Mr. "

	fmt.Printf("The variable x contains %d\n", x)
	fmt.Printf("The value %d is stored in the variable y.\n", y)
	fmt.Printf("The experiment took %f seconds. \n", seconds)
	fmt.Printf("A favorite irrational # is Euler's number: %f\n",e)
	fmt.Printf("Hopefully you have more than $%f!\n", checking)
	fmt.Printf("My name's %s %s%s \n", title, firstName, lastName)
}