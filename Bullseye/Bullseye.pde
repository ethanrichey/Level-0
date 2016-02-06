
void setup(){
  size(500,500);
}
void draw(){
 
  for(int i=525; i>24;i = i-25){
  ellipse(250,250,i,i);
 noFill();
 if((i%3) == 0)
 {
   
   fill(255, 0, 0);
}
 else if((i%3) == 1)
{
 fill(0, 0,255);

}
else if((i%3) == 2)
{
  fill( 255, 255, 255);
}



}
}
