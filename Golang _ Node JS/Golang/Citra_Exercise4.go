package main

import (
	"fmt"
)

func main() {
	//this exercise demonstrates escape sequence & comments (like this)!
	fmt.Print("Learn\tGo\n\tthe\nHard\tWay\n\n")
	fmt.Print("\tLearn tGo the\"Hard\"Way!\n")
	//system.out.frimp("Learn Go the Hard Way");
	fmt.Print("Hello\n") //this line print Hello
	fmt.Print("Jello\by\n") //this line print Jelly
	/* The quick brown fox jumped over a lazy dog.
	10 quick wafting zephyrs vex bold Jim. */
	fmt./*testing*/Println("Hard to beliee, eh?")
	fmt.Println("Surprise? /*abcde */ Or what did you expect?")
	fmt.Println("\\// -=- \\//")
	fmt.Println("I hope you understand \"escape sequence\" now.\n")
}