package Etapa3;

public class Etapa3 {

    public boolean checkBrackets(Stack<Character> s1) {

        StaticStack<Character> aux = new StaticStack<>(s1.numElements());

        while (!s1.isEmpty()) {

            char c = (char) s1.pop();

            if (c == ')') {
                aux.push(c);
            }

            else if (c == '(') {

                if (aux.isEmpty()) {
                    return false;
                }

                aux.pop();
            }
        }

        return aux.isEmpty();
    }
}