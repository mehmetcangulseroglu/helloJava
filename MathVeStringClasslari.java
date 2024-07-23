public class MathVeStringClasslari {
    public static void main(String[] args){
        //MATH SINIFI KULLANIMI...
        System.out.println(Math.ceil(1.1));
        System.out.println(Math.cos(30));
        System.out.println(Math.floor(1.1));
        System.out.println(Math.max(2,5));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.round(1.4));
        System.out.println(Math.abs(-1));
        System.out.println(Math.sqrt(16));



        //STRİNG SINIFI KULLANIMI...
        String metin="MEHMET CAN";
        String metin2=" GÜLSEROĞLU";

        System.out.println(metin.length());
        System.out.println(metin.concat(metin2));
        System.out.println(metin.indexOf('L'));
        System.out.println(metin.charAt(4));
        System.out.println(metin.compareTo("ahmet"));
        System.out.println(metin.compareToIgnoreCase("ahmet"));
        System.out.println(metin.contains("ET"));
        System.out.println(metin.endsWith("M"));
        //System.out.println(metin.replace("GÜLSEROĞLU","GULSEROGLU"));
        System.out.println(metin.toLowerCase());
        System.out.println(metin.toUpperCase());
        



    }
}
