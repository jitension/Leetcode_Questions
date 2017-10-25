/* 434. Number of Segments in a String
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.
*/

class Solution {
    public int countSegments(String s) {
        return s.trim().length() == 0 ? 0 : s.trim().split("\\s+").length;          
    }
}
