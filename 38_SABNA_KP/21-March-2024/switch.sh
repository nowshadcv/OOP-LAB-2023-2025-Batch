echo "Enter the first number"
read n
echo "Enter the second number"
read m
echo "1.Add 2.Sub 3.Mul 4.Div 5.Mod"
echo "Enter your choice"
read ch
case $ch in
	1)echo "Addition is :$((n+m))";;
	2)echo "Substraction is : $((n-m))";;
	3)echo "Multiplication is : $((n*m))";;
	4)echo "Division is :$((n/m))";;
	5)echo "Modulus is : $((n%m))";;
esac
