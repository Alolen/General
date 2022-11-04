class Solution:

    def twoSum(self, nums: list[int], target: int) -> list[int]:
        dict_of_seen_values = {}
        for idx, value in enumerate(nums):
            required_number = target - value
            if required_number in dict_of_seen_values:
                return [idx, dict_of_seen_values[required_number]]
            else:
                dict_of_seen_values[value] = idx

my_solution = Solution()

print(my_solution.twoSum([2, 7, 11, 15], 9))