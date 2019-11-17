    PImage pictureOfPong;     //as member variable
    int x1 = (int) random(600);
    int y=(int) random(600);
    int speed = 10;
    int speed2 = 10;

void setup(){
  size(600,600);
  pictureOfPong= loadImage("pong.jpg");
  pictureOfPong.resize(600,600);
}

void draw(){
  image(pictureOfPong, 0, 0);     //in draw method
   
  fill(#77FF03);
  stroke(#8C03FF);
  ellipse(x1, y, 50,50);
  x1+=speed;
  y+=speed2;

  if(x1 > 600 || x1<0){
   speed=-speed; 
   
}
if(y > 600 || y< 0 ){
 speed2=-speed2; 
}
  }
