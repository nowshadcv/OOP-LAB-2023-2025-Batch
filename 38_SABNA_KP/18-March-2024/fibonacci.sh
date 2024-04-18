#!/bin/bash
n=10
a=0
b=1
sum=0
echo "The fibonacci series is :"
for((i=0;i<=n;i++))
do
	echo -e "$a"
	sum=`expr $sum + $a`
	fn=$((a + b))
	a=$b
	b=$fn
done
echo -e "\n The sum of fibonacci series is $sum "
