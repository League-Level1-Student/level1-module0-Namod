int x;
int y;
int z = (int) random(width);
int score;
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0)
          score--;
     println("Your score is now: " + score); }
void setup(){
size(600,600);

}

void draw(){
background(#E5D94F);

  fill(#4468E8);
stroke(#1441DE);

y+=10;
ellipse(z,y,50,50);
if(y>=600){
  y=0;
  y+=50;
  z = (int) random(width);

}
rect(mouseX,500,100,100);
stroke(#BFBEB9);
if(y == 450){
  checkCatch(z);
}
  
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

}
