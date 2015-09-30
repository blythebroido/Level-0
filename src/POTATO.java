import java.io.IOException;


public class POTATO {
public static void main(String[] args) throws InterruptedException, IOException {
	for (int i = 1; i < 8; i++) {
		Runtime.getRuntime().exec("say " + i +"potato").waitFor();
	
	if(i==4){
	Runtime.getRuntime().exec("say " + "more").waitFor();
}
}
}
}