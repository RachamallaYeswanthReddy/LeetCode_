class MedianFinder {
    List<Integer> lst;
    public MedianFinder() {
        lst = new ArrayList<Integer>();
    }
    public void addNum(int num) {
        if(lst.size() < 1){
            lst.add(0, num);
            return;
        }

        if(lst.size() == 1){ 
            int ind = lst.get(0) < num ? 1 : 0; 
            lst.add(ind, num);
            return;
        }

        // binary search to find the right place to insert the element
        int index = findInsertIndex(num);

        lst.add(index, num);
    }
    
    public double findMedian() {
        int n = lst.size();
        double med;
        if (n % 2 == 0) {
            med = (lst.get(n / 2 - 1) + lst.get(n / 2)) / 2.0;
        } else {
            med = lst.get(n / 2);
        }
        return med;
    }

    private int findInsertIndex(int num){
        
        int l = 0;  
        int r = lst.size()-1;  

        while(l<r){ 

            int mid = l + ((r-l)/2); 

            if(num <= lst.get(mid)){ 
                r = mid; 
            }else{
                l = mid+1; 
            }

        }

        if(lst.get(l) < num){
            l++;
        }

        return l; 

    }

}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */