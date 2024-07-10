public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }


    @Override
    public void pauseMusic() {
        System.out.println("Pausing music...");
    }


    @Override
    public void stopMusic() {
        System.out.println("Stoping music...");
    }


    @Override
    public void makeCall (String number) {
        System.out.println("Calling from" + number);
    }


    @Override
    public void endCall() {
        System.out.println("Ending calling...");
    }


    @Override 
    public void receiveCall(String number) {
        System.out.println("Receiving call from" + number);
    }


    @Override
    public void openBrowser() {
        System.out.println("Opening browser...");
    }


    @Override
    public void navigateTo(String url) {
        System.out.println("Navigate to" + url);
    }


    @Override
    public void closeBrowser() {
        System.out.println("Closing browser...");
    }
}

