class StockSpanner {

    // Pair class
    class Pair {
        int price;
        int idx;

        Pair(int price, int idx) {
            this.price = price;
            this.idx = idx;
        }
    }

    // Stack to store (price, index)
    Stack<Pair> st;

    // Current index
    int idx;

    public StockSpanner() {
        st = new Stack<>();
        idx = -1;
    }

    public int next(int price) {

        idx++;

        // Remove all smaller or equal prices
        while (!st.isEmpty() && st.peek().price <= price) {
            st.pop();
        }

        int span;

        // No previous greater price
        if (st.isEmpty()) {
            span = idx + 1;
        }
        // Previous greater exists
        else {
            span = idx - st.peek().idx;
        }

        // Save current price and index
        st.push(new Pair(price, idx));

        return span;
    }
}