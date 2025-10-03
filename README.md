# 💻 Padrão Observer em Simulação de Leilão

Este projeto em **Java** é uma demonstração prática do **Padrão de Projeto Observer (Observador)**, aplicado para simular um sistema simples de **leilão**.

---

## 🎯 Objetivo do Projeto
O objetivo principal é ilustrar o funcionamento do **Padrão Observer**, onde um objeto (**Sujeito**, no caso a **Loja**) notifica automaticamente uma lista de objetos dependentes (**Observadores**, no caso os **Clientes**) sobre qualquer mudança de estado.

### No contexto do leilão:
- 🏬 **Loja** → Sujeito Concreto  
  - Mantém o estado (produto, preço mínimo, vencedor).  
  - Inicia o leilão e notifica os clientes.  

- 👥 **Clientes** → Observadores Concretos  
  - Registram-se na Loja.  
  - São notificados sobre o status do leilão (início e resultado final).  

---

## 🚀 Padrão de Projeto: Observer
O **Observer** define uma **dependência um-para-muitos** entre objetos:  
> quando um objeto muda de estado, todos os seus dependentes são **notificados e atualizados automaticamente**.

---

## 🏗️ Estrutura de Classes
O projeto é composto por cinco arquivos principais que implementam o padrão no pacote `observer`:

| Interface/Classe | Papel no Observer | Descrição |
|------------------|------------------|-----------|
| **ILoja**        | Sujeito (Interface) | Define os métodos para anexar (`adicionarCliente`), desanexar (`removerCliente`) e notificar (`notificarClientes`) os observadores. Também define `realizarLeilao`. |
| **Loja**         | Sujeito Concreto  | Implementa `ILoja`. Mantém a lista de observadores (clientes), o estado do leilão (produto, preço mínimo, vencedor) e a lógica do leilão (`realizarLeilao`, `finalizarLeilao`). |
| **ICliente**     | Observador (Interface) | Define o método de atualização (`atualizar`) que o Sujeito chama para notificar o Observador, além de métodos de interação (`darLance`, `getNome`). |
| **Cliente**      | Observador Concreto | Implementa `ICliente`. Mantém o estado (nome, valor do lance) e a lógica de reação às notificações, exibindo a mensagem recebida. |
| **Observer**     | Classe principal (Main) | Demonstra o funcionamento. Cria instâncias da `Loja` e dos `Clientes`, registra-os e executa a sequência de eventos do leilão. |

---
