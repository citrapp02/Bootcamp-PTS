package main

import (
	"fmt"
	"strings"
)

func main(){
	var name string
	fmt.Print("Make up the name of a programming language! ")
	fmt.Scanf("%s", &name)

	if strings.Compare(name, "c++") < 0 {
		fmt.Println(name + " Comes BEFORE c++")
	}
	if strings.Compare(name, "c++") == 0 {
		fmt.Println(name + " isn't a made-up langauge!")
	}
	if strings.Compare(name, "c++") > 0 {
		fmt.Println(name + " Comes AFTER c++")
	}
	if strings.Compare(name, "go") < 0 {
		fmt.Println(name + " Comes BEFORE go")
	}
	if strings.Compare(name, "go") == 0 {
		fmt.Println(name + " isn't a made-up langauge!")
	}
	if strings.Compare(name, "go") > 0 {
		fmt.Println(name + " Comes AFTER go")
	}
	if strings.Compare(name, "java") < 0 {
		fmt.Println(name + " Comes BEFORE java")
	}
	if strings.Compare(name, "java") == 0 {
		fmt.Println(name + " isn't a made-up langauge!")
	}
	if strings.Compare(name, "java") > 0 {
		fmt.Println(name + " Comes AFTER java")
	}
	if strings.Compare(name, "lisp") < 0 {
		fmt.Println(name + " Comes BEFORE lisp")
	}
	if strings.Compare(name, "lisp") == 0 {
		fmt.Println(name + " isn't a made-up langauge!")
	}
	if strings.Compare(name, "lisp") > 0 {
		fmt.Println(name + " Comes AFTER lisp")
	}
	if strings.Compare(name, "python") < 0 {
		fmt.Println(name + " Comes BEFORE python")
	}
	if strings.Compare(name, "python") == 0 {
		fmt.Println(name + " isn't a made-up langauge!")
	}
	if strings.Compare(name, "pythom") > 0 {
		fmt.Println(name + " Comes AFTER python")
	}
	if strings.Compare(name, "ruby") < 0 {
		fmt.Println(name + " Comes BEFORE ruby")
	}
	if strings.Compare(name, "ruby") == 0 {
		fmt.Println(name + " isn't a made-up langauge!")
	}
	if strings.Compare(name, "ruby") > 0 {
		fmt.Println(name + " Comes AFTER ruby")
	}
	if strings.Compare(name, "visualbasic") < 0 {
		fmt.Println(name + " Comes BEFORE visualbasic")
	}
	if strings.Compare(name, "visualbasic") == 0 {
		fmt.Println(name + " isn't a made-up langauge!")
	}
	if strings.Compare(name, "visualbasic") > 0 {
		fmt.Println(name + " Comes AFTER visualbasic")
	}
}