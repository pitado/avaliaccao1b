function calcularOrcamento() {
  const nome = document.getElementById('nome').value;
  const email = document.getElementById('email').value;
  const sessao = document.getElementById('sessao').value;
  const participantes = parseInt(document.getElementById('participantes').value);
  const maquiagem = document.querySelector('input[name="maquiagem"]:checked').value;

  let total = 0;

  if (sessao === "individual") {
    total = 150;
  } else if (sessao === "casal") {
    total = 250;
  } else if (sessao === "familia") {
    total = 300;
    if (participantes > 4) {
      total += (participantes - 4) * 30;
    }
  }

  if (maquiagem === "sim") {
    total += 50;
  }

  const resultado = `
    <strong>Simulação de orçamento:</strong><br>
    Cliente: ${nome}<br>
    E-mail: ${email}<br>
    Sessão: Ensaio em ${sessao}<br>
    Participantes: ${participantes}<br>
    Maquiagem: ${maquiagem === "sim" ? "Sim" : "Não"}<br>
    <strong>Total estimado: R$${total.toFixed(2)}</strong>
  `;

  document.getElementById('resultado').innerHTML = resultado;
  document.getElementById('resultado').style.display = 'block';
}
