class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Original: " + sb);

        sb.delete(5, 11);
        System.out.println("After delete(5,11): " + sb);

        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt(0): " + sb);
    }
}