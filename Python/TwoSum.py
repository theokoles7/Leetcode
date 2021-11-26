def twoSum(nums, target):
  """Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

  Args:
      nums (List[int]): List of integers to be analyzed
      target (int): target sum
  """
  for i in range(len(nums)):
    for j in range(len(nums)):
      if nums[i] + nums[j] == target and i != j:
        return [i, j]
  return []

def main():
  nums1 = [2, 7, 11, 15]
  nums2 = [3, 2, 4]
  nums3 = [3, 3]

  print(
    format("\n%5s %20s %10s %10s" % ("Test", "Array", "Target", "Result")),
    format("\n%5s %20s %8d %10s" % ("Test 1:", "[2, 7, 11, 15]", 9, twoSum(nums1, 9)) ),
    format("\n%5s %20s %8d %10s" % ("Test 2:", "[3, 2, 4]", 6, twoSum(nums2, 6)) ),
    format("\n%5s %20s %8d %10s" % ("Test 3:", "[3, 3]", 6, twoSum(nums3, 6)) ),
  )
  print()

main()