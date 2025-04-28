```mermaid
flowchart TD
    A[Início: Página Principal] --> B{Escolha do Usuário}
    
    B --> C1[Buscar por Especialidade]
    B --> C2[Consultar Guia de Serviços]
    B --> C3[Encontrar Posto Mais Próximo]
    
    %% Fluxo Buscar por Especialidade
    C1 --> D1[Exibir campo de busca por especialidade]
    D1 --> E1[Permitir filtros de bairro/região]
    E1 --> F1[Consultar banco de dados]
    F1 --> G1[Exibir lista de postos: nome, endereço, horários]
    G1 --> H1{Ordenar resultados?}
    H1 -- Sim --> I1[Ordenar por distância ou horário]
    H1 -- Não --> J1[Fim da busca por especialidade]

    %% Fluxo Consultar Guia de Serviços
    C2 --> D2[Exibir categorias de serviços]
    D2 --> E2[Campo de busca por palavra-chave]
    E2 --> F2[Exibir informações acessíveis]
    F2 --> G2[Área administrativa para atualização de dados]
    G2 --> J2[Fim da consulta ao guia]

    %% Fluxo Encontrar Posto Mais Próximo
    C3 --> D3{Usar localização atual?}
    D3 -- Sim --> E3[Solicitar permissão de GPS]
    E3 --> F3[Detectar posição]
    D3 -- Não --> G3[Campo para digitar endereço]
    F3 --> H3[Buscar postos mais próximos]
    G3 --> H3[Buscar postos mais próximos]
    H3 --> I3[Exibir lista de postos + mapa]
    I3 --> J3{Postos encontrados?}
    J3 -- Sim --> K3[Fim da busca por localização]
    J3 -- Não --> L3[Exibir mensagem: "Nenhum posto encontrado"]
    L3 --> K3
