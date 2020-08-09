package main

import "fmt"

func main() {
	var a, b, c, d,e,f, g int
	var x, y, z float32
	var one, two, both string

	a = 10
	b = 27
	fmt.Printf("a is %d, b is %d\n", a, b)

	c = a + b
	fmt.Printf("a + b is %d\n",c)
	d = a - b
	fmt.Printf("a - b is %d\n",d)
	e = a + b*3
	fmt.Printf("a + b*3 is %d\n",e)
	f = b/2
	fmt.Printf("b/2 is %d\n", f)
	g = b % 10
	fmt.Printf("bmod10 is %d\n",g)
	x = 1.1
	fmt.Printf("\nx is %f\n",x)
	y = x * x
	fmt.Printf("x*x is %f\n",y)
	z = float32(b)/2
	fmt.Printf("b/2 is %f\n",z)
	x = 1.1
	fmt.Println()

	one = "dog"
	two = "house"
	both = one + two
	fmt.Println(both)
}