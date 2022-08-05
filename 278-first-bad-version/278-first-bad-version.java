/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    // boolean isBadVersion(int version) {
    //     return true;
    // }

    public int firstBadVersion(int n) {

        int l = 0;
        int r = n;
        int mid = l +(r-l) / 2;

        while (l <= r) {
            if (isBadVersion(mid) == false)
                l = mid + 1;
            else if (isBadVersion(mid) == true) {
                if (isBadVersion(mid - 1) == false)
                    return mid;
                else if(isBadVersion(mid - 1) == true)
                    r = mid - 1;
            }
            mid = l+ (r-l)/2;
        }

        return mid;

    }
}