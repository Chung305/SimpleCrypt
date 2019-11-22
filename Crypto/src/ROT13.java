package src;

public class ROT13  {
    private Integer alpha;

    ROT13(Character cs, Character cf) {
        this.alpha = cs.compareTo(cf);
    }

    ROT13() {
        this.alpha = 13;
    }

    public String crypt(String text) throws UnsupportedOperationException {
        return encrypt(text);
    }

    public String encrypt(String text) {
        StringBuilder cypher = new StringBuilder();

        for(int i = 0; i < text.length(); i++){
            Character character = text.charAt(i);
            //checking for if its a letter;
            if(checker(character)){
                cypher.append(lowerUpperCaseShifter(character));
            }else
                cypher.append(character);
        }
        return cypher.toString();
    }

    public String decrypt(String text) {
        return encrypt(text);
    }
    public Character lowerUpperCaseShifter(Character character){
        //checking if lowercase
        if(Character.isLowerCase(character)){
            if(character > 'm')
                return (char) (character + alpha);
            else
                return (char) (character - alpha);
        }
        //checking if uppercase
        else if(Character.isUpperCase(character)){
            if(character > 'M')
                return (char) (character + alpha);
            else
                return (char)(character - alpha);
        }
        return null;
    }

    public Boolean checker(Character x){
        return Character.isLetter(x);
    }

    public String rotate(String s, Character c) {

        StringBuilder sb = new StringBuilder();
        this.alpha = c.compareTo(s.charAt(0));
        for(int i = 0; i < s.length(); i++){
            char letter;
            if(i + this.alpha < s.length()){
                letter = s.charAt(i + this.alpha);
            }
            else {
                letter = s.charAt(i + this.alpha - s.length());
            }
            sb.append(letter);
        }
        return sb.toString();
    }

}
