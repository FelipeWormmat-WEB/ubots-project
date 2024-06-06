import React, { useState, useEffect } from 'react';

function Atendentes() {
  const [atendentes, setAtendentes] = useState([]);

  useEffect(() => {
    fetchAtendentes();
  }, []);

  async function fetchAtendentes() {
    try {
      const response = await fetch('http://localhost:8080/atendentes');
      const data = await response.json();
      setAtendentes(data);
    } catch (error) {
      console.error('Erro ao buscar atendentes:', error);
    }
  }

  return (
    <div>
      <h1>Lista de Atendentes</h1>
      <ul>
        {atendentes.map(atendente => (
          <li key={atendente.id}>{atendente.nome}</li>
        ))}
      </ul>
    </div>
  );
}

export default Atendentes;