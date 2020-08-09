package main

import (
	"fmt"
)

func main(){
	var pin, entry int

	pin = 12345

	fmt.Println("WELCOME TO THE BANK OF JAVA.")
	fmt.Println("ENTER YOUR PIN.")
	fmt.Scanf("%d", &entry)

	for ( entry != pin ) {
	fmt.Println("\nINCORRECT PIN. TRY AGAIN.")
	fmt.Println("ENTER YOUR PIN: ")
	fmt.Scanf("\n%d", &entry)
	}
	fmt.Println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE ID $425.17.")
}