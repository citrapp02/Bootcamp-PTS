package main

import "fmt"

func main(){
	var month, days int
	var monthName string

	fmt.Print("Which month? (1-12) ")
	fmt.Scanf("%d", &month)

	switch month {
	case 1:
		monthName = "Januari"
		break
	case 2:
		monthName = "Februari"
		break
	case 3:
		monthName = "March"
		break
	case 4:
		monthName = "April"
		break
	case 5:
		monthName = "May"
		break
	case 6:
		monthName = "June"
		break
	case 7:
		monthName = "July"
		break
	case 8:
		monthName = "Augustus"
		break
	case 9:
		monthName = "September"
		break
	case 10:
		monthName = "October"
		break
	case 11:
		monthName = "November"
		break
	case 12:
		monthName = "Desember"
		break
	default:
		monthName = "error"
	}

	switch month {
	case 9:
	case 4:
	case 6:
	case 11:
		days = 30
		break
	case 2:
		days = 28
		break
	default:
		days = 31
	}

	fmt.Printf("%d days hath %s", days, monthName)
}