func removeDuplicates(nums []int) int {
    var arr []int
    k := 0

    for i := 0; i < len(nums) - 1; i++ {
        if nums[i] != nums[i + 1] {
            arr = []int{}
        }

        arr = append(arr, nums[i])

        if len(arr) > 2 {
        }
    }

    return k
}
