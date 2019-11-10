int x;
int y;

void setup(){
size(600,600);

}

void draw(){
 x++;
 y++;
int z = (int) random(width);
int w = (int) random(width);




background(#47474B);
fill(#0308FC);
stroke(#0308FC);
ellipse(x, y, z, w);

if( x>599 & y >599){
x=0;
y=0;
x++;
y++;
}
}
