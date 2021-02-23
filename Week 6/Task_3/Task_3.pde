float red  = 255;
float green = 255;
float yellow = 255;
float grey = 150;
int background = 255;

float time = 0;


void setup()
{
  size(500, 500);
  background(background);
  rectMode(CORNERS);
  fill(100);
  rect(50, 50, 250, 400);
  
}

void draw()
{
 // body

 fill(0);
 rect( 60, 60, 240, 390);


 
 //light red
 ellipseMode(CENTER);
 fill(grey);
 ellipse(150, 120, 90, 90);
 if (time < 20)
 {
   fill(red,0,0);
   ellipse(150, 120, 90, 90);
 }

 //light yellow
 fill(grey);
 ellipse(150, 220, 90, 90);
 if (time > 20 && time < 40)
 {
   fill(red,green,0);
   ellipse(150, 220, 90, 90);
 }
 //light red  
 fill(grey);
 ellipse(150, 320, 90, 90);
 if (time > 40 && time < 70)
 {
   fill(0,green,0);
   ellipse(150, 320, 90, 90);
 }
 
 //light reset 
 if (time > 100)
 {
   time = 0;
 }
 
 time = time + 0.25;
}
