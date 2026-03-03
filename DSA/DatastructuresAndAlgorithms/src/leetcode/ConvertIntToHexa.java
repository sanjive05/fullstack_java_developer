package leetcode;

public class ConvertIntToHexa {
    public String toHex(int num) {
        String hexa = "";
        int copy = num;
        if(num == -1){
            hexa = "ffffffff";
            return hexa;
        }

        while(copy>=16){
            hexa += String.valueOf(copy/16);
            copy  = copy % 16;
        }
        if(copy < 10){
            hexa += String.valueOf(copy);
        }
        switch (copy){
        case 10:
               hexa += "a";
               break;
        case 11:
               hexa += "b";
               break;

        case 12:
               hexa += "c";
               break;
        case 13:
               hexa += "d";
               break;
        case 14:
               hexa += "e";
               break;
        case 15:
               hexa += "f";
               break;
        }

        return hexa;

    }

	public static void main(String[] args) {
		ConvertIntToHexa hexa = new ConvertIntToHexa();
		System.out.println(hexa.toHex(22));

	}

}
