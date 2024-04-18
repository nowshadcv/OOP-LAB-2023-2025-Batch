#!/bin/bash
read -p "Enter a number " num
for((i=1;i<=10;i++))
do
	echo "$num * $i = $((num*i))"
done
