import ddf.minim.*;        
AudioSample sound;        
   
void draw() {
 PImage garlick = loadImage("garlick.ppm.gif");
garlick.resize(80,80);
image(garlick, 500, 500);
if (mousePressed){
  image(garlick, mouseX, mouseY);
sound.trigger();
}}
void setup() {
  Minim minim = new Minim(this);
sound = minim.loadSample("Drake - Hotline Bling.mp3"); 
 
  size(800,800);
fill(170,102,017);
ellipse(400,400,500,500);



}
