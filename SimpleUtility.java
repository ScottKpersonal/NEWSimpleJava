public class SimpleUtility {
    public String simpleReverse(String torevers) {
        if (torevers == null) return null;
        
        char[] chars = torevers.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        
        return new String(chars);
    }
}
