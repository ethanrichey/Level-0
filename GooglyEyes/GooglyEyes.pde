
void setup(){
  size(800,800);
  
}
void draw(){
  
  
  background(250,250,250);
 if(mouseX <= 200){
   mouseX = 199;
 }
 else if(mouseX >= 310){
   mouseX = 309;
 }
 else if(mouseY >= 460){
   mouseY = 459;
 }
 else if(mouseY <= 330){
   mouseY = 329;
   
 }
  ellipse(250,400,200,200);
  ellipse(500,400,200,200);
   fill(0,0,0);
  ellipse(mouseX,mouseY,50,50);
  ellipse(mouseX + 250, mouseY,50,50);
fill(250,250,250);













   }
