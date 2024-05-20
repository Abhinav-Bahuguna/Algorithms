
def nth_fib(num):
    if num < 3:
        return 1
    else:
        return nth_fib(num-1) + nth_fib(num-2)

if __name__ == '__main__':
    for i in range(1, 11):
        print(f"{i}th Fibonacci Number: {nth_fib(i)}")
