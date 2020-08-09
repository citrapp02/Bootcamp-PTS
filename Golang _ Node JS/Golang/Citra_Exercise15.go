package main

import "fmt"

func main() { 
	var age int

	fmt.Print("How old are you? ")
	fmt.Scanf("%d", &age)

	fmt.Println("You ar: ")
	if age < 13 {
		fmt.Println("\ttoo young to create a Facebook account")
	}
	if age < 16 {
		fmt.Println("\ttoo young to get driver's license")
	}
	if age < 18 {
		fmt.Println("\ttoo young to get a tattoo")
	}
	if age < 21 {
		fmt.Println("\ttoo young to drink")
	}
	if age < 35 {
		fmt.Println("\ttoo young to run for President of the U.S.")
		fmt.Println("\t\t(How sad!)")
	}
}