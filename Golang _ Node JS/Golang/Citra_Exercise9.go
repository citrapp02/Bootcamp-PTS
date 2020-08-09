package main

import "fmt"

func main(){
	var m, kg, bmi float64

	fmt.Print("Your height in m: ")
	fmt.Scanf("%f", &m)

	fmt.Print("Your height in kg: ")
	fmt.Scanf("\n%f", &kg)

	bmi = kg/(m*m)

	fmt.Printf("Your BMI is %f", bmi)
}