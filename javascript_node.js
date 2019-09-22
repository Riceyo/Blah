// read–eval–print loop

const http = require('http');

const server = http.createServer((request, responce) => {
  console.dir(request, {depth:0});
  console.log(request.url);
  console.log(request.connection.remoteAddress);
  console.log(request, {depth:0});
  responce.writeHead(200, {'Content-Type': 'text/html'});
  responce.write("hello <br />");
  responce.end(Date());
})

server.listen(1337, () => {console.log("listening...")})

console.log(process.env.USER);

const func = secs => {console.log("hello " + secs);};

setTimeout(func, 1000, 1);
setTimeout(func, 2000, 2);
setTimeout(func, 3000, 3);

process.on('exit', () => {console.log("bye");});

setTimeout(() => process.exit(), 5000);
