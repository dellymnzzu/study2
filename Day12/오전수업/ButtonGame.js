let text = "";
let num = [0, 1, 2, 3, 4, 5, 6, 7, 8];
let answer = [1, 2, 3, 4, 5, 6, 7, 8, 0];
const LEFT = -1, UP = -3, RIGHT = 1, DOWN = 3;  
// up은 위랑 비교하기 위해서 3을 주었다. 
//right와 left를 비교하기 위해서는 1을 주면된다. 

function shuffle()  // 서로 섞이는 효과이다. 첫번째 실행
{ 
    num.sort(function(a,b){return 0.5 - Math.random()});  // 무작위로 섞는다.
}

function display()  //두번째 실행 
{

    text ="";
    let idx = 0;
    for(let i=0;i<3;i++)  // 행
    {
        for(let j=0;j<3;j++)  // 열
        {
            text += `<button onclick='move(${idx}, ${num[idx]})'>${num[idx]}</button>`;  // 버튼 클릭시 move안에 idx(순서),btnNum(몇번인지)을 가지고 들어간다. 
            idx++;  // 순서를 +1 증가한다. 
        }
        text += "<br>"// 3행 3열로 br로 개행함. 
    }
    document.getElementById("game").innerHTML = text;  
}
function move(idx, btnNum)  // 순서와 버튼 숫자를 받았다. 
{
    let pointOfTheCompass = whereIsZero(idx, btnNum);  // 제로 찾는 것. whereIsZero()호출
    if( pointOfTheCompass != -100)  // -100이 실행이 된다면 0이 옆에 있다는 소리다 if문을 실행하면 된다. 
    {
        if( pointOfTheCompass == LEFT )
        {
            num[idx+LEFT] = btnNum;
            num[idx] = 0;       
        }
        else if( pointOfTheCompass == UP )
        {
            num[idx+UP] = btnNum;
            num[idx] = 0;       
        }
        else if( pointOfTheCompass == RIGHT )
        {
            num[idx+RIGHT] = btnNum;
            num[idx] = 0;       
        }
        else if( pointOfTheCompass == DOWN)
        {
            num[idx+DOWN] = btnNum;
            num[idx] = 0;
        }

        display();        
        if( result() ) alert("정답입니다.");
    }
}
function whereIsZero(idx, btnNum) 
{
    if( idx%3 != 0 )  // 왼쪽에 있는 애들은 검사하지마 ,만약 0이 아니면, if문으로 들어가. 
    {
        if( num[idx+LEFT]== 0 ) 
            return LEFT;
    }
    if( (idx+UP)>=0 )
    {
        if( num[idx+UP]==0 )
            return UP;
    }
    if( idx%3 != 2 )
    {
        if( num[idx+RIGHT]==0 )
            return RIGHT;
    }       
    if( (idx+DOWN) < num.length )
    {
       if( num[idx+DOWN]==0 )
            return DOWN;
    }
    return -100;   // 0이 없다는 소리다. 
}
function init()  // 첫번째 shuffle()함수 실행 후 display()함수 실행
{
    shuffle();
    display();
}
function result()
{
    for(var i=0;i<num.length;i++)
    {
        if(num[i] != answer[i])
            return false;
    }
    return true;
}

window.onload = init; // window가 onload 되면 init 함수를 실행한다. 
 