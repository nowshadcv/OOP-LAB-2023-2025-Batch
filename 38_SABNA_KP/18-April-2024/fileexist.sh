#!/bin/bash
echo -e "Enter the filename \c"
read filename
if [ -e $filename ]
then
	echo "$filename found"
else
	echo "$filename not found"
fi

	
