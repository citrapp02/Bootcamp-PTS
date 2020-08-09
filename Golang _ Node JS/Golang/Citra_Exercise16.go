package main 

import "fmt"

func main(){
	var first, second float64

	fmt.Print("Give me two numbers. First: ")
	fmt.Scanf("%f", &first)
	fmt.Print("Second: ")
	fmt.Scanf("\n%f", &second)

	if first < second{
		fmt.Printf("%f is LESS THAN %f\n", first, second)
	}
	if first <= second{
		fmt.Printf("%f is LESS THAN/EQUAL TO %f\n", first, second)
	}
	if first == second{
		fmt.Printf("%f is EQUAL %f\n", first, second)
	}
	if first >= second{
		fmt.Printf("%f is GREATER THAN/EQUAL TO %f\n", first, second)
	}
	if first > second{
		fmt.Printf("%f is GREATER THAN %f\n", first, second)
	}
	if first != second{
		fmt.Printf("%f is NOT EQUAL TO %f\n", first, second)
	}
}