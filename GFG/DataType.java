class Solution {
    static int dataTypeSize(String str) {
        if(str=="Character"){
            return 1;
        }
        else if(str=="Integer"){
            return 4;
        }
        else if(str=="Long"){
            return 8;
        }
        else if(str=="Float"){
            return 4;
        }
        else if(str=="Double"){
            return 8;
        }
        return -1;
    }
}