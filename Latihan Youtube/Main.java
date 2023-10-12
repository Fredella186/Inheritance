public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Tanjiro",10,100);
        HeroStrenght hero2 = new HeroStrenght("Zanitsu",20,100);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
        }
}
    