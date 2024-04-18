#!/bin/bash
read -p "Enter the filename" filename
while read line
do
	echo $line
done < $filename

