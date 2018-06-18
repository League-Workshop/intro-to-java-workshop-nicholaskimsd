PImage rainbow;
PImage unicorn;
void setup(){
  size(800,  600);
}
void draw(){
rainbow = loadImage ("cookies.jpg");
rainbow.resize(width,height);
background(rainbow);
 unicorn = loadImage ("hi.jpg");
unicorn.resize(300,200);
image (unicorn,  mouseX, mouseY);


}