package main 

import (
	"fmt"
)

func main() {
	var capital, say string
	var multiplyResult int
	var numberRange float64

	fmt.Println("What city is the capital of France?")
	fmt.Scanf("%s", &capital) // match the % with type data

	fmt.Println("What city is 6 multiplied by 7?")
	fmt.Scanf("\n%d", &multiplyResult)

	fmt.Println("Enter a umber between 0.0 and 1.0.")
	fmt.Scanf("n%f", &numberRange)

	fmt.Println("Is there anything else you would like to say?")
	fmt.Scanf("\n%s", &say)
}