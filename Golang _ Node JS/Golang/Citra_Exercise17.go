package main

import "fmt"

func main(){
	var age int = 22
	var onGuestList bool = false
	var allure float64 = 7.5
	var gender string = "F"

	if onGuestList || age >= 21 || (gender == "F" && allure >= 8){
		fmt.Println("You are allowed to enter the club")
	}else {
		fmt.Println("You are ot allowed to enter the club")
	}
}