def isPalindrome(x):
  """Takes an integer and determines if it is a palindrome (reads the same forward and backward)

  Args:
      x (int): integer being analyzed

  Returns:
      boolean: true if integer is a palindrome, otherwise false
  """

  for i in range(len(str(x))):
    if str(x)[i] != str(x)[len(str(x)) - i - 1] or x < 0:
      return False

  return True

def main():
  print(
    format("%-10s %10s %8s" % ("Test", "Integer", "Result")) + "\n" +
    format("%-10s %10d %8s" % ("Test 1: ", 121, isPalindrome(121))) + "\n" +
    format("%-10s %10d %8s" % ("Test 2: ", -121, isPalindrome(-121))) + "\n" +
    format("%-10s %10d %8s" % ("Test 3: ", 10, isPalindrome(10))) + "\n" +
    format("%-10s %10d %8s" % ("Test 4: ", -101, isPalindrome(-101)))
  )

main()