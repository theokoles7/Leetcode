def lengthOfLastWord(s: str):
  """Determines the character length of the last word in the string

  Args:
      s (str): String being analyzed

  Returns:
      int: length of last word in string
  """
  length = 0
  hit = False
  i = len(s) - 1

  while i >= 0:
    if s[i] == " " and hit == True:
      return length
    elif s[i] != " ":
      hit = True
      length += 1
    i -= 1

  return length

def main():
  print(
    format("%-10s %-30s %10s" %("Test", "String", "Length")) + "\n" +
    "-" * 52 + "\n" +
    format("%-10s %-30s %10d" %("Test 1:", "\'Hello World\'", lengthOfLastWord("Hello World"))) + "\n" +
    format("%-10s %-30s %10d" %("Test 2:", "\'   fly me  to  the moon  \'", lengthOfLastWord("   fly me   to   the moon  "))) + "\n" +
    format("%-10s %-30s %10d" %("Test 3:", "\'luffy is still joyboy\'", lengthOfLastWord("luffy is still joyboy"))) + "\n" +
    format("%-10s %-30s %10d" %("Test 4:", "\'Hello\'", lengthOfLastWord("Hello"))) + "\n" +
    format("%-10s %-30s %10d" %("Test 5:", "\' a\'", lengthOfLastWord(" a"))) + "\n" +
    format("%-10s %-30s %10d" %("Test 6:", "\'a \'", lengthOfLastWord("a ")))
  )

main()