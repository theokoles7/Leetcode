def romanToInt(s):
  """Calculates value of Roman numeral string

  Args:
      s (string): String of Roman numeral characters being analyzed

  Returns:
      int: integer value of Roman numeral string
  """
  sum = 0
  i = 0

  while i < len(s):
    if s[i] == 'M':
      sum += 1000
    elif s[i] == 'D':
      sum += 500
    elif s[i] == 'L':
      sum += 50
    elif s[i] == 'V':
      sum += 5
    elif s[i] == 'C':
      if i < len(s) - 1:
        if s[i + 1] == 'M':
          sum += 900
          i += 1
        elif s[i + 1] == 'D':
          sum += 400
          i += 1
        else:
          sum += 100
      else:
        sum += 100
    elif s[i] == 'X':
      if i < len(s) - 1:
        if s[i + 1] == 'C':
          sum += 90
          i += 1
        elif s[i + 1] == 'L':
          sum += 40
          i += 1
        else:
          sum += 10
      else:
        sum += 10
    elif s[i] == 'I':
      if i < len(s) - 1:
        if s[i + 1] == 'X':
          sum += 9
          i += 1
        elif s[i + 1] == 'V':
          sum += 4
          i += 1
        else:
          sum += 1
      else:
        sum += 1
    else:
      return "Something went wrong"
    i += 1

  return sum

def main():
  print(
    format("%-10s %-10s %10s" % ("Test", "String", "Integer")) + "\n" +
    "-" * 32 + "\n" +
    format("%-10s %-10s %10d" % ("Test 1:", "III", romanToInt("III"))) + "\n" +
    format("%-10s %-10s %10d" % ("Test 2:", "IV", romanToInt("IV"))) + "\n" +
    format("%-10s %-10s %10d" % ("Test 3:", "IX", romanToInt("IX"))) + "\n" +
    format("%-10s %-10s %10d" % ("Test 4:", "LVIII", romanToInt("LVIII"))) + "\n" +
    format("%-10s %-10s %10d" % ("Test 5:", "MCMXCIV", romanToInt("MCMXCIV")))
  )

main()