import cProfile
import sys
from timeit import Timer

# ############################
# ORDER N*N
# ############################

# the first loop goes through N elements in string1
# the second loop goes through N elements in string2
# the resulting operation is in the other of N*N*N

def find_char_NN(string1, string2):
    result = ""
    for char1 in string1:
        for char2 in string2:
            if char1 == char2:
                result += char1
                break
    return result
	
string1 = raw_input('Enter first string:  ')	
string2 = raw_input('Enter second string: ')
print "Result for Order N*N: ", find_char_NN(string1,string2)
print ""
print ""
	

# ############################
# ORDER N
# ############################

# First store the characters of string2 as a character set.
# Then scan string1 and check if it is in the character set.
# if there is a match add it to the result
# This gives a total runtime of Order N.

def find_char_N(string1, string2):
    result = ""
    characterset = set(list(string2))
    for char1 in string1:
        if char1 in characterset:
            result += char1
    return result
	
string1 = raw_input('Enter third string:  ')	
string2 = raw_input('Enter fourth string: ')	
print "Result for Order N: ", find_char_N(string1,string2)		

