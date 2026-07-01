def greet(name):
    return f"Hello, {name}!"
name = input("Enter your name: ")
age = int(input("Enter your age: "))
print(greet(name))
if age >= 18:
    print("You are an adult.")
else:
    print("You are a minor.")

print("\nNumbers from 1 to 5:")
for i in range(1, 6):
    print(i)
