 class SimpleJavaProgram {

    public static void main (String[] args){

        for (int i = 1; i <=100; i++){
            System.out.println(convert(i));
        }
    }

    public static String convert(int input){
        if (input % 3  == 0){
            return "AGGELOS";
        }
        if (input % 5 == 0){
            return "LIAMIS";
        }
        if (input % 13 == 0) return "19100";

        return String.valueOf(input);
    }

}
