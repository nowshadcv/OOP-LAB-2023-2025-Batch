#!/bin/bash
echo "Enter the name of state"
echo "1.Kerala"
echo  "2.Karnataka"
echo "3.Telangana"
echo "4.Maharashtra"
echo "5.Tamilnadu"
read state
case $state in 
	1)echo "Trivandrum";;
	2)echo "Bengaluru";;
	3)echo "Hyderabad";;
	4)echo "Mumbai";;
	5)echo "Chennai";;
	6)echo "No state available";;
esac


