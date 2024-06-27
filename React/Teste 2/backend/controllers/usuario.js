import {db} from "../db.js";

export const getUsers = (_,res)=>{
    const q = "SELECT * FROM usuarios"

    db.query(q,(err,data)=>{
        if (err) return res.json(err);
        return res.status(200).json(data)
    })
}

export const deleteUser = (req, res) => {
    const userId = req.params.id; // Captura o ID do usuário da URL

    const q = "DELETE FROM usuarios WHERE id = ?"; // Query SQL para deletar o usuário pelo ID

    db.query(q, userId, (err, result) => { // Executa a query passando o ID do usuário
        if (err) return res.status(500).json({ error: "Erro ao deletar usuário" });
        
        // Verifica se algum usuário foi afetado pela operação de exclusão
        if (result.affectedRows === 0) {
            return res.status(404).json({ error: "Usuário não encontrado" });
        }

        return res.status(200).json({ message: "Usuário deletado com sucesso" });
    });
};