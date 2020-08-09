package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main(){
	var secret, guess int
	rand.Seed(time.Now().UTC().UnixNano())

	secret = 1 + (int)(100*rand.Float64())

	fmt.Println("I'm thinking of a number between 1-100.")
	fmt.Println(" Try to guess it!")
	fmt.Print(">")
	fmt.Scanf("\n%d", &guess)

	for secret != guess{
		if guess < secret {
		fmt.Print("Sorry, your guess is too low.")
		fmt.Print("Try again.\n>")
		fmt.Scanf("\n%d", &guess)
		}
		if guess > secret {
			fmt.Print("Sorry, your guess is too high.")
			fmt.Print(" Try again.\n>")
			fmt.Scanf("\n%d", &guess)
		}
	}
	fmt.Println("You guessed it! what are the odds???")
}
