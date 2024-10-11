let text = "";
let num = [0, 1, 2, 3, 4, 5, 6, 7, 8];
let answer = [1, 2, 3, 4, 5, 6, 7, 8, 0];
const LEFT = -1, UP = -3, RIGHT = 1, DOWN = 3;  

window.onload = init ;

function shuffle() {
    num.sort(function(a,b){return 0.5 - Math.random()});
}

function display() {
    text ="";
    let idx = 0;
    for (let i = 0; i<3;i++){
        for(let j = 0; j<3;j++){
            text += `<button onclick='move(${idx}, ${num[idx]})'>${num[idx]}</button>`; 
            idx++;
        }
        text += "<br>"// 3행 3열로 br로 개행함. 
    }
    document.getElementById("game").innerHTML = text;  

}

function move(idx,btnNum){
    let pointOfTheCompass = whereIsZero(idx,btnNum);
}

function init() {
    shuffle();
    display();
}  // 셔플 후 디스플레이에 나오기                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            