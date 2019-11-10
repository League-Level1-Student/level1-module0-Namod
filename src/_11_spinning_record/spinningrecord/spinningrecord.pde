    PImage pictureOfRecord;     //as member variable
    int x = 0;
    int y = 0;
    int angle = 0;

void setup(){

  size(600,600);     //in setup method
  pictureOfRecord= loadImage("record.jpg");
  pictureOfRecord.resize(600,600);
    
  
}
void draw(){
  
if(mousePressed){
  rotateImage(pictureOfRecord,angle);
  angle +=10;

}
image(pictureOfRecord, x, y);     //in draw method
}
  void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
  
  }

  
