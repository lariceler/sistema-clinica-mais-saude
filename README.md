# Sistema de Clínica Médica +Saúde

Projeto desenvolvido para a disciplina **Teste de Software - GPE01M30025**.

## Objetivo

Este projeto materializa as Histórias de Usuário do sistema de clínica médica +Saúde, contemplando funcionalidades de cadastro de pacientes, agendamento de consultas e visualização de consultas.

## Histórias de Usuário testadas

- **HU01 - Cadastro de Paciente**
- **HU02 - Agendamento de Consulta**
- **HU03 - Visualização de Consultas**

## Ferramenta de teste utilizada

- **JUnit 5**

## Tipos de testes demonstrados

- **Teste de Unidade:** cadastro de paciente e validação de CPF duplicado.
- **Teste de Sistema:** agendamento de consulta e bloqueio de horário ocupado.
- **Teste de Regressão:** visualização de consultas, filtro por médico/data e ordenação por horário.

## Como executar os testes

```bash
mvn test
```

## Integração Contínua

O projeto possui um pipeline no GitHub Actions em:

```text
.github/workflows/ci.yml
```

Esse pipeline executa automaticamente os testes a cada push na branch principal.

## Integrantes

- Larissa de Almeida Pereira
- Giovana Rodrigues dos Santos
- Yann Rick Costa Leite
- Gustavo Jose Viana Lima de Barros
