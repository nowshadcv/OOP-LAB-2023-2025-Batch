#!/bin/bash
echo "Enter two numbers"
read a b
sum=`expr $a + $b`
diff=`expr $a - $b`
mul=`expr $a \* $b`
div=`expr $a / $b`
mod=`expr $a % $b`
echo "$a + $b =  $sum "
echo "$a - $b =  $diff "
echo "$a * $b = $mul "
echo "$a / $b = $div "
echo "$a % $b =  $mod"
 
