#!/bin/bash
arr=(12 4 5 6 8 10 5)
sum=0
for i in ${arr[@]}
do
	sum=`expr $sum + $i`
done
echo $sum
