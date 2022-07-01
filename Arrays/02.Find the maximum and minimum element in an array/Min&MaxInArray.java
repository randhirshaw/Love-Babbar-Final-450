class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        pair pair = null;
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        pair = new pair(min,max);
        return pair;
    }
}
