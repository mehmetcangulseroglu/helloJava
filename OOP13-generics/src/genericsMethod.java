//metotlarda generics yapısı nasıl kullanılır ona bakalım...


public class genericsMethod {
    public <E> void genericMethod(E[] arr){
        for(E bastir:arr){
            System.out.println(bastir);
        }
    }


}
