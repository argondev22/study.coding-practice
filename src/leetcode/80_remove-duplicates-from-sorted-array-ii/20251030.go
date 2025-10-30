func removeDuplicates(nums []int) int {
    l := len(nums) 
    if l <= 2 {
        return l
    }

    k := 2

    for i := 2; i < l; i++ {
        if nums[k - 2] != nums[i] {
            nums[k] = nums[i]
            k++
        }
    }
    
    return k;
}
