import org.services.interaction.userInteraction;

/*Classe principal na execução
//Sub pacotes:
src/
├── main/
│   └── java/
│       └── org/
│           ├── itemclass/
│           │   ├── Item.java
│           │   └── Shoes.java
│           ├── services/
│           │   ├── service.java
│           │   └── serviceShoes.java
│           └── interaction/
│               └── userInteraction.java
└── App.java  */

public class App {
    public static void main(String[] args) {
        userInteraction interacao = new userInteraction();
        interacao.iniciar();
    }
}

