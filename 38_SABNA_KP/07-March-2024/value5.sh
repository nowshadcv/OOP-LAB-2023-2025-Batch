#!/bin/bash
echo "Enter a value"
read n
b=1
while [ $b -le $n ]
do
	echo "Value of $b=$b"
	b=`expr $b + 1`
done
