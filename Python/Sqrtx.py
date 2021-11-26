def mySqrt(x: int) -> int:
  """Finds the round about square root of an integer

  Args:
      x (int): Integer being rooted

  Returns:
      int: Root of integer
  """
  i = 0
  while i <= x:
    if x > i * i and x < (i + 1) * (i + 1) or x == i * i:
      return i
    i += 1
  return -1

def main():
  print(
    format("%-10s %-10s %10s" % ("Test", "X", "Root")) + "\n" +
    "-" * 32 + "\n" +
    format("%-10s %-10d %10d" % ("Test 1:", 2, mySqrt(2))) + "\n" +
    format("%-10s %-10d %10d" % ("Test 2:", 4, mySqrt(4))) + "\n" +
    format("%-10s %-10d %10d" % ("Test 3:", 8, mySqrt(8))) + "\n" +
    format("%-10s %-10d %10d" % ("Test 4:", 26, mySqrt(26)))+ "\n" +
    format("%-10s %-10d %10d" % ("Test 5:", 1, mySqrt(1)))
  )

main()