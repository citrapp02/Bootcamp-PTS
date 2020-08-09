package main

import "fmt"

func main(){
	var price, salesTax, total float64
	price = 0

	salesTax = price * 0.0825
	total = price + salesTax

	fmt.Print("How much is the purchase price? ")
	fmt.Scanf("%f", &price)

	fmt.Println("Item price:\t", price)
	fmt.Println("Sales Tax:\t", salesTax)
	fmt.Println("Total cost:\t", total)
}

