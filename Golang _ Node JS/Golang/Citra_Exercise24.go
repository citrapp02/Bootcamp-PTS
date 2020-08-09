package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main(){
	var a, b, c, d int
	var r, rps float64
	rand.Seed(time.Now().UTC().UnixNano())

	rps = rand.Float64()
	if rps < 0.3333333 { //will be true 1/3 of the time
		fmt.Println("ROCK")
	} else if rps < 0.6666667 {
		fmt.Println("PAPER")
	} else {
		fmt.Println("SCISSORS")
	}

	//pick four random integers, each 1-10
	a = 1 + (int)(10*rand.Float64())
	b = 1 + (int)(10*rand.Float64())
	c = 1 + (int)(10*rand.Float64())
	d = 1 + (int)(10*rand.Float64())
	fmt.Printf("1-10:\t%d\t%d\t%d\t%d\n", a, b, c, d)

	//pick four random integers, each 1-6
	a = 1 + (int)(6*rand.Float64())
	b = 1 + (int)(6*rand.Float64())
	c = 1 + (int)(6*rand.Float64())
	d = 1 + (int)(6*rand.Float64())
	fmt.Printf("1-6:\t%d\t%d\t%d\t%d\n", a, b, c, d)

	//pick a single random integer, 1-100
	a = 1 + (int)(100*rand.Float64())
	fmt.Printf("1-100:\t%d\t%d\t%d\t%d\n", a, a, a, a)

	//pick four random integers, each 1-100
	a = 1 + (int)(100*rand.Float64())
	b = 1 + (int)(100*rand.Float64())
	c = 1 + (int)(100*rand.Float64())
	d = 1 + (int)(100*rand.Float64())
	fmt.Printf("1-100:\t%d\t%d\t%d\t%d\n", a, b, c, d)
	
	//pick four random integers, each 0-99
	a = 0 + (int)(100*rand.Float64())
	b = 0 + (int)(100*rand.Float64())
	c = 0 + (int)(100*rand.Float64())
	d = 0 + (int)(100*rand.Float64())
	fmt.Printf("0-99:\t%d\t%d\t%d\t%d\n", a, b, c, d)

	//pick four random integers, each 10-20
	a = 10 + (int)(11*rand.Float64())
	b = 10 + (int)(11*rand.Float64())
	c = 10 + (int)(11*rand.Float64())
	d = 10 + (int)(11*rand.Float64())
	fmt.Printf("10-20:\t%d\t%d\t%d\t%d\n", a, b, c, d)

	//display four random doubes, each [0-1]
	fmt.Printf("0-1:\t%f\t%f\n", rand.Float64(), rand.Float64())
	fmt.Printf("0-1:\t%f\t%f\n", rand.Float64(), rand.Float64())
	
	r = 10 * rand.Float64()	
	fmt.Printf("0-9.99:\t%f\n", r)
	fmt.Printf("0-9.99:\t%d\n", (int)(r))
	fmt.Printf("1-10:\t%d", (1 + (int)(r)))

}