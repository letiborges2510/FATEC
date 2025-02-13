

var http = require('http')

http.createServer(function(req, res){
    res.end("Mensagem a ser direcionada: Oi, tudo bem?")
}).listen(8081)

console.log("Servidor está ativo!")