public class PlanoOperadora {
	public static void main(String[] args) {

		String plano = "M"; //O plano T possui todos os benefícios, o M possui benefícios do M e do B, o B apenas do B

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");

			}
		}
	}
}