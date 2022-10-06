public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada?: " + smartTv.ligada);
        System.out.println("Canal Atual?: " + smartTv.canal);
        System.out.println("Volume Atual?: " + smartTv.volume);

        smartTv.ligar();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual?: " + smartTv.canal);

    }
}
