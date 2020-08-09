package main

import (
	"fmt"
	"math"
)

func main(){
	var x, y float64

	fmt.Print("Give me a number, and I'll find its square root. ")
	fmt.Print("(No negatives, please)")
	fmt.Scan(&x)

	for x < 0 {
	fmt.Println("I won't take the square root of negative.")
	fmt.Print("\nNew number: ")
	fmt.Scan(&x)
	}

	y = math.Sqrt(x)

	fmt.Printf("The square root of %f is %f\n", x, y)
}