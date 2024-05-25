package Tema_Curs42_Exercitiul1;

public class Main {
   /* Se dau interfetele: TelefonBehaviour si SmartphoneBehaviour;
    Un telefon poate fi incarcat si poate suna.
    Un smartphone poate fi incarcat, poate suna , poate facescreenshot-uri si poate descarca aplicatii.
    Defineste clasele Nokia, Motorola, Samsung si Iphone si stabileste contractele necesare.
    */

    public static void main(String[] args) {
        Nokia nokia = new Nokia("Nokia");
        nokia.recharge();
        nokia.ring();

        Motorola motorola = new Motorola("Motorola");
        motorola.recharge();
        motorola.ring();

        Samsung samsung = new Samsung("Samsung");
        samsung.recharge();
        samsung.ring();
        samsung.screenshot();
        samsung.downloadApps();

        Iphone iphone = new Iphone("Iphone");
        iphone.recharge();
        iphone.ring();
        iphone.screenshot();
        iphone.downloadApps();



    }
}
