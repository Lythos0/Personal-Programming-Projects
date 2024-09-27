heights = {"Robert Downey Jr.": 175.26, "Chris Evans": 182.88,
"Mark Ruffalo": 172.72, "Chris Hemsworth": 190.50,
"Scarlett Johansson": 160.02, "Tom Hiddleston": 187.96,
"Cobie Smulders": 172.72, "Samuel L. Jackson": 187.96,
"Clark Gregg": 175.26, "Stellan Skarsgård": 190.50,
"Jeremy Renner": 175.26}
#print("hi")
#Make something to go through the list (dictionary) and have it print the lowest height.
low = float('inf') #highest possible value
LowestHeight = ''
for i in heights:
   if heights[i] < low:
        low = heights[i]
        LowestHeight = i
print(LowestHeight)