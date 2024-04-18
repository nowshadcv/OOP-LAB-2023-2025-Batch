#!/bin/bash
a=10
sum=0
while [ $a -gt 0 ]
do
	sum=`expr $sum + $a`
	a=`expr $a - 1`
done
echo "Sum of first 10 numbers are $sum"

