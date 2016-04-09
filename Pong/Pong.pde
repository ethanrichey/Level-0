PImage backgroundImage;
import ddf.minim.*;
 Minim minim; 
 AudioSample sound;
int n = 0;
int numPlays = 0;
int e = 400;
int h = 50;
int s = 30;
int a = -30;
void draw(){
   image(backgroundImage, 0, 0, 1200, 800);
  fill(255,0,0);
  ellipse(h+=s,e+=a,40,40);
  rect( mouseX, 785, 200, 30);
  textSize(40);
  text(n,20,40);
  
  if ( h >= 1200){
    s = -s;  
  }
  else if (h <= 0){
    s = -s;
  }
  
 if (e <= 0){
  a = -a;
    }
  if ((e >= 800) && (numPlays == 0)){
    sound.trigger();
    numPlays++;
  }
  
  if ((mouseX < h) && h < (mouseX + 200) && (height > e) && (e > height - 30)){
    s = -s;
    a = -a;
    n++;
  }

} 
void setup(){
   size(1200,800);
  backgroundImage = loadImage("cyka-blyat.jpg");  
    minim = new Minim (this);
    sound = minim.loadSample("Cyka.wav", 128);
}
