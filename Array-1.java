//Array-1 > firstLast6
public boolean firstLast6(int[] nums) {
  if(nums[0] == 6 || nums[nums.length-1] == 6){
    return true;
  }
  else return false;
}

//Array-1 > sameFirstLast 
public boolean sameFirstLast(int[] nums) {
  if(nums.length >= 1){
    if(nums[0] == nums[nums.length-1]){
      return true;
    }
    else return false;
  }
  else return false;
}

//Array-1 > makePi
public int[] makePi() {
  int[] arr = {3, 1, 4};
  return arr;
}

//Array-1 > commonEnd
public boolean commonEnd(int[] a, int[] b) {
  if(a[0] == b[0] || a[a.length-1] == b[b.length-1]){
    return true;
  }
  else return false;
}

//Array-1 > sum3
public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums[2];
}

//Array-1 > rotateLeft3
public int[] rotateLeft3(int[] nums) {
  int x = nums[0];
  nums[0] = nums[1];
  nums[1] = nums[2];
  nums[2] = x;
  return nums;
}

//Array-1 > reverse3
public int[] reverse3(int[] nums) {
  int x = nums[0];
  nums[0] = nums[2];
  nums[2] = x;
  return nums;
}

//Array-1 > maxEnd3
public int[] maxEnd3(int[] nums) {
  if (nums[0] > nums[2]){
    nums[1] = nums[0];
    nums[2] = nums[0];
  }
  else {
    nums[0] = nums[2];
    nums[1] = nums[2];
  }
  return nums;
}

//Array-1 > sum2
public int sum2(int[] nums) {
  if (nums.length >= 2){
    return nums[0] + nums[1];
  }
  else if (nums.length == 1){
    return nums[0];
  }
  else return 0;
}

//Array-1 > middleWay
public int[] middleWay(int[] a, int[] b) {
  int[] arr = {a[1], b[1]};
  return arr;
}

//Array-1 > makeEnds
public int[] makeEnds(int[] nums) {
  int[] arr = {nums[0], nums[nums.length-1]};
  return arr;
}

//Array-1 > has23
public boolean has23(int[] nums) {
  if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3){
    return true;
  }
  else return false;
}

//Array-1 > no23
public boolean no23(int[] nums) {
  if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3){
    return false;
  }
  else return true;
}

