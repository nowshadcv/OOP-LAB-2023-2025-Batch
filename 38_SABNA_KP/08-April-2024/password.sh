#!/bin/bash
read -p "Enter your password: " password
if [[ ${#password} -ge 8 && "$password" =~ [A-Z] && "$password" =~ [a-z] && "$password" =~ [0-9] ]]; 
then
	echo "Strong Password"
else 
	echo "Weak Password"
fi
~
