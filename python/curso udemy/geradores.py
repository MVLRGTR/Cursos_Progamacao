'''
def gerados_cubos(n):
    for num in range(n):
        yield num**3

for i in gerados_cubos(10):
    print(i)
'''
def gen_fib(n):
    a = 0
    b = 1
    for i in range(n):
        if a == 0 and b == 1:
            yield 0
        a , b = b , a + b
        yield a
    
for j in  gen_fib(10):
    print(j)

pop = gen_fib(10)
print(list(pop))

pop1 = gen_fib(10)
print(next(pop1))
print(next(pop1))
print(next(pop1))
print(next(pop1))
print(next(pop1))
