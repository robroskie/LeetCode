/**
 * @param {string} s
 * @return {boolean}
 */
function isPalindrome(s) {
  let left = 0;
  let right = s.length - 1;

  let regex = new RegExp('^[a-zA-Z0-9]+$');

  while (left < right) {
    while (!regex.test(s[left]) && left < right)
      left++;
    
    while (!regex.test(s[right]) && left < right)
      right--;

    if (s[left].toLowerCase() != s[right].toLowerCase())
      return false;

    left++;
    right--;
  }
  return true;
};