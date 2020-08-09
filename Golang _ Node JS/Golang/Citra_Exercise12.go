package main

import "fmt"

func main(){
	var a, b, c, d, e, f bool
	var x, y float64

	fmt.Print("Give me two numbers. First: ")
	fmt.Scanf("%f", &x)
	fmt.Print("Second: ")
	fmt.Scanf("\n%f", &y)

	a = (x < y)
	b = (x <= y)
	c = (x == y)
	d = (x != y)
	e = (x > y)
	f = (x >= y)

	fmt.Printf("%0.1f is LESS THAN %0.1f: %t\n", x, y, a)

	fmt.Printf("%0.1f is LESS THAN/EQUAL TO %0.1f: %t\n", x, y, b)
	fmt.Printf("%0.1f is EQUAL TO %0.1f: %t\n", x, y, c)
	fmt.Printf("%0.1f is NOT EQUAL TO %0.1f: %t\n", x, y, d)
	fmt.Printf("%0.1f is GREATER THAN %0.1f: %t\n", x, y, e)
	fmt.Printf("%0.1f is GREATER THAN /EQUAL TO %0.1f: %t\n", x, y, f)
	fmt.Println()

	fmt.Println(!(x < y), (x >= y))
	fmt.Println(!(x <= y), (x > y))
	fmt.Println(!(x == y), (x != y))
	fmt.Println(!(x != y), (x == y))
	fmt.Println(!(x > y), (x <= y))
	fmt.Println(!(x >= y), (x < y))
}
