package main

import (
	"fmt"
	"math/rand"
	"strconv"
	"time"
)

func main(){
	var coin, again string
	var streak int = 0
	var gotHeads bool
	rand.Seed(time.Now(). UTC().UnixNano())

	for ok := true; ok; ok = (again == "y"){
		gotHeads = rand.Float64() < 0.5

		if gotHeads{
			coin = "HEADS"
		} else {
			coin = "TAILS"
		}

		fmt.Println("You flip a coin and it is..." + coin)

		if gotHeads{
			streak++
			fmt.Println("\tThat's "+strconv.Itoa(streak)+" in a row...")
			fmt.Println("\tWould you like to flip agan (y/n)? ")
			fmt.Scan(&again)
		} else {
			fmt.Println("\tYou lose everything!")
			fmt.Println("\tShould've quit while you were a HEAD....")
			streak = 0
			again = "n"
		}
		fmt.Println("Final score: " + strconv.Itoa(streak))
	}
	
}