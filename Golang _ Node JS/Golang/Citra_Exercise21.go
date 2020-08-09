package main

import "fmt"

func main(){
	var title, first, last, gender, married string
	var age int

	fmt.Print("First name: ")
	fmt.Scanf("%s", &first)
	fmt.Print("Last name: ")
	fmt.Scanf("\n%s", &last)
	fmt.Print("Gender (M/F): ")
	fmt.Scanf("\n%s", &gender)
	fmt.Print("Age: ")
	fmt.Scanf("\n%d", &age)

	if age < 20{
		title = first
	} else {
		if gender == "F" {
			fmt.Print("Are you married, "+first+"? (Y/N)")
			fmt.Scanf("\n%s", married)
			if married =="Y"{
				title = "Mrs."
			} else {
				title = "Ms."
			}
		}else {
			title = "Mr."
		}
	}
	fmt.Println("\n"+title+" "+last)
}