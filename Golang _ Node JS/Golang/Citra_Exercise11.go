package main

import "fmt"

func main(){
	var i, j, k int

	i = 5
	j = 5
	k = 5
	fmt.Printf("i: %d\tj: %d\tk: %d\n", i, j, k)
	i = i + 3
	j = j - 3
	k = k * 3
	fmt.Printf("i: %d\tj: %d\tk: %d\n", i, j, k)

	i = 5
	j = 5
	k = 5
	fmt.Printf("i: %d\tj: %d\tk: %d\n", i, j, k)
	i += 3
	j -= 3
	k *= 3
	fmt.Printf("i: %d\tj: %d\tk: %d\n", i, j, k)

	i,j,k = 5,5,5
	fmt.Printf("i: %d\tj: %d\tk: %d\n", i, j, k)
	i += 1
	j -= 2
	k *= 3
	fmt.Printf("i: %d\tj: %d\tk: %d\n", i, j, k)

	i,j = 5,5
	fmt.Printf("i: %d\tj: %d\n", i, j)
	i = +1
	j = -2
	fmt.Printf("i: %d\tj: %d\n", i, j)

	i,j = 5,5
	fmt.Printf("i: %d\tj: %d\n", i, j)
	i++ 
	j-- 
	fmt.Printf("i: %d\tj: %d\n", i, j)
}