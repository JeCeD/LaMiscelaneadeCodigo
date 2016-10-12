import re
#print(re.search(r"\d K","asgtrgg"))
patron = re.compile(r"\d\d\d")
print (patron.research("adh1723").group())
