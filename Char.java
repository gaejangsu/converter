class Char {
	static String getChar(String args) {
	int num = Integer.parseInt(args);
	int length = 16;
	if(0<=num && num<=65535) {
		String binary = "[" + toBinary(num, length) + "]";
		return binary;
	}
	return "";
	
}
	
	public static String toBinary(int n, int length)
    {
        StringBuilder binary = new StringBuilder();
        for (long i = (1L << length - 1); i > 0; i = i / 2) {
            binary.append((n & i) != 0 ? "1" : "0");
        }
        return binary.toString();
    }
}
