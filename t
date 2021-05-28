package main

import (
"fmt"
"os"
"strings")

func main() {
	fmt.Println("-------------------------")
	fmt.Println(os.Environ())
	fmt.Println("-------------------------")
	displayEnviron(os.Environ())
}

func displayEnviron(env []string) {
	for _, kv := range env {
		fmt.Println("raw=["+kv+"]")
		bits := strings.SplitN(kv, "=", 2)
		k := bits[0]
		v := bits[1]
		fmt.Println("k=["+ k + "] v=["+ v+"]")
	}
}
