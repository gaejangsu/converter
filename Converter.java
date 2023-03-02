import java.util.ArrayList;

class Converter {

	public static void main(String[] args) {
		
		ArrayList<String> primitive = new ArrayList<String>();
		primitive.add("boolean");
		primitive.add("char");
		primitive.add("byte");
		primitive.add("short");
		primitive.add("int");
		primitive.add("long");
		primitive.add("float");
		primitive.add("double");
		
		if(primitive.contains(args[0])) {
			if(args[0].equals(primitive.get(0))) {
				String result = Boolean.getBoolean(args[3].substring(0, args[3].length() - 1));
				System.out.println(result);
			}
			
			if(args[0].equals(primitive.get(1))) {
				String result = Char.getChar(args[3].substring(0, args[3].length() - 1));
				System.out.println(result);
			}
			
		}
		
		
		
	}

}