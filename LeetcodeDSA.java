// two sum 1
// import java.util.HashMap;
// class LeetcodeDSA {
//     public static void main(String[] args) {
//         int[] nums = {2, 7, 11, 15, 44, 34};
//         int target = 41;
//         twoSum(nums, target); }
//     private static void twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             int diff = target - nums[i]; // 53
//             if (map.containsKey(diff)) {
//                 System.out.println("Indices are: " + map.get(diff) + " and " + i); }
//             map.put(nums[i], i); }  }  }

// two sum 2
// class LeetcodeDSA {
//     private static int[] twoSum(int[] nums, int target) {
//         int i=0, j=nums.length-1;
//         while (i < j) {
//             int sum = nums[i]+nums[j];
//             if (sum == target) {
//                 System.out.println(i + " and " + j);
//                 return new int[]{i, j};
//             } else if (sum > target) {
//                 j--;
//             } else if (sum < target) {
//                 i++;
//             }  }
//         return null; }
//     public static void main(String[] args) {
//         int[] nums = {12, 45, 65, 87, 333, 1000};
//         int target = 1087;
//         int[] res = twoSum(nums, target);
//         System.out.println(res[0] + " " + res[1]); }  }


// 3sum
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// class LeetcodeDSA {
//     private static List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//         List<List<Integer>> arr = new ArrayList<>();
//         for(int k=0; k < nums.length; k++){
//             if(k > 0 && nums[k] == nums[k-1]) continue;
//             int i = k+1, j = nums.length-1;
//             while (i < j) {
//                 int sum = (nums[i] + nums[j] + nums[k]);
//                 if (sum < 0) {
//                     i++;
//                 } else if (sum > 0) {
//                     j--;
//                 } else if (sum == 0) {
//                     arr.add(Arrays.asList(nums[k], nums[i], nums[j]));
//                     i++; j--;
//                     while (i < j && nums[i] == nums[i-1]) i++;
//                     while (i < j && nums[j] == nums[j+1]) j--; } }
//         }
//         return arr;  }  
//     public static void main(String[] args) {
//         int[] nums = {-1, 0, 1, 2, -1, -4};
//         List<List<Integer>> res = threeSum(nums);
//         System.out.println(res);  }  }


// rotate array
// import java.util.Arrays;
// class LeetcodeDSA {
//     private static int[] rotate(int[] nums, int k) {
//         int len = nums.length;
//         k = k % len;
//         reverse(nums, 0, len-1);
//         reverse(nums, 0, k-1);
//         reverse(nums, k, len-1); 
//         return Arrays.copyOfRange(nums, 0, len-1);
//     } 
//     private static void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++; end--; } }
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4 ,5 ,6, 7, 8};
//         int k = 4;
//         int[] res = rotate(nums, k); 
//         System.out.println(Arrays.toString(res)); }  }


// remove duplicates from sorted array
// import java.util.Arrays;
// class LeetcodeDSA {
//     private static int[] removeDuplicates(int[] nums) {
//         int k = 0;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i]  != nums[k]) {
//                 k++;
//                 nums[k] = nums[i]; } }
//         return Arrays.copyOfRange(nums, 0, k+1); }
//     public static void main(String[] args) {
//         int[] nums = {1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 8};
//         int[] res = removeDuplicates(nums);
//         System.out.println(Arrays.toString(res)); }  }


// remove from unsorted array
// import java.util.Arrays;
// class LeetcodeDSA {
//     private static int[] removeDuplicates(int[] nums) {
//       ;  Arrays.sort(nums);
//         System.out.println(Arrays.toString(nums));
//         int k = 0;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i]  != nums[k]) {
//                 k++;
//                 nums[k] = nums[i]; 
//             }
//         }
//         return Arrays.copyOfRange(nums, 0, k+1); }
//     public static void main(String[] args) {
//         int[] nums = {7, 1, 2, 6, 3, 4, 4, 5, 2, 5, 6, 7, 17, 80, 8};
//         int[] res = removeDuplicates(nums);
//         System.out.println(Arrays.toString(res)); }  }


// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;
// class LeetcodeDSA {
//     private static int[] removeDuplicates(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             set.add(num);
//         }
//         int[] arr = new int[set.size()];
//         int index=0;
//         for(int n : set) {
//             arr[index] = n;
//             index++;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int[] nums = {7, 4, 2, 7, 3, 1, 4, 1, 2};
//         int[] res = removeDuplicates(nums);
//         System.out.println(Arrays.toString(res));
//     }
// }


// stocks1
// class LeetcodeDSA {
//     private static int maxProfit(int[] prices) {
//         int maxP = Integer.MIN_VALUE;
//         int minP = Integer.MAX_VALUE;
//         for (int i = 0; i < prices.length; i++) {
//             minP = Math.min(minP, prices[i]);
//             maxP = Math.max(maxP, prices[i] - minP); }
//         return maxP; }
//     public static void main(String[] args) {
//         int[] prices = {7, 8, 2, 6, 11};
//         int res = maxProfit(prices);
//         System.out.println(res); } }


// // string valid palindrome
// class LeetcodeDSA {
//     private static boolean isValidPalindrome(String str) {
//         String s = str.toLowerCase().replaceAll("[^A-za-z0-9]", "");
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) != s.charAt(s.length()-1-i)) {
//                 return false; }
//         }
//         return true; }
//     public static void main(String[] args) {
//         String str = "madam";
//         System.out.println(isValidPalindrome(str)); }  }


// array valid palindrome
// class LeetcodeDSA {
//     private static boolean isValidPalindrome(int[] nums) {
//         for (int i = 0; i < nums.length/2; i++) {
//             if (nums[i] != nums[nums.length-1-i]) {
//                 return false; }
//         }
//         return true; }
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 2, 1, 2};
//         System.out.println(isValidPalindrome(nums)); }  }


// reverse a string
// class LeetcodeDSA {
//     private static String reverseString(String str) {
//         char[] ch = str.toCharArray();
//         int i=0, j=str.length()-1;
//         while (i<j) {
//             char temp = ch[i];
//             ch[i] = ch[j];
//             ch[j] = temp;
//             i++; j--;
//         }
//         return new String(ch);
//     }  
//     public static void main(String[] args) {
//         String str = "ebaad";
//         String res = reverseString(str);
//         System.out.println(res);
//     }  
// }


// reverse an array
// import java.util.Arrays;
// class LeetcodeDSA {
//     private static String reverseArray(int[] nums) {
//         int i=0, j=nums.length-1;
//         while (i<j) {
//             int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
//             i++; j--; }
//         return Arrays.toString(nums); }  
//     public static void main(String[] args) {
//         int[] arr = {1, 2,3, 4, 5};
//         String arr2 = reverseArray(arr);
//         System.out.println(arr2);  }  }


// find the missing number
// class LeetcodeDSA {
//     private static int missingNum(int[] nums) {
//         int n = nums.length+1;
//         int actualSum = (n * (n + 1)) / 2;
//         int tempSum=0;
//         for(int i : nums) {
//             tempSum += i;
//         }
//         return actualSum-tempSum;
//     }
//     public static void main(String[] args) {
//         int[] nums = {5, 3, 1, 2};
//         System.out.println(missingNum(nums));
//     }    
// }


// trapping rainwater
// class LeetcodeDSA {
//     private static int trap(int[] height) {
//         int i = 0;
//         int j = height.length-1;
//         int leftHeight = height[i];
//         int rightHeight = height[j];
//         int total=0;
//         while (i < j) {
//             if (height[i] < height[j]) {
//                 i++;
//                 leftHeight = Math.max(leftHeight, height[i]);
//                 total += (leftHeight - height[i]);
//             } else {
//                 j--;
//                 rightHeight = Math.max(rightHeight, height[j]);
//                 total += (rightHeight - height[j]);
//             }
//         }
//         return total; }
//     public static void main(String[] args) {
//         int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//         // int[] height = {4,2,0,3,2,5};      
//         int totalWater = trap(height);
//         System.out.println(totalWater);
//     }    
// }


// merge sort
// import java.util.ArrayList;
// import java.util.List;
// class LeetcodeDSA {
//     private static void mergeSort(int[] nums, int left, int right) {
//         if (left >= right) { return; }
//         int mid = (left + right) / 2;
//         mergeSort(nums, left, mid);
//         mergeSort(nums, mid + 1, right);
//         merge(nums, left, mid, right); }
//     private static void merge(int[] nums, int left, int mid, int right) {
//         int i = left;
//         int j = mid + 1;
//         List<Integer> arr = new ArrayList<>();
//         while (i <= mid && j <= right) {
//             if (nums[i] <= nums[j]) {
//                 arr.add(nums[i]);
//                 i++;
//             } else{
//                 arr.add(nums[j]);
//                 j++; } }
//         while (i <= mid) {
//             arr.add(nums[i]);
//             i++; }
//         while (j <= right) {
//             arr.add(nums[j]);
//             j++; }
//         for (int k = 0; k < arr.size(); k++) {
//             nums[left + k] = arr.get(k);
//         } }
//     public static void main(String[] args) {
//         int nums[] = {5, 2, 1, 3, 1, 2, 4, 8, 7};
//         for (int i = 0; i < nums.length; i++) {
//             System.out.print(nums[i] + " ");
//         } System.out.println();
//         mergeSort(nums, 0, nums.length-1);
//         for (int i = 0; i < nums.length; i++) {
//             System.out.print(nums[i] + " "); } } }


// minimum size subarray sum
// class LeetcodeDSA {
//     private static int minSubarray(int[] nums, int target) {
//         int l = 0, r = 0;
//         int minLen = Integer.MAX_VALUE;
//         int total = 0;
//         while (r < nums.length) {
//             total += nums[r];
//             while (total >= target) {
//                 minLen = Math.min(minLen, r - l + 1);
//                 total -= nums[l];   
//                 l++; }
//             r++; }
//         // If minLen was not updated, return 0
//         return minLen == Integer.MAX_VALUE ? 0 : minLen; }
//     public static void main(String[] args) {
//         int[] nums = {2, 3, 1, 2, 4, 3};
//         int target = 7;
//         int res = minSubarray(nums, target);
//         System.out.println(res); }  }


// maximum subarray sum
// class LeetcodeDSA {
//     private static int maxSubarraySum(int[] nums) {
//         int sum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for(int i=0; i < nums.length; i++) {
//             sum += nums[i];
//             if(sum > maxSum) {
//                 maxSum = sum; }
//             if(sum < 0) { 
//                 sum = 0; } }
//         return maxSum; }
//     public static void main(String[] args) {
//         int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int res = maxSubarraySum(nums);
//         System.out.println(res); }  }


// length of last word 
// class LeetcodeDSA {
//     private static int lengthOfLastWord(String str){
//        int count=0;
//        str = str.trim();
//         for (int i = str.length()-1; i > 0; i--) {
//             if (str.charAt(i)==' ') {
//                 break;            
//             }  count++;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         String s = "Hello World  ";
//         int length = lengthOfLastWord(s);
//         System.out.println(length); }  }


// isSubsequence
// class LeetcodeDSA {
//     private static boolean isSubsequence(String s, String t) {
//         int i=0, j=0;
//         while(i < s.length() && j < t.length()) {
//             if (s.charAt(i) == t.charAt(j)) {
//                 i++;
//             } j++; }
//         return i == s.length();
//     }      
//     public static void main(String[] args) {
//         String s = "abc";
//         String t = "ahbgdc";
//         System.out.println(isSubsequence(s, t)); } }


// find index of first occurrance
// class LeetcodeDSA {
//     private static int[] findIndex(String haystack, String needle) {
//         for (int i = 0; i <= haystack.length()-needle.length(); i++) {
//             if (haystack.substring(i, i + needle.length()).equals(needle)) {
//                 return new int[]{i, i+needle.length()}; }
//         }
//         return null;
//     }
//     public static void main(String[] args) {
//         String haystack = "bttbutsadbut";
//         String needle = "but";
//         int[] index = findIndex(haystack, needle);
//         System.out.println(index[0] + " " + index[1]); } }
















// valid anagram
public class LeetcodeDSA {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1));
        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2, t2));
    }
}


// RANSOM NOTE
// import java.util.HashMap;
// import java.util.Map;
// class LeetcodeDSA {
//     public static boolean isRansomNote(String ransomNote, String magazine) {
//         Map<Character, Integer> map = new HashMap<>();

//         // Count the frequency of each character in the magazine
//         for (char c : magazine.toCharArray()) {
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }

//         // Now HashMap would look something like this {a = 2, b = 1}

//         // Check if the ransomNote can be constructed from the magazine
//         for (char c : ransomNote.toCharArray()) {
//             if (!map.containsKey(c) || map.get(c) <= 0) {
//                 return false;
//             }
//             map.put(c, map.get(c) - 1);
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String ransomNote = "aa";
//         String magazine = "aab";
//         System.out.println(isRansomNote(ransomNote, magazine)); // Output should be true
//     }
// }


// longest consecutive string
// import java.util.Arrays;
// import java.util.Set;
// import java.util.stream.Collectors;
// class LeetcodeDSA {
//     public static int longestConsecutive(int[] nums) {
//         if (nums == null || nums.length == 0) {
//             return 0;
//         }
//         // Convert array to a set to remove duplicates and for O(1) lookups
//         Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//         int maxCount = 0;
//         for (int i = 0; i < numSet.size(); i++) {
//             if (!numSet.contains(nums[i] - 1)) {
//                 int count = 0;

//                 while (numSet.contains(nums[i] + count)) {
//                     count++;
//                 }
//                 maxCount = Math.max(maxCount, count);
//             }
//         }
//         return maxCount;
//     }
//     public static void main(String[] args) {
//         int[] nums = {100, 4, 200, 1, 3, 2};
//         System.out.println(longestConsecutive(nums)); // Output should be 4
//     }
// }




// FIND THE BIGGEST VERSION
// class LeetcodeDSA {

//     public static String biggerString(String str) {
//         String[] versions = str.split(" ");
//         String version1 = versions[0];
//         String version2 = versions[1];

//         // Compare the two versions using the compareVersions method
//         int result = compareVersions(version1, version2);

//         // Return the bigger version
//         return result > 0 ? version1 : version2;
//     }

//     // Method to compare two versions
//     public static int compareVersions(String version1, String version2) {
//         String[] levels1 = version1.split("\\.");
//         String[] levels2 = version2.split("\\.");

//         int length = Math.max(levels1.length, levels2.length);

//         for (int i = 0; i < length; i++) {
//             int v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
//             int v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
//             if (v1 < v2) {
//                 return -1;
//             }
//             if (v1 > v2) {
//                 return 1;
//             }
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         String str = "12.23.4 12.1.1";
//         String res = biggerString(str);
//         System.out.println(res);  // Output: 12.1.1
//     }
// }