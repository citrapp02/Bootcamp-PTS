package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main(){
	var secret, guess int
	rand.Seed(time.Now().UTC().UnixNano())

	secret = 1 + (int)(rand.Float64()*10)

	fmt.Println("I have chosen a number between 1 and 10.")
	fmt.Println("Try to guess it.")
	fmt.Print("Your guess: ")
	fmt.Scanf("%d", &guess)

	for secret != guess{
		fmt.Println("That is incorrect. Guess again.")
		fmt.Print("Your guess: ")
	}

	fmt.Print("That's right! You're good guesser.")
}