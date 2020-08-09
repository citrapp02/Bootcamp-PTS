package main

import "fmt"

func main(){
	var secret, guess string = "please", ""

	fmt.Print("What's the secret word?")
	fmt.Scanf("%s", &guess)

	if guess == secret {
		fmt.Println("That's correct1")
	}else {
		fmt.Printf("No, the secret word isn't \"%s\".", guess)
	}
}