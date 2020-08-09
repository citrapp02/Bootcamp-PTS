package main

import "fmt"

func main(){
	var bmi float64

	fmt.Print("Enter your BMI: ")
	fmt.Scanf("%f", &bmi)
	fmt.Print("BMI category: ")
	if bmi < 15.0 {
		fmt.Println("very severely under weight")
	} else if bmi <= 16.0 {
		fmt.Println("severely under weight")
	} else if bmi < 18.5 {
		fmt.Println("under weight")
	} else if bmi < 25.0 {
		fmt.Println("normal weight")
	} else if bmi < 30.0 {
		fmt.Println("over weight")
	} else if bmi < 35.0 {
		fmt.Println("moderately obese")
	} else if bmi < 40.0 {
		fmt.Println("severely obese")
	} else {
		fmt.Println("ver severely/\"mordibly\" obese")
	}
}