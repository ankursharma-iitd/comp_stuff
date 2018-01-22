//calculate if the number is a power of 2 or not
class Solution{
    public boolean checkIfPower(int v){
        return ((v != 0) && (v & (v - 1)) == 0);
    }

    public int countOnes(int v){
        int count  = 0;
        while(v > 0){
            v &= v - 1;
            count++;
        }
        return count;
    }

    public int findK(int v){
        //find the index in the number which is 1
        int c = 0;
        if((v & 0x0000FFFF) == 0){
            c += 16;
            v >>= 16;
        }
        if((v & 0x000000FF) == 0){
            c += 8;
            v >>= 8;
        }
        if((v & 0x0000000F) == 0){
            c += 4;
            v >>= 4;
        }
        if ((v & 0x00000003) == 0) {
            c += 2;
            v >>= 2;
        }
        if ((v & 0x00000001) == 0) {
            c += 1;
            v >>= 1;
        }
        return c;
    }

    public int findParity(int v){
        v ^= (v >> 16);
        v ^= (v >> 8);
        v ^= (v >> 4);
        v ^= (v >> 2);
        v ^= (v >> 1);
        return (v & 1);
    }

    public int reverseBits(int v){

        int mask16 = 0x0000FFFF;
        int mask8 = 0x00FF00FF;
        int mask4 = 0x0F0F0F0F;
        int mask2 = 0x33333333;
        int mask1 = 0x55555555;

        int right, left, reversed;

        right = v & mask16;
        left = (v >> 16) & mask16;
        reversed = (left << 16) | right;

        right = v & mask8;
        left = (v >> 8) & mask8;
        reversed = (left << 8) | right;

        right = v & mask4;
        left = (v >> 4) & mask4;
        reversed = (left << 4) | right;

        right = v & mask2;
        left = (v >> 2) & mask2;
        reversed = (left << 2) | right;

        right = v & mask1;
        left = (v >> 1) & mask1;
        reversed = (left << 1) | right;

        return reversed;
    }
}

