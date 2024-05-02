const { pool } = require('./src/mysql')

 async function testarconexao(){
    pool.getConnection((error, connection) => {
        if (error) {
          console.error('Erro ao obter conexão:', error);
          return;
        }
      
        connection.query('SELECT * FROM produtos', (err, results, fields) => {
          connection.release();
      
          if (err) {
            console.error('Erro ao executar consulta:', err);
            return;
          }
      
          console.log('Resultado da consulta:', results);
          
        });
      });
}



module.exports = testarconexao

