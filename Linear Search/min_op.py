class Solution:
    def minimumPairRemoval(self, nums):
        arr = nums[:]
        ops = 0

        while not self.is_non_decreasing(arr):
            min_sum = float('inf')
            idx = 0

            for i in range(len(arr) - 1):
                s = arr[i] + arr[i + 1]
                if s < min_sum:
                    min_sum = s
                    idx = i

            arr[idx] = arr[idx] + arr[idx + 1]
            arr.pop(idx + 1)
            ops += 1

        return ops

    def is_non_decreasing(self, arr):
        for i in range(1, len(arr)):
            if arr[i] < arr[i - 1]:
                return False
        return True


# -------- TEST IN VS CODE --------
if __name__ == "__main__":
    sol = Solution()
    print(sol.minimumPairRemoval([5, 2, 3, 1]))  # Expected: 2
    print(sol.minimumPairRemoval([1, 2, 2]))    # Expected: 0
