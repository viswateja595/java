package exercism;

class ResistorColorDuo {
    int value(String[] colors) {
        String str="";
        for(int i=0;i<colors.length;i++)
            {
        		String color=colors[i].toLowerCase();
               switch (color) {
			case "black": {
				str+="0";
				break;
			}
			case "brown": {
				str+="1";
				break;
			}
			case "red": {
				str+="2";
				break;
			}
			case "orange": {
				str+="3";
				break;
			}
			case "yellow": {
				str+="4";
				break;
			}
			case "green": {
				str+="5";
				break;
			}
			case "blue": {
				str+="6";
				break;
			}
			case "violet": {
				str+="7";
				break;
			}
			case "grey": {
				str+="8";
				break;
			}
			case "white": {
				str+="9";
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + color);
			}
            }
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
		String[] inputStrings= {"green", "brown"};
		ResistorColorDuo r=new ResistorColorDuo();
		System.out.println(r.value(inputStrings));
 	}
}

