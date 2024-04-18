#!/bin/bash
echo "Enter a number"
read n
a=1
sum=0
until [ $a -gt $n ]
do
	sum=$((sum + a))
	a=$((a+1))
done
echo "Sum of first $n numbers are $sum"

