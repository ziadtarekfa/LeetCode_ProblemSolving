class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
            int ranPointer = 0, magPointer = 0;
        char[] ransomArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();

        Arrays.sort(ransomArray);
        Arrays.sort(magazineArray);

        while (ranPointer < ransomArray.length && magPointer < magazineArray.length) {

            if (ransomArray[ranPointer] < magazineArray[magPointer]) {
                return false;
            } else if (ransomArray[ranPointer] == magazineArray[magPointer]) {
                ranPointer++;
            }

            magPointer++;
        }
        return ranPointer >= ransomArray.length - 1 && (magPointer != magazineArray.length || ranPointer >= ransomArray.length);
    }
}