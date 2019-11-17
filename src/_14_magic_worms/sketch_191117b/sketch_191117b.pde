int x;
int y;
int  z;
void setup(){
    size(600,600);
    background(#0A0A0A);

}

void draw(){
for (int i = 0; i < 300; i++) {
  x = (int) random(600);
  y= (int) random(600);
  z = (int) random(255);
  fill(z);
  stroke(z);
  ellipse(x, y, 5,5);
}
}
