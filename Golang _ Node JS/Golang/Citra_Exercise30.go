package main

import (
	"fmt"
	"strconv"
)

func main(){
	var current int
	var total int = 0

	fmt.Print("Type in a bunch of values and I'll add them up.")
	fmt.Println("I'll stop when you type a zero.")


	for current = 1; current != 0; {
		fmt.Print("Value : ")
		fmt.Scan(&current)
		total += current
		fmt.Println("The total so far is: "+strconv.Itoa(total))
	}
	
	fmt.Println("The final tatal is: "+strconv.Itoa(total))
}