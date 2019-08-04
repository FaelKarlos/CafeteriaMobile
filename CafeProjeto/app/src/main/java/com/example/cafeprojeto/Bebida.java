package com.example.cafeprojeto;

public class Bebida {

    private String nome;
    private String descricao;
    private int imagemIDRecurso;

    public static final Bebida[] bebidas = {
           new Bebida("Latte", "Latte é uma bebida de café expresso" +
                   "com uma quantidade generosa de espuma de leite no topo.",
                   R.drawable.latte),
            new Bebida("Cappuccino", "Um cappuccino classico" +
                    "e consistente em um terço de café expresso, um terço de leite vaporizado"+
                    "e um terço de espuma de leite vaporizado.",
                    R.drawable.cappuccino),
            new Bebida("Filter","Café coado do grau torrado e fresco da "+
                    "mais alta qualidade.",
                    R.drawable.filter)
   };

    public Bebida(String name, String descricao, int imagemIDRecurso) {
    }
}

