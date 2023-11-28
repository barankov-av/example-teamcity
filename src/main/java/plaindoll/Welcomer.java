package plaindoll;

import java.util.Random;

public class Welcomer{
	public String sayWelcome() {
		return "Welcome home, good hunter. What is it your desire?";
	}
	public String sayFarewell() {
		return "Farewell, good hunter. May you find your worth in waking world.";
	}
	public String sayNeedGold(){
		return "Not enough gold";
	}
	public String saySome(){
		return "something in the way";
	}
	public String sayHunter() {
       String[] hunterPhrases = {
        "May the good blood guide your way, hunter.",
        "You're a hunter, aren't you? I knew it. That's precisely how I started out!",
        "Ah, sweet child of blood, hunter of beasts, what's left of you now?",
        "A hoonter must hoont.",
        "You've come to the right place. A hoonter must hoont.",
        "You're a hunter with your sanity, aren't you?",
        "A hoonter must hoont. But first, you'll need some blood.",
        "You're a hunter, aren't you? You must not fear the beasts. They are of no harm to those who hunt them."
    };
    Random random = new Random();
    int index = random.nextInt(hunterPhrases.length);
    return hunterPhrases[index];
    }
}
