#include <iostream>

int nth_fib(int num){
	if( num < 3 ) return 1;
	else return nth_fib(num-1) + nth_fib(num-2);
}

int main(int argc, char** argv){

	for( int i: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
	std::cout<<i<<"th Fibonacci Number: "<<nth_fib(i)<<std::endl;

	return 0;
}
