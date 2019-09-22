var lineTopX = 0;
var lineBotX = 400;
var lineColRan;
var anotherCanvas;

function setup() {
  createCanvas(400, 600);
  background("white");
  lineColRan = random(0, 255);
  anotherCanvas = createGraphics(400,600);
}

function draw() {  
  fill("black");
  stroke("white");
  strokeWeight(10);
  noStroke();  
  ellipse(mouseX, mouseY, 20, 20);  
  
  lineTop = map(lineTopX, 0, 400, 0, lineColRan);
  fill(lineTop);
  rect(lineTopX, 0, 50, 50);
  lineTopX += 5;
  
  lineBot = map(lineBotX, 0, 400, 0, lineColRan);  
  fill(lineBot);
  rect(lineBotX, 550, 50, 50);  
  lineBotX -= 5;
    
  dotX = random(width);
  dotY = random(height);
  anotherCanvas.fill("grey");
  anotherCanvas.noStroke();
  anotherCanvas.ellipse(dotX, dotY, 10, 10);
  image(anotherCanvas, 0, 0);
}

function mousePressed() {
  background("white");
  anotherCanvas = createGraphics(400,600);  
  lineColRan = random(0, 255);
  lineTopX = 0;
  lineBotX = 400;
}
