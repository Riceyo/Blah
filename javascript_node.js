const http = require('http');

const server = http.createServer((request, responce) => {responce.end("hello");})

server.listen(1337, () => {console.log("listening...")})

console.log(process.env.USER);

const func = secs => {console.log("hello " + secs);};

setTimeout(func, 1000, 1);
setTimeout(func, 2000, 2);
setTimeout(func, 3000, 3);

process.on('exit', () => {console.log("bye");});

setTimeout(() => process.exit(), 5000);
