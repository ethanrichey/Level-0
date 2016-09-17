import ddf.minim.*;     //at the very top of your sketch
 PImage pictureOfRecord;        //as member variable
int angle;
 Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
   

void setup(){
  pictureOfRecord= loadImage("rek2.jpg");   //in setup method
  size(pictureOfRecord.width, pictureOfRecord.height);
  angle = 0;
  minim = new Minim(this);    //in the setup method
song = minim.loadFile("lolmad.mp3", 512);//in the setup method
}

void draw(){
  if(mousePressed){
   song.play();
    rotateImage(pictureOfRecord, angle);
  angle = angle + 100000;
 }
  else{
    song.pause();
  }
  image(pictureOfRecord, 20, 20);//in draw method

}

void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);
}
