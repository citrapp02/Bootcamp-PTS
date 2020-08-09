package main 
import "fmt"

func main() {
	var word string
	var yep, nope bool

	fmt.Println("Type the word \"weasel\", please.")
	fmt.Scanf("%s", &word)

	yep = word == "weasel"
	nope = word != "weasel"

	fmt.Println("You type what was requested: ", yep)
	fmt.Println("You ignore polite instruction: ", nope)
}