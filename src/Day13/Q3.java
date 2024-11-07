package Day13;


import java.util.Random;

class PokemonProfessor {  //오박사 배열 받고 메소드 선택
    String[] pokemon = {"피카츄", "파이리", "꼬부기", "이상해씨"};
    String[] color = {"노란색", "빨간색", "파란색", "초록색"};
    String[] size = {"대", "중", "소", "미니"};

    //랜덤값 받기
    Random r = new Random();

    // 랜덤값 받고 선택받기
    String chooseRandom(String[] aray) {
        int arr = r.nextInt(3);
        return aray[arr];
    }

    String chooseRandomPokemon() {
        return chooseRandom(pokemon);
    }

    String chooseRandomColor() {
        return chooseRandom(color);
    }

    String chooseRandomSize() {
        return chooseRandom(size);
    }


}

class Trainer {  //지우 포켓몬 출력
    static void show(PokemonProfessor pp) { // 메소드 출력
        String pokemon = pp.chooseRandomPokemon();
        String color = pp.chooseRandomColor();
        String size = pp.chooseRandomSize();
        System.out.println(color + " " + pokemon + "이고 크기는 " + size + "입니다.");
    }


}

public class Q3 {
    public static void main(String[] args) {
        // 객체 선언
        PokemonProfessor pokemonProfessor = new PokemonProfessor();
        Trainer trainer = new Trainer();

        Trainer.show(pokemonProfessor);


    }
}
